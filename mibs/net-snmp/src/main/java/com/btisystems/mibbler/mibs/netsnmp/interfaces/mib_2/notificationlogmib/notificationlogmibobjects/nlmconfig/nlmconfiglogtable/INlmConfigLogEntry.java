
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmconfig.nlmconfiglogtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlmConfigLogEntry
    extends IDeviceEntity
{


    void setNlmLogName(String nlmLogName);

    String getNlmLogName();

    void setNlmConfigLogFilterName(String nlmConfigLogFilterName);

    String getNlmConfigLogFilterName();

    void setNlmConfigLogEntryLimit(int nlmConfigLogEntryLimit);

    int getNlmConfigLogEntryLimit();

    boolean isNlmConfigLogEntryLimitDefined();

    void setNlmConfigLogAdminStatus(int nlmConfigLogAdminStatus);

    int getNlmConfigLogAdminStatus();

    boolean isNlmConfigLogAdminStatusDefined();

    void setNlmConfigLogOperStatus(int nlmConfigLogOperStatus);

    int getNlmConfigLogOperStatus();

    void setNlmConfigLogStorageType(int nlmConfigLogStorageType);

    int getNlmConfigLogStorageType();

    void setNlmConfigLogEntryStatus(int nlmConfigLogEntryStatus);

    int getNlmConfigLogEntryStatus();

    INlmConfigLogEntry clone();

}
