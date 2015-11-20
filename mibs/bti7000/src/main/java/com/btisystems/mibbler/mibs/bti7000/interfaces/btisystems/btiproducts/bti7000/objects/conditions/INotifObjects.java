
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.conditions;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INotifObjects
    extends IDeviceEntity
{


    void setCondDateAndTime(String condDateAndTime);

    String getCondDateAndTime();

    void setCondReportType(int condReportType);

    int getCondReportType();

    void setCondSeverity(int condSeverity);

    int getCondSeverity();

    void setCondServiceAffecting(int condServiceAffecting);

    int getCondServiceAffecting();

    void setCondDescription(String condDescription);

    String getCondDescription();

    void setCondObjectType(int condObjectType);

    int getCondObjectType();

    void setCondCodeType(int condCodeType);

    int getCondCodeType();

    INotifObjects clone();

}
