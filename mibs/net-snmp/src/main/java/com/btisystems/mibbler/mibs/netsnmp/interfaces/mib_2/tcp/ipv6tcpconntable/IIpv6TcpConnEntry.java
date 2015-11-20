
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp.ipv6tcpconntable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6TcpConnEntry
    extends IDeviceEntity
{


    void setIpv6TcpConnLocalAddress(String ipv6TcpConnLocalAddress);

    String getIpv6TcpConnLocalAddress();

    void setIpv6TcpConnLocalPort(int ipv6TcpConnLocalPort);

    int getIpv6TcpConnLocalPort();

    void setIpv6TcpConnRemAddress(String ipv6TcpConnRemAddress);

    String getIpv6TcpConnRemAddress();

    void setIpv6TcpConnRemPort(int ipv6TcpConnRemPort);

    int getIpv6TcpConnRemPort();

    void setIpv6TcpConnIfIndex(int ipv6TcpConnIfIndex);

    int getIpv6TcpConnIfIndex();

    void setIpv6TcpConnState(int ipv6TcpConnState);

    int getIpv6TcpConnState();

    IIpv6TcpConnEntry clone();

}
