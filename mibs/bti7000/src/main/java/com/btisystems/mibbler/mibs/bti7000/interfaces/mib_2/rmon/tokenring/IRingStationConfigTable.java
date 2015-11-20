
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.ringstationconfigtable.IRingStationConfigEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRingStationConfigTable
    extends IDeviceEntity
{


    Map<String, IRingStationConfigEntry> getRingStationConfigEntry();

    IRingStationConfigTable clone();

}
