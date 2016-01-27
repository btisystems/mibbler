
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.iptrafficstats.ipifstatstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpIfStatsEntry
    extends IDeviceEntity
{


    void setIpIfStatsIPVersion(int ipIfStatsIPVersion);

    int getIpIfStatsIPVersion();

    void setIpIfStatsIfIndex(int ipIfStatsIfIndex);

    int getIpIfStatsIfIndex();

    void setIpIfStatsInReceives(int ipIfStatsInReceives);

    int getIpIfStatsInReceives();

    void setIpIfStatsHCInReceives(long ipIfStatsHCInReceives);

    long getIpIfStatsHCInReceives();

    void setIpIfStatsInOctets(int ipIfStatsInOctets);

    int getIpIfStatsInOctets();

    void setIpIfStatsHCInOctets(long ipIfStatsHCInOctets);

    long getIpIfStatsHCInOctets();

    void setIpIfStatsInHdrErrors(int ipIfStatsInHdrErrors);

    int getIpIfStatsInHdrErrors();

    void setIpIfStatsInNoRoutes(int ipIfStatsInNoRoutes);

    int getIpIfStatsInNoRoutes();

    void setIpIfStatsInAddrErrors(int ipIfStatsInAddrErrors);

    int getIpIfStatsInAddrErrors();

    void setIpIfStatsInUnknownProtos(int ipIfStatsInUnknownProtos);

    int getIpIfStatsInUnknownProtos();

    void setIpIfStatsInTruncatedPkts(int ipIfStatsInTruncatedPkts);

    int getIpIfStatsInTruncatedPkts();

    void setIpIfStatsInForwDatagrams(int ipIfStatsInForwDatagrams);

    int getIpIfStatsInForwDatagrams();

    void setIpIfStatsHCInForwDatagrams(long ipIfStatsHCInForwDatagrams);

    long getIpIfStatsHCInForwDatagrams();

    void setIpIfStatsReasmReqds(int ipIfStatsReasmReqds);

    int getIpIfStatsReasmReqds();

    void setIpIfStatsReasmOKs(int ipIfStatsReasmOKs);

    int getIpIfStatsReasmOKs();

    void setIpIfStatsReasmFails(int ipIfStatsReasmFails);

    int getIpIfStatsReasmFails();

    void setIpIfStatsInDiscards(int ipIfStatsInDiscards);

    int getIpIfStatsInDiscards();

    void setIpIfStatsInDelivers(int ipIfStatsInDelivers);

    int getIpIfStatsInDelivers();

    void setIpIfStatsHCInDelivers(long ipIfStatsHCInDelivers);

    long getIpIfStatsHCInDelivers();

    void setIpIfStatsOutRequests(int ipIfStatsOutRequests);

    int getIpIfStatsOutRequests();

    void setIpIfStatsHCOutRequests(long ipIfStatsHCOutRequests);

    long getIpIfStatsHCOutRequests();

    void setIpIfStatsOutForwDatagrams(int ipIfStatsOutForwDatagrams);

    int getIpIfStatsOutForwDatagrams();

    void setIpIfStatsHCOutForwDatagrams(long ipIfStatsHCOutForwDatagrams);

    long getIpIfStatsHCOutForwDatagrams();

    void setIpIfStatsOutDiscards(int ipIfStatsOutDiscards);

    int getIpIfStatsOutDiscards();

    void setIpIfStatsOutFragReqds(int ipIfStatsOutFragReqds);

    int getIpIfStatsOutFragReqds();

    void setIpIfStatsOutFragOKs(int ipIfStatsOutFragOKs);

    int getIpIfStatsOutFragOKs();

    void setIpIfStatsOutFragFails(int ipIfStatsOutFragFails);

    int getIpIfStatsOutFragFails();

    void setIpIfStatsOutFragCreates(int ipIfStatsOutFragCreates);

    int getIpIfStatsOutFragCreates();

    void setIpIfStatsOutTransmits(int ipIfStatsOutTransmits);

    int getIpIfStatsOutTransmits();

    void setIpIfStatsHCOutTransmits(long ipIfStatsHCOutTransmits);

    long getIpIfStatsHCOutTransmits();

    void setIpIfStatsOutOctets(int ipIfStatsOutOctets);

    int getIpIfStatsOutOctets();

    void setIpIfStatsHCOutOctets(long ipIfStatsHCOutOctets);

    long getIpIfStatsHCOutOctets();

    void setIpIfStatsInMcastPkts(int ipIfStatsInMcastPkts);

    int getIpIfStatsInMcastPkts();

    void setIpIfStatsHCInMcastPkts(long ipIfStatsHCInMcastPkts);

    long getIpIfStatsHCInMcastPkts();

    void setIpIfStatsInMcastOctets(int ipIfStatsInMcastOctets);

    int getIpIfStatsInMcastOctets();

    void setIpIfStatsHCInMcastOctets(long ipIfStatsHCInMcastOctets);

    long getIpIfStatsHCInMcastOctets();

    void setIpIfStatsOutMcastPkts(int ipIfStatsOutMcastPkts);

    int getIpIfStatsOutMcastPkts();

    void setIpIfStatsHCOutMcastPkts(long ipIfStatsHCOutMcastPkts);

    long getIpIfStatsHCOutMcastPkts();

    void setIpIfStatsOutMcastOctets(int ipIfStatsOutMcastOctets);

    int getIpIfStatsOutMcastOctets();

    void setIpIfStatsHCOutMcastOctets(long ipIfStatsHCOutMcastOctets);

    long getIpIfStatsHCOutMcastOctets();

    void setIpIfStatsInBcastPkts(int ipIfStatsInBcastPkts);

    int getIpIfStatsInBcastPkts();

    void setIpIfStatsHCInBcastPkts(long ipIfStatsHCInBcastPkts);

    long getIpIfStatsHCInBcastPkts();

    void setIpIfStatsOutBcastPkts(int ipIfStatsOutBcastPkts);

    int getIpIfStatsOutBcastPkts();

    void setIpIfStatsHCOutBcastPkts(long ipIfStatsHCOutBcastPkts);

    long getIpIfStatsHCOutBcastPkts();

    void setIpIfStatsDiscontinuityTime(int ipIfStatsDiscontinuityTime);

    int getIpIfStatsDiscontinuityTime();

    void setIpIfStatsRefreshRate(int ipIfStatsRefreshRate);

    int getIpIfStatsRefreshRate();

    IIpIfStatsEntry clone();

}
