
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipforward;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipforward.ipforwardtable.IIpForwardEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpForwardTable
    extends IDeviceEntity
{


    Map<String, IIpForwardEntry> getIpForwardEntry();

    IIpForwardTable clone();

}
