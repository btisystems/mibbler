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
package com.btisystems.pronx.ems.inherited;

import com.btisystems.pronx.ems.core.model.DeviceEntity;
import org.snmp4j.smi.OID;

import java.lang.*;
import java.util.TreeMap;

public class _OidRegistry {
    public final static TreeMap<OID, Class<? extends DeviceEntity>> oidRegistry = createMap();

    private static TreeMap<OID, Class<? extends DeviceEntity>> createMap() {
        TreeMap<OID, Class<? extends DeviceEntity>> map = new TreeMap<OID, Class<? extends DeviceEntity>>();
        map.put(new OID("1.3.6.1.2.1.1"), System.class);
        return map;
    }

}
