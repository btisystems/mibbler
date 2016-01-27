
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6ifstatstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6IfStatsEntry
    extends IDeviceEntity
{


    void setIpv6IfStatsInReceives(int ipv6IfStatsInReceives);

    int getIpv6IfStatsInReceives();

    void setIpv6IfStatsInHdrErrors(int ipv6IfStatsInHdrErrors);

    int getIpv6IfStatsInHdrErrors();

    void setIpv6IfStatsInTooBigErrors(int ipv6IfStatsInTooBigErrors);

    int getIpv6IfStatsInTooBigErrors();

    void setIpv6IfStatsInNoRoutes(int ipv6IfStatsInNoRoutes);

    int getIpv6IfStatsInNoRoutes();

    void setIpv6IfStatsInAddrErrors(int ipv6IfStatsInAddrErrors);

    int getIpv6IfStatsInAddrErrors();

    void setIpv6IfStatsInUnknownProtos(int ipv6IfStatsInUnknownProtos);

    int getIpv6IfStatsInUnknownProtos();

    void setIpv6IfStatsInTruncatedPkts(int ipv6IfStatsInTruncatedPkts);

    int getIpv6IfStatsInTruncatedPkts();

    void setIpv6IfStatsInDiscards(int ipv6IfStatsInDiscards);

    int getIpv6IfStatsInDiscards();

    void setIpv6IfStatsInDelivers(int ipv6IfStatsInDelivers);

    int getIpv6IfStatsInDelivers();

    void setIpv6IfStatsOutForwDatagrams(int ipv6IfStatsOutForwDatagrams);

    int getIpv6IfStatsOutForwDatagrams();

    void setIpv6IfStatsOutRequests(int ipv6IfStatsOutRequests);

    int getIpv6IfStatsOutRequests();

    void setIpv6IfStatsOutDiscards(int ipv6IfStatsOutDiscards);

    int getIpv6IfStatsOutDiscards();

    void setIpv6IfStatsOutFragOKs(int ipv6IfStatsOutFragOKs);

    int getIpv6IfStatsOutFragOKs();

    void setIpv6IfStatsOutFragFails(int ipv6IfStatsOutFragFails);

    int getIpv6IfStatsOutFragFails();

    void setIpv6IfStatsOutFragCreates(int ipv6IfStatsOutFragCreates);

    int getIpv6IfStatsOutFragCreates();

    void setIpv6IfStatsReasmReqds(int ipv6IfStatsReasmReqds);

    int getIpv6IfStatsReasmReqds();

    void setIpv6IfStatsReasmOKs(int ipv6IfStatsReasmOKs);

    int getIpv6IfStatsReasmOKs();

    void setIpv6IfStatsReasmFails(int ipv6IfStatsReasmFails);

    int getIpv6IfStatsReasmFails();

    void setIpv6IfStatsInMcastPkts(int ipv6IfStatsInMcastPkts);

    int getIpv6IfStatsInMcastPkts();

    void setIpv6IfStatsOutMcastPkts(int ipv6IfStatsOutMcastPkts);

    int getIpv6IfStatsOutMcastPkts();

    IIpv6IfStatsEntry clone();

}
