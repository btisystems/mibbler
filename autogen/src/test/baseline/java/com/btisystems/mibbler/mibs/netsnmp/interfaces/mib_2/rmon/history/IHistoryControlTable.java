
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.history;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.history.historycontroltable.IHistoryControlEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHistoryControlTable
    extends IDeviceEntity
{


    Map<String, IHistoryControlEntry> getHistoryControlEntry();

    IHistoryControlTable clone();

}
