
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ifmib;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIfMIBObjects
    extends IDeviceEntity
{


    void setIfTableLastChange(int ifTableLastChange);

    int getIfTableLastChange();

    void setIfStackLastChange(int ifStackLastChange);

    int getIfStackLastChange();

    IIfMIBObjects clone();

}
