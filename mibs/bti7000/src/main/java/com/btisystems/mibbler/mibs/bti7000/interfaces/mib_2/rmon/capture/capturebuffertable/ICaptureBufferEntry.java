
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.capture.capturebuffertable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ICaptureBufferEntry
    extends IDeviceEntity
{


    void setCaptureBufferControlIndex(int captureBufferControlIndex);

    int getCaptureBufferControlIndex();

    void setCaptureBufferIndex(int captureBufferIndex);

    int getCaptureBufferIndex();

    void setCaptureBufferPacketID(int captureBufferPacketID);

    int getCaptureBufferPacketID();

    void setCaptureBufferPacketData(String captureBufferPacketData);

    String getCaptureBufferPacketData();

    void setCaptureBufferPacketLength(int captureBufferPacketLength);

    int getCaptureBufferPacketLength();

    void setCaptureBufferPacketTime(int captureBufferPacketTime);

    int getCaptureBufferPacketTime();

    void setCaptureBufferPacketStatus(int captureBufferPacketStatus);

    int getCaptureBufferPacketStatus();

    ICaptureBufferEntry clone();

}
