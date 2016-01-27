
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IInterfaces
    extends IDeviceEntity
{


    void setIfNumber(int ifNumber);

    int getIfNumber();

    IInterfaces clone();

}
