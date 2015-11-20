
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.hosttopn;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.hosttopn.hosttopntable.IHostTopNEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHostTopNTable
    extends IDeviceEntity
{


    Map<String, IHostTopNEntry> getHostTopNEntry();

    IHostTopNTable clone();

}
