
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.amdtable.IAmdEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAmdTable
    extends IDeviceEntity
{


    Map<String, IAmdEntry> getAmdEntry();

    IAmdTable clone();

}
