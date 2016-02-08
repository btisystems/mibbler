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
