
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.iptrafficstats;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.iptrafficstats.ipsystemstatstable.IIpSystemStatsEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpSystemStatsTable
    extends IDeviceEntity
{


    Map<String, IIpSystemStatsEntry> getIpSystemStatsEntry();

    IIpSystemStatsTable clone();

}
