
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6addrprefixtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6AddrPrefixEntry
    extends IDeviceEntity
{


    void setIpv6AddrPrefix(String ipv6AddrPrefix);

    String getIpv6AddrPrefix();

    void setIpv6AddrPrefixLength(int ipv6AddrPrefixLength);

    int getIpv6AddrPrefixLength();

    void setIpv6AddrPrefixOnLinkFlag(int ipv6AddrPrefixOnLinkFlag);

    int getIpv6AddrPrefixOnLinkFlag();

    void setIpv6AddrPrefixAutonomousFlag(int ipv6AddrPrefixAutonomousFlag);

    int getIpv6AddrPrefixAutonomousFlag();

    void setIpv6AddrPrefixAdvPreferredLifetime(int ipv6AddrPrefixAdvPreferredLifetime);

    int getIpv6AddrPrefixAdvPreferredLifetime();

    void setIpv6AddrPrefixAdvValidLifetime(int ipv6AddrPrefixAdvValidLifetime);

    int getIpv6AddrPrefixAdvValidLifetime();

    IIpv6AddrPrefixEntry clone();

}
