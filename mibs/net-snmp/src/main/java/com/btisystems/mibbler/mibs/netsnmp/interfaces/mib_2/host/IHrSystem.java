
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrSystem
    extends IDeviceEntity
{


    void setHrSystemUptime(int hrSystemUptime);

    int getHrSystemUptime();

    void setHrSystemDate(String hrSystemDate);

    String getHrSystemDate();

    void setHrSystemInitialLoadDevice(int hrSystemInitialLoadDevice);

    int getHrSystemInitialLoadDevice();

    void setHrSystemInitialLoadParameters(String hrSystemInitialLoadParameters);

    String getHrSystemInitialLoadParameters();

    void setHrSystemNumUsers(int hrSystemNumUsers);

    int getHrSystemNumUsers();

    void setHrSystemProcesses(int hrSystemProcesses);

    int getHrSystemProcesses();

    void setHrSystemMaxProcesses(int hrSystemMaxProcesses);

    int getHrSystemMaxProcesses();

    IHrSystem clone();

}
