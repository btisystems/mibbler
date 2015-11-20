
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp.tcpconntable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITcpConnEntry
    extends IDeviceEntity
{


    void setTcpConnState(int tcpConnState);

    int getTcpConnState();

    void setTcpConnLocalAddress(String tcpConnLocalAddress);

    String getTcpConnLocalAddress();

    void setTcpConnLocalPort(int tcpConnLocalPort);

    int getTcpConnLocalPort();

    void setTcpConnRemAddress(String tcpConnRemAddress);

    String getTcpConnRemAddress();

    void setTcpConnRemPort(int tcpConnRemPort);

    int getTcpConnRemPort();

    ITcpConnEntry clone();

}
