
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smrunobjects.smruntable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISmRunEntry
    extends IDeviceEntity
{


    void setSmRunIndex(int smRunIndex);

    int getSmRunIndex();

    void setSmRunArgument(String smRunArgument);

    String getSmRunArgument();

    void setSmRunStartTime(String smRunStartTime);

    String getSmRunStartTime();

    void setSmRunEndTime(String smRunEndTime);

    String getSmRunEndTime();

    void setSmRunLifeTime(int smRunLifeTime);

    int getSmRunLifeTime();

    void setSmRunExpireTime(int smRunExpireTime);

    int getSmRunExpireTime();

    void setSmRunExitCode(int smRunExitCode);

    int getSmRunExitCode();

    boolean isSmRunExitCodeDefined();

    void setSmRunResult(String smRunResult);

    String getSmRunResult();

    void setSmRunControl(int smRunControl);

    int getSmRunControl();

    boolean isSmRunControlDefined();

    void setSmRunState(int smRunState);

    int getSmRunState();

    void setSmRunError(String smRunError);

    String getSmRunError();

    void setSmRunResultTime(String smRunResultTime);

    String getSmRunResultTime();

    void setSmRunErrorTime(String smRunErrorTime);

    String getSmRunErrorTime();

    ISmRunEntry clone();

}
