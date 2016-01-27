
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrdiskstoragetable.IHrDiskStorageEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrDiskStorageTable
    extends IDeviceEntity
{


    Map<String, IHrDiskStorageEntry> getHrDiskStorageEntry();

    IHrDiskStorageTable clone();

}
