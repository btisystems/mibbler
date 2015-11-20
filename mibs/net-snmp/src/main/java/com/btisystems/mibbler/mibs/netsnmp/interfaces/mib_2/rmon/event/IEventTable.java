
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.event;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.event.eventtable.IEventEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IEventTable
    extends IDeviceEntity
{


    Map<String, IEventEntry> getEventEntry();

    IEventTable clone();

}
