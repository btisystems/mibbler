
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.alarm;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.alarm.alarmtable.IAlarmEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAlarmTable
    extends IDeviceEntity
{


    Map<String, IAlarmEntry> getAlarmEntry();

    IAlarmTable clone();

}
