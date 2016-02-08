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
