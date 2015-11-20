
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlanstatisticstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qPortVlanStatisticsEntry
    extends IDeviceEntity
{


    void setDot1qTpVlanPortInFrames(int dot1qTpVlanPortInFrames);

    int getDot1qTpVlanPortInFrames();

    void setDot1qTpVlanPortOutFrames(int dot1qTpVlanPortOutFrames);

    int getDot1qTpVlanPortOutFrames();

    void setDot1qTpVlanPortInDiscards(int dot1qTpVlanPortInDiscards);

    int getDot1qTpVlanPortInDiscards();

    void setDot1qTpVlanPortInOverflowFrames(int dot1qTpVlanPortInOverflowFrames);

    int getDot1qTpVlanPortInOverflowFrames();

    void setDot1qTpVlanPortOutOverflowFrames(int dot1qTpVlanPortOutOverflowFrames);

    int getDot1qTpVlanPortOutOverflowFrames();

    void setDot1qTpVlanPortInOverflowDiscards(int dot1qTpVlanPortInOverflowDiscards);

    int getDot1qTpVlanPortInOverflowDiscards();

    IDot1qPortVlanStatisticsEntry clone();

}
