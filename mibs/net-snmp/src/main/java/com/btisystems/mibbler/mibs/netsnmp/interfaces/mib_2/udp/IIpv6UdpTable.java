
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.udp;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.udp.ipv6udptable.IIpv6UdpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6UdpTable
    extends IDeviceEntity
{


    Map<String, IIpv6UdpEntry> getIpv6UdpEntry();

    IIpv6UdpTable clone();

}
