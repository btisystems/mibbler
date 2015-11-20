
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrStorage
    extends IDeviceEntity
{


    void setHrMemorySize(int hrMemorySize);

    int getHrMemorySize();

    IHrStorage clone();

}
