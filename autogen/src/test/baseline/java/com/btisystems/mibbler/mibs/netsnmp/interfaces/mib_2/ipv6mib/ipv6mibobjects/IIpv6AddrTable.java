
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6addrtable.IIpv6AddrEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6AddrTable
    extends IDeviceEntity
{


    Map<String, IIpv6AddrEntry> getIpv6AddrEntry();

    IIpv6AddrTable clone();

}
