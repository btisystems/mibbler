/**
 *
 * Copyright (C) BTI Systems Inc. 2001-2010. All Rights Reserved.
 *
 * The information contained herein is the property of BTI Systems
 * Inc. and is strictly confidential. Except as expressly authorized
 * in writing by BTI Systems Inc., the holder shall keep all
 * information contained herein confidential, shall disclose the
 * information only to its employees with a need to know, and shall
 * protect the information, in whole or in part, from disclosure and
 * dissemination to third parties with the same degree of care it uses
 * to protect its own confidential information, but with no less than
 * reasonable care. Except as expressly authorized in writing by BTI
 * Systems Inc., the holder is granted no rights to use the
 * information contained herein.
 *
 * Unpublished. All rights reserved under the copyright laws of
 * Canada.
 *
 * $Id: App.java 16769 2014-11-03 21:55:58Z sjames $
 */

package com.btisystems.pronx.ems;

import com.btisystems.pronx.ems.model.DeviceGroup;
import com.btisystems.pronx.ems.model.MibCommon;
import com.btisystems.pronx.ems.model.MibInput;
import com.btisystems.pronx.ems.model.MibSource;
import com.btisystems.pronx.ems.schemas.meta.notification.NotificationMeta;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import net.percederberg.mibble.Mib;
import net.percederberg.mibble.MibLoader;
import net.percederberg.mibble.MibLoaderException;
import net.percederberg.mibble.MibValueSymbol;
import net.percederberg.mibble.snmp.SnmpObjectType;
import net.percederberg.mibble.value.ObjectIdentifierValue;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * autogen application - mib compiler.
 */
public class App {

    private static final String DEFAULT_CONTEXT = "src/main/resources/defaultConfiguration.xml";

    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    private static final JCodeModel codeModel = new JCodeModel();
    public static final String CONTEXT = "context";
    private static final String FILE_SEP = File.separator;

    private static Properties properties;

    private static ApplicationContext autogenContext;

    /**
     * Entrypoint method.
     *
     * @param args the args
     * @throws Exception the exception
     */
    @SuppressWarnings("unchecked")
    public static void main(final String[] args) throws Exception {

        final String configurationFile = processCommandLineOptions(args);

        LOG.info("Autogen running. configurationFile=" + configurationFile);

        if (configurationFile != null) {
            autogenContext = new FileSystemXmlApplicationContext(configurationFile);
            properties = (Properties) autogenContext.getBean("properties");
            LOG.info("properties=" + properties);

            final List<DeviceGroup> groupList = (List<DeviceGroup>) autogenContext.getBean("groupList");
            if (groupList != null) {

                processMibFiles(groupList);
                
                buildSourceFiles();
                
                deleteImportedSource();
            }
        }
        LOG.info("Autogen complete");
    }

    private static void deleteImportedSource() throws IOException {
        for (final String importedPackage : MibEntityCompiler.IMPORTED_PACKAGES) {
            LOG.debug("Deleting: {}", properties.getProperty("target-directory") + FILE_SEP + importedPackage.replaceAll("\\.", FILE_SEP));
            FileUtils.deleteDirectory(new File(properties.getProperty("target-directory") + FILE_SEP + importedPackage.replaceAll("\\.", FILE_SEP)));
        }
    }


    /**
     * Process command line options, delivering array of mib files to be processed.
     * @param args command line args
     * @return
     */
    private static String processCommandLineOptions(final String[] args) {

        // create the command line parser
        final CommandLineParser parser = new PosixParser();
 
       // create Options object
        final Options options = new Options();
        options.addOption(CONTEXT, true, "name of Spring context");
        options.addOption("help", false, "print this message");

        try {
            // parse the command line arguments
            final CommandLine line = parser.parse(options, args);

            if (line.hasOption("help")) {
                // automatically generate the help statement
                final HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("App", options);
                System.exit(1);
            }

            if (line.hasOption(CONTEXT)) {
                return line.getOptionValue(CONTEXT);
            }
            return "file:${project.basedir}/" +  DEFAULT_CONTEXT;

        } catch (final ParseException exp) {
            LOG.info("Unexpected exception:" + exp.getMessage());
            System.exit(1);
        }
        return null;
    }

    /**
     * Load and process each of the Mib files.
     * @param groupList List of Device Groups
     */
    private static void processMibFiles(final List<DeviceGroup> groupList) {

        for (final DeviceGroup group : groupList) {
            compileDeviceGroup(group);
        }
    }

    private static void compileDeviceGroup(final DeviceGroup group) {
        LOG.debug(">>> compileDeviceGroup name:{} package:{}", group.getName(), group.getPackageName());

        final Map<String, JDefinedClass> interfaceMap = identifyCommonEntities(group);

        for (final MibSource source : group.getSourceMibs()) {
            final List<String> sourceNames = source.getSourceFilenames();

            final List<File> sourceFiles = getFiles(sourceNames);

            final MibLoader loader = new MibLoader();
            addDefaultDirectories(loader, source.getDefaultSourceDirectories());

            if (App.loadMibs(loader, sourceFiles)) {
                App.compileMibs(group, loader, source, interfaceMap);
            }

            loader.unloadAll();
        }
    }

    /**
     * Load mibs from list of source files.
     * @param group DeviceGroup
     * @param loader Mib Loader
     * @param source Mib Source
     * @param interfaceMap Supported Interfaces
     * @return
     */
    private static Collection<String> compileMibs(final DeviceGroup group, final MibLoader loader,
                               final MibSource source, final Map<String, JDefinedClass> interfaceMap) {

        // Get complete package name using group + source.
        final String packageName = buildPackageName(group.getPackageName(), source.getPackageName());

        final List<MibValueSymbol> rootSymbols = locateRootSymbols(loader, source.getRootObjects());
        final Map<String, List<MibValueSymbol>> symbolMap = locateChildSymbols(rootSymbols, source.getExcludedRootObjects());

        final MibEntityCompiler compiler = new MibEntityCompiler(symbolMap, packageName, interfaceMap, codeModel);
        
        compiler.importDependencies();
        
        for (List<MibValueSymbol> symbolList : symbolMap.values()) {
            final Iterator<MibValueSymbol> iterator = symbolList.iterator();
            while (iterator.hasNext()) {
                final MibValueSymbol symbol = iterator.next();
                if (MibEntityCompiler.IMPORTED_SYMBOLS.contains(getOidFromSymbol(symbol))) {
                    LOG.debug("removing common symbol:{}", getOidFromSymbol(symbol));
                    iterator.remove();
                }
            }
        }
        
        compiler.compile(codeModel);

        compileNotifications(loader, packageName, source.isGenerateNotificationObjects());

        final Map<String, JDefinedClass> classes = compiler.getEntityClasses();

        return compiler.generateRootEntity(classes);
    }

    private static void compileNotifications(final MibLoader loader, final String packageName, final boolean generateNotificationObjects) {
        if (generateNotificationObjects){
            final MibNotificationObjectCompiler notificationObjectCompiler = new MibNotificationObjectCompiler(loader, packageName);
            notificationObjectCompiler.compile(codeModel);

        }
        final MibNotificationCompiler notificationCompiler = new MibNotificationCompiler(loader, packageName);
        final NotificationMeta meta = notificationCompiler.compile(codeModel);
        saveNotificationRegistry(packageName, meta);
    }

    private static void saveNotificationRegistry(final String packageName, final NotificationMeta meta) {
        final File notificationRegistryDoc = getNotificationRegistryDocumentName(packageName);
        final File notificationRegistryDir = notificationRegistryDoc.getParentFile();
        if (Files.notExists(notificationRegistryDir.toPath())) {
            notificationRegistryDir.mkdirs();
        }
        try (XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(notificationRegistryDoc)))) {
            encoder.writeObject(meta);
            encoder.writeObject(meta);
        } catch (final Exception e) {
            LOG.error("Exception saving Notification Registry: {}", e.getMessage(), e);
        }
    }

    private static File getNotificationRegistryDocumentName(final String packageName) {
        return new File(properties.getProperty("target-registry-directory"), packageName + ".xml");
    }

    private static void registerEntities(final Map<String, Map <String, List<MibValueSymbol>>> groupEntities,
            final Map<String, List<MibValueSymbol>> symbolMap) {
        for (final Entry<String, List<MibValueSymbol>> rootSymbolListEntry : symbolMap.entrySet()) {
            final String rootOid = rootSymbolListEntry.getKey();
            Map<String, List<MibValueSymbol>> groupRootSymbolMap = groupEntities.get(rootOid);
            if (groupRootSymbolMap == null) {
                groupRootSymbolMap = new HashMap<>();
                groupEntities.put(rootOid, groupRootSymbolMap);
            }

            for (final MibValueSymbol valueSymbol : rootSymbolListEntry.getValue()) {

                final String oid = valueSymbol.getName();
                LOG.debug("Using OID:{}", oid);
                if (groupRootSymbolMap.containsKey(oid)) {
                    LOG.debug("{} previous instances:{}", oid, groupRootSymbolMap.get(oid).size());
                    boolean equivalent = false;
                    for (final MibValueSymbol symbol : groupRootSymbolMap.get(oid)) {
                        if (areEntitiesEquivalent(symbol, valueSymbol)) {
                            equivalent = true;
                            break;
                        }
                    }
                    if (!equivalent) {
                        LOG.debug("Not equivalent {} {}", valueSymbol, groupRootSymbolMap.get(oid).get(0));
                        groupRootSymbolMap.get(oid).add(valueSymbol);
                    }
                } else {
                    LOG.debug("Adding {}", valueSymbol.getValue().toString());
                    final List<MibValueSymbol> list = new ArrayList<>();
                    list.add(valueSymbol);
                    groupRootSymbolMap.put(oid, list);
                }
            }
        }
    }

    private static Map<String, JDefinedClass> identifyCommonEntities(final DeviceGroup group) {
        LOG.debug(">>> identifyCommonEntities group:{}", group.getName());
        final Map<String, Map<String, List<MibValueSymbol>>> groupRootOidMap = new HashMap<>();

        for (final MibSource source : group.getSourceMibs()) {
            final List<String> sourceNames = source.getSourceFilenames();

            final List<File> sourceFiles = getFiles(sourceNames);

            final MibLoader loader = new MibLoader();
            addDefaultDirectories(loader, source.getDefaultSourceDirectories());

            App.loadMibs(loader, sourceFiles);

            final Map<String, List<MibValueSymbol>> symbolMap = getCompilableEntitySymbols(loader, source);

            registerEntities(groupRootOidMap, symbolMap);
        }

        final Map<String, List<MibValueSymbol>> rootInterfaceMap = new HashMap<>();

        // Identify single version entities
        final Set<MibValueSymbol> commonIdentifiers = new HashSet<>();
        for (final Entry <String, Map<String, List<MibValueSymbol>>> rootMapEntry : groupRootOidMap.entrySet()) {
            LOG.debug("root OID : {}", rootMapEntry.getKey());
            final List<MibValueSymbol> rootInterfaceList = new ArrayList<>();
            rootInterfaceMap.put(rootMapEntry.getKey(), rootInterfaceList);

            for (final List<MibValueSymbol> list : rootMapEntry.getValue().values()) {
                rootInterfaceList.add(list.get(0));
                getCommonIdentifiers(list, commonIdentifiers);
            }
        }

        // Determine package name for interfaces.
        final String interfacePackageName = buildPackageName(group.getPackageName(), group.getInterfacePackageName());

        final MibEntityCompiler compiler = new MibEntityCompiler(rootInterfaceMap, interfacePackageName);
        compiler.compileInterfaces(codeModel, commonIdentifiers);
        final Map<String, JDefinedClass> interfaceMap = compiler.getEntityClasses();
        LOG.debug("interface map for group:{} {}", group.getName(), interfaceMap);

        return interfaceMap;
    }

    /**
     * Determine which symbols should be included in the interfaces (because they are common across all implementations.
     * @param list Mib Value Symbols
     * @param commonIdentifiers Mib Value Symbol
     */
    private static void getCommonIdentifiers(final List<MibValueSymbol> list, final Set<MibValueSymbol> commonIdentifiers) {

        boolean isTable = false;
        MibValueSymbol[] identifiersToCheck;
        if (list.get(0).isTable()) {
            commonIdentifiers.add(list.get(0).getChild(0));
            identifiersToCheck = list.get(0).getChild(0).getChildren();
            isTable = true;
        } else {
            identifiersToCheck = list.get(0).getChildren();
        }

        for (final MibValueSymbol anIdentifierToCheck : identifiersToCheck) {
            boolean isCommon = true;
            for (int entityIndex = 1; entityIndex < list.size(); entityIndex++) {
                final MibValueSymbol[] identifiersToCompare = isTable ? list.get(entityIndex).getChild(0).getChildren() : list.get(entityIndex).getChildren();
                if (!listContainsEquivalentChild(anIdentifierToCheck, identifiersToCompare)) {
                    isCommon = false;
                    break;
                }
            }
            if (isCommon) {
                commonIdentifiers.add(anIdentifierToCheck);
            }
        }
    }

    private static String buildPackageName(final String rootName,
            final String childName) {
        String builtName;
        if (childName != null && childName.length() > 0) {
            builtName = rootName + "." + childName;
        } else {
            builtName = rootName;
        }
        return builtName;
    }

    /**
     * Returns true only if children contains a symbol that is equivalent to child.
     * @param child
     * @param children
     * @return
     */
    private static boolean listContainsEquivalentChild(final MibValueSymbol child,
                                                       final MibValueSymbol[] children) {
        LOG.debug("listContainsEquivalentChild {}", child.getName());
        for (final MibValueSymbol childToCompare : children) {
            if ((child.isScalar() || child.isTableColumn()) && (childToCompare.isScalar() || childToCompare.isTableColumn())) {
                LOG.debug("check scalar {}", childToCompare.getName());
                if (areScalarsEquivalent(child, childToCompare)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected static boolean areEntitiesEquivalent(final MibValueSymbol symbol1, final MibValueSymbol symbol2) {
        LOG.debug(">>> areEntitiesEquivalent {} {}", symbol1, symbol2);
        if (!symbol1.getValue().equals(symbol2.getValue())) {
            LOG.debug("value: {} {}", symbol1.getValue(), symbol2.getValue());
            return false;
        }

        if (!symbol1.getName().equals(symbol2.getName())) {
            LOG.debug("name: {} {}", symbol1.getName(), symbol2.getName());
            return false;
        }

        if (symbol1.getChildCount() != symbol2.getChildCount()) {
            LOG.debug("childcount {} {}", symbol1.getValue(), "" + symbol1.getChildCount() + " " + symbol2.getChildCount());
            return false;
        }

        if (symbol1.isTable()) {
            return areEntitiesEquivalent(symbol1.getChild(0), symbol2.getChild(0));
        }

        for (int childIndex = 0; childIndex < symbol1.getChildCount(); childIndex++) {
            if ((symbol1.getChild(childIndex).isScalar() || symbol1.getChild(childIndex).isTableColumn())
                    && !areScalarsEquivalent(symbol1.getChild(childIndex), symbol2.getChild(childIndex))) {
                return false;
            }
        }
        return true;
    }

    private static boolean areScalarsEquivalent(final MibValueSymbol symbol1, final MibValueSymbol symbol2) {

        // Allow for a comparison with scalar/column and non-scalar/column (if an OID is reused).
        if (!(symbol2.getType() instanceof SnmpObjectType)) {
            LOG.debug("Not type");
            return false;
        }

        if (((SnmpObjectType) symbol1.getType()).getSyntax().getClass() != ((SnmpObjectType) symbol2.getType()).getSyntax().getClass()) {
            LOG.debug("type: {} {}", symbol1.getType(), symbol2.getType());
            return false;
        }

        if (!symbol1.getName().equals(symbol2.getName())) {
            LOG.debug("name: {} {}", symbol1.getName(), symbol2.getName());
            return false;
        }

        if (symbol1.getChildCount() != symbol2.getChildCount()) {
            LOG.debug("childcount {} {}", symbol1.getValue(), "" + symbol1.getChildCount() + " " + symbol2.getChildCount());
            return false;
        }

        return true;
    }

    private static List<MibValueSymbol> locateRootSymbols(final MibLoader loader, final List<String> rootObjects) {
        final List<MibValueSymbol> rootSymbols = new ArrayList<>();

        for (final String rootObject : rootObjects) {
            LOG.debug("Looking for root:{}", rootObject);
            for (final Mib mib : loader.getAllMibs()) {
                final MibValueSymbol symbol = mib.getSymbolByValue(rootObject);
                if (symbol != null) {
                    rootSymbols.add(symbol);
                    LOG.debug("Found root:{}", symbol);
                    break;
                }
            }
        }
        return rootSymbols;
    }

    private static void addDefaultDirectories(final MibLoader loader, final List<String> defaultSourceDirectories) {
        if (defaultSourceDirectories != null) {
            for (final String directoryName : defaultSourceDirectories) {
                LOG.debug("Add directory to loader:{}", directoryName);
                loader.addDir(new File(directoryName));
            }
        }
    }

    private static boolean loadMibs(final MibLoader loader,
                                      final List<File> sourceFiles) {

        for (final File sourceName : sourceFiles) {
            if (!sourceName.isDirectory()) {
                loader.addDir(sourceName.getParentFile());
                try {
                    LOG.debug("load source:{}", sourceName);
                    loader.load(sourceName);
                } catch (final IOException e) {
                    LOG.info("IOException:" + e.getMessage());
                    return false;

                } catch (final MibLoaderException e) {
                    LOG.info("MibLoaderException loading mib " + sourceName + ":" + e.getMessage());
                    e.getLog().printTo(System.out);
                    return false;
                }
            }
        }
        return true;
    }

    private static List<File> getFiles(final List<String> sourceNames) {
        final List<File> files = new ArrayList<>();
        for (final String sourceName : sourceNames) {
            files.add(new File(sourceName));
        }
        return files;
    }

    // Generate Java classes.
    private static void buildSourceFiles() {
        buildJavaSources();
    }

    private static void buildJavaSources() {
        final File file = new File(properties.getProperty("target-directory"));

        try {
            FileUtils.forceMkdir(file);
            codeModel.build(file, (PrintStream) null);
        } catch (final IOException e) {
            LOG.info("Failed to create classes:" + e.getMessage());
            System.exit(1);
        }
    }

    private static Map<String, List<MibValueSymbol>> getCompilableEntitySymbols(final MibLoader loader,
            final MibInput source) {
        final List<MibValueSymbol> rootSymbols = locateRootSymbols(loader, source.getRootObjects());
        return locateChildSymbols(rootSymbols, source.getExcludedRootObjects());
    }

    private static Map<String, List<MibValueSymbol>> locateChildSymbols(final List<MibValueSymbol> rootSymbols,
                                                                                final Set<String> excludedRoots) {
        final Map<String, List<MibValueSymbol>> rootSymbolMap = new HashMap<>();
        for (final MibValueSymbol rootSymbol : rootSymbols) {
            rootSymbolMap.put(rootSymbol.getValue().toString(), getChildEntities(rootSymbol, excludedRoots));
        }
        return rootSymbolMap;
    }

    private static List<MibValueSymbol> getChildEntities(final MibValueSymbol rootSymbol,
            final Set<String> excludedRoots) {
        LOG.debug(">>> getChildEntities:{}", rootSymbol);
        final List<MibValueSymbol> masterList = new ArrayList<>();
        if (rootSymbol.isTable()) {
            masterList.add(rootSymbol);
        } else {
            getChildEntities(rootSymbol, excludedRoots, masterList);
        }
        LOG.debug("<<< getChildEntities:{}", masterList.size());
        return masterList;
    }

    private static void getChildEntities(final MibValueSymbol rootSymbol, final Set<String> excludedRoots, final List<MibValueSymbol> masterList) {
        for (final MibValueSymbol child : rootSymbol.getChildren()) {

            if (child != null && !isObjectExcluded((ObjectIdentifierValue) child.getValue(), excludedRoots)) {
                if (child.isScalar() || child.isTableColumn()) {
                    if (!masterList.contains(rootSymbol)) {
                        masterList.add(rootSymbol);
                    }
                } else {
                    masterList.addAll(getChildEntities(child, excludedRoots));
                }
            }
        }
    }

    private static boolean isObjectExcluded(final ObjectIdentifierValue oidValue, final Set<String> excludedRoots) {
        LOG.debug("check exlusion:{} {}", oidValue.toString(), excludedRoots);
        return (excludedRoots != null && excludedRoots.contains(oidValue.toString()));
    }

    private static String getOidFromSymbol(final MibValueSymbol rootSymbol) {
        return rootSymbol.getValue().toString();
    }
}
