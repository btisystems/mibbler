
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dtp.dot1dtphcporttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dTpHCPortEntry
    extends IDeviceEntity
{


    void setDot1dTpHCPortInFrames(long dot1dTpHCPortInFrames);

    long getDot1dTpHCPortInFrames();

    void setDot1dTpHCPortOutFrames(long dot1dTpHCPortOutFrames);

    long getDot1dTpHCPortOutFrames();

    void setDot1dTpHCPortInDiscards(long dot1dTpHCPortInDiscards);

    long getDot1dTpHCPortInDiscards();

    IDot1dTpHCPortEntry clone();

}
