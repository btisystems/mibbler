
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrfstable.IHrFSEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrFSTable
    extends IDeviceEntity
{


    Map<String, IHrFSEntry> getHrFSEntry();

    IHrFSTable clone();

}
