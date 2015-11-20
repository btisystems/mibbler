
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp.tcplistenertable.ITcpListenerEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITcpListenerTable
    extends IDeviceEntity
{


    Map<String, ITcpListenerEntry> getTcpListenerEntry();

    ITcpListenerTable clone();

}
