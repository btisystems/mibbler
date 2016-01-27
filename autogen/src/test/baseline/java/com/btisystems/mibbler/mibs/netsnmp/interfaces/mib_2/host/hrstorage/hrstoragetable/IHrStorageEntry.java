
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrstorage.hrstoragetable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrStorageEntry
    extends IDeviceEntity
{


    void setHrStorageIndex(int hrStorageIndex);

    int getHrStorageIndex();

    void setHrStorageType(String hrStorageType);

    String getHrStorageType();

    void setHrStorageDescr(String hrStorageDescr);

    String getHrStorageDescr();

    void setHrStorageAllocationUnits(int hrStorageAllocationUnits);

    int getHrStorageAllocationUnits();

    void setHrStorageSize(int hrStorageSize);

    int getHrStorageSize();

    void setHrStorageUsed(int hrStorageUsed);

    int getHrStorageUsed();

    void setHrStorageAllocationFailures(int hrStorageAllocationFailures);

    int getHrStorageAllocationFailures();

    IHrStorageEntry clone();

}
