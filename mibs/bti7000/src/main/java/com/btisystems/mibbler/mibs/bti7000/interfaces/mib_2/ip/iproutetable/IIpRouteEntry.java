
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ip.iproutetable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpRouteEntry
    extends IDeviceEntity
{


    void setIpRouteDest(String ipRouteDest);

    String getIpRouteDest();

    void setIpRouteIfIndex(int ipRouteIfIndex);

    int getIpRouteIfIndex();

    void setIpRouteMetric1(int ipRouteMetric1);

    int getIpRouteMetric1();

    void setIpRouteMetric2(int ipRouteMetric2);

    int getIpRouteMetric2();

    void setIpRouteMetric3(int ipRouteMetric3);

    int getIpRouteMetric3();

    void setIpRouteMetric4(int ipRouteMetric4);

    int getIpRouteMetric4();

    void setIpRouteNextHop(String ipRouteNextHop);

    String getIpRouteNextHop();

    void setIpRouteType(int ipRouteType);

    int getIpRouteType();

    void setIpRouteProto(int ipRouteProto);

    int getIpRouteProto();

    void setIpRouteAge(int ipRouteAge);

    int getIpRouteAge();

    void setIpRouteMask(String ipRouteMask);

    String getIpRouteMask();

    void setIpRouteMetric5(int ipRouteMetric5);

    int getIpRouteMetric5();

    void setIpRouteInfo(String ipRouteInfo);

    String getIpRouteInfo();

    IIpRouteEntry clone();

}
