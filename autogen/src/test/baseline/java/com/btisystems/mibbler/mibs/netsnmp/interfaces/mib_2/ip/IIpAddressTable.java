
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipaddresstable.IIpAddressEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpAddressTable
    extends IDeviceEntity
{


    Map<String, IIpAddressEntry> getIpAddressEntry();

    IIpAddressTable clone();

}
