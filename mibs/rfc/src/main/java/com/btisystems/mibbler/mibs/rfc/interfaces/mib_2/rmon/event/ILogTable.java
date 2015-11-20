
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.event;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.event.logtable.ILogEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ILogTable
    extends IDeviceEntity
{


    Map<String, ILogEntry> getLogEntry();

    ILogTable clone();

}
