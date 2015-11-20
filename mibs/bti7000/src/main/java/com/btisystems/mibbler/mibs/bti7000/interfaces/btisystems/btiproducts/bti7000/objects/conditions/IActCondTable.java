
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.conditions;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.conditions.actcondtable.IActCondEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IActCondTable
    extends IDeviceEntity
{


    Map<String, IActCondEntry> getActCondEntry();

    IActCondTable clone();

}
