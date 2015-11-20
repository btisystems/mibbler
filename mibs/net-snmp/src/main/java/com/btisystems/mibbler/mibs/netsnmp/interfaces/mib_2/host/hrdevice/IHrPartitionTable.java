
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrpartitiontable.IHrPartitionEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrPartitionTable
    extends IDeviceEntity
{


    Map<String, IHrPartitionEntry> getHrPartitionEntry();

    IHrPartitionTable clone();

}
