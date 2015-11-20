
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.hosts.hostcontrol2table;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHostControl2Entry
    extends IDeviceEntity
{


    void setHostControlDroppedFrames(int hostControlDroppedFrames);

    int getHostControlDroppedFrames();

    void setHostControlCreateTime(int hostControlCreateTime);

    int getHostControlCreateTime();

    IHostControl2Entry clone();

}
