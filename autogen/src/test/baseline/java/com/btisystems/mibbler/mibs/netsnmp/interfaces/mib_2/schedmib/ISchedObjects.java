
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.schedmib;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISchedObjects
    extends IDeviceEntity
{


    void setSchedLocalTime(String schedLocalTime);

    String getSchedLocalTime();

    ISchedObjects clone();

}
