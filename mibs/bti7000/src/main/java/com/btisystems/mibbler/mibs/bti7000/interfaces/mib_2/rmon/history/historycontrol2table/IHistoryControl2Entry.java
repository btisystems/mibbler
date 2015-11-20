
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history.historycontrol2table;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHistoryControl2Entry
    extends IDeviceEntity
{


    void setHistoryControlDroppedFrames(int historyControlDroppedFrames);

    int getHistoryControlDroppedFrames();

    IHistoryControl2Entry clone();

}
