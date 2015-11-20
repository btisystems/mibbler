
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmstats;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmstats.nlmstatslogtable.INlmStatsLogEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlmStatsLogTable
    extends IDeviceEntity
{


    Map<String, INlmStatsLogEntry> getNlmStatsLogEntry();

    INlmStatsLogTable clone();

}
