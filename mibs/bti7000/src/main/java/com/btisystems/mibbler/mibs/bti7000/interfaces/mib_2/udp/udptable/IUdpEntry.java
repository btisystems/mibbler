
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.udp.udptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IUdpEntry
    extends IDeviceEntity
{


    void setUdpLocalAddress(String udpLocalAddress);

    String getUdpLocalAddress();

    void setUdpLocalPort(int udpLocalPort);

    int getUdpLocalPort();

    IUdpEntry clone();

}
