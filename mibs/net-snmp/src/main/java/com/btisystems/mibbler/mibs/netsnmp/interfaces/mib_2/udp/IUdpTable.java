
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.udp;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.udp.udptable.IUdpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IUdpTable
    extends IDeviceEntity
{


    Map<String, IUdpEntry> getUdpEntry();

    IUdpTable clone();

}
