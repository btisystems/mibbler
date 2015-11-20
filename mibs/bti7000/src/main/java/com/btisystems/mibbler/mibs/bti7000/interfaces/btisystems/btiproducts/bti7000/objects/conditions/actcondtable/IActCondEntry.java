
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.conditions.actcondtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IActCondEntry
    extends IDeviceEntity
{


    void setActCondNotifIdx(String actCondNotifIdx);

    String getActCondNotifIdx();

    void setActCondTableEntryIdx(String actCondTableEntryIdx);

    String getActCondTableEntryIdx();

    void setActCondInstanceIdx(String actCondInstanceIdx);

    String getActCondInstanceIdx();

    void setActCondReportType(int actCondReportType);

    int getActCondReportType();

    void setActCondDateAndTime(String actCondDateAndTime);

    String getActCondDateAndTime();

    void setActCondSeverity(int actCondSeverity);

    int getActCondSeverity();

    void setActCondServiceAffecting(int actCondServiceAffecting);

    int getActCondServiceAffecting();

    void setActCondDescription(String actCondDescription);

    String getActCondDescription();

    void setActCondObjectType(int actCondObjectType);

    int getActCondObjectType();

    void setActCondCodeType(int actCondCodeType);

    int getActCondCodeType();

    IActCondEntry clone();

}
