
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.alarm.alarmtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAlarmEntry
    extends IDeviceEntity
{


    void setAlarmIndex(int alarmIndex);

    int getAlarmIndex();

    void setAlarmInterval(int alarmInterval);

    int getAlarmInterval();

    void setAlarmVariable(String alarmVariable);

    String getAlarmVariable();

    void setAlarmSampleType(int alarmSampleType);

    int getAlarmSampleType();

    void setAlarmValue(int alarmValue);

    int getAlarmValue();

    void setAlarmStartupAlarm(int alarmStartupAlarm);

    int getAlarmStartupAlarm();

    void setAlarmRisingThreshold(int alarmRisingThreshold);

    int getAlarmRisingThreshold();

    void setAlarmFallingThreshold(int alarmFallingThreshold);

    int getAlarmFallingThreshold();

    void setAlarmRisingEventIndex(int alarmRisingEventIndex);

    int getAlarmRisingEventIndex();

    void setAlarmFallingEventIndex(int alarmFallingEventIndex);

    int getAlarmFallingEventIndex();

    void setAlarmOwner(String alarmOwner);

    String getAlarmOwner();

    void setAlarmStatus(int alarmStatus);

    int getAlarmStatus();

    IAlarmEntry clone();

}
