
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifinvertedstackmib.ifinvmibobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifinvertedstackmib.ifinvmibobjects.ifinvstacktable.IIfInvStackEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIfInvStackTable
    extends IDeviceEntity
{


    Map<String, IIfInvStackEntry> getIfInvStackEntry();

    IIfInvStackTable clone();

}
