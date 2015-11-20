
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.history.historycontrol2table;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHistoryControl2Entry
    extends IDeviceEntity
{


    void setHistoryControlDroppedFrames(int historyControlDroppedFrames);

    int getHistoryControlDroppedFrames();

    IHistoryControl2Entry clone();

}
