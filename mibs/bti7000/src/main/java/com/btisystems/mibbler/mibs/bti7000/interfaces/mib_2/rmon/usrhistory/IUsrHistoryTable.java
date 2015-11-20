
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.usrhistory;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.usrhistory.usrhistorytable.IUsrHistoryEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IUsrHistoryTable
    extends IDeviceEntity
{


    Map<String, IUsrHistoryEntry> getUsrHistoryEntry();

    IUsrHistoryTable clone();

}
