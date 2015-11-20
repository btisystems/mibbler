
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipv6routeradverttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6RouterAdvertEntry
    extends IDeviceEntity
{


    void setIpv6RouterAdvertIfIndex(int ipv6RouterAdvertIfIndex);

    int getIpv6RouterAdvertIfIndex();

    void setIpv6RouterAdvertSendAdverts(int ipv6RouterAdvertSendAdverts);

    int getIpv6RouterAdvertSendAdverts();

    boolean isIpv6RouterAdvertSendAdvertsDefined();

    void setIpv6RouterAdvertMaxInterval(int ipv6RouterAdvertMaxInterval);

    int getIpv6RouterAdvertMaxInterval();

    boolean isIpv6RouterAdvertMaxIntervalDefined();

    void setIpv6RouterAdvertMinInterval(int ipv6RouterAdvertMinInterval);

    int getIpv6RouterAdvertMinInterval();

    void setIpv6RouterAdvertManagedFlag(int ipv6RouterAdvertManagedFlag);

    int getIpv6RouterAdvertManagedFlag();

    boolean isIpv6RouterAdvertManagedFlagDefined();

    void setIpv6RouterAdvertOtherConfigFlag(int ipv6RouterAdvertOtherConfigFlag);

    int getIpv6RouterAdvertOtherConfigFlag();

    boolean isIpv6RouterAdvertOtherConfigFlagDefined();

    void setIpv6RouterAdvertLinkMTU(int ipv6RouterAdvertLinkMTU);

    int getIpv6RouterAdvertLinkMTU();

    boolean isIpv6RouterAdvertLinkMTUDefined();

    void setIpv6RouterAdvertReachableTime(int ipv6RouterAdvertReachableTime);

    int getIpv6RouterAdvertReachableTime();

    boolean isIpv6RouterAdvertReachableTimeDefined();

    void setIpv6RouterAdvertRetransmitTime(int ipv6RouterAdvertRetransmitTime);

    int getIpv6RouterAdvertRetransmitTime();

    boolean isIpv6RouterAdvertRetransmitTimeDefined();

    void setIpv6RouterAdvertCurHopLimit(int ipv6RouterAdvertCurHopLimit);

    int getIpv6RouterAdvertCurHopLimit();

    void setIpv6RouterAdvertDefaultLifetime(int ipv6RouterAdvertDefaultLifetime);

    int getIpv6RouterAdvertDefaultLifetime();

    void setIpv6RouterAdvertRowStatus(int ipv6RouterAdvertRowStatus);

    int getIpv6RouterAdvertRowStatus();

    IIpv6RouterAdvertEntry clone();

}
