
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.usrhistory;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.usrhistory.usrhistoryobjecttable.IUsrHistoryObjectEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IUsrHistoryObjectTable
    extends IDeviceEntity
{


    Map<String, IUsrHistoryObjectEntry> getUsrHistoryObjectEntry();

    IUsrHistoryObjectTable clone();

}
