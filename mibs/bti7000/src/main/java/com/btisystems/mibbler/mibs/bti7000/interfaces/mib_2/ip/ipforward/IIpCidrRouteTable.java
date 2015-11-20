
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ip.ipforward;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ip.ipforward.ipcidrroutetable.IIpCidrRouteEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpCidrRouteTable
    extends IDeviceEntity
{


    Map<String, IIpCidrRouteEntry> getIpCidrRouteEntry();

    IIpCidrRouteTable clone();

}
