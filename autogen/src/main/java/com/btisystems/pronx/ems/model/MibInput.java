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
 * $Id$
 */
package com.btisystems.pronx.ems.model;

import static com.google.common.base.Preconditions.checkNotNull;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.InitializingBean;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Represents MIB input source to be processed by autogen.
 */
public abstract class MibInput implements InitializingBean {

    /**
     * The name of the files containing the source to be compiled.
     */
    private  List<String> sourceFilenames;

    /**
     * The name of the directories containing the source files.
     */
    private List<String> sourceDirectoryList;

    /**
     * The name of the java package to which generated classes are to belong.
     */
    private  String packageName;

    /**
     * The default source directories to be given to the Mib Loader.
     */
    private List<String> defaultSourceDirectories;

    /**
     * The OIDs of the root objects we are interested in.
     */
    private List<String> rootObjects;

    /**
     * The OIDs of the root of sub-trees that should be excluded from the compilation.
     */
    private Set<String> excludedRootObjects;


    /**
     * Sets root objects.
     *
     * @param rootObjects the root objects
     */
//    @Required
    public final void setRootObjects(final List<String> rootObjects) {
        this.rootObjects = rootObjects;
    }

    /**
     * Sets package name.
     *
     * @param packageName the package name
     */
//    @Required
    public final void setPackageName(final String packageName) {
        this.packageName = packageName;
    }

    /**
     * Sets source filenames.
     *
     * @param sourceFilenames the source filenames
     */
    public final void setSourceFilenames(final List<String> sourceFilenames) {
        this.sourceFilenames = sourceFilenames;
    }

    /**
     * Sets source directory list.
     *
     * @param directoryNameList the directory name list
     */
    public final void setSourceDirectoryList(final List<String> directoryNameList) {
        this.sourceDirectoryList = directoryNameList;
    }

    public List<String> getSourceDirectoryList() {
        return sourceDirectoryList;
    }

    /**
     * Sets default source directories.
     *
     * @param defaultSourceDirectories the default source directories
     */
    public final void setDefaultSourceDirectories(final List<String> defaultSourceDirectories) {
        this.defaultSourceDirectories = defaultSourceDirectories;
    }

    /**
     * Sets excluded root objects.
     *
     * @param exclusionRootObjects the exclusion root objects
     */
    public final void setExcludedRootObjects(final Set<String> exclusionRootObjects) {
        this.excludedRootObjects = exclusionRootObjects;
    }

    @Override
    public final void afterPropertiesSet() throws Exception {

        // Check that source files have been defined in exactly one way.
        if (sourceDirectoryList != null) {
            if (sourceFilenames != null) {
                throw new BeanInitializationException("Cannot set both sourceFilenames and directoryName properties");
            }
        } else if (sourceFilenames == null) {
            throw new BeanInitializationException("Neither sourceFilenames nor directoryName property set");
        }
    }

    /**
     * Gets source filenames.
     *
     * @return the source filenames
     */
    public final List<String> getSourceFilenames() {
        if (sourceFilenames != null) {
            return sourceFilenames;
        }

        return loadSourceFilenamesFromDirectoryList();
    }

    /**
     * Gets package name.
     *
     * @return the package name
     */
    public final String getPackageName() {
        return packageName;
    }

    /**
     * Gets default source directories.
     *
     * @return the default source directories
     */
    public final List<String> getDefaultSourceDirectories() {
        return defaultSourceDirectories;
    }

    /**
     * Gets root objects.
     *
     * @return the root objects
     */
    public final List<String> getRootObjects() {
        return rootObjects;
    }

    /**
     * Gets excluded root objects.
     *
     * @return the excluded root objects
     */
    public final Set<String> getExcludedRootObjects() {
        return excludedRootObjects;
    }

    /**
     * Loads the Source Filenames from a Directory List.
     *
     * @return list of filenames
     */
    private List<String> loadSourceFilenamesFromDirectoryList() {
        final List<String> filenames = new ArrayList<>();
        for (final String sourceDirectory : sourceDirectoryList) {
            final File directory = new File(sourceDirectory);
            final File[] listFiles = checkNotNull(
                    directory.listFiles(),
                    "Invalid source directory=" + sourceDirectory);
            for (final File file : listFiles) {
                filenames.add(file.getPath());
            }
        }
        return filenames;
    }
}
