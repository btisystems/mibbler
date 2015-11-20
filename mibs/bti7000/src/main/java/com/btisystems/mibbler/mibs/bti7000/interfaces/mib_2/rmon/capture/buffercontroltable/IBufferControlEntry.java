
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.capture.buffercontroltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IBufferControlEntry
    extends IDeviceEntity
{


    void setBufferControlIndex(int bufferControlIndex);

    int getBufferControlIndex();

    void setBufferControlChannelIndex(int bufferControlChannelIndex);

    int getBufferControlChannelIndex();

    void setBufferControlFullStatus(int bufferControlFullStatus);

    int getBufferControlFullStatus();

    void setBufferControlFullAction(int bufferControlFullAction);

    int getBufferControlFullAction();

    void setBufferControlCaptureSliceSize(int bufferControlCaptureSliceSize);

    int getBufferControlCaptureSliceSize();

    boolean isBufferControlCaptureSliceSizeDefined();

    void setBufferControlDownloadSliceSize(int bufferControlDownloadSliceSize);

    int getBufferControlDownloadSliceSize();

    boolean isBufferControlDownloadSliceSizeDefined();

    void setBufferControlDownloadOffset(int bufferControlDownloadOffset);

    int getBufferControlDownloadOffset();

    boolean isBufferControlDownloadOffsetDefined();

    void setBufferControlMaxOctetsRequested(int bufferControlMaxOctetsRequested);

    int getBufferControlMaxOctetsRequested();

    boolean isBufferControlMaxOctetsRequestedDefined();

    void setBufferControlMaxOctetsGranted(int bufferControlMaxOctetsGranted);

    int getBufferControlMaxOctetsGranted();

    void setBufferControlCapturedPackets(int bufferControlCapturedPackets);

    int getBufferControlCapturedPackets();

    void setBufferControlTurnOnTime(int bufferControlTurnOnTime);

    int getBufferControlTurnOnTime();

    void setBufferControlOwner(String bufferControlOwner);

    String getBufferControlOwner();

    void setBufferControlStatus(int bufferControlStatus);

    int getBufferControlStatus();

    IBufferControlEntry clone();

}
