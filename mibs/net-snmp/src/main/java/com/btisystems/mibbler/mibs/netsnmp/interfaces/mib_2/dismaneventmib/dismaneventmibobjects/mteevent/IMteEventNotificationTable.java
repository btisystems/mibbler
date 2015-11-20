
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventnotificationtable.IMteEventNotificationEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteEventNotificationTable
    extends IDeviceEntity
{


    Map<String, IMteEventNotificationEntry> getMteEventNotificationEntry();

    IMteEventNotificationTable clone();

}
