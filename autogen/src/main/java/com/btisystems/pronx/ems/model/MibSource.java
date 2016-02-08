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
 * Represents a MIB source to be compiled by autogen.
 */
public class MibSource extends MibInput {

    /**
     * Name of the database schema to which entity classes will be saved.
     */
    private String schemaName;

    /**
     * The name of the common sets to be referenced.
     */
    private List<String> commonNameList;

    public MibSource() {
    }

    /**
     * Whether the tool should generate Notification objects or not.
     */

    private boolean generateNotificationObjects;

    /**
     * Sets common name list.
     *
     * @param commonNameList the common name list
     */
    public final void setCommonNameList(final List<String> commonNameList) {
        this.commonNameList = commonNameList;
    }

    /**
     * Sets schema name.
     *
     * @param schemaName the schema name
     */
    @Required
    public final void setSchemaName(final String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * Sets generate notification objects.
     *
     * @param generateNotificationObjects the generate notification objects
     */
    public final void setGenerateNotificationObjects(final boolean generateNotificationObjects) {
        this.generateNotificationObjects = generateNotificationObjects;
    }

    /**
     * Gets schema name.
     *
     * @return the schema name
     */
    public final String getSchemaName() {
        return schemaName;
    }

    /**
     * Gets common name list.
     *
     * @return the common name list
     */
    public final List<String> getCommonNameList() {
        return commonNameList;
    }

    /**
     * Is generate notification objects boolean.
     *
     * @return the boolean
     */
    public final boolean isGenerateNotificationObjects() {
        return generateNotificationObjects;
    }

}
