
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.slotinvdatatable.ISlotInvDataEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISlotInvDataTable
    extends IDeviceEntity
{


    Map<String, ISlotInvDataEntry> getSlotInvDataEntry();

    ISlotInvDataTable clone();

}
