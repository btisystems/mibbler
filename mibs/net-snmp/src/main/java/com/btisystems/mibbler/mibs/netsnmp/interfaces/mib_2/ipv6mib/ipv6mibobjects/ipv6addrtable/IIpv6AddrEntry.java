
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6addrtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6AddrEntry
    extends IDeviceEntity
{


    void setIpv6AddrAddress(String ipv6AddrAddress);

    String getIpv6AddrAddress();

    void setIpv6AddrPfxLength(int ipv6AddrPfxLength);

    int getIpv6AddrPfxLength();

    void setIpv6AddrType(int ipv6AddrType);

    int getIpv6AddrType();

    void setIpv6AddrAnycastFlag(int ipv6AddrAnycastFlag);

    int getIpv6AddrAnycastFlag();

    void setIpv6AddrStatus(int ipv6AddrStatus);

    int getIpv6AddrStatus();

    IIpv6AddrEntry clone();

}
