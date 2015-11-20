
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ifmib.ifmibobjects.iftesttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIfTestEntry
    extends IDeviceEntity
{


    void setIfTestId(int ifTestId);

    int getIfTestId();

    void setIfTestStatus(int ifTestStatus);

    int getIfTestStatus();

    void setIfTestType(String ifTestType);

    String getIfTestType();

    void setIfTestResult(int ifTestResult);

    int getIfTestResult();

    void setIfTestCode(String ifTestCode);

    String getIfTestCode();

    void setIfTestOwner(String ifTestOwner);

    String getIfTestOwner();

    IIfTestEntry clone();

}
