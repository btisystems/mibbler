
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipforward.inetcidrroutetable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IInetCidrRouteEntry
    extends IDeviceEntity
{


    void setInetCidrRouteDestType(int inetCidrRouteDestType);

    int getInetCidrRouteDestType();

    void setInetCidrRouteDest(String inetCidrRouteDest);

    String getInetCidrRouteDest();

    void setInetCidrRoutePfxLen(int inetCidrRoutePfxLen);

    int getInetCidrRoutePfxLen();

    void setInetCidrRoutePolicy(String inetCidrRoutePolicy);

    String getInetCidrRoutePolicy();

    void setInetCidrRouteNextHopType(int inetCidrRouteNextHopType);

    int getInetCidrRouteNextHopType();

    void setInetCidrRouteNextHop(String inetCidrRouteNextHop);

    String getInetCidrRouteNextHop();

    void setInetCidrRouteIfIndex(int inetCidrRouteIfIndex);

    int getInetCidrRouteIfIndex();

    void setInetCidrRouteType(int inetCidrRouteType);

    int getInetCidrRouteType();

    void setInetCidrRouteProto(int inetCidrRouteProto);

    int getInetCidrRouteProto();

    void setInetCidrRouteAge(int inetCidrRouteAge);

    int getInetCidrRouteAge();

    void setInetCidrRouteNextHopAS(int inetCidrRouteNextHopAS);

    int getInetCidrRouteNextHopAS();

    boolean isInetCidrRouteNextHopASDefined();

    void setInetCidrRouteMetric1(int inetCidrRouteMetric1);

    int getInetCidrRouteMetric1();

    boolean isInetCidrRouteMetric1Defined();

    void setInetCidrRouteMetric2(int inetCidrRouteMetric2);

    int getInetCidrRouteMetric2();

    boolean isInetCidrRouteMetric2Defined();

    void setInetCidrRouteMetric3(int inetCidrRouteMetric3);

    int getInetCidrRouteMetric3();

    boolean isInetCidrRouteMetric3Defined();

    void setInetCidrRouteMetric4(int inetCidrRouteMetric4);

    int getInetCidrRouteMetric4();

    boolean isInetCidrRouteMetric4Defined();

    void setInetCidrRouteMetric5(int inetCidrRouteMetric5);

    int getInetCidrRouteMetric5();

    boolean isInetCidrRouteMetric5Defined();

    void setInetCidrRouteStatus(int inetCidrRouteStatus);

    int getInetCidrRouteStatus();

    IInetCidrRouteEntry clone();

}
