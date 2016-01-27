
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswrun.hrswruntable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrSWRunEntry
    extends IDeviceEntity
{


    void setHrSWRunIndex(int hrSWRunIndex);

    int getHrSWRunIndex();

    void setHrSWRunName(String hrSWRunName);

    String getHrSWRunName();

    void setHrSWRunID(String hrSWRunID);

    String getHrSWRunID();

    void setHrSWRunPath(String hrSWRunPath);

    String getHrSWRunPath();

    void setHrSWRunParameters(String hrSWRunParameters);

    String getHrSWRunParameters();

    void setHrSWRunType(int hrSWRunType);

    int getHrSWRunType();

    void setHrSWRunStatus(int hrSWRunStatus);

    int getHrSWRunStatus();

    IHrSWRunEntry clone();

}
