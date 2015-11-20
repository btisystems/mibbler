
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IConditions
    extends IDeviceEntity
{


    void setActCondSummary(int actCondSummary);

    int getActCondSummary();

    IConditions clone();

}
