
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.udp.udpendpointtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IUdpEndpointEntry
    extends IDeviceEntity
{


    void setUdpEndpointLocalAddressType(int udpEndpointLocalAddressType);

    int getUdpEndpointLocalAddressType();

    void setUdpEndpointLocalAddress(String udpEndpointLocalAddress);

    String getUdpEndpointLocalAddress();

    void setUdpEndpointLocalPort(int udpEndpointLocalPort);

    int getUdpEndpointLocalPort();

    void setUdpEndpointRemoteAddressType(int udpEndpointRemoteAddressType);

    int getUdpEndpointRemoteAddressType();

    void setUdpEndpointRemoteAddress(String udpEndpointRemoteAddress);

    String getUdpEndpointRemoteAddress();

    void setUdpEndpointRemotePort(int udpEndpointRemotePort);

    int getUdpEndpointRemotePort();

    void setUdpEndpointInstance(int udpEndpointInstance);

    int getUdpEndpointInstance();

    void setUdpEndpointProcess(int udpEndpointProcess);

    int getUdpEndpointProcess();

    IUdpEndpointEntry clone();

}
