
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.hosts;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.hosts.hostcontroltable.IHostControlEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHostControlTable
    extends IDeviceEntity
{


    Map<String, IHostControlEntry> getHostControlEntry();

    IHostControlTable clone();

}
