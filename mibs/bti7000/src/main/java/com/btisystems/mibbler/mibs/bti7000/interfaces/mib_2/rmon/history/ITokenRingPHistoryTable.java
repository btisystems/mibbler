
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history.tokenringphistorytable.ITokenRingPHistoryEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITokenRingPHistoryTable
    extends IDeviceEntity
{


    Map<String, ITokenRingPHistoryEntry> getTokenRingPHistoryEntry();

    ITokenRingPHistoryTable clone();

}
