
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.slotinvtable.ISlotInvEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISlotInvTable
    extends IDeviceEntity
{


    Map<String, ISlotInvEntry> getSlotInvEntry();

    ISlotInvTable clone();

}
