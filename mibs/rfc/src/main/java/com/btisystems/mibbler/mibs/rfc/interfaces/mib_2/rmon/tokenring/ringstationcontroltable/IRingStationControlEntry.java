
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.tokenring.ringstationcontroltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRingStationControlEntry
    extends IDeviceEntity
{


    void setRingStationControlIfIndex(int ringStationControlIfIndex);

    int getRingStationControlIfIndex();

    void setRingStationControlTableSize(int ringStationControlTableSize);

    int getRingStationControlTableSize();

    void setRingStationControlActiveStations(int ringStationControlActiveStations);

    int getRingStationControlActiveStations();

    void setRingStationControlRingState(int ringStationControlRingState);

    int getRingStationControlRingState();

    void setRingStationControlBeaconSender(String ringStationControlBeaconSender);

    String getRingStationControlBeaconSender();

    void setRingStationControlBeaconNAUN(String ringStationControlBeaconNAUN);

    String getRingStationControlBeaconNAUN();

    void setRingStationControlActiveMonitor(String ringStationControlActiveMonitor);

    String getRingStationControlActiveMonitor();

    void setRingStationControlOrderChanges(int ringStationControlOrderChanges);

    int getRingStationControlOrderChanges();

    void setRingStationControlOwner(String ringStationControlOwner);

    String getRingStationControlOwner();

    void setRingStationControlStatus(int ringStationControlStatus);

    int getRingStationControlStatus();

    IRingStationControlEntry clone();

}
