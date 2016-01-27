
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.hosts;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.hosts.hosttimetable.IHostTimeEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHostTimeTable
    extends IDeviceEntity
{


    Map<String, IHostTimeEntry> getHostTimeEntry();

    IHostTimeTable clone();

}
