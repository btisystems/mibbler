
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dtp.dot1dtpporttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dTpPortEntry
    extends IDeviceEntity
{


    void setDot1dTpPort(int dot1dTpPort);

    int getDot1dTpPort();

    void setDot1dTpPortMaxInfo(int dot1dTpPortMaxInfo);

    int getDot1dTpPortMaxInfo();

    void setDot1dTpPortInFrames(int dot1dTpPortInFrames);

    int getDot1dTpPortInFrames();

    void setDot1dTpPortOutFrames(int dot1dTpPortOutFrames);

    int getDot1dTpPortOutFrames();

    void setDot1dTpPortInDiscards(int dot1dTpPortInDiscards);

    int getDot1dTpPortInDiscards();

    IDot1dTpPortEntry clone();

}
