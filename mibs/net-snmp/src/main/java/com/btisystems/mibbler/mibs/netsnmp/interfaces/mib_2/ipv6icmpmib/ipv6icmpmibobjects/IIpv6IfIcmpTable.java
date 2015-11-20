
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6icmpmib.ipv6icmpmibobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6icmpmib.ipv6icmpmibobjects.ipv6ificmptable.IIpv6IfIcmpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6IfIcmpTable
    extends IDeviceEntity
{


    Map<String, IIpv6IfIcmpEntry> getIpv6IfIcmpEntry();

    IIpv6IfIcmpTable clone();

}
