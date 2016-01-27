
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswrun;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswrun.hrswruntable.IHrSWRunEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrSWRunTable
    extends IDeviceEntity
{


    Map<String, IHrSWRunEntry> getHrSWRunEntry();

    IHrSWRunTable clone();

}
