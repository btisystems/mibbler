
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrfstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrFSEntry
    extends IDeviceEntity
{


    void setHrFSIndex(int hrFSIndex);

    int getHrFSIndex();

    void setHrFSMountPoint(String hrFSMountPoint);

    String getHrFSMountPoint();

    void setHrFSRemoteMountPoint(String hrFSRemoteMountPoint);

    String getHrFSRemoteMountPoint();

    void setHrFSType(String hrFSType);

    String getHrFSType();

    void setHrFSAccess(int hrFSAccess);

    int getHrFSAccess();

    void setHrFSBootable(int hrFSBootable);

    int getHrFSBootable();

    void setHrFSStorageIndex(int hrFSStorageIndex);

    int getHrFSStorageIndex();

    void setHrFSLastFullBackupDate(String hrFSLastFullBackupDate);

    String getHrFSLastFullBackupDate();

    void setHrFSLastPartialBackupDate(String hrFSLastPartialBackupDate);

    String getHrFSLastPartialBackupDate();

    IHrFSEntry clone();

}
