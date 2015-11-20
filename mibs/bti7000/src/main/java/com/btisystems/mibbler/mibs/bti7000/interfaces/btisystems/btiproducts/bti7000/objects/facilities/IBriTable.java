
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.britable.IBriEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IBriTable
    extends IDeviceEntity
{


    Map<String, IBriEntry> getBriEntry();

    IBriTable clone();

}
