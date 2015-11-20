
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipdefaultroutertable.IIpDefaultRouterEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpDefaultRouterTable
    extends IDeviceEntity
{


    Map<String, IIpDefaultRouterEntry> getIpDefaultRouterEntry();

    IIpDefaultRouterTable clone();

}
