
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.slotinvdatatable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISlotInvDataEntry
    extends IDeviceEntity
{


    void setSlotInvDataShelfIdx(int slotInvDataShelfIdx);

    int getSlotInvDataShelfIdx();

    void setSlotInvDataSlotTypeIdx(int slotInvDataSlotTypeIdx);

    int getSlotInvDataSlotTypeIdx();

    void setSlotInvDataSlotIdx(int slotInvDataSlotIdx);

    int getSlotInvDataSlotIdx();

    void setSlotInvDataRecordIdx(int slotInvDataRecordIdx);

    int getSlotInvDataRecordIdx();

    void setSlotInvDataNameIdx(int slotInvDataNameIdx);

    int getSlotInvDataNameIdx();

    void setSlotInvDataValue(String slotInvDataValue);

    String getSlotInvDataValue();

    ISlotInvDataEntry clone();

}
