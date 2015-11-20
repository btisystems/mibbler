
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.ringstationcontroltable.IRingStationControlEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRingStationControlTable
    extends IDeviceEntity
{


    Map<String, IRingStationControlEntry> getRingStationControlEntry();

    IRingStationControlTable clone();

}
