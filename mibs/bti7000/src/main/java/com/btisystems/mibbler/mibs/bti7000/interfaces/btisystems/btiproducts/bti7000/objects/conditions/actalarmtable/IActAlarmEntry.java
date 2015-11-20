
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.conditions.actalarmtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IActAlarmEntry
    extends IDeviceEntity
{


    void setActAlarmNotifIdx(String actAlarmNotifIdx);

    String getActAlarmNotifIdx();

    void setActAlarmTableEntryIdx(String actAlarmTableEntryIdx);

    String getActAlarmTableEntryIdx();

    void setActAlarmInstanceIdx(String actAlarmInstanceIdx);

    String getActAlarmInstanceIdx();

    void setActAlarmReportType(int actAlarmReportType);

    int getActAlarmReportType();

    void setActAlarmDateAndTime(String actAlarmDateAndTime);

    String getActAlarmDateAndTime();

    void setActAlarmSeverity(int actAlarmSeverity);

    int getActAlarmSeverity();

    void setActAlarmServiceAffecting(int actAlarmServiceAffecting);

    int getActAlarmServiceAffecting();

    void setActAlarmDescription(String actAlarmDescription);

    String getActAlarmDescription();

    void setActAlarmObjectType(int actAlarmObjectType);

    int getActAlarmObjectType();

    void setActAlarmCodeType(int actAlarmCodeType);

    int getActAlarmCodeType();

    IActAlarmEntry clone();

}
