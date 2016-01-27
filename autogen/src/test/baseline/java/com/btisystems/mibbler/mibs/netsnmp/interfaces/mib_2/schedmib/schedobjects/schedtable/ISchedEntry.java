
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.schedmib.schedobjects.schedtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISchedEntry
    extends IDeviceEntity
{


    void setSchedOwner(String schedOwner);

    String getSchedOwner();

    void setSchedName(String schedName);

    String getSchedName();

    void setSchedDescr(String schedDescr);

    String getSchedDescr();

    boolean isSchedDescrDefined();

    void setSchedInterval(int schedInterval);

    int getSchedInterval();

    boolean isSchedIntervalDefined();

    void setSchedWeekDay(String schedWeekDay);

    String getSchedWeekDay();

    void setSchedMonth(String schedMonth);

    String getSchedMonth();

    void setSchedDay(String schedDay);

    String getSchedDay();

    void setSchedHour(String schedHour);

    String getSchedHour();

    void setSchedMinute(String schedMinute);

    String getSchedMinute();

    void setSchedContextName(String schedContextName);

    String getSchedContextName();

    boolean isSchedContextNameDefined();

    void setSchedVariable(String schedVariable);

    String getSchedVariable();

    void setSchedValue(int schedValue);

    int getSchedValue();

    boolean isSchedValueDefined();

    void setSchedType(int schedType);

    int getSchedType();

    boolean isSchedTypeDefined();

    void setSchedAdminStatus(int schedAdminStatus);

    int getSchedAdminStatus();

    boolean isSchedAdminStatusDefined();

    void setSchedOperStatus(int schedOperStatus);

    int getSchedOperStatus();

    void setSchedFailures(int schedFailures);

    int getSchedFailures();

    void setSchedLastFailure(int schedLastFailure);

    int getSchedLastFailure();

    boolean isSchedLastFailureDefined();

    void setSchedLastFailed(String schedLastFailed);

    String getSchedLastFailed();

    void setSchedStorageType(int schedStorageType);

    int getSchedStorageType();

    boolean isSchedStorageTypeDefined();

    void setSchedRowStatus(int schedRowStatus);

    int getSchedRowStatus();

    void setSchedTriggers(int schedTriggers);

    int getSchedTriggers();

    ISchedEntry clone();

}
