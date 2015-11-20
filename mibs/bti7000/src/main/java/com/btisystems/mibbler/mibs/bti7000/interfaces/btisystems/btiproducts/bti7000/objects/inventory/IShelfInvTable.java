
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.shelfinvtable.IShelfInvEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IShelfInvTable
    extends IDeviceEntity
{


    Map<String, IShelfInvEntry> getShelfInvEntry();

    IShelfInvTable clone();

}
