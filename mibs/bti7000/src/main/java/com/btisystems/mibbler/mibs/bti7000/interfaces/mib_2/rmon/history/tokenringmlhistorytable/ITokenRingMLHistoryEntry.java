
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history.tokenringmlhistorytable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITokenRingMLHistoryEntry
    extends IDeviceEntity
{


    void setTokenRingMLHistoryIndex(int tokenRingMLHistoryIndex);

    int getTokenRingMLHistoryIndex();

    void setTokenRingMLHistorySampleIndex(int tokenRingMLHistorySampleIndex);

    int getTokenRingMLHistorySampleIndex();

    void setTokenRingMLHistoryIntervalStart(int tokenRingMLHistoryIntervalStart);

    int getTokenRingMLHistoryIntervalStart();

    void setTokenRingMLHistoryDropEvents(int tokenRingMLHistoryDropEvents);

    int getTokenRingMLHistoryDropEvents();

    void setTokenRingMLHistoryMacOctets(int tokenRingMLHistoryMacOctets);

    int getTokenRingMLHistoryMacOctets();

    void setTokenRingMLHistoryMacPkts(int tokenRingMLHistoryMacPkts);

    int getTokenRingMLHistoryMacPkts();

    void setTokenRingMLHistoryRingPurgeEvents(int tokenRingMLHistoryRingPurgeEvents);

    int getTokenRingMLHistoryRingPurgeEvents();

    void setTokenRingMLHistoryRingPurgePkts(int tokenRingMLHistoryRingPurgePkts);

    int getTokenRingMLHistoryRingPurgePkts();

    void setTokenRingMLHistoryBeaconEvents(int tokenRingMLHistoryBeaconEvents);

    int getTokenRingMLHistoryBeaconEvents();

    void setTokenRingMLHistoryBeaconTime(int tokenRingMLHistoryBeaconTime);

    int getTokenRingMLHistoryBeaconTime();

    void setTokenRingMLHistoryBeaconPkts(int tokenRingMLHistoryBeaconPkts);

    int getTokenRingMLHistoryBeaconPkts();

    void setTokenRingMLHistoryClaimTokenEvents(int tokenRingMLHistoryClaimTokenEvents);

    int getTokenRingMLHistoryClaimTokenEvents();

    void setTokenRingMLHistoryClaimTokenPkts(int tokenRingMLHistoryClaimTokenPkts);

    int getTokenRingMLHistoryClaimTokenPkts();

    void setTokenRingMLHistoryNAUNChanges(int tokenRingMLHistoryNAUNChanges);

    int getTokenRingMLHistoryNAUNChanges();

    void setTokenRingMLHistoryLineErrors(int tokenRingMLHistoryLineErrors);

    int getTokenRingMLHistoryLineErrors();

    void setTokenRingMLHistoryInternalErrors(int tokenRingMLHistoryInternalErrors);

    int getTokenRingMLHistoryInternalErrors();

    void setTokenRingMLHistoryBurstErrors(int tokenRingMLHistoryBurstErrors);

    int getTokenRingMLHistoryBurstErrors();

    void setTokenRingMLHistoryACErrors(int tokenRingMLHistoryACErrors);

    int getTokenRingMLHistoryACErrors();

    void setTokenRingMLHistoryAbortErrors(int tokenRingMLHistoryAbortErrors);

    int getTokenRingMLHistoryAbortErrors();

    void setTokenRingMLHistoryLostFrameErrors(int tokenRingMLHistoryLostFrameErrors);

    int getTokenRingMLHistoryLostFrameErrors();

    void setTokenRingMLHistoryCongestionErrors(int tokenRingMLHistoryCongestionErrors);

    int getTokenRingMLHistoryCongestionErrors();

    void setTokenRingMLHistoryFrameCopiedErrors(int tokenRingMLHistoryFrameCopiedErrors);

    int getTokenRingMLHistoryFrameCopiedErrors();

    void setTokenRingMLHistoryFrequencyErrors(int tokenRingMLHistoryFrequencyErrors);

    int getTokenRingMLHistoryFrequencyErrors();

    void setTokenRingMLHistoryTokenErrors(int tokenRingMLHistoryTokenErrors);

    int getTokenRingMLHistoryTokenErrors();

    void setTokenRingMLHistorySoftErrorReports(int tokenRingMLHistorySoftErrorReports);

    int getTokenRingMLHistorySoftErrorReports();

    void setTokenRingMLHistoryRingPollEvents(int tokenRingMLHistoryRingPollEvents);

    int getTokenRingMLHistoryRingPollEvents();

    void setTokenRingMLHistoryActiveStations(int tokenRingMLHistoryActiveStations);

    int getTokenRingMLHistoryActiveStations();

    ITokenRingMLHistoryEntry clone();

}
