
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.capture;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.capture.capturebuffertable.ICaptureBufferEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ICaptureBufferTable
    extends IDeviceEntity
{


    Map<String, ICaptureBufferEntry> getCaptureBufferEntry();

    ICaptureBufferTable clone();

}
