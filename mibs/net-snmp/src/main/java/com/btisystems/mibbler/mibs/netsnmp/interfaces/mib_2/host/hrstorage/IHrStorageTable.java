
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrstorage;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrstorage.hrstoragetable.IHrStorageEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrStorageTable
    extends IDeviceEntity
{


    Map<String, IHrStorageEntry> getHrStorageEntry();

    IHrStorageTable clone();

}
