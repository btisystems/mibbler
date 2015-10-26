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
 * Represents a MIB source to be compiled by autogen.
 */
public class MibSource extends MibInput {

    /**
     * Name of the database schema to which entity classes will be saved.
     */
    private  String schemaName;

    /**
     * The name of the common sets to be referenced.
     */
    private List<String> commonNameList;

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

