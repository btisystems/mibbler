
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlmStats
    extends IDeviceEntity
{


    void setNlmStatsGlobalNotificationsLogged(int nlmStatsGlobalNotificationsLogged);

    int getNlmStatsGlobalNotificationsLogged();

    void setNlmStatsGlobalNotificationsBumped(int nlmStatsGlobalNotificationsBumped);

    int getNlmStatsGlobalNotificationsBumped();

    INlmStats clone();

}
