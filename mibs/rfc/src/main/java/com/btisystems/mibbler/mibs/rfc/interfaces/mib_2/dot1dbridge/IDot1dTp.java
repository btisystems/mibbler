
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dTp
    extends IDeviceEntity
{


    void setDot1dTpLearnedEntryDiscards(int dot1dTpLearnedEntryDiscards);

    int getDot1dTpLearnedEntryDiscards();

    void setDot1dTpAgingTime(int dot1dTpAgingTime);

    int getDot1dTpAgingTime();

    IDot1dTp clone();

}
