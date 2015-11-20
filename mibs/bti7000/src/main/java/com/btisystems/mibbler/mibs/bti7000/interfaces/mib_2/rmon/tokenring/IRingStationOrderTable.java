
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.ringstationordertable.IRingStationOrderEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRingStationOrderTable
    extends IDeviceEntity
{


    Map<String, IRingStationOrderEntry> getRingStationOrderEntry();

    IRingStationOrderTable clone();

}
