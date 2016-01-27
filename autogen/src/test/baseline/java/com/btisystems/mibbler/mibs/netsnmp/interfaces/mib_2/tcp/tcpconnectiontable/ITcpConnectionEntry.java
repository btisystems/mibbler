
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp.tcpconnectiontable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITcpConnectionEntry
    extends IDeviceEntity
{


    void setTcpConnectionLocalAddressType(int tcpConnectionLocalAddressType);

    int getTcpConnectionLocalAddressType();

    void setTcpConnectionLocalAddress(String tcpConnectionLocalAddress);

    String getTcpConnectionLocalAddress();

    void setTcpConnectionLocalPort(int tcpConnectionLocalPort);

    int getTcpConnectionLocalPort();

    void setTcpConnectionRemAddressType(int tcpConnectionRemAddressType);

    int getTcpConnectionRemAddressType();

    void setTcpConnectionRemAddress(String tcpConnectionRemAddress);

    String getTcpConnectionRemAddress();

    void setTcpConnectionRemPort(int tcpConnectionRemPort);

    int getTcpConnectionRemPort();

    void setTcpConnectionState(int tcpConnectionState);

    int getTcpConnectionState();

    void setTcpConnectionProcess(int tcpConnectionProcess);

    int getTcpConnectionProcess();

    ITcpConnectionEntry clone();

}
