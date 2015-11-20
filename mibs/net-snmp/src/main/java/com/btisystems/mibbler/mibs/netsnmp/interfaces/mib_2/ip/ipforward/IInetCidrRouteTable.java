
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipforward;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipforward.inetcidrroutetable.IInetCidrRouteEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IInetCidrRouteTable
    extends IDeviceEntity
{


    Map<String, IInetCidrRouteEntry> getInetCidrRouteEntry();

    IInetCidrRouteTable clone();

}
