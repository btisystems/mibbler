
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.ringstationtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRingStationEntry
    extends IDeviceEntity
{


    void setRingStationIfIndex(int ringStationIfIndex);

    int getRingStationIfIndex();

    void setRingStationMacAddress(String ringStationMacAddress);

    String getRingStationMacAddress();

    void setRingStationLastNAUN(String ringStationLastNAUN);

    String getRingStationLastNAUN();

    void setRingStationStationStatus(int ringStationStationStatus);

    int getRingStationStationStatus();

    void setRingStationLastEnterTime(int ringStationLastEnterTime);

    int getRingStationLastEnterTime();

    void setRingStationLastExitTime(int ringStationLastExitTime);

    int getRingStationLastExitTime();

    void setRingStationDuplicateAddresses(int ringStationDuplicateAddresses);

    int getRingStationDuplicateAddresses();

    void setRingStationInLineErrors(int ringStationInLineErrors);

    int getRingStationInLineErrors();

    void setRingStationOutLineErrors(int ringStationOutLineErrors);

    int getRingStationOutLineErrors();

    void setRingStationInternalErrors(int ringStationInternalErrors);

    int getRingStationInternalErrors();

    void setRingStationInBurstErrors(int ringStationInBurstErrors);

    int getRingStationInBurstErrors();

    void setRingStationOutBurstErrors(int ringStationOutBurstErrors);

    int getRingStationOutBurstErrors();

    void setRingStationACErrors(int ringStationACErrors);

    int getRingStationACErrors();

    void setRingStationAbortErrors(int ringStationAbortErrors);

    int getRingStationAbortErrors();

    void setRingStationLostFrameErrors(int ringStationLostFrameErrors);

    int getRingStationLostFrameErrors();

    void setRingStationCongestionErrors(int ringStationCongestionErrors);

    int getRingStationCongestionErrors();

    void setRingStationFrameCopiedErrors(int ringStationFrameCopiedErrors);

    int getRingStationFrameCopiedErrors();

    void setRingStationFrequencyErrors(int ringStationFrequencyErrors);

    int getRingStationFrequencyErrors();

    void setRingStationTokenErrors(int ringStationTokenErrors);

    int getRingStationTokenErrors();

    void setRingStationInBeaconErrors(int ringStationInBeaconErrors);

    int getRingStationInBeaconErrors();

    void setRingStationOutBeaconErrors(int ringStationOutBeaconErrors);

    int getRingStationOutBeaconErrors();

    void setRingStationInsertions(int ringStationInsertions);

    int getRingStationInsertions();

    IRingStationEntry clone();

}
