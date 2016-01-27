
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipv6interfacetable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6InterfaceEntry
    extends IDeviceEntity
{


    void setIpv6InterfaceIfIndex(int ipv6InterfaceIfIndex);

    int getIpv6InterfaceIfIndex();

    void setIpv6InterfaceReasmMaxSize(int ipv6InterfaceReasmMaxSize);

    int getIpv6InterfaceReasmMaxSize();

    void setIpv6InterfaceIdentifier(String ipv6InterfaceIdentifier);

    String getIpv6InterfaceIdentifier();

    void setIpv6InterfaceEnableStatus(int ipv6InterfaceEnableStatus);

    int getIpv6InterfaceEnableStatus();

    void setIpv6InterfaceReachableTime(int ipv6InterfaceReachableTime);

    int getIpv6InterfaceReachableTime();

    void setIpv6InterfaceRetransmitTime(int ipv6InterfaceRetransmitTime);

    int getIpv6InterfaceRetransmitTime();

    void setIpv6InterfaceForwarding(int ipv6InterfaceForwarding);

    int getIpv6InterfaceForwarding();

    IIpv6InterfaceEntry clone();

}
