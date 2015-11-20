
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpTrafficStats
    extends IDeviceEntity
{


    void setIpIfStatsTableLastChange(int ipIfStatsTableLastChange);

    int getIpIfStatsTableLastChange();

    IIpTrafficStats clone();

}
