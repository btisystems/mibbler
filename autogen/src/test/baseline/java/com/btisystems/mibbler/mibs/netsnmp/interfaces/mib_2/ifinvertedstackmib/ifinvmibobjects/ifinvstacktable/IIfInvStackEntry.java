
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifinvertedstackmib.ifinvmibobjects.ifinvstacktable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIfInvStackEntry
    extends IDeviceEntity
{


    void setIfInvStackStatus(int ifInvStackStatus);

    int getIfInvStackStatus();

    IIfInvStackEntry clone();

}
