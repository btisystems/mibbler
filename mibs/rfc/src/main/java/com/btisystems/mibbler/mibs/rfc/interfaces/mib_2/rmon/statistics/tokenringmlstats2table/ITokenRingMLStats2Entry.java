
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.statistics.tokenringmlstats2table;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITokenRingMLStats2Entry
    extends IDeviceEntity
{


    void setTokenRingMLStatsDroppedFrames(int tokenRingMLStatsDroppedFrames);

    int getTokenRingMLStatsDroppedFrames();

    void setTokenRingMLStatsCreateTime(int tokenRingMLStatsCreateTime);

    int getTokenRingMLStatsCreateTime();

    ITokenRingMLStats2Entry clone();

}
