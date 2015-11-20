
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history.historycontrol2table.IHistoryControl2Entry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHistoryControl2Table
    extends IDeviceEntity
{


    Map<String, IHistoryControl2Entry> getHistoryControl2Entry();

    IHistoryControl2Table clone();

}
