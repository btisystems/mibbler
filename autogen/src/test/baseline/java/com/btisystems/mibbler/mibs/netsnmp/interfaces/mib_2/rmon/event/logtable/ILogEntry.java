
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.event.logtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ILogEntry
    extends IDeviceEntity
{


    void setLogEventIndex(int logEventIndex);

    int getLogEventIndex();

    void setLogIndex(int logIndex);

    int getLogIndex();

    void setLogTime(int logTime);

    int getLogTime();

    void setLogDescription(String logDescription);

    String getLogDescription();

    ILogEntry clone();

}
