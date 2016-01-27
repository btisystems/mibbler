
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipv6interfacetable.IIpv6InterfaceEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6InterfaceTable
    extends IDeviceEntity
{


    Map<String, IIpv6InterfaceEntry> getIpv6InterfaceEntry();

    IIpv6InterfaceTable clone();

}
