/**
 *                     GNU GENERAL PUBLIC LICENSE
 *                        Version 3, 29 June 2007
 *
 *  Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/>
 *  Everyone is permitted to copy and distribute verbatim copies
 *  of this license document, but changing it is not allowed.
 *
 *  This program is free software: you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License as published
 *  by the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 *  FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 */
package com.btisystems.pronx.ems;

import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.GeneratedIdentifiers;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;
import com.btisystems.pronx.ems.core.model.IIndexed;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.ClassPath;
import com.sun.codemodel.JArray;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JCase;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JExpression;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JInvocation;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JSwitch;
import com.sun.codemodel.JType;
import com.sun.codemodel.JVar;
import net.percederberg.mibble.MibType;
import net.percederberg.mibble.MibValue;
import net.percederberg.mibble.MibValueSymbol;
import net.percederberg.mibble.snmp.SnmpIndex;
import net.percederberg.mibble.snmp.SnmpObjectType;
import net.percederberg.mibble.type.ChoiceType;
import net.percederberg.mibble.type.Constraint;
import net.percederberg.mibble.type.ObjectIdentifierType;
import net.percederberg.mibble.type.SizeConstraint;
import net.percederberg.mibble.type.StringType;
import net.percederberg.mibble.type.ValueConstraint;
import net.percederberg.mibble.value.NumberValue;
import net.percederberg.mibble.value.ObjectIdentifierValue;
import net.percederberg.mibble.value.StringValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * Manages the 'compilation' of a Mib, by generating Java entity classes for
 * each of the managed objects.
 */
public class MibEntityCompiler extends AbstractMibCompiler {

    private static final String INTERFACE_PREFIX = "I";

    private static final Logger LOG = LoggerFactory.getLogger(MibEntityCompiler.class);

    private static final int PUBLIC_FINAL_STATIC = JMod.PUBLIC | JMod.FINAL | JMod.STATIC;

    private final Map<String, List<MibValueSymbol>> rootSymbolMap;
    private final Map<String, JDefinedClass> oidClasses = new TreeMap<>();
    private final Map<String, JDefinedClass> interfaceMap;
    public static final Set<String> IMPORTED_PACKAGES = new HashSet<>();
    public static final Set<String> IMPORTED_SYMBOLS = new HashSet<>();

    /**
     * Maintains an occurrence count for each unqualified class name. Used to
     * assign a numeric suffix for names of tables and fields that are derived
     * from the class name.
     */
    private final Map<String, Integer> classNameOccurrences = new HashMap<>();

    /**
     * Class constructor.
     *
     * @param symbolMap associates the root OIDs with the symbols that belong to
     *            the associated tree
     * @param packageName the name of the package to which classes are to be
     *            added
     * @param interfaceMap associates an OID with the {@link JDefinedClass} that
     *            defines the interface to be implemented by an entity derived
     *            from that OID.
     */
    public MibEntityCompiler(final Map<String, List<MibValueSymbol>> symbolMap, final String packageName,
            final Map<String, JDefinedClass> interfaceMap) {
        super(packageName);
        this.rootSymbolMap = symbolMap;
        this.interfaceMap = interfaceMap;
    }

    public MibEntityCompiler(final Map<String, List<MibValueSymbol>> symbolMap, final String packageName,
            final Map<String, JDefinedClass> interfaceMap, final JCodeModel codeModel) {
        this(symbolMap, packageName, interfaceMap);
        this.codeModel = codeModel;

    }

    /**
     * Class constructor.
     *
     * @param symbolMap associates the root OIDs with the symbols that belong to
     *            the associated tree
     * @param packageName the name of the package to which classes are to be
     *            added
     */
    public MibEntityCompiler(final Map<String, List<MibValueSymbol>> symbolMap, final String packageName) {
        this(symbolMap, packageName, null);
    }

    /**
     * Compile the Mib to java code
     *
     * @param codeModel the Java Code Model which will hold the generated code
     */
    public final void compile(final JCodeModel codeModel) {
        this.codeModel = codeModel;
        for (final Entry<String, List<MibValueSymbol>> rootEntry : rootSymbolMap.entrySet()) {
            for (final MibValueSymbol child : rootEntry.getValue()) {
                buildClass(createEntityPackageName(rootEntry.getKey(), child), child, null);
            }
        }
    }

    /**
     * Compile interfaces.
     *
     * @param codeModel the code model
     * @param commonIdentifiers the common identifiers
     */
    public final void compileInterfaces(final JCodeModel codeModel, final Set<MibValueSymbol> commonIdentifiers) {
        this.codeModel = codeModel;
        for (final Entry<String, List<MibValueSymbol>> rootEntry : rootSymbolMap.entrySet()) {
            for (final MibValueSymbol child : rootEntry.getValue()) {
                buildInterface(createEntityPackageName(rootEntry.getKey(), child), child, commonIdentifiers);
            }
        }
    }

    private JClass buildInterface(final String packageName, final MibValueSymbol entity,
            final Set<MibValueSymbol> commonIdentifiers) {
        LOG.debug("build Interface:{}.{}", packageName, getInterfaceName(entity.getName()));
        final JDefinedClass definedInterface = createInterface(packageName, getInterfaceName(entity.getName()));
        definedInterface._extends(IDeviceEntity.class);

        definedInterface.metadata = new ClassMetadata(definedInterface);

        // TODO SJ If it's a table and there is an interface for the
        // corresponding entry, let the interface
        // extend ITableAccess<entryInterface>

        final IClassBuilder interfaceBuilder = new IClassBuilder() {

            @Override
            public JClass buildCodeForClass(final String packageName, final MibValueSymbol entity) {
                return buildInterface(packageName, entity, commonIdentifiers);
            }
        };

        for (final MibValueSymbol child : entity.getChildren()) {
            if (child != null && commonIdentifiers.contains(child)) {
                LOG.debug("Identifier is common and will be included:{}", child);

                // Establish type of field - this will create a new class if
                // necessary.
                final JType type = getFieldType(generateChildPackageName(packageName, entity.getName()), child,
                        interfaceBuilder);
                if (type == null) {
                    LOG.debug("Not generating empty entity:{}", child.getName());
                } else {
                    final String fieldName = getMappedName(child.getName());
                    if (!child.isTableRow()) {
                        final JMethod setMethod = definedInterface.method(JMod.NONE, codeModel.VOID,
                                getSetterName(fieldName));
                        setMethod.param(type, fieldName);
                    }
                    definedInterface.method(JMod.NONE, type, getGetterName(fieldName));
                    if (isIsDefinedMethodRequired(child, type)) {
                        definedInterface.method(JMod.NONE, codeModel.BOOLEAN, getIsDefinedName(fieldName));
                    }
                }
            }
        }

        // Add clone to interface
        definedInterface.method(JMod.NONE, definedInterface, "clone");

        addToOidClassMap(entity, definedInterface);
        return definedInterface;
    }

    private boolean isIsDefinedMethodRequired(final MibValueSymbol child, final JType type) {
        if (type == codeModel.INT || type == codeModel.LONG) {
            if (getFieldDefaultValue(child) instanceof NumberValue) {
                return true;
            }
        } else if (type == codeModel.ref(String.class) && getFieldDefaultValue(child) instanceof StringValue) {
            return true;
        }
        return false;
    }

    /**
     * Generate root entity collection.
     *
     * @param classes the classes
     * @return the collection
     */
    public final Collection<String> generateRootEntity(final Map<String, JDefinedClass> classes) {
        final JDefinedClass rootClass = createRootClass();
        final Map<String, JFieldVar> oidRootFieldMap = new HashMap<>();

        // importDependencies();

        for (final Entry<String, JDefinedClass> classEntry : classes.entrySet()) {

            final JDefinedClass topLevelClass = classEntry.getValue();

            // Table rows don't appear in the root entity (yet).
            final Boolean isTableRow = ((ClassMetadata) topLevelClass.metadata).isTableRow();
            if (!isTableRow) {
                // Add the field to the class.
                LOG.debug("class name:{} {}", topLevelClass.fullName(), topLevelClass.name());

                final String fieldName = getUniqueClassIdentifier(topLevelClass);
                final JFieldVar rootField = rootClass.field(JMod.PRIVATE, topLevelClass, fieldName);
                oidRootFieldMap.put(classEntry.getKey(), rootField);
                // Generate accessor methods, but no need for notify on root
                // entity
                generateAccessors(rootClass, rootField.type(), fieldName, -1);
            }
        }

        addStandardMethods(rootClass);

        generateGetRootsMethod(rootClass, oidRootFieldMap);

        generateClassRegistry();

        final Collection<String> classNames = new ArrayList<>();
        classNames.add(rootClass.fullName());
        for (final JDefinedClass clazz : classes.values()) {
            classNames.add(clazz.fullName());
        }
        return classNames;
    }

    private String getUniqueClassIdentifier(final JDefinedClass definedClass) {
        final String name = ((ClassMetadata) definedClass.metadata).getUniqueIdentifier();
        return decapitalizeFirstCharacter(name);
    }

    /**
     * Generate class with map, mapping OIDs to classes.
     */
    private void generateClassRegistry() {
        final JDefinedClass registryClass = createClass(packageName, GeneratedIdentifiers.OID_REGISTRY_CLASSNAME);

        // Create TreeMap, initialised by call to static function.
        JClass typeVar = codeModel.ref(TreeMap.class);
        typeVar = typeVar.narrow(OID.class).narrow(
                codeModel.ref(Class.class).narrow(codeModel.ref(DeviceEntity.class).wildcard()));
        final JFieldVar registryMap = registryClass.field(PUBLIC_FINAL_STATIC, typeVar, "oidRegistry");

        final JMethod initMethod = registryClass.method(JMod.STATIC | JMod.PRIVATE, typeVar, "createMap");
        registryMap.init(JExpr.invoke(initMethod));

        // Instantiate the map.
        final JVar localVar = initMethod.body().decl(typeVar, "map");
        localVar.init(JExpr._new(typeVar));

        // Populate it
        final JClass oidTypeVar = codeModel.ref(OID.class);
        for (final Entry<String, JDefinedClass> entry : oidClasses.entrySet()) {

            // Generate a put of the form:
            // map.put(new OID("1.2.3.3"), Pojo.class);
            final JInvocation putInvocation = initMethod.body().invoke(JExpr.ref("map"), "put");

            final JInvocation newInvocation = JExpr._new(oidTypeVar);
            newInvocation.arg(entry.getKey());

            putInvocation.arg(newInvocation);
            putInvocation.arg(entry.getValue().dotclass());
        }

        // Return the map.
        initMethod.body()._return(JExpr.ref("map"));

    }

    public void importDependencies() {
        try {
            final ImmutableSet<ClassPath.ClassInfo> classes = ClassPath.from(this.getClass().getClassLoader())
                    .getAllClasses();
            for (ClassPath.ClassInfo clazz : classes) {
                if (clazz.getSimpleName().equals(GeneratedIdentifiers.OID_REGISTRY_CLASSNAME)) {
                    LOG.info("Adding OIDs from registry: {}", clazz.getName());
                    final Class loadedClass = this.getClass().getClassLoader().loadClass(clazz.getName());
                    final Field field = loadedClass.getDeclaredField("oidRegistry");
                    final TreeMap<OID, Class<? extends DeviceEntity>> map = (TreeMap<OID, Class<? extends DeviceEntity>>) field
                            .get(null);
                    for (Entry<OID, Class<? extends DeviceEntity>> entry : map.entrySet()) {
                        if (!oidClasses.containsKey(entry.getKey().toString())) {
                            final String fullClassName = getFullClassName(entry.getValue().getPackage().getName(),
                                    entry.getValue().getSimpleName());
                            if (codeModel._getClass(fullClassName) == null) {
                                final JDefinedClass importedClass = createClass(
                                        entry.getValue().getPackage().getName(), entry.getValue().getSimpleName());
                                final ClassMetadata metadata = new ClassMetadata(importedClass);
                                final boolean isTableRow = IIndexed.class.isAssignableFrom(entry.getValue());
                                metadata.setTableRow(isTableRow);
                                importedClass.metadata = metadata;
                                oidClasses.put(entry.getKey().toString(), importedClass);
                                IMPORTED_PACKAGES.add(entry.getValue().getPackage().getName());
                                IMPORTED_SYMBOLS.add(entry.getKey().toString());
                            } else {
                                oidClasses.put(entry.getKey().toString(), codeModel._getClass(fullClassName));
                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {
            LOG.error("Exception adding classpath OIDS.", ex);
        }
    }

    private void generateGetRootsMethod(final JDefinedClass rootClass, final Map<String, JFieldVar> oidRootFieldMap) {
        final JMethod method = rootClass.method(JMod.PUBLIC, codeModel._ref(DeviceEntity[].class), "getRoots");

        final JArray objectArray = JExpr.newArray(codeModel._ref(DeviceEntity.class));
        List<Entry<String, JFieldVar>> entries = new ArrayList<>(oidRootFieldMap.entrySet());
        Collections.sort(entries, new Comparator<Entry<String, JFieldVar>>() {
            @Override
            public int compare(Entry<String, JFieldVar> o1, Entry<String, JFieldVar> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for (final Entry<String, JFieldVar> entry : entries) {
            objectArray.add(entry.getValue());
        }

        method.body()._return(objectArray);
    }

    /**
     * Create the root class.
     * 
     * @return the root class
     */
    private JDefinedClass createRootClass() {
        final JDefinedClass rootClass = createClass(packageName, GeneratedIdentifiers.ROOT_CLASS_NAME);
        rootClass._extends(AbstractRootEntity.class);
        return rootClass;
    }

    /**
     * Gets entity classes.
     *
     * @return the list of full names of the entity classes generated from the
     *         MIB
     */
    public final Map<String, JDefinedClass> getEntityClasses() {
        return oidClasses;
    }

    private String createEntityPackageName(final String rootOid, final MibValueSymbol child) {
        final List<String> names = new ArrayList<>();
        MibValueSymbol parent = child;

        while (!rootOid.equals(getOidFromSymbol(parent)) && parent.getParent() != null) {
            parent = parent.getParent();
            names.add(parent.getName());
        }
        String classPackageName = packageName;
        int nameIndex = names.size();
        while (nameIndex-- > 0) {
            classPackageName = generateChildPackageName(classPackageName, names.get(nameIndex));
        }
        LOG.debug("packageName:{}", classPackageName);
        return classPackageName;
    }

    /**
     * Build a class associated with a Mib Symbol, recursively creating any
     * classes on which the class depends.
     * 
     * @param packageName
     * @param rootSymbol
     * @param parentClass
     * @return
     */
    private JDefinedClass buildClass(final String packageName, final MibValueSymbol rootSymbol,
            final JDefinedClass parentClass) {
        LOG.debug(">>> buildClass package:{} class:{}", packageName, rootSymbol.getName());

        // Create the class, constructor and annotate.
        final JDefinedClass definedClass = createClass(packageName, getClassName(rootSymbol.getName()));
        definedClass.constructor(JMod.PUBLIC);
        definedClass._implements(Serializable.class);
        definedClass._extends(DeviceEntity.class);

        final JDefinedClass abstractInterface = getInterfaceForSymbol(rootSymbol);
        if (abstractInterface != null) {
            LOG.debug("Got interface for {} {}", getOidFromSymbol(rootSymbol), abstractInterface);
            definedClass._implements(abstractInterface);
        }

        definedClass.metadata = createClassMetaData(definedClass, rootSymbol);

        // Create class fields, creating any nested classes as necessary
        final List<MibValueSymbol> children = createChildFields(packageName, rootSymbol, definedClass);

        if (doesObjectIncludeScalarTypes(children)) {
            definedClass._implements(IVariableBindingSetter.class);
            generateSetFromVariableBindingMethod(definedClass, rootSymbol, children);
        }

        if (rootSymbol.isTable()) {
            final MibValueSymbol entrySymbol = children.get(0);
            definedClass._implements(codeModel.ref(ITableAccess.class).narrow(getInterfaceFromOid(entrySymbol)));
            generateTableAccessMethods(definedClass, entrySymbol);
        }

        if (rootSymbol.isTableRow()) {
            createIndexMethod(rootSymbol, definedClass);
            createRelationshipToTable(definedClass, parentClass);
        }

        addStandardMethods(definedClass);

        addToOidClassMap(rootSymbol, definedClass);
        createClassPersistenceAnnotations(definedClass, rootSymbol);

        // Generate all the metadata the class will need.
        generateClassMetadata(rootSymbol, definedClass, children);

        return definedClass;
    }

    private Object createClassMetaData(final JDefinedClass definedClass, final MibValueSymbol rootSymbol) {
        final ClassMetadata metadata = new ClassMetadata(definedClass);
        metadata.setTableRow(rootSymbol.isTableRow());
        return metadata;
    }

    /**
     * Create the child fields for the object.
     * 
     * @param packageName
     * @param rootSymbol
     * @param parentClass
     * @return
     */
    private List<MibValueSymbol> createChildFields(final String packageName, final MibValueSymbol rootSymbol,
            final JDefinedClass parentClass) {
        final MibValueSymbol[] children = rootSymbol.getChildren();
        final List<MibValueSymbol> childEntities = new ArrayList<>();
        final IClassBuilder classBuilder = new IClassBuilder() {
            @Override
            public JClass buildCodeForClass(final String packageName, final MibValueSymbol entity) {
                return buildClass(packageName, entity, parentClass);
            }
        };

        for (final MibValueSymbol child : children) {
            if (child != null) {

                // Establish type of field - this will create a new class if
                // necessary.
                final JType type = getFieldType(generateChildPackageName(packageName, rootSymbol.getName()), child,
                        classBuilder);
                if (type == null) {
                    LOG.debug("Not generating empty entity:{}", child.getName());
                } else {
                    final String fieldName = getMappedName(child.getName());
                    createField(child, fieldName, type, parentClass);
                    childEntities.add(child);
                }
            }
        }
        return childEntities;
    }

    /**
     * Establishes the relationship from a table row entry to its parent table
     * 
     * @param definedClass
     * @param parentClass
     */
    private void createRelationshipToTable(final JDefinedClass definedClass, final JDefinedClass parentClass) {

        final JFieldVar tableVar = definedClass.field(JMod.PRIVATE, parentClass, PARENT_ENTITY_IDENTIFIER);

        // Define setTable method signature: public void _setTable(tableClass
        // table)
        final JMethod setMethod = definedClass.method(JMod.PUBLIC, codeModel.VOID,
                GeneratedIdentifiers.METHOD_SET_TABLE);
        final JVar tableParameter = setMethod.param(parentClass, "table");

        final JBlock body = setMethod.body();
        body.assign(JExpr._this().ref(tableVar), tableParameter);
    }

    /**
     * Creates index details if the symbol defines an indexed object (i.e. one
     * that resides in a table).
     * 
     * @param rootSymbol
     * @param definedClass
     */
    private void createIndexMethod(final MibValueSymbol rootSymbol, final JDefinedClass definedClass) {

        LOG.debug("createIndexMethod root:{} class:{}", rootSymbol, definedClass);

        // Get the index details retrieved from the MIB
        final ArrayList<SnmpIndex> indices = getIndexInformation(rootSymbol);

        // Make the class implement IIndexed, with a method to set its index
        // from an OID.
        definedClass._implements(IIndexed.class);

        // ==============================================================================================
        // Creates a public method to set the index variables of an entity,
        // given an OID of an
        // instance of any of the variables in the entity.
        //
        // Example:
        // If the index looks like: Index { intField1, stringField, intField2 }
        // and the OID of the entity is: 1.4.5.100.1.2
        // the body of the method would look something like:
        //
        // byte[] oidBytes = oid.toByteArray();
        // int[] oidInts = oid.toIntArray();
        // int index = 7; // the offset of the first sub-identifier of the index
        // int len; // length of String index
        //
        // // Get index field intField1
        // setIntField1(oidInts[n]); // See notes
        // n++;
        // // Get index field stringField
        // len = oidInts[n];
        // n++
        // setStringField(new String(oidBytes, n, len)); // See notes
        // n = n + len;
        // // Get index field intField1
        // setIntField2(oidInts[n]); // See notes
        // n++;
        //
        // So, presented with the OID: 1.4.5.100.1.2.1.17.3.65.66.67.18
        // it will assign:
        // 17 to intField1
        // ABC to stringField
        // 18 to intField2
        //
        // Notes
        // - we only need to call the set method for those indexes that are
        // local to the entry that is
        // being indexed.
        // ==============================================================================================

        // Define the method signature: public void _setIndex(OID oid)
        final JMethod setMethod = definedClass.method(JMod.PUBLIC, codeModel.VOID,
                GeneratedIdentifiers.METHOD_SET_INDEX);
        final JVar oidParam = setMethod.param(OID.class, "oid");

        // Establish the zero-based sub-identifier in the OID that defines the
        // first index value.
        // This will be the length of the OID for the containing object + 1
        // (allowing for the sub-identifier
        // that identifies the variable being updated by the OID.
        final int elementOffset = getOidPartCount(rootSymbol) + 1;

        final JBlock body = setMethod.body();

        // Declare local variables
        final JVar byteArrayVar = body.decl(codeModel._ref(byte[].class), "_oidBytes");
        byteArrayVar.init(JExpr.invoke(oidParam, "toByteArray"));

        final JVar intArrayVar = body.decl(codeModel._ref(int[].class), "_oidInts");
        intArrayVar.init(JExpr.invoke(oidParam, "toIntArray"));

        final JVar arrayOffsetVar = body.decl(codeModel.INT, "arrayOffset");
        arrayOffsetVar.init(JExpr.lit(elementOffset));
        final JVar lenVar = body.decl(codeModel.INT, "_len");

        // Create code to save off the index as a string.
        saveIndexAsString(definedClass, body, elementOffset, intArrayVar, oidParam);

        // Create an assignment for each part of the index.
        createIndexPartAssignments(rootSymbol, indices, body, byteArrayVar, intArrayVar, arrayOffsetVar, lenVar);

    }

    private void createIndexPartAssignments(final MibValueSymbol rootSymbol, final ArrayList<SnmpIndex> indices,
            final JBlock body, final JVar byteArrayVar, final JVar intArrayVar, final JVar arrayOffsetVar,
            final JVar lenVar) {
        for (final SnmpIndex index : indices) {

            // Get the child variable for this index
            String indexFieldName = null;
            MibValueSymbol indexField = getChildByOid(rootSymbol, (ObjectIdentifierValue) index.getValue());

            boolean isLocalIndex = false;
            // If the index field is not part of the entry itself, look for it
            // across all the mibs.
            if (indexField == null) {
                indexField = getSymbolByOid(rootSymbol, (ObjectIdentifierValue) index.getValue());
            } else {
                indexFieldName = indexField.getName();
                isLocalIndex = true;
            }

            if (indexField != null) {

                final JType indexType = mapObjectTypeToJavaType(indexField.getType());
                LOG.debug("index Field:{} type:{}", indexField, indexType);
                if (indexType == codeModel.INT) {
                    createIntegerIndexPartAssignment(body, intArrayVar, arrayOffsetVar, indexFieldName, isLocalIndex);

                } else if (indexType == codeModel.ref(String.class)) {
                    createStringIndexPartAssignment(body, byteArrayVar, intArrayVar, arrayOffsetVar, lenVar, index,
                            indexFieldName, indexField, isLocalIndex);

                } else {
                    LOG.warn("Ignoring non-integer index:{} type:{}", index.getValue(), indexType);
                }
            } else {
                LOG.warn("Failed to find index field:{} referenced by:{}", index.getValue(),
                        getOidFromSymbol(rootSymbol));
            }
        }
    }

    @SuppressWarnings("checkstyle:parameternumber")
    private void createStringIndexPartAssignment(final JBlock body, final JVar byteArrayVar, final JVar intArrayVar,
            final JVar arrayOffsetVar, final JVar lenVar, final SnmpIndex index, final String indexFieldName,
            final MibValueSymbol indexField, final boolean isLocalIndex) {
        // Determine how to extract String values from indexfield
        final IIndexFieldConverter indexConverter = getIndexConverter(indexField);

        if (index.isImplied()) {
            if (isLocalIndex) {
                LOG.debug("implied length");
                // Implied length string.
                // Generate:
                // len = oidBytes.length - _index;
                // followed by one of:
                // o setIndexName(new String(oidBytes, _index, len));
                // o setIndexName(_getObjectIdentifier(oidInts, _index, len)); -
                // for an object identifier
                body.assign(lenVar, byteArrayVar.ref("length").minus(arrayOffsetVar));
                final JInvocation setterInvocation = body.invoke(getSetterName(indexFieldName));
                setterInvocation.arg(indexConverter.convert(byteArrayVar, intArrayVar, lenVar, arrayOffsetVar));
            }
        } else {
            final int stringLength = getIndexStringLength(indexField.getType());
            LOG.debug("stringLength {}", stringLength);
            if (stringLength == -1) {
                // Variable length string.
                // Generate:
                // len = oidBytes[_index++];
                // followed by one of:
                // o setIndexName(new String(oidBytes, _index, len));
                // o setIndexName(_getObjectIdentifier(oidInts, _index, len)); -
                // for an object identifier
                // followd by:
                // _index += len;
                body.assign(lenVar, intArrayVar.component(arrayOffsetVar.incr()));
                if (isLocalIndex) {
                    final JInvocation setterInvocation = body.invoke(getSetterName(indexFieldName));
                    setterInvocation.arg(indexConverter.convert(byteArrayVar, intArrayVar, lenVar, arrayOffsetVar));
                }
                body.assignPlus(arrayOffsetVar, lenVar);
            } else {
                // Fixed length string.
                // Generate:
                // setIndexName(new String(oidBytes, _index,
                // stringLength));
                // _index += stringLength;
                if (isLocalIndex) {
                    final JInvocation setterInvocation = body.invoke(getSetterName(indexField));
                    final JInvocation newString = JExpr._new(codeModel.ref(String.class));
                    newString.arg(byteArrayVar).arg(arrayOffsetVar).arg(JExpr.lit(stringLength));
                    setterInvocation.arg(indexConverter.convert(byteArrayVar, intArrayVar, JExpr.lit(stringLength),
                            arrayOffsetVar));
                }
                body.assignPlus(arrayOffsetVar, JExpr.lit(stringLength));
            }
        }
    }

    private void createIntegerIndexPartAssignment(final JBlock body, final JVar intArrayVar, final JVar arrayOffsetVar,
            final String indexFieldName, final boolean isLocalIndex) {
        // Call the setter for the index variable, for example:
        // setIndexName(oidBytes[_index]);
        // _index++;
        if (isLocalIndex) {
            final JInvocation setterInvocation = body.invoke(getSetterName(indexFieldName));
            setterInvocation.arg(intArrayVar.component(arrayOffsetVar));
        }
        body.assignPlus(arrayOffsetVar, JExpr.lit(1));
    }

    private void saveIndexAsString(final JDefinedClass definedClass, final JBlock body, final int elementOffset,
            final JVar intArrayVar, final JVar oidParam) {

        final JVar indexVar = definedClass.field(JMod.PRIVATE, codeModel.ref(String.class), "_index");

        // Generate statement of the form:
        // _index = new OID(intArray, 14, oid.size() - 14).toString()
        body.assign(
                indexVar,
                JExpr._new(codeModel.ref(OID.class)).arg(intArrayVar).arg(JExpr.lit(elementOffset))
                        .arg(oidParam.invoke("size").minus(JExpr.lit(elementOffset))).invoke("toString"));

        // Create method to return the index.
        definedClass.method(JMod.PUBLIC, codeModel.ref(String.class), "_getIndex").body()._return(indexVar);
    }

    /**
     * Retrieve the index information associated with a managed object.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private ArrayList<SnmpIndex> getIndexInformation(final MibValueSymbol rootSymbol) {
        final SnmpObjectType objectType = (SnmpObjectType) rootSymbol.getType();
        final ArrayList indices = objectType.getIndex();

        LOG.debug("entry:{} count:{}", rootSymbol.getValue(), indices.size());
        return indices;
    }

    /**
     * Find the child of a parent, matching a specified OID.
     * 
     * @param rootSymbol
     * @param targetId
     * @return
     */
    private MibValueSymbol getChildByOid(final MibValueSymbol rootSymbol, final ObjectIdentifierValue targetId) {
        for (final MibValueSymbol child : rootSymbol.getChildren()) {
            if (child != null) {
                final ObjectIdentifierValue childId = (ObjectIdentifierValue) child.getValue();
                if (childId.compareTo(targetId) == 0) {
                    return child;
                }
            }
        }
        return null;
    }

    /**
     * Create field in a class.
     * 
     * @param child
     * @param fieldName
     * @param type
     * @param definedClass
     */
    private void createField(final MibValueSymbol child, final String fieldName, final JType type,
            final JDefinedClass definedClass) {

        LOG.debug("Add field {} to class {}", fieldName, definedClass);

        // Add the field to the class.
        final JFieldVar field = definedClass.field(JMod.PRIVATE, getFieldImplementationType(child, type), fieldName);

        // Initialise the field if it's a collection.
        if (child.isTableRow()) {
            final JClass typeVar = codeModel.ref(TreeMap.class);
            final JDefinedClass childClass = getInterfaceFromOid(child);
            field.init(JExpr._new(typeVar.narrow(codeModel.ref(String.class), childClass)));
        }

        generateAccessors(definedClass, child, type, fieldName);
    }

    /**
     * Determine the field implementation type. If a long/integer type has a
     * default value, use Integer/Long rather than the primitive type.
     * 
     * @param child
     * @param type
     * @return
     */
    private JType getFieldImplementationType(final MibValueSymbol child, final JType type) {
        if (fieldHasDefaultValue(child)) {
            if (type == codeModel.INT) {
                return codeModel.ref(Integer.class);
            }
            if (type == codeModel.LONG) {
                return codeModel.ref(Long.class);
            }
        }
        return type;
    }

    private void createClassPersistenceAnnotations(final JDefinedClass definedClass, final MibValueSymbol rootSymbol) {

        if (!rootSymbol.isTableRow()) {
            final JFieldVar parentField = definedClass.field(JMod.PRIVATE, AbstractRootEntity.class,
                    PARENT_ENTITY_IDENTIFIER);

            final JMethod setMethod = definedClass.method(JMod.PUBLIC, codeModel.VOID, "set_ParentEntity");
            final JVar parentParam = setMethod.param(AbstractRootEntity.class, "parent");

            setMethod.body().assign(parentField, parentParam);
        }
    }

    private boolean doesObjectIncludeScalarTypes(final List<MibValueSymbol> childEntities) {
        for (final MibValueSymbol child : childEntities) {
            // If it's a scalar or a table column...
            if (isSimpleType(child)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Generate methods to access table entries.
     * 
     * @param definedClass
     * @param entrySymbol
     */
    private void generateTableAccessMethods(final JDefinedClass definedClass, final MibValueSymbol entrySymbol) {

        final String entryName = getMappedName(entrySymbol.getName());
        final JDefinedClass entryClass = getClassFromOid(entrySymbol);
        final JDefinedClass interfaceClass = getInterfaceFromOid(entrySymbol);

        generateGetEntryMethod(definedClass, entryName, interfaceClass);

        generateSetEntryMethod(definedClass, entryName, interfaceClass, entryClass);

        generateGetEntriesMethod(definedClass, entryName, interfaceClass);

        generateCreateEntryMethod(definedClass, entryClass, getOidFromSymbol(entrySymbol));
    }

    private JDefinedClass getInterfaceForSymbol(final MibValueSymbol entrySymbol) {
        if (interfaceMap != null) {
            return interfaceMap.get(getOidFromSymbol(entrySymbol));
        }
        return null;
    }

    private void generateCreateEntryMethod(final JDefinedClass definedClass, final JDefinedClass entryClass,
            final String entryOid) {

        final JMethod createMethod = definedClass.method(JMod.PUBLIC, entryClass, "createEntry");
        final JVar entryIndex = createMethod.param(String.class, "entryIndex");
        final JBlock body = createMethod.body();

        // Method will look like:
        //
        // public T createEntry(String index) {
        // T newEntry = new T();
        // newEntry._setIndex(new OID(tableOID + ".0." + index));
        // setEntry(index, newEntry);
        // return newEntry;
        // }
        // Note that the index is set before the entry is added to the table.
        // This means that property change events will NOT be fired by any
        // changes made by
        // the _setIndex method.

        final JVar newEntry = body.decl(entryClass, "newEntry").init(JExpr._new(entryClass));
        body.invoke(newEntry, GeneratedIdentifiers.METHOD_SET_INDEX).arg(
                JExpr._new(codeModel.ref(OID.class)).arg(JExpr.lit(entryOid).plus(JExpr.lit(".0.").plus(entryIndex))));
        body.invoke("setEntry").arg(entryIndex).arg(newEntry);
        body._return(newEntry);
    }

    private void generateSetEntryMethod(final JDefinedClass definedClass, final String entryName,
            final JDefinedClass interfaceClass, final JDefinedClass entryClass) {
        final JMethod setMethod = definedClass.method(JMod.PUBLIC, codeModel.VOID, "setEntry");
        final JVar keyVar = setMethod.param(String.class, "key");
        final JVar valueVar = setMethod.param(interfaceClass, "value");

        setMethod.body().invoke(JExpr.ref(entryName), "put").arg(keyVar).arg(valueVar);
        setMethod.body().invoke(JExpr.cast(entryClass, valueVar), GeneratedIdentifiers.METHOD_SET_TABLE)
                .arg(JExpr._this());
        setMethod.body().invoke("addChild").arg(valueVar);
    }

    private void generateGetEntryMethod(final JDefinedClass definedClass, final String entryName,
            final JDefinedClass entryClass) {
        final JMethod getMethod = definedClass.method(JMod.PUBLIC, entryClass, "getEntry");
        final JVar keyVar = getMethod.param(String.class, "key");

        getMethod.body()._return(JExpr.invoke(JExpr.ref(entryName), "get").arg(keyVar));
    }

    private void generateGetEntriesMethod(final JDefinedClass definedClass, final String entryName,
            final JDefinedClass entryClass) {
        final JMethod getMethod = definedClass.method(JMod.PUBLIC, getTableCollectionType(entryClass), "getEntries");
        getMethod.body()._return(JExpr.ref(entryName));
    }

    private JDefinedClass getClassFromOid(final MibValueSymbol child) {
        return oidClasses.get(getOidFromSymbol(child));
    }

    private JDefinedClass getInterfaceFromOid(final MibValueSymbol entity) {
        JDefinedClass interfaceClass = getInterfaceForSymbol(entity);
        if (interfaceClass == null) {
            interfaceClass = getClassFromOid(entity);
        }
        return interfaceClass;
    }

    private void generateSetFromVariableBindingMethod(final JDefinedClass definedClass,
            final MibValueSymbol rootSymbol, final List<MibValueSymbol> childEntities) {
        final JMethod setMethod = definedClass.method(JMod.PUBLIC, codeModel.VOID, "set");
        final JVar binding = setMethod.param(VariableBinding.class, "binding");

        final JSwitch switchExpression = setMethod.body()._switch(
                generateGetVariableIdentifier(JExpr.invoke(binding, "getOid"), rootSymbol));

        for (final MibValueSymbol child : childEntities) {
            // If it's scalar or a table column...
            if (isSimpleType(child)) {

                final int mibIndex = getMibIndex(child);

                final JCase caseExpression = switchExpression._case(JExpr.lit(mibIndex));
                final JInvocation setterInvocation = caseExpression.body().invoke(getSetterName(child));
                setterInvocation.arg(getValueFromVariableBinding(binding, child));
                caseExpression.body()._break();
            }
        }
    }

    private JExpression getValueFromVariableBinding(final JVar binding, final MibValueSymbol child) {
        final JInvocation getValueInvocation = JExpr.invoke(binding, "getVariable");
        if (mapObjectTypeToJavaType(child.getType()) == codeModel.INT) {
            return getValueInvocation.invoke("toInt");
        } else if (mapObjectTypeToJavaType(child.getType()) == codeModel.LONG) {
            return getValueInvocation.invoke("toLong");
        }
        return getValueInvocation.invoke("toString");
    }

    /**
     * Generate an expression to deliver the part of the OID that delivers the
     * type of the variable in the object.
     * 
     * @param oidVar
     * @param rootSymbol
     * @return
     */
    private JExpression generateGetVariableIdentifier(final JExpression oidVar, final MibValueSymbol rootSymbol) {
        final int partCount = getOidPartCount(rootSymbol);
        final JInvocation call = JExpr.invoke(oidVar, "get");
        call.arg(JExpr.lit(partCount));
        return call;
    }

    /**
     * Generate get and set methods for named field of specified type.
     * 
     * @param definedClass
     * @param type
     * @param field
     * @param fieldId
     */
    private void generateAccessors(final JDefinedClass definedClass, final JType type, final String field,
            final int fieldId) {
        generateGetAccessor(null, definedClass, type, field);
        generateSetAccessor(definedClass, type, field, fieldId, true);
    }

    /**
     * Establish Java field type that corresponds to a MibValueSymbol, creating
     * a class, if necessary. Null is returned if the field is an object that
     * has no variables in its tree.
     * 
     * @param extendPackageName
     * @param child
     * @param classBuilder
     * @return
     */
    private JType getFieldType(final String extendPackageName, final MibValueSymbol child,
            final IClassBuilder classBuilder) {

        // If it's scalar or a table column, expect a simple java type.
        if (isSimpleType(child)) {
            return mapObjectTypeToJavaType(child.getType());
        }

        // Otherwise, see if there is any point creating a class.
        if (child.isTableRow()) {
            final JClass type = classBuilder.buildCodeForClass(extendPackageName, child);

            // If the new class is part of a table, create a collection type for
            // it.
            if (child.isTableRow()) {
                final JDefinedClass resolvedType = getInterfaceFromOid(child);
                return getTableCollectionType(resolvedType);
            }
            return type;
        }
        return null;
    }

    /**
     * Create a Collection<type> java type.
     * 
     * @param clazz
     * @return
     */
    private JType getTableCollectionType(final JClass clazz) {
        final JClass typeVar = codeModel.ref(Map.class);
        return typeVar.narrow(codeModel.ref(String.class), clazz);
    }

    /**
     * Return length of fixed length String type, or -1 if it's not fixed.
     * 
     * @param type
     * @return
     */
    private int getIndexStringLength(final MibType type) {
        StringType objectType = null;
        if (((SnmpObjectType) type).getSyntax() instanceof ChoiceType) {
            objectType = (StringType) ((ChoiceType) ((SnmpObjectType) type).getSyntax()).getAllElements()[0].getType();
            LOG.debug("resolved : {}", objectType.getClass());
        } else if (((SnmpObjectType) type).getSyntax() instanceof StringType) {
            objectType = (StringType) ((SnmpObjectType) type).getSyntax();
        }

        if (objectType == null) {
            return -1;
        }

        final Constraint constraint = objectType.getConstraint();
        if (constraint instanceof SizeConstraint) {
            final SizeConstraint sizeConstraint = (SizeConstraint) constraint;
            if (sizeConstraint.getValues().size() == 1) {
                final Constraint valueConstraint = (Constraint) sizeConstraint.getValues().get(0);
                if (valueConstraint instanceof ValueConstraint) {
                    final MibValue value = ((ValueConstraint) valueConstraint).getValue();
                    if (value instanceof NumberValue) {
                        return ((Number) (value.toObject())).intValue();
                    }
                }
            }
        }
        return -1;
    }

    /**
     * Get a standard interface name from a Mib name.
     * 
     * @param name
     * @return
     */
    private String getInterfaceName(final String name) {
        return INTERFACE_PREFIX + getClassName(name);
    }

    /**
     * Deliver the name of the set method of a variable, given its MIB symbol
     * 
     * @param symbol
     * @return
     */
    private String getSetterName(final MibValueSymbol symbol) {
        return getSetterName(getMappedName(symbol.getName()));
    }

    /**
     * Decapitalise first character of the specified name.
     * 
     * @param name
     * @return
     */
    private String decapitalizeFirstCharacter(final String name) {
        final StringBuilder sb = new StringBuilder(name);
        final char firstChar = sb.charAt(0);
        sb.setCharAt(0, Character.toLowerCase(firstChar));
        return sb.toString();
    }

    /**
     * Map OID to class name.
     * 
     * @param rootSymbol
     * @param definedClass
     */
    private void addToOidClassMap(final MibValueSymbol rootSymbol, final JDefinedClass definedClass) {
        oidClasses.put(getOidFromSymbol(rootSymbol), definedClass);

        // Determine if this is a duplicate class name.
        final String className = definedClass.name();
        Integer count = classNameOccurrences.get(className);
        if (count == null) {
            classNameOccurrences.put(className, 0);
        } else {
            final int index = ++count;
            classNameOccurrences.put(className, index);
            ((ClassMetadata) definedClass.metadata).setUniqueIdentifier(definedClass.name() + Integer.toString(index));
        }
    }

    /**
     * Get the number of sub-identifiers that make up the OID.
     * 
     * @param symbol
     * @return
     */
    private int getOidPartCount(final MibValueSymbol symbol) {
        final ObjectIdentifierValue value = (ObjectIdentifierValue) symbol.getValue();
        return value.toString().split("\\.").length;
    }

    private IIndexFieldConverter getIndexConverter(final MibValueSymbol indexField) {
        final MibType type = ((SnmpObjectType) indexField.getType()).getSyntax();

        if (type instanceof ObjectIdentifierType) {
            return objectIdentifierConverter;
        }
        if (type.getReferenceSymbol() != null) {
            final String refSymbolName = type.getReferenceSymbol().getName();
            if ("InetAddress".equals(refSymbolName)) {
                return objectIdentifierConverter;
            }
            if ("MacAddress".equals(refSymbolName) || "PhysAddress".equals(refSymbolName)) {
                return macAddressConverter;
            }
        }

        return defaultConverter;
    }

    private interface IIndexFieldConverter {
        /**
         * Convert j expression.
         *
         * @param byteArray the byte array
         * @param intArray the int array
         * @param lenVar the len var
         * @param offsetVar the offset var
         * @return the j expression
         */
        JExpression convert(JVar byteArray, JVar intArray, JExpression lenVar, JExpression offsetVar);
    }

    private final IIndexFieldConverter objectIdentifierConverter = new IIndexFieldConverter() {
        @Override
        public JExpression convert(final JVar byteArray, final JVar intArray, final JExpression lenVar,
                final JExpression offsetVar) {
            return JExpr.invoke(GeneratedIdentifiers.METHOD_GET_OBJECT_IDENTIFIER).arg(intArray).arg(offsetVar)
                    .arg(lenVar);
        }
    };
    private final IIndexFieldConverter macAddressConverter = new IIndexFieldConverter() {
        @Override
        public JExpression convert(final JVar byteArray, final JVar intArray, final JExpression lenVar,
                final JExpression offsetVar) {
            return JExpr.invoke(GeneratedIdentifiers.METHOD_GET_MACADDRESS).arg(intArray).arg(offsetVar).arg(lenVar);
        }
    };
    private final IIndexFieldConverter defaultConverter = new IIndexFieldConverter() {
        @Override
        public JExpression convert(final JVar byteArray, final JVar intArray, final JExpression lenVar,
                final JExpression offsetVar) {
            return JExpr._new(codeModel.ref(String.class)).arg(byteArray).arg(offsetVar).arg(lenVar);
        }
    };

    private interface IClassBuilder {
        /**
         * Build code for class j class.
         *
         * @param packageName the package name
         * @param entity the entity
         * @return the j class
         */
        JClass buildCodeForClass(String packageName, MibValueSymbol entity);
    }

    private class ClassMetadata {
        private boolean isTableRow;

        /**
         * Used to disambiguate identifiers for classes with the same name.
         */
        private String uniqueIdentifier;

        /**
         * Is table row boolean.
         *
         * @return the boolean
         */
        public boolean isTableRow() {
            return isTableRow;
        }

        /**
         * Sets table row.
         *
         * @param isTableRow the is table row
         */
        public void setTableRow(final boolean isTableRow) {
            this.isTableRow = isTableRow;
        }

        /**
         * Gets unique identifier.
         *
         * @return the unique identifier
         */
        public String getUniqueIdentifier() {
            return uniqueIdentifier;
        }

        /**
         * Sets unique identifier.
         *
         * @param uniqueIdentifier the unique identifier
         */
        public void setUniqueIdentifier(final String uniqueIdentifier) {
            this.uniqueIdentifier = uniqueIdentifier;
        }

        /**
         * Instantiates a new Class metadata.
         *
         * @param definedClass the defined class
         */
        protected ClassMetadata(final JDefinedClass definedClass) {
            uniqueIdentifier = definedClass.name();
        }
    }
}
