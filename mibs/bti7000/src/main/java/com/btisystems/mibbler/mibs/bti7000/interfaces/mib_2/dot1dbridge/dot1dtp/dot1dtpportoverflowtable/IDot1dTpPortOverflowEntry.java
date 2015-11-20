
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dtp.dot1dtpportoverflowtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dTpPortOverflowEntry
    extends IDeviceEntity
{


    void setDot1dTpPortInOverflowFrames(int dot1dTpPortInOverflowFrames);

    int getDot1dTpPortInOverflowFrames();

    void setDot1dTpPortOutOverflowFrames(int dot1dTpPortOutOverflowFrames);

    int getDot1dTpPortOutOverflowFrames();

    void setDot1dTpPortInOverflowDiscards(int dot1dTpPortInOverflowDiscards);

    int getDot1dTpPortInOverflowDiscards();

    IDot1dTpPortOverflowEntry clone();

}
