
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.tokenring.ringstationordertable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRingStationOrderEntry
    extends IDeviceEntity
{


    void setRingStationOrderIfIndex(int ringStationOrderIfIndex);

    int getRingStationOrderIfIndex();

    void setRingStationOrderOrderIndex(int ringStationOrderOrderIndex);

    int getRingStationOrderOrderIndex();

    void setRingStationOrderMacAddress(String ringStationOrderMacAddress);

    String getRingStationOrderMacAddress();

    IRingStationOrderEntry clone();

}
