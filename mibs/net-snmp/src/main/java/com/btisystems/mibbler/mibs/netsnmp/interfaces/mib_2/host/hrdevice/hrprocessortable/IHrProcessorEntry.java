
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrprocessortable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrProcessorEntry
    extends IDeviceEntity
{


    void setHrProcessorFrwID(String hrProcessorFrwID);

    String getHrProcessorFrwID();

    void setHrProcessorLoad(int hrProcessorLoad);

    int getHrProcessorLoad();

    IHrProcessorEntry clone();

}
