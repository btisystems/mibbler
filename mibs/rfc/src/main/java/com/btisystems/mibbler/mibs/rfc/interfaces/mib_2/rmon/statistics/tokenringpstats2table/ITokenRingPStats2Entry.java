
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.statistics.tokenringpstats2table;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITokenRingPStats2Entry
    extends IDeviceEntity
{


    void setTokenRingPStatsDroppedFrames(int tokenRingPStatsDroppedFrames);

    int getTokenRingPStatsDroppedFrames();

    void setTokenRingPStatsCreateTime(int tokenRingPStatsCreateTime);

    int getTokenRingPStatsCreateTime();

    ITokenRingPStats2Entry clone();

}
