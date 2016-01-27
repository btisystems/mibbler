
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.hosttopn.hosttopncontroltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHostTopNControlEntry
    extends IDeviceEntity
{


    void setHostTopNControlIndex(int hostTopNControlIndex);

    int getHostTopNControlIndex();

    void setHostTopNHostIndex(int hostTopNHostIndex);

    int getHostTopNHostIndex();

    void setHostTopNRateBase(int hostTopNRateBase);

    int getHostTopNRateBase();

    void setHostTopNTimeRemaining(int hostTopNTimeRemaining);

    int getHostTopNTimeRemaining();

    boolean isHostTopNTimeRemainingDefined();

    void setHostTopNDuration(int hostTopNDuration);

    int getHostTopNDuration();

    boolean isHostTopNDurationDefined();

    void setHostTopNRequestedSize(int hostTopNRequestedSize);

    int getHostTopNRequestedSize();

    boolean isHostTopNRequestedSizeDefined();

    void setHostTopNGrantedSize(int hostTopNGrantedSize);

    int getHostTopNGrantedSize();

    void setHostTopNStartTime(int hostTopNStartTime);

    int getHostTopNStartTime();

    void setHostTopNOwner(String hostTopNOwner);

    String getHostTopNOwner();

    void setHostTopNStatus(int hostTopNStatus);

    int getHostTopNStatus();

    IHostTopNControlEntry clone();

}
