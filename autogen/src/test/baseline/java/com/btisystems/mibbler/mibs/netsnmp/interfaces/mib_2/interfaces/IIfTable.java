
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.interfaces;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.interfaces.iftable.IIfEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIfTable
    extends IDeviceEntity
{


    Map<String, IIfEntry> getIfEntry();

    IIfTable clone();

}
