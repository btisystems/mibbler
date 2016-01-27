
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6nettomediatable.IIpv6NetToMediaEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6NetToMediaTable
    extends IDeviceEntity
{


    Map<String, IIpv6NetToMediaEntry> getIpv6NetToMediaEntry();

    IIpv6NetToMediaTable clone();

}
