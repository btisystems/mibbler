
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ip.ipforward.ipforwardtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpForwardEntry
    extends IDeviceEntity
{


    void setIpForwardDest(String ipForwardDest);

    String getIpForwardDest();

    void setIpForwardMask(String ipForwardMask);

    String getIpForwardMask();

    void setIpForwardPolicy(int ipForwardPolicy);

    int getIpForwardPolicy();

    void setIpForwardNextHop(String ipForwardNextHop);

    String getIpForwardNextHop();

    void setIpForwardIfIndex(int ipForwardIfIndex);

    int getIpForwardIfIndex();

    boolean isIpForwardIfIndexDefined();

    void setIpForwardType(int ipForwardType);

    int getIpForwardType();

    boolean isIpForwardTypeDefined();

    void setIpForwardProto(int ipForwardProto);

    int getIpForwardProto();

    void setIpForwardAge(int ipForwardAge);

    int getIpForwardAge();

    boolean isIpForwardAgeDefined();

    void setIpForwardInfo(String ipForwardInfo);

    String getIpForwardInfo();

    void setIpForwardNextHopAS(int ipForwardNextHopAS);

    int getIpForwardNextHopAS();

    boolean isIpForwardNextHopASDefined();

    void setIpForwardMetric1(int ipForwardMetric1);

    int getIpForwardMetric1();

    boolean isIpForwardMetric1Defined();

    void setIpForwardMetric2(int ipForwardMetric2);

    int getIpForwardMetric2();

    boolean isIpForwardMetric2Defined();

    void setIpForwardMetric3(int ipForwardMetric3);

    int getIpForwardMetric3();

    boolean isIpForwardMetric3Defined();

    void setIpForwardMetric4(int ipForwardMetric4);

    int getIpForwardMetric4();

    boolean isIpForwardMetric4Defined();

    void setIpForwardMetric5(int ipForwardMetric5);

    int getIpForwardMetric5();

    boolean isIpForwardMetric5Defined();

    IIpForwardEntry clone();

}
