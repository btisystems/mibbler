
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrprocessortable.IHrProcessorEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrProcessorTable
    extends IDeviceEntity
{


    Map<String, IHrProcessorEntry> getHrProcessorEntry();

    IHrProcessorTable clone();

}
