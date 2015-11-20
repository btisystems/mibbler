
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6addrprefixtable.IIpv6AddrPrefixEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6AddrPrefixTable
    extends IDeviceEntity
{


    Map<String, IIpv6AddrPrefixEntry> getIpv6AddrPrefixEntry();

    IIpv6AddrPrefixTable clone();

}
