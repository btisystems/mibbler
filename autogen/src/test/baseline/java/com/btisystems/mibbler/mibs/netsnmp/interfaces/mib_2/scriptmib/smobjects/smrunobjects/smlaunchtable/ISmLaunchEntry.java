
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smrunobjects.smlaunchtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISmLaunchEntry
    extends IDeviceEntity
{


    void setSmLaunchOwner(String smLaunchOwner);

    String getSmLaunchOwner();

    void setSmLaunchName(String smLaunchName);

    String getSmLaunchName();

    void setSmLaunchScriptOwner(String smLaunchScriptOwner);

    String getSmLaunchScriptOwner();

    void setSmLaunchScriptName(String smLaunchScriptName);

    String getSmLaunchScriptName();

    void setSmLaunchArgument(String smLaunchArgument);

    String getSmLaunchArgument();

    void setSmLaunchMaxRunning(int smLaunchMaxRunning);

    int getSmLaunchMaxRunning();

    boolean isSmLaunchMaxRunningDefined();

    void setSmLaunchMaxCompleted(int smLaunchMaxCompleted);

    int getSmLaunchMaxCompleted();

    boolean isSmLaunchMaxCompletedDefined();

    void setSmLaunchLifeTime(int smLaunchLifeTime);

    int getSmLaunchLifeTime();

    boolean isSmLaunchLifeTimeDefined();

    void setSmLaunchExpireTime(int smLaunchExpireTime);

    int getSmLaunchExpireTime();

    boolean isSmLaunchExpireTimeDefined();

    void setSmLaunchStart(int smLaunchStart);

    int getSmLaunchStart();

    boolean isSmLaunchStartDefined();

    void setSmLaunchControl(int smLaunchControl);

    int getSmLaunchControl();

    boolean isSmLaunchControlDefined();

    void setSmLaunchAdminStatus(int smLaunchAdminStatus);

    int getSmLaunchAdminStatus();

    boolean isSmLaunchAdminStatusDefined();

    void setSmLaunchOperStatus(int smLaunchOperStatus);

    int getSmLaunchOperStatus();

    boolean isSmLaunchOperStatusDefined();

    void setSmLaunchRunIndexNext(int smLaunchRunIndexNext);

    int getSmLaunchRunIndexNext();

    void setSmLaunchStorageType(int smLaunchStorageType);

    int getSmLaunchStorageType();

    boolean isSmLaunchStorageTypeDefined();

    void setSmLaunchRowStatus(int smLaunchRowStatus);

    int getSmLaunchRowStatus();

    void setSmLaunchError(String smLaunchError);

    String getSmLaunchError();

    void setSmLaunchLastChange(String smLaunchLastChange);

    String getSmLaunchLastChange();

    void setSmLaunchRowExpireTime(int smLaunchRowExpireTime);

    int getSmLaunchRowExpireTime();

    boolean isSmLaunchRowExpireTimeDefined();

    ISmLaunchEntry clone();

}
