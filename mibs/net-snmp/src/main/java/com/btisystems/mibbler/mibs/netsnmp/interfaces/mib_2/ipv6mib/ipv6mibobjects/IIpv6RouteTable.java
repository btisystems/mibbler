
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6routetable.IIpv6RouteEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6RouteTable
    extends IDeviceEntity
{


    Map<String, IIpv6RouteEntry> getIpv6RouteEntry();

    IIpv6RouteTable clone();

}
