
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.probeconfig;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.probeconfig.serialconfigtable.ISerialConfigEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISerialConfigTable
    extends IDeviceEntity
{


    Map<String, ISerialConfigEntry> getSerialConfigEntry();

    ISerialConfigTable clone();

}
