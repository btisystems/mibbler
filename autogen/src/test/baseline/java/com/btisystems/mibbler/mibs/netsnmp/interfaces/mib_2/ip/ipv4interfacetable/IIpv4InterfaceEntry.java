
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipv4interfacetable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv4InterfaceEntry
    extends IDeviceEntity
{


    void setIpv4InterfaceIfIndex(int ipv4InterfaceIfIndex);

    int getIpv4InterfaceIfIndex();

    void setIpv4InterfaceReasmMaxSize(int ipv4InterfaceReasmMaxSize);

    int getIpv4InterfaceReasmMaxSize();

    void setIpv4InterfaceEnableStatus(int ipv4InterfaceEnableStatus);

    int getIpv4InterfaceEnableStatus();

    void setIpv4InterfaceRetransmitTime(int ipv4InterfaceRetransmitTime);

    int getIpv4InterfaceRetransmitTime();

    boolean isIpv4InterfaceRetransmitTimeDefined();

    IIpv4InterfaceEntry clone();

}
