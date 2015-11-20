
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history.etherhistorytable.IEtherHistoryEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IEtherHistoryTable
    extends IDeviceEntity
{


    Map<String, IEtherHistoryEntry> getEtherHistoryEntry();

    IEtherHistoryTable clone();

}
