
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlanhcstatisticstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qPortVlanHCStatisticsEntry
    extends IDeviceEntity
{


    void setDot1qTpVlanPortHCInFrames(long dot1qTpVlanPortHCInFrames);

    long getDot1qTpVlanPortHCInFrames();

    void setDot1qTpVlanPortHCOutFrames(long dot1qTpVlanPortHCOutFrames);

    long getDot1qTpVlanPortHCOutFrames();

    void setDot1qTpVlanPortHCInDiscards(long dot1qTpVlanPortHCInDiscards);

    long getDot1qTpVlanPortHCInDiscards();

    IDot1qPortVlanHCStatisticsEntry clone();

}
