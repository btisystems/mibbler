
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6routetable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6RouteEntry
    extends IDeviceEntity
{


    void setIpv6RouteDest(String ipv6RouteDest);

    String getIpv6RouteDest();

    void setIpv6RoutePfxLength(int ipv6RoutePfxLength);

    int getIpv6RoutePfxLength();

    void setIpv6RouteIndex(int ipv6RouteIndex);

    int getIpv6RouteIndex();

    void setIpv6RouteIfIndex(int ipv6RouteIfIndex);

    int getIpv6RouteIfIndex();

    void setIpv6RouteNextHop(String ipv6RouteNextHop);

    String getIpv6RouteNextHop();

    void setIpv6RouteType(int ipv6RouteType);

    int getIpv6RouteType();

    void setIpv6RouteProtocol(int ipv6RouteProtocol);

    int getIpv6RouteProtocol();

    void setIpv6RoutePolicy(int ipv6RoutePolicy);

    int getIpv6RoutePolicy();

    void setIpv6RouteAge(int ipv6RouteAge);

    int getIpv6RouteAge();

    void setIpv6RouteNextHopRDI(int ipv6RouteNextHopRDI);

    int getIpv6RouteNextHopRDI();

    void setIpv6RouteMetric(int ipv6RouteMetric);

    int getIpv6RouteMetric();

    void setIpv6RouteWeight(int ipv6RouteWeight);

    int getIpv6RouteWeight();

    void setIpv6RouteInfo(String ipv6RouteInfo);

    String getIpv6RouteInfo();

    void setIpv6RouteValid(int ipv6RouteValid);

    int getIpv6RouteValid();

    boolean isIpv6RouteValidDefined();

    IIpv6RouteEntry clone();

}
