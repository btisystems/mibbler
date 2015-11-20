
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.capture;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.capture.buffercontroltable.IBufferControlEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IBufferControlTable
    extends IDeviceEntity
{


    Map<String, IBufferControlEntry> getBufferControlEntry();

    IBufferControlTable clone();

}
