
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.history.etherhistorytable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IEtherHistoryEntry
    extends IDeviceEntity
{


    void setEtherHistoryIndex(int etherHistoryIndex);

    int getEtherHistoryIndex();

    void setEtherHistorySampleIndex(int etherHistorySampleIndex);

    int getEtherHistorySampleIndex();

    void setEtherHistoryIntervalStart(int etherHistoryIntervalStart);

    int getEtherHistoryIntervalStart();

    void setEtherHistoryDropEvents(int etherHistoryDropEvents);

    int getEtherHistoryDropEvents();

    void setEtherHistoryOctets(int etherHistoryOctets);

    int getEtherHistoryOctets();

    void setEtherHistoryPkts(int etherHistoryPkts);

    int getEtherHistoryPkts();

    void setEtherHistoryBroadcastPkts(int etherHistoryBroadcastPkts);

    int getEtherHistoryBroadcastPkts();

    void setEtherHistoryMulticastPkts(int etherHistoryMulticastPkts);

    int getEtherHistoryMulticastPkts();

    void setEtherHistoryCRCAlignErrors(int etherHistoryCRCAlignErrors);

    int getEtherHistoryCRCAlignErrors();

    void setEtherHistoryUndersizePkts(int etherHistoryUndersizePkts);

    int getEtherHistoryUndersizePkts();

    void setEtherHistoryOversizePkts(int etherHistoryOversizePkts);

    int getEtherHistoryOversizePkts();

    void setEtherHistoryFragments(int etherHistoryFragments);

    int getEtherHistoryFragments();

    void setEtherHistoryJabbers(int etherHistoryJabbers);

    int getEtherHistoryJabbers();

    void setEtherHistoryCollisions(int etherHistoryCollisions);

    int getEtherHistoryCollisions();

    void setEtherHistoryUtilization(int etherHistoryUtilization);

    int getEtherHistoryUtilization();

    IEtherHistoryEntry clone();

}
