
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipv6routeradverttable.IIpv6RouterAdvertEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6RouterAdvertTable
    extends IDeviceEntity
{


    Map<String, IIpv6RouterAdvertEntry> getIpv6RouterAdvertEntry();

    IIpv6RouterAdvertTable clone();

}
