
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswrunperf;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswrunperf.hrswrunperftable.IHrSWRunPerfEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrSWRunPerfTable
    extends IDeviceEntity
{


    Map<String, IHrSWRunPerfEntry> getHrSWRunPerfEntry();

    IHrSWRunPerfTable clone();

}
