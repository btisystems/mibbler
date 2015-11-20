
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.hosts;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.hosts.hosttable.IHostEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHostTable
    extends IDeviceEntity
{


    Map<String, IHostEntry> getHostEntry();

    IHostTable clone();

}
