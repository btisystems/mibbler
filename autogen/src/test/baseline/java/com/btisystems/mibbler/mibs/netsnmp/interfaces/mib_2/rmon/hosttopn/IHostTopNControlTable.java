
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.hosttopn;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.hosttopn.hosttopncontroltable.IHostTopNControlEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHostTopNControlTable
    extends IDeviceEntity
{


    Map<String, IHostTopNControlEntry> getHostTopNControlEntry();

    IHostTopNControlTable clone();

}
