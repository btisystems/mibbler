
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipforward.ipcidrroutetable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpCidrRouteEntry
    extends IDeviceEntity
{


    void setIpCidrRouteDest(String ipCidrRouteDest);

    String getIpCidrRouteDest();

    void setIpCidrRouteMask(String ipCidrRouteMask);

    String getIpCidrRouteMask();

    void setIpCidrRouteTos(int ipCidrRouteTos);

    int getIpCidrRouteTos();

    void setIpCidrRouteNextHop(String ipCidrRouteNextHop);

    String getIpCidrRouteNextHop();

    void setIpCidrRouteIfIndex(int ipCidrRouteIfIndex);

    int getIpCidrRouteIfIndex();

    boolean isIpCidrRouteIfIndexDefined();

    void setIpCidrRouteType(int ipCidrRouteType);

    int getIpCidrRouteType();

    void setIpCidrRouteProto(int ipCidrRouteProto);

    int getIpCidrRouteProto();

    void setIpCidrRouteAge(int ipCidrRouteAge);

    int getIpCidrRouteAge();

    boolean isIpCidrRouteAgeDefined();

    void setIpCidrRouteInfo(String ipCidrRouteInfo);

    String getIpCidrRouteInfo();

    void setIpCidrRouteNextHopAS(int ipCidrRouteNextHopAS);

    int getIpCidrRouteNextHopAS();

    boolean isIpCidrRouteNextHopASDefined();

    void setIpCidrRouteMetric1(int ipCidrRouteMetric1);

    int getIpCidrRouteMetric1();

    boolean isIpCidrRouteMetric1Defined();

    void setIpCidrRouteMetric2(int ipCidrRouteMetric2);

    int getIpCidrRouteMetric2();

    boolean isIpCidrRouteMetric2Defined();

    void setIpCidrRouteMetric3(int ipCidrRouteMetric3);

    int getIpCidrRouteMetric3();

    boolean isIpCidrRouteMetric3Defined();

    void setIpCidrRouteMetric4(int ipCidrRouteMetric4);

    int getIpCidrRouteMetric4();

    boolean isIpCidrRouteMetric4Defined();

    void setIpCidrRouteMetric5(int ipCidrRouteMetric5);

    int getIpCidrRouteMetric5();

    boolean isIpCidrRouteMetric5Defined();

    void setIpCidrRouteStatus(int ipCidrRouteStatus);

    int getIpCidrRouteStatus();

    IIpCidrRouteEntry clone();

}
