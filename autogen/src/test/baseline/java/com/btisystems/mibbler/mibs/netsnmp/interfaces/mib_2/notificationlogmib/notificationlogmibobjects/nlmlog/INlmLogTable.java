
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog.nlmlogtable.INlmLogEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlmLogTable
    extends IDeviceEntity
{


    Map<String, INlmLogEntry> getNlmLogEntry();

    INlmLogTable clone();

}
