
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipv4interfacetable.IIpv4InterfaceEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv4InterfaceTable
    extends IDeviceEntity
{


    Map<String, IIpv4InterfaceEntry> getIpv4InterfaceEntry();

    IIpv4InterfaceTable clone();

}
