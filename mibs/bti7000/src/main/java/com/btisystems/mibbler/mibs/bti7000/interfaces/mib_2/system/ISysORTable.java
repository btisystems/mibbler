
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.system;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.system.sysortable.ISysOREntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISysORTable
    extends IDeviceEntity
{


    Map<String, ISysOREntry> getSysOREntry();

    ISysORTable clone();

}
