
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.sourceroutingstats2table;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISourceRoutingStats2Entry
    extends IDeviceEntity
{


    void setSourceRoutingStatsDroppedFrames(int sourceRoutingStatsDroppedFrames);

    int getSourceRoutingStatsDroppedFrames();

    void setSourceRoutingStatsCreateTime(int sourceRoutingStatsCreateTime);

    int getSourceRoutingStatsCreateTime();

    ISourceRoutingStats2Entry clone();

}
