
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics.etherstats2table;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IEtherStats2Entry
    extends IDeviceEntity
{


    void setEtherStatsDroppedFrames(int etherStatsDroppedFrames);

    int getEtherStatsDroppedFrames();

    void setEtherStatsCreateTime(int etherStatsCreateTime);

    int getEtherStatsCreateTime();

    IEtherStats2Entry clone();

}
