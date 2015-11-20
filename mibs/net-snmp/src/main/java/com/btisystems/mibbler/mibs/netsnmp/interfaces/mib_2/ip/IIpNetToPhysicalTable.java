
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipnettophysicaltable.IIpNetToPhysicalEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpNetToPhysicalTable
    extends IDeviceEntity
{


    Map<String, IIpNetToPhysicalEntry> getIpNetToPhysicalEntry();

    IIpNetToPhysicalTable clone();

}
