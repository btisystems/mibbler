
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6ifstatstable.IIpv6IfStatsEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6IfStatsTable
    extends IDeviceEntity
{


    Map<String, IIpv6IfStatsEntry> getIpv6IfStatsEntry();

    IIpv6IfStatsTable clone();

}
