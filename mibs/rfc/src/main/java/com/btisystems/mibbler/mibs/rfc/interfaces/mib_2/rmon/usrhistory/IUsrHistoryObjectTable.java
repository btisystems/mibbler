
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.usrhistory;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.usrhistory.usrhistoryobjecttable.IUsrHistoryObjectEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IUsrHistoryObjectTable
    extends IDeviceEntity
{


    Map<String, IUsrHistoryObjectEntry> getUsrHistoryObjectEntry();

    IUsrHistoryObjectTable clone();

}
