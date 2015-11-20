
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.filter.channel2table;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IChannel2Entry
    extends IDeviceEntity
{


    void setChannelDroppedFrames(int channelDroppedFrames);

    int getChannelDroppedFrames();

    void setChannelCreateTime(int channelCreateTime);

    int getChannelCreateTime();

    IChannel2Entry clone();

}
