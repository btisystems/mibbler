
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.tokenring.ringstationcontrol2table;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRingStationControl2Entry
    extends IDeviceEntity
{


    void setRingStationControlDroppedFrames(int ringStationControlDroppedFrames);

    int getRingStationControlDroppedFrames();

    void setRingStationControlCreateTime(int ringStationControlCreateTime);

    int getRingStationControlCreateTime();

    IRingStationControl2Entry clone();

}
