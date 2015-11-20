
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history.tokenringmlhistorytable.ITokenRingMLHistoryEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITokenRingMLHistoryTable
    extends IDeviceEntity
{


    Map<String, ITokenRingMLHistoryEntry> getTokenRingMLHistoryEntry();

    ITokenRingMLHistoryTable clone();

}
