
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3statstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot3StatsEntry
    extends IDeviceEntity
{


    void setDot3StatsIndex(int dot3StatsIndex);

    int getDot3StatsIndex();

    void setDot3StatsAlignmentErrors(int dot3StatsAlignmentErrors);

    int getDot3StatsAlignmentErrors();

    void setDot3StatsFCSErrors(int dot3StatsFCSErrors);

    int getDot3StatsFCSErrors();

    void setDot3StatsSingleCollisionFrames(int dot3StatsSingleCollisionFrames);

    int getDot3StatsSingleCollisionFrames();

    void setDot3StatsMultipleCollisionFrames(int dot3StatsMultipleCollisionFrames);

    int getDot3StatsMultipleCollisionFrames();

    void setDot3StatsSQETestErrors(int dot3StatsSQETestErrors);

    int getDot3StatsSQETestErrors();

    void setDot3StatsDeferredTransmissions(int dot3StatsDeferredTransmissions);

    int getDot3StatsDeferredTransmissions();

    void setDot3StatsLateCollisions(int dot3StatsLateCollisions);

    int getDot3StatsLateCollisions();

    void setDot3StatsExcessiveCollisions(int dot3StatsExcessiveCollisions);

    int getDot3StatsExcessiveCollisions();

    void setDot3StatsInternalMacTransmitErrors(int dot3StatsInternalMacTransmitErrors);

    int getDot3StatsInternalMacTransmitErrors();

    void setDot3StatsCarrierSenseErrors(int dot3StatsCarrierSenseErrors);

    int getDot3StatsCarrierSenseErrors();

    void setDot3StatsFrameTooLongs(int dot3StatsFrameTooLongs);

    int getDot3StatsFrameTooLongs();

    void setDot3StatsInternalMacReceiveErrors(int dot3StatsInternalMacReceiveErrors);

    int getDot3StatsInternalMacReceiveErrors();

    void setDot3StatsEtherChipSet(String dot3StatsEtherChipSet);

    String getDot3StatsEtherChipSet();

    void setDot3StatsSymbolErrors(int dot3StatsSymbolErrors);

    int getDot3StatsSymbolErrors();

    void setDot3StatsDuplexStatus(int dot3StatsDuplexStatus);

    int getDot3StatsDuplexStatus();

    void setDot3StatsRateControlAbility(int dot3StatsRateControlAbility);

    int getDot3StatsRateControlAbility();

    void setDot3StatsRateControlStatus(int dot3StatsRateControlStatus);

    int getDot3StatsRateControlStatus();

    IDot3StatsEntry clone();

}
