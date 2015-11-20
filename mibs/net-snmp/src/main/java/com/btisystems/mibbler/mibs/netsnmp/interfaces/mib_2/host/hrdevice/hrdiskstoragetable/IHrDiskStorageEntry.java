
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrdiskstoragetable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrDiskStorageEntry
    extends IDeviceEntity
{


    void setHrDiskStorageAccess(int hrDiskStorageAccess);

    int getHrDiskStorageAccess();

    void setHrDiskStorageMedia(int hrDiskStorageMedia);

    int getHrDiskStorageMedia();

    void setHrDiskStorageRemoveble(int hrDiskStorageRemoveble);

    int getHrDiskStorageRemoveble();

    void setHrDiskStorageCapacity(int hrDiskStorageCapacity);

    int getHrDiskStorageCapacity();

    IHrDiskStorageEntry clone();

}
