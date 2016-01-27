
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp.tcpconnectiontable.ITcpConnectionEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITcpConnectionTable
    extends IDeviceEntity
{


    Map<String, ITcpConnectionEntry> getTcpConnectionEntry();

    ITcpConnectionTable clone();

}
