
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.usrhistory.usrhistorytable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IUsrHistoryEntry
    extends IDeviceEntity
{


    void setUsrHistorySampleIndex(int usrHistorySampleIndex);

    int getUsrHistorySampleIndex();

    void setUsrHistoryIntervalStart(int usrHistoryIntervalStart);

    int getUsrHistoryIntervalStart();

    void setUsrHistoryIntervalEnd(int usrHistoryIntervalEnd);

    int getUsrHistoryIntervalEnd();

    void setUsrHistoryAbsValue(int usrHistoryAbsValue);

    int getUsrHistoryAbsValue();

    void setUsrHistoryValStatus(int usrHistoryValStatus);

    int getUsrHistoryValStatus();

    IUsrHistoryEntry clone();

}
