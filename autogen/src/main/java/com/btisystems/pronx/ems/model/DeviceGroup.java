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

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

/**
 * Represents a group of mib source sets, relating to a single device type.
 */
public class DeviceGroup {
    /**
     * The sets of mib sources for different device variants.
     */
    private List<MibSource> sourceMibs;

    /**
     * Name used to identify the group.
     */
    private String name;

    /**
     * The name of the java package to which generated classes are to belong.
     */
    private String packageName;

    /**
     * The name of the package used to contain interfaces (added to
     * packageName).
     */
    private String interfacePackageName;

    /**
     * Gets source mibs.
     *
     * @return the source mibs
     */
    @Required
    public final List<MibSource> getSourceMibs() {
        return sourceMibs;
    }

    /**
     * Sets source mibs.
     *
     * @param sourceMibs the source mibs
     */
    @Required
    public final void setSourceMibs(final List<MibSource> sourceMibs) {
        this.sourceMibs = sourceMibs;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    @Required
    public final void setName(final String name) {
        this.name = name;
    }

    /**
     * Sets interface package name.
     *
     * @param interfacePackageName the interface package name
     */
    @Required
    public final void setInterfacePackageName(final String interfacePackageName) {
        this.interfacePackageName = interfacePackageName;
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
     * Sets package name.
     *
     * @param packageName the package name
     */
    public final void setPackageName(final String packageName) {
        this.packageName = packageName;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public final String getName() {
        return name;
    }

    /**
     * Gets interface package name.
     *
     * @return the interface package name
     */
    public final String getInterfacePackageName() {
        return interfacePackageName;
    }

}
