
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrdevicetable.IHrDeviceEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrDeviceTable
    extends IDeviceEntity
{


    Map<String, IHrDeviceEntry> getHrDeviceEntry();

    IHrDeviceTable clone();

}
