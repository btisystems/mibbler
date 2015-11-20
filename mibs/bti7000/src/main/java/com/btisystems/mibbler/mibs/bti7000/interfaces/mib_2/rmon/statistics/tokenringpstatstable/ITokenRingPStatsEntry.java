
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics.tokenringpstatstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITokenRingPStatsEntry
    extends IDeviceEntity
{


    void setTokenRingPStatsIndex(int tokenRingPStatsIndex);

    int getTokenRingPStatsIndex();

    void setTokenRingPStatsDataSource(String tokenRingPStatsDataSource);

    String getTokenRingPStatsDataSource();

    void setTokenRingPStatsDropEvents(int tokenRingPStatsDropEvents);

    int getTokenRingPStatsDropEvents();

    void setTokenRingPStatsDataOctets(int tokenRingPStatsDataOctets);

    int getTokenRingPStatsDataOctets();

    void setTokenRingPStatsDataPkts(int tokenRingPStatsDataPkts);

    int getTokenRingPStatsDataPkts();

    void setTokenRingPStatsDataBroadcastPkts(int tokenRingPStatsDataBroadcastPkts);

    int getTokenRingPStatsDataBroadcastPkts();

    void setTokenRingPStatsDataMulticastPkts(int tokenRingPStatsDataMulticastPkts);

    int getTokenRingPStatsDataMulticastPkts();

    void setTokenRingPStatsDataPkts18to63Octets(int tokenRingPStatsDataPkts18to63Octets);

    int getTokenRingPStatsDataPkts18to63Octets();

    void setTokenRingPStatsDataPkts64to127Octets(int tokenRingPStatsDataPkts64to127Octets);

    int getTokenRingPStatsDataPkts64to127Octets();

    void setTokenRingPStatsDataPkts128to255Octets(int tokenRingPStatsDataPkts128to255Octets);

    int getTokenRingPStatsDataPkts128to255Octets();

    void setTokenRingPStatsDataPkts256to511Octets(int tokenRingPStatsDataPkts256to511Octets);

    int getTokenRingPStatsDataPkts256to511Octets();

    void setTokenRingPStatsDataPkts512to1023Octets(int tokenRingPStatsDataPkts512to1023Octets);

    int getTokenRingPStatsDataPkts512to1023Octets();

    void setTokenRingPStatsDataPkts1024to2047Octets(int tokenRingPStatsDataPkts1024to2047Octets);

    int getTokenRingPStatsDataPkts1024to2047Octets();

    void setTokenRingPStatsDataPkts2048to4095Octets(int tokenRingPStatsDataPkts2048to4095Octets);

    int getTokenRingPStatsDataPkts2048to4095Octets();

    void setTokenRingPStatsDataPkts4096to8191Octets(int tokenRingPStatsDataPkts4096to8191Octets);

    int getTokenRingPStatsDataPkts4096to8191Octets();

    void setTokenRingPStatsDataPkts8192to18000Octets(int tokenRingPStatsDataPkts8192to18000Octets);

    int getTokenRingPStatsDataPkts8192to18000Octets();

    void setTokenRingPStatsDataPktsGreaterThan18000Octets(int tokenRingPStatsDataPktsGreaterThan18000Octets);

    int getTokenRingPStatsDataPktsGreaterThan18000Octets();

    void setTokenRingPStatsOwner(String tokenRingPStatsOwner);

    String getTokenRingPStatsOwner();

    void setTokenRingPStatsStatus(int tokenRingPStatsStatus);

    int getTokenRingPStatsStatus();

    ITokenRingPStatsEntry clone();

}
