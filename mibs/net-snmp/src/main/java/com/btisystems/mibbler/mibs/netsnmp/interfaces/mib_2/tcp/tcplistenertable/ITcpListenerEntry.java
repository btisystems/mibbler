
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp.tcplistenertable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITcpListenerEntry
    extends IDeviceEntity
{


    void setTcpListenerLocalAddressType(int tcpListenerLocalAddressType);

    int getTcpListenerLocalAddressType();

    void setTcpListenerLocalAddress(String tcpListenerLocalAddress);

    String getTcpListenerLocalAddress();

    void setTcpListenerLocalPort(int tcpListenerLocalPort);

    int getTcpListenerLocalPort();

    void setTcpListenerProcess(int tcpListenerProcess);

    int getTcpListenerProcess();

    ITcpListenerEntry clone();

}
