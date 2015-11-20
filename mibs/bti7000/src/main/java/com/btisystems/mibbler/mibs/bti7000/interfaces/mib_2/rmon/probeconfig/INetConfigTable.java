
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.probeconfig;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.probeconfig.netconfigtable.INetConfigEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INetConfigTable
    extends IDeviceEntity
{


    Map<String, INetConfigEntry> getNetConfigEntry();

    INetConfigTable clone();

}
