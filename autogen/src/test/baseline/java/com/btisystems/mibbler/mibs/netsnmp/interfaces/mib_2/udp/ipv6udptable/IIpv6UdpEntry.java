
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.udp.ipv6udptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6UdpEntry
    extends IDeviceEntity
{


    void setIpv6UdpLocalAddress(String ipv6UdpLocalAddress);

    String getIpv6UdpLocalAddress();

    void setIpv6UdpLocalPort(int ipv6UdpLocalPort);

    int getIpv6UdpLocalPort();

    void setIpv6UdpIfIndex(int ipv6UdpIfIndex);

    int getIpv6UdpIfIndex();

    IIpv6UdpEntry clone();

}
