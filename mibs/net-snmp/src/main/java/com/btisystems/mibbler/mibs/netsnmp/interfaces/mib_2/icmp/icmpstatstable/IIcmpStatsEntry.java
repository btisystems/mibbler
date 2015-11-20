
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.icmp.icmpstatstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIcmpStatsEntry
    extends IDeviceEntity
{


    void setIcmpStatsIPVersion(int icmpStatsIPVersion);

    int getIcmpStatsIPVersion();

    void setIcmpStatsInMsgs(int icmpStatsInMsgs);

    int getIcmpStatsInMsgs();

    void setIcmpStatsInErrors(int icmpStatsInErrors);

    int getIcmpStatsInErrors();

    void setIcmpStatsOutMsgs(int icmpStatsOutMsgs);

    int getIcmpStatsOutMsgs();

    void setIcmpStatsOutErrors(int icmpStatsOutErrors);

    int getIcmpStatsOutErrors();

    IIcmpStatsEntry clone();

}
