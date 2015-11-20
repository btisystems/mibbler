
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog.nlmlogtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlmLogEntry
    extends IDeviceEntity
{


    void setNlmLogIndex(int nlmLogIndex);

    int getNlmLogIndex();

    void setNlmLogTime(int nlmLogTime);

    int getNlmLogTime();

    void setNlmLogDateAndTime(String nlmLogDateAndTime);

    String getNlmLogDateAndTime();

    void setNlmLogEngineID(String nlmLogEngineID);

    String getNlmLogEngineID();

    void setNlmLogEngineTAddress(String nlmLogEngineTAddress);

    String getNlmLogEngineTAddress();

    void setNlmLogEngineTDomain(String nlmLogEngineTDomain);

    String getNlmLogEngineTDomain();

    void setNlmLogContextEngineID(String nlmLogContextEngineID);

    String getNlmLogContextEngineID();

    void setNlmLogContextName(String nlmLogContextName);

    String getNlmLogContextName();

    void setNlmLogNotificationID(String nlmLogNotificationID);

    String getNlmLogNotificationID();

    INlmLogEntry clone();

}
