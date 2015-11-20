
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.tokenring.ringstationconfigtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRingStationConfigEntry
    extends IDeviceEntity
{


    void setRingStationConfigIfIndex(int ringStationConfigIfIndex);

    int getRingStationConfigIfIndex();

    void setRingStationConfigMacAddress(String ringStationConfigMacAddress);

    String getRingStationConfigMacAddress();

    void setRingStationConfigUpdateTime(int ringStationConfigUpdateTime);

    int getRingStationConfigUpdateTime();

    void setRingStationConfigLocation(String ringStationConfigLocation);

    String getRingStationConfigLocation();

    void setRingStationConfigMicrocode(String ringStationConfigMicrocode);

    String getRingStationConfigMicrocode();

    void setRingStationConfigGroupAddress(String ringStationConfigGroupAddress);

    String getRingStationConfigGroupAddress();

    void setRingStationConfigFunctionalAddress(String ringStationConfigFunctionalAddress);

    String getRingStationConfigFunctionalAddress();

    IRingStationConfigEntry clone();

}
