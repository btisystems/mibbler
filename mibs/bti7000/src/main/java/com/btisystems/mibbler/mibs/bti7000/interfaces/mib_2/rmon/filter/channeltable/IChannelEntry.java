
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.filter.channeltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IChannelEntry
    extends IDeviceEntity
{


    void setChannelIndex(int channelIndex);

    int getChannelIndex();

    void setChannelIfIndex(int channelIfIndex);

    int getChannelIfIndex();

    void setChannelAcceptType(int channelAcceptType);

    int getChannelAcceptType();

    void setChannelDataControl(int channelDataControl);

    int getChannelDataControl();

    boolean isChannelDataControlDefined();

    void setChannelTurnOnEventIndex(int channelTurnOnEventIndex);

    int getChannelTurnOnEventIndex();

    void setChannelTurnOffEventIndex(int channelTurnOffEventIndex);

    int getChannelTurnOffEventIndex();

    void setChannelEventIndex(int channelEventIndex);

    int getChannelEventIndex();

    void setChannelEventStatus(int channelEventStatus);

    int getChannelEventStatus();

    boolean isChannelEventStatusDefined();

    void setChannelMatches(int channelMatches);

    int getChannelMatches();

    void setChannelDescription(String channelDescription);

    String getChannelDescription();

    void setChannelOwner(String channelOwner);

    String getChannelOwner();

    void setChannelStatus(int channelStatus);

    int getChannelStatus();

    IChannelEntry clone();

}
