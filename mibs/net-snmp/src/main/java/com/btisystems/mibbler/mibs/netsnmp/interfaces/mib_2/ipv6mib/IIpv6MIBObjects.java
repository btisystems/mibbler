
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6MIBObjects
    extends IDeviceEntity
{


    void setIpv6Forwarding(int ipv6Forwarding);

    int getIpv6Forwarding();

    void setIpv6DefaultHopLimit(int ipv6DefaultHopLimit);

    int getIpv6DefaultHopLimit();

    boolean isIpv6DefaultHopLimitDefined();

    void setIpv6Interfaces(int ipv6Interfaces);

    int getIpv6Interfaces();

    void setIpv6IfTableLastChange(int ipv6IfTableLastChange);

    int getIpv6IfTableLastChange();

    void setIpv6RouteNumber(int ipv6RouteNumber);

    int getIpv6RouteNumber();

    void setIpv6DiscardedRoutes(int ipv6DiscardedRoutes);

    int getIpv6DiscardedRoutes();

    IIpv6MIBObjects clone();

}
