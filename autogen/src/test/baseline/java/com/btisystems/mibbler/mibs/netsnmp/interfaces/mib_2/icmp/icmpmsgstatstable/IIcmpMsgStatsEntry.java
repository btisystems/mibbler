
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.icmp.icmpmsgstatstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIcmpMsgStatsEntry
    extends IDeviceEntity
{


    void setIcmpMsgStatsIPVersion(int icmpMsgStatsIPVersion);

    int getIcmpMsgStatsIPVersion();

    void setIcmpMsgStatsType(int icmpMsgStatsType);

    int getIcmpMsgStatsType();

    void setIcmpMsgStatsInPkts(int icmpMsgStatsInPkts);

    int getIcmpMsgStatsInPkts();

    void setIcmpMsgStatsOutPkts(int icmpMsgStatsOutPkts);

    int getIcmpMsgStatsOutPkts();

    IIcmpMsgStatsEntry clone();

}
