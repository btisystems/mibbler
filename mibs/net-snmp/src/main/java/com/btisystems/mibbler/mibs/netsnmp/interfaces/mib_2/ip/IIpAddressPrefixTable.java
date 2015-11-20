
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipaddressprefixtable.IIpAddressPrefixEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpAddressPrefixTable
    extends IDeviceEntity
{


    Map<String, IIpAddressPrefixEntry> getIpAddressPrefixEntry();

    IIpAddressPrefixTable clone();

}
