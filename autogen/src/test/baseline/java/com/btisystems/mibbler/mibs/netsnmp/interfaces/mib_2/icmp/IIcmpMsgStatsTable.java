
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.icmp;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.icmp.icmpmsgstatstable.IIcmpMsgStatsEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIcmpMsgStatsTable
    extends IDeviceEntity
{


    Map<String, IIcmpMsgStatsEntry> getIcmpMsgStatsEntry();

    IIcmpMsgStatsTable clone();

}
