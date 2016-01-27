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
