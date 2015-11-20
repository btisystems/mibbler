
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.conditions;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.conditions.actalarmtable.IActAlarmEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IActAlarmTable
    extends IDeviceEntity
{


    Map<String, IActAlarmEntry> getActAlarmEntry();

    IActAlarmTable clone();

}
