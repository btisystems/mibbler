
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipv6scopezoneindextable.IIpv6ScopeZoneIndexEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6ScopeZoneIndexTable
    extends IDeviceEntity
{


    Map<String, IIpv6ScopeZoneIndexEntry> getIpv6ScopeZoneIndexEntry();

    IIpv6ScopeZoneIndexTable clone();

}
