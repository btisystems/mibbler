
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.pluggableinvtable.IPluggableInvEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IPluggableInvTable
    extends IDeviceEntity
{


    Map<String, IPluggableInvEntry> getPluggableInvEntry();

    IPluggableInvTable clone();

}
