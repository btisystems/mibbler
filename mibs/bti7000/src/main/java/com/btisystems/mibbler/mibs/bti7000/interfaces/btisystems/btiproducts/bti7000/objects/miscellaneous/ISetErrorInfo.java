
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.miscellaneous;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISetErrorInfo
    extends IDeviceEntity
{


    void setSetErrorCode(int setErrorCode);

    int getSetErrorCode();

    void setSetErrorDesc(String setErrorDesc);

    String getSetErrorDesc();

    ISetErrorInfo clone();

}
