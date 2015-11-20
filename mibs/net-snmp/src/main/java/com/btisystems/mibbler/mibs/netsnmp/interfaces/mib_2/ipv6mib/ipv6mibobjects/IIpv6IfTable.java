
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6iftable.IIpv6IfEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6IfTable
    extends IDeviceEntity
{


    Map<String, IIpv6IfEntry> getIpv6IfEntry();

    IIpv6IfTable clone();

}
