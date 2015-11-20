
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.tcp;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.tcp.tcpconntable.ITcpConnEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITcpConnTable
    extends IDeviceEntity
{


    Map<String, ITcpConnEntry> getTcpConnEntry();

    ITcpConnTable clone();

}
