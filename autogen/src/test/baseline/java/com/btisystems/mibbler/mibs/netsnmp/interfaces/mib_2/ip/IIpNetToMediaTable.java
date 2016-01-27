
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipnettomediatable.IIpNetToMediaEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpNetToMediaTable
    extends IDeviceEntity
{


    Map<String, IIpNetToMediaEntry> getIpNetToMediaEntry();

    IIpNetToMediaTable clone();

}
