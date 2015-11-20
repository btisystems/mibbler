
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.iptrafficstats;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.iptrafficstats.ipifstatstable.IIpIfStatsEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpIfStatsTable
    extends IDeviceEntity
{


    Map<String, IIpIfStatsEntry> getIpIfStatsEntry();

    IIpIfStatsTable clone();

}
