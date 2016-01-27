
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifmib.ifmibobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifmib.ifmibobjects.ifstacktable.IIfStackEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIfStackTable
    extends IDeviceEntity
{


    Map<String, IIfStackEntry> getIfStackEntry();

    IIfStackTable clone();

}
