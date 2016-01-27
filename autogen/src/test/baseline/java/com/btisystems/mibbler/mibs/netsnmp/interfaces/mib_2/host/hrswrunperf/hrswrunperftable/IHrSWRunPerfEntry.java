
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswrunperf.hrswrunperftable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrSWRunPerfEntry
    extends IDeviceEntity
{


    void setHrSWRunPerfCPU(int hrSWRunPerfCPU);

    int getHrSWRunPerfCPU();

    void setHrSWRunPerfMem(int hrSWRunPerfMem);

    int getHrSWRunPerfMem();

    IHrSWRunPerfEntry clone();

}
