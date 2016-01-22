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

import org.springframework.beans.factory.annotation.Required;

/**
 * Represents common MIB source to be processed by autogen.
 */
public class MibCommon extends MibInput {


    private String name;

    public MibCommon() {
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
     * Gets name.
     *
     * @return the name
     */
    public final String getName() {
        return name;
    }

}

