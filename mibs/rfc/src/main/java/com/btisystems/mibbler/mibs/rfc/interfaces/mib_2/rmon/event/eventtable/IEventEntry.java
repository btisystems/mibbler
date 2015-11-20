
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.event.eventtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IEventEntry
    extends IDeviceEntity
{


    void setEventIndex(int eventIndex);

    int getEventIndex();

    void setEventDescription(String eventDescription);

    String getEventDescription();

    void setEventType(int eventType);

    int getEventType();

    void setEventCommunity(String eventCommunity);

    String getEventCommunity();

    void setEventLastTimeSent(int eventLastTimeSent);

    int getEventLastTimeSent();

    void setEventOwner(String eventOwner);

    String getEventOwner();

    void setEventStatus(int eventStatus);

    int getEventStatus();

    IEventEntry clone();

}
