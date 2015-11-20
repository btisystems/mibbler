
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.capture;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.capture.buffercontroltable.IBufferControlEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IBufferControlTable
    extends IDeviceEntity
{


    Map<String, IBufferControlEntry> getBufferControlEntry();

    IBufferControlTable clone();

}
