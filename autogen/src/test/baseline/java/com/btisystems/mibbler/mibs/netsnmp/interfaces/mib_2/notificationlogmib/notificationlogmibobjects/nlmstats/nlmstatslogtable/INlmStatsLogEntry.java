
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmstats.nlmstatslogtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlmStatsLogEntry
    extends IDeviceEntity
{


    void setNlmStatsLogNotificationsLogged(int nlmStatsLogNotificationsLogged);

    int getNlmStatsLogNotificationsLogged();

    void setNlmStatsLogNotificationsBumped(int nlmStatsLogNotificationsBumped);

    int getNlmStatsLogNotificationsBumped();

    INlmStatsLogEntry clone();

}
