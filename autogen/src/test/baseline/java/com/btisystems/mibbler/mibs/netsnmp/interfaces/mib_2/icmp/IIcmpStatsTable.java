
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.icmp;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.icmp.icmpstatstable.IIcmpStatsEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIcmpStatsTable
    extends IDeviceEntity
{


    Map<String, IIcmpStatsEntry> getIcmpStatsEntry();

    IIcmpStatsTable clone();

}
