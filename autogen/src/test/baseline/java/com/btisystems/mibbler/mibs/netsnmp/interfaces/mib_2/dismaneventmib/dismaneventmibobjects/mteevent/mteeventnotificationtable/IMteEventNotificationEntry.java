
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventnotificationtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteEventNotificationEntry
    extends IDeviceEntity
{


    void setMteEventNotification(String mteEventNotification);

    String getMteEventNotification();

    void setMteEventNotificationObjectsOwner(String mteEventNotificationObjectsOwner);

    String getMteEventNotificationObjectsOwner();

    void setMteEventNotificationObjects(String mteEventNotificationObjects);

    String getMteEventNotificationObjects();

    IMteEventNotificationEntry clone();

}
