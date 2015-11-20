
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics.tokenringmlstatstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITokenRingMLStatsEntry
    extends IDeviceEntity
{


    void setTokenRingMLStatsIndex(int tokenRingMLStatsIndex);

    int getTokenRingMLStatsIndex();

    void setTokenRingMLStatsDataSource(String tokenRingMLStatsDataSource);

    String getTokenRingMLStatsDataSource();

    void setTokenRingMLStatsDropEvents(int tokenRingMLStatsDropEvents);

    int getTokenRingMLStatsDropEvents();

    void setTokenRingMLStatsMacOctets(int tokenRingMLStatsMacOctets);

    int getTokenRingMLStatsMacOctets();

    void setTokenRingMLStatsMacPkts(int tokenRingMLStatsMacPkts);

    int getTokenRingMLStatsMacPkts();

    void setTokenRingMLStatsRingPurgeEvents(int tokenRingMLStatsRingPurgeEvents);

    int getTokenRingMLStatsRingPurgeEvents();

    void setTokenRingMLStatsRingPurgePkts(int tokenRingMLStatsRingPurgePkts);

    int getTokenRingMLStatsRingPurgePkts();

    void setTokenRingMLStatsBeaconEvents(int tokenRingMLStatsBeaconEvents);

    int getTokenRingMLStatsBeaconEvents();

    void setTokenRingMLStatsBeaconTime(int tokenRingMLStatsBeaconTime);

    int getTokenRingMLStatsBeaconTime();

    void setTokenRingMLStatsBeaconPkts(int tokenRingMLStatsBeaconPkts);

    int getTokenRingMLStatsBeaconPkts();

    void setTokenRingMLStatsClaimTokenEvents(int tokenRingMLStatsClaimTokenEvents);

    int getTokenRingMLStatsClaimTokenEvents();

    void setTokenRingMLStatsClaimTokenPkts(int tokenRingMLStatsClaimTokenPkts);

    int getTokenRingMLStatsClaimTokenPkts();

    void setTokenRingMLStatsNAUNChanges(int tokenRingMLStatsNAUNChanges);

    int getTokenRingMLStatsNAUNChanges();

    void setTokenRingMLStatsLineErrors(int tokenRingMLStatsLineErrors);

    int getTokenRingMLStatsLineErrors();

    void setTokenRingMLStatsInternalErrors(int tokenRingMLStatsInternalErrors);

    int getTokenRingMLStatsInternalErrors();

    void setTokenRingMLStatsBurstErrors(int tokenRingMLStatsBurstErrors);

    int getTokenRingMLStatsBurstErrors();

    void setTokenRingMLStatsACErrors(int tokenRingMLStatsACErrors);

    int getTokenRingMLStatsACErrors();

    void setTokenRingMLStatsAbortErrors(int tokenRingMLStatsAbortErrors);

    int getTokenRingMLStatsAbortErrors();

    void setTokenRingMLStatsLostFrameErrors(int tokenRingMLStatsLostFrameErrors);

    int getTokenRingMLStatsLostFrameErrors();

    void setTokenRingMLStatsCongestionErrors(int tokenRingMLStatsCongestionErrors);

    int getTokenRingMLStatsCongestionErrors();

    void setTokenRingMLStatsFrameCopiedErrors(int tokenRingMLStatsFrameCopiedErrors);

    int getTokenRingMLStatsFrameCopiedErrors();

    void setTokenRingMLStatsFrequencyErrors(int tokenRingMLStatsFrequencyErrors);

    int getTokenRingMLStatsFrequencyErrors();

    void setTokenRingMLStatsTokenErrors(int tokenRingMLStatsTokenErrors);

    int getTokenRingMLStatsTokenErrors();

    void setTokenRingMLStatsSoftErrorReports(int tokenRingMLStatsSoftErrorReports);

    int getTokenRingMLStatsSoftErrorReports();

    void setTokenRingMLStatsRingPollEvents(int tokenRingMLStatsRingPollEvents);

    int getTokenRingMLStatsRingPollEvents();

    void setTokenRingMLStatsOwner(String tokenRingMLStatsOwner);

    String getTokenRingMLStatsOwner();

    void setTokenRingMLStatsStatus(int tokenRingMLStatsStatus);

    int getTokenRingMLStatsStatus();

    ITokenRingMLStatsEntry clone();

}
