
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmconfig;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmconfig.nlmconfiglogtable.INlmConfigLogEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlmConfigLogTable
    extends IDeviceEntity
{


    Map<String, INlmConfigLogEntry> getNlmConfigLogEntry();

    INlmConfigLogTable clone();

}
