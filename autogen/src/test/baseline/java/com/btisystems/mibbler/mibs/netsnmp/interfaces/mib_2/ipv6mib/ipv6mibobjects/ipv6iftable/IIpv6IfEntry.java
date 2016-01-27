
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6iftable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6IfEntry
    extends IDeviceEntity
{


    void setIpv6IfIndex(int ipv6IfIndex);

    int getIpv6IfIndex();

    void setIpv6IfDescr(String ipv6IfDescr);

    String getIpv6IfDescr();

    void setIpv6IfLowerLayer(String ipv6IfLowerLayer);

    String getIpv6IfLowerLayer();

    void setIpv6IfEffectiveMtu(int ipv6IfEffectiveMtu);

    int getIpv6IfEffectiveMtu();

    void setIpv6IfReasmMaxSize(int ipv6IfReasmMaxSize);

    int getIpv6IfReasmMaxSize();

    void setIpv6IfIdentifier(String ipv6IfIdentifier);

    String getIpv6IfIdentifier();

    void setIpv6IfIdentifierLength(int ipv6IfIdentifierLength);

    int getIpv6IfIdentifierLength();

    void setIpv6IfPhysicalAddress(String ipv6IfPhysicalAddress);

    String getIpv6IfPhysicalAddress();

    void setIpv6IfAdminStatus(int ipv6IfAdminStatus);

    int getIpv6IfAdminStatus();

    void setIpv6IfOperStatus(int ipv6IfOperStatus);

    int getIpv6IfOperStatus();

    void setIpv6IfLastChange(int ipv6IfLastChange);

    int getIpv6IfLastChange();

    IIpv6IfEntry clone();

}
