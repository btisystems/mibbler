
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3hcstatstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot3HCStatsEntry
    extends IDeviceEntity
{


    void setDot3HCStatsAlignmentErrors(long dot3HCStatsAlignmentErrors);

    long getDot3HCStatsAlignmentErrors();

    void setDot3HCStatsFCSErrors(long dot3HCStatsFCSErrors);

    long getDot3HCStatsFCSErrors();

    void setDot3HCStatsInternalMacTransmitErrors(long dot3HCStatsInternalMacTransmitErrors);

    long getDot3HCStatsInternalMacTransmitErrors();

    void setDot3HCStatsFrameTooLongs(long dot3HCStatsFrameTooLongs);

    long getDot3HCStatsFrameTooLongs();

    void setDot3HCStatsInternalMacReceiveErrors(long dot3HCStatsInternalMacReceiveErrors);

    long getDot3HCStatsInternalMacReceiveErrors();

    void setDot3HCStatsSymbolErrors(long dot3HCStatsSymbolErrors);

    long getDot3HCStatsSymbolErrors();

    IDot3HCStatsEntry clone();

}
