
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history.tokenringphistorytable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITokenRingPHistoryEntry
    extends IDeviceEntity
{


    void setTokenRingPHistoryIndex(int tokenRingPHistoryIndex);

    int getTokenRingPHistoryIndex();

    void setTokenRingPHistorySampleIndex(int tokenRingPHistorySampleIndex);

    int getTokenRingPHistorySampleIndex();

    void setTokenRingPHistoryIntervalStart(int tokenRingPHistoryIntervalStart);

    int getTokenRingPHistoryIntervalStart();

    void setTokenRingPHistoryDropEvents(int tokenRingPHistoryDropEvents);

    int getTokenRingPHistoryDropEvents();

    void setTokenRingPHistoryDataOctets(int tokenRingPHistoryDataOctets);

    int getTokenRingPHistoryDataOctets();

    void setTokenRingPHistoryDataPkts(int tokenRingPHistoryDataPkts);

    int getTokenRingPHistoryDataPkts();

    void setTokenRingPHistoryDataBroadcastPkts(int tokenRingPHistoryDataBroadcastPkts);

    int getTokenRingPHistoryDataBroadcastPkts();

    void setTokenRingPHistoryDataMulticastPkts(int tokenRingPHistoryDataMulticastPkts);

    int getTokenRingPHistoryDataMulticastPkts();

    void setTokenRingPHistoryDataPkts18to63Octets(int tokenRingPHistoryDataPkts18to63Octets);

    int getTokenRingPHistoryDataPkts18to63Octets();

    void setTokenRingPHistoryDataPkts64to127Octets(int tokenRingPHistoryDataPkts64to127Octets);

    int getTokenRingPHistoryDataPkts64to127Octets();

    void setTokenRingPHistoryDataPkts128to255Octets(int tokenRingPHistoryDataPkts128to255Octets);

    int getTokenRingPHistoryDataPkts128to255Octets();

    void setTokenRingPHistoryDataPkts256to511Octets(int tokenRingPHistoryDataPkts256to511Octets);

    int getTokenRingPHistoryDataPkts256to511Octets();

    void setTokenRingPHistoryDataPkts512to1023Octets(int tokenRingPHistoryDataPkts512to1023Octets);

    int getTokenRingPHistoryDataPkts512to1023Octets();

    void setTokenRingPHistoryDataPkts1024to2047Octets(int tokenRingPHistoryDataPkts1024to2047Octets);

    int getTokenRingPHistoryDataPkts1024to2047Octets();

    void setTokenRingPHistoryDataPkts2048to4095Octets(int tokenRingPHistoryDataPkts2048to4095Octets);

    int getTokenRingPHistoryDataPkts2048to4095Octets();

    void setTokenRingPHistoryDataPkts4096to8191Octets(int tokenRingPHistoryDataPkts4096to8191Octets);

    int getTokenRingPHistoryDataPkts4096to8191Octets();

    void setTokenRingPHistoryDataPkts8192to18000Octets(int tokenRingPHistoryDataPkts8192to18000Octets);

    int getTokenRingPHistoryDataPkts8192to18000Octets();

    void setTokenRingPHistoryDataPktsGreaterThan18000Octets(int tokenRingPHistoryDataPktsGreaterThan18000Octets);

    int getTokenRingPHistoryDataPktsGreaterThan18000Octets();

    ITokenRingPHistoryEntry clone();

}
