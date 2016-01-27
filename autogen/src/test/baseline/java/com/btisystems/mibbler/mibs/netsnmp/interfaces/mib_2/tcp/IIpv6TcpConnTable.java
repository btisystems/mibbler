
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp.ipv6tcpconntable.IIpv6TcpConnEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6TcpConnTable
    extends IDeviceEntity
{


    Map<String, IIpv6TcpConnEntry> getIpv6TcpConnEntry();

    IIpv6TcpConnTable clone();

}
