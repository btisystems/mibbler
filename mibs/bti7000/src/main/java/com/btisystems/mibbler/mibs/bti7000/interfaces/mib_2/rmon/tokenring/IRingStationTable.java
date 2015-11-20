
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.ringstationtable.IRingStationEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRingStationTable
    extends IDeviceEntity
{


    Map<String, IRingStationEntry> getRingStationEntry();

    IRingStationTable clone();

}
