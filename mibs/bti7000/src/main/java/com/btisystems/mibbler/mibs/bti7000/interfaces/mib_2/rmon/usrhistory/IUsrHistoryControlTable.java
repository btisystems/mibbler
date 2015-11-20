
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.usrhistory;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.usrhistory.usrhistorycontroltable.IUsrHistoryControlEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IUsrHistoryControlTable
    extends IDeviceEntity
{


    Map<String, IUsrHistoryControlEntry> getUsrHistoryControlEntry();

    IUsrHistoryControlTable clone();

}
