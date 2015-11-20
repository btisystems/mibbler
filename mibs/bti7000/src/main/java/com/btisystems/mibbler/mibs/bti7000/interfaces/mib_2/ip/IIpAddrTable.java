
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ip;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ip.ipaddrtable.IIpAddrEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpAddrTable
    extends IDeviceEntity
{


    Map<String, IIpAddrEntry> getIpAddrEntry();

    IIpAddrTable clone();

}
