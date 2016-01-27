
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.udp;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.udp.udpendpointtable.IUdpEndpointEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IUdpEndpointTable
    extends IDeviceEntity
{


    Map<String, IUdpEndpointEntry> getUdpEndpointEntry();

    IUdpEndpointTable clone();

}
