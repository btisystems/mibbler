
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.ringstationcontrol2table.IRingStationControl2Entry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRingStationControl2Table
    extends IDeviceEntity
{


    Map<String, IRingStationControl2Entry> getRingStationControl2Entry();

    IRingStationControl2Table clone();

}
