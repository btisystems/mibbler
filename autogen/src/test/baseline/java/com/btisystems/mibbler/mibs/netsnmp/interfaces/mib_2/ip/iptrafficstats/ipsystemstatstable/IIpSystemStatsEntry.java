
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.iptrafficstats.ipsystemstatstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpSystemStatsEntry
    extends IDeviceEntity
{


    void setIpSystemStatsIPVersion(int ipSystemStatsIPVersion);

    int getIpSystemStatsIPVersion();

    void setIpSystemStatsInReceives(int ipSystemStatsInReceives);

    int getIpSystemStatsInReceives();

    void setIpSystemStatsHCInReceives(long ipSystemStatsHCInReceives);

    long getIpSystemStatsHCInReceives();

    void setIpSystemStatsInOctets(int ipSystemStatsInOctets);

    int getIpSystemStatsInOctets();

    void setIpSystemStatsHCInOctets(long ipSystemStatsHCInOctets);

    long getIpSystemStatsHCInOctets();

    void setIpSystemStatsInHdrErrors(int ipSystemStatsInHdrErrors);

    int getIpSystemStatsInHdrErrors();

    void setIpSystemStatsInNoRoutes(int ipSystemStatsInNoRoutes);

    int getIpSystemStatsInNoRoutes();

    void setIpSystemStatsInAddrErrors(int ipSystemStatsInAddrErrors);

    int getIpSystemStatsInAddrErrors();

    void setIpSystemStatsInUnknownProtos(int ipSystemStatsInUnknownProtos);

    int getIpSystemStatsInUnknownProtos();

    void setIpSystemStatsInTruncatedPkts(int ipSystemStatsInTruncatedPkts);

    int getIpSystemStatsInTruncatedPkts();

    void setIpSystemStatsInForwDatagrams(int ipSystemStatsInForwDatagrams);

    int getIpSystemStatsInForwDatagrams();

    void setIpSystemStatsHCInForwDatagrams(long ipSystemStatsHCInForwDatagrams);

    long getIpSystemStatsHCInForwDatagrams();

    void setIpSystemStatsReasmReqds(int ipSystemStatsReasmReqds);

    int getIpSystemStatsReasmReqds();

    void setIpSystemStatsReasmOKs(int ipSystemStatsReasmOKs);

    int getIpSystemStatsReasmOKs();

    void setIpSystemStatsReasmFails(int ipSystemStatsReasmFails);

    int getIpSystemStatsReasmFails();

    void setIpSystemStatsInDiscards(int ipSystemStatsInDiscards);

    int getIpSystemStatsInDiscards();

    void setIpSystemStatsInDelivers(int ipSystemStatsInDelivers);

    int getIpSystemStatsInDelivers();

    void setIpSystemStatsHCInDelivers(long ipSystemStatsHCInDelivers);

    long getIpSystemStatsHCInDelivers();

    void setIpSystemStatsOutRequests(int ipSystemStatsOutRequests);

    int getIpSystemStatsOutRequests();

    void setIpSystemStatsHCOutRequests(long ipSystemStatsHCOutRequests);

    long getIpSystemStatsHCOutRequests();

    void setIpSystemStatsOutNoRoutes(int ipSystemStatsOutNoRoutes);

    int getIpSystemStatsOutNoRoutes();

    void setIpSystemStatsOutForwDatagrams(int ipSystemStatsOutForwDatagrams);

    int getIpSystemStatsOutForwDatagrams();

    void setIpSystemStatsHCOutForwDatagrams(long ipSystemStatsHCOutForwDatagrams);

    long getIpSystemStatsHCOutForwDatagrams();

    void setIpSystemStatsOutDiscards(int ipSystemStatsOutDiscards);

    int getIpSystemStatsOutDiscards();

    void setIpSystemStatsOutFragReqds(int ipSystemStatsOutFragReqds);

    int getIpSystemStatsOutFragReqds();

    void setIpSystemStatsOutFragOKs(int ipSystemStatsOutFragOKs);

    int getIpSystemStatsOutFragOKs();

    void setIpSystemStatsOutFragFails(int ipSystemStatsOutFragFails);

    int getIpSystemStatsOutFragFails();

    void setIpSystemStatsOutFragCreates(int ipSystemStatsOutFragCreates);

    int getIpSystemStatsOutFragCreates();

    void setIpSystemStatsOutTransmits(int ipSystemStatsOutTransmits);

    int getIpSystemStatsOutTransmits();

    void setIpSystemStatsHCOutTransmits(long ipSystemStatsHCOutTransmits);

    long getIpSystemStatsHCOutTransmits();

    void setIpSystemStatsOutOctets(int ipSystemStatsOutOctets);

    int getIpSystemStatsOutOctets();

    void setIpSystemStatsHCOutOctets(long ipSystemStatsHCOutOctets);

    long getIpSystemStatsHCOutOctets();

    void setIpSystemStatsInMcastPkts(int ipSystemStatsInMcastPkts);

    int getIpSystemStatsInMcastPkts();

    void setIpSystemStatsHCInMcastPkts(long ipSystemStatsHCInMcastPkts);

    long getIpSystemStatsHCInMcastPkts();

    void setIpSystemStatsInMcastOctets(int ipSystemStatsInMcastOctets);

    int getIpSystemStatsInMcastOctets();

    void setIpSystemStatsHCInMcastOctets(long ipSystemStatsHCInMcastOctets);

    long getIpSystemStatsHCInMcastOctets();

    void setIpSystemStatsOutMcastPkts(int ipSystemStatsOutMcastPkts);

    int getIpSystemStatsOutMcastPkts();

    void setIpSystemStatsHCOutMcastPkts(long ipSystemStatsHCOutMcastPkts);

    long getIpSystemStatsHCOutMcastPkts();

    void setIpSystemStatsOutMcastOctets(int ipSystemStatsOutMcastOctets);

    int getIpSystemStatsOutMcastOctets();

    void setIpSystemStatsHCOutMcastOctets(long ipSystemStatsHCOutMcastOctets);

    long getIpSystemStatsHCOutMcastOctets();

    void setIpSystemStatsInBcastPkts(int ipSystemStatsInBcastPkts);

    int getIpSystemStatsInBcastPkts();

    void setIpSystemStatsHCInBcastPkts(long ipSystemStatsHCInBcastPkts);

    long getIpSystemStatsHCInBcastPkts();

    void setIpSystemStatsOutBcastPkts(int ipSystemStatsOutBcastPkts);

    int getIpSystemStatsOutBcastPkts();

    void setIpSystemStatsHCOutBcastPkts(long ipSystemStatsHCOutBcastPkts);

    long getIpSystemStatsHCOutBcastPkts();

    void setIpSystemStatsDiscontinuityTime(int ipSystemStatsDiscontinuityTime);

    int getIpSystemStatsDiscontinuityTime();

    void setIpSystemStatsRefreshRate(int ipSystemStatsRefreshRate);

    int getIpSystemStatsRefreshRate();

    IIpSystemStatsEntry clone();

}
