
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.tokenring;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.tokenring.ringstationconfigcontroltable.IRingStationConfigControlEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRingStationConfigControlTable
    extends IDeviceEntity
{


    Map<String, IRingStationConfigControlEntry> getRingStationConfigControlEntry();

    IRingStationConfigControlTable clone();

}
