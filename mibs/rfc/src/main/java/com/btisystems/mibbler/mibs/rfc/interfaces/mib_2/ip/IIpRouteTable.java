
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.ip;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.ip.iproutetable.IIpRouteEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpRouteTable
    extends IDeviceEntity
{


    Map<String, IIpRouteEntry> getIpRouteEntry();

    IIpRouteTable clone();

}
