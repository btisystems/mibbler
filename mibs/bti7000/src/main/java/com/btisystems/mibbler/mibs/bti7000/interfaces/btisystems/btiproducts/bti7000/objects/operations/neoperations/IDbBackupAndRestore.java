
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.neoperations;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDbBackupAndRestore
    extends IDeviceEntity
{


    void setDbBackupAndRestoreCmd(int dbBackupAndRestoreCmd);

    int getDbBackupAndRestoreCmd();

    void setDbBackupAndRestoreType(int dbBackupAndRestoreType);

    int getDbBackupAndRestoreType();

    void setDbBackupAndRestoreAddress(String dbBackupAndRestoreAddress);

    String getDbBackupAndRestoreAddress();

    void setDbBackupAndRestorePath(String dbBackupAndRestorePath);

    String getDbBackupAndRestorePath();

    void setDbBackupAndRestoreFtpUser(String dbBackupAndRestoreFtpUser);

    String getDbBackupAndRestoreFtpUser();

    void setDbBackupAndRestoreFtpPswd(String dbBackupAndRestoreFtpPswd);

    String getDbBackupAndRestoreFtpPswd();

    void setDbBackupAndRestoreCheckAlm(int dbBackupAndRestoreCheckAlm);

    int getDbBackupAndRestoreCheckAlm();

    void setDbBackupAndRestoreCheckSysName(int dbBackupAndRestoreCheckSysName);

    int getDbBackupAndRestoreCheckSysName();

    void setDbBackupAndRestoreInvokeFilename(String dbBackupAndRestoreInvokeFilename);

    String getDbBackupAndRestoreInvokeFilename();

    void setDbBackupAndRestoreFilename(String dbBackupAndRestoreFilename);

    String getDbBackupAndRestoreFilename();

    void setDbBackupAndRestoreResult(int dbBackupAndRestoreResult);

    int getDbBackupAndRestoreResult();

    IDbBackupAndRestore clone();

}
