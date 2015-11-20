
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.tokenring.ringstationconfigcontroltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRingStationConfigControlEntry
    extends IDeviceEntity
{


    void setRingStationConfigControlIfIndex(int ringStationConfigControlIfIndex);

    int getRingStationConfigControlIfIndex();

    void setRingStationConfigControlMacAddress(String ringStationConfigControlMacAddress);

    String getRingStationConfigControlMacAddress();

    void setRingStationConfigControlRemove(int ringStationConfigControlRemove);

    int getRingStationConfigControlRemove();

    void setRingStationConfigControlUpdateStats(int ringStationConfigControlUpdateStats);

    int getRingStationConfigControlUpdateStats();

    IRingStationConfigControlEntry clone();

}
