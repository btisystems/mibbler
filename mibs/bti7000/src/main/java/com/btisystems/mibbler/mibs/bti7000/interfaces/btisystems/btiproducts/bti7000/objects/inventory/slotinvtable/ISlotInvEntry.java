
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.slotinvtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISlotInvEntry
    extends IDeviceEntity
{


    void setSlotInvShelfIdx(int slotInvShelfIdx);

    int getSlotInvShelfIdx();

    void setSlotInvSlotTypeIdx(int slotInvSlotTypeIdx);

    int getSlotInvSlotTypeIdx();

    void setSlotInvSlotIdx(int slotInvSlotIdx);

    int getSlotInvSlotIdx();

    void setSlotInvSWVersion(String slotInvSWVersion);

    String getSlotInvSWVersion();

    void setSlotInvPackShortName(String slotInvPackShortName);

    String getSlotInvPackShortName();

    void setSlotInvPackName(String slotInvPackName);

    String getSlotInvPackName();

    void setSlotInvPackPEC(String slotInvPackPEC);

    String getSlotInvPackPEC();

    void setSlotInvPackCLEI(String slotInvPackCLEI);

    String getSlotInvPackCLEI();

    void setSlotInvPackSerialNum(String slotInvPackSerialNum);

    String getSlotInvPackSerialNum();

    void setSlotInvPackRev(int slotInvPackRev);

    int getSlotInvPackRev();

    void setSlotInvPackMfgDate(String slotInvPackMfgDate);

    String getSlotInvPackMfgDate();

    void setSlotInvPackMfgLoc(String slotInvPackMfgLoc);

    String getSlotInvPackMfgLoc();

    void setSlotInvPackTestDate(String slotInvPackTestDate);

    String getSlotInvPackTestDate();

    void setSlotInvPackTestLoc(String slotInvPackTestLoc);

    String getSlotInvPackTestLoc();

    void setSlotInvUpgradeStage(int slotInvUpgradeStage);

    int getSlotInvUpgradeStage();

    void setSlotInvUpgradeResult(int slotInvUpgradeResult);

    int getSlotInvUpgradeResult();

    void setSlotInvPackUSI(String slotInvPackUSI);

    String getSlotInvPackUSI();

    void setSlotInvTempHighTh(int slotInvTempHighTh);

    int getSlotInvTempHighTh();

    void setSlotInvTempShutdownTh(int slotInvTempShutdownTh);

    int getSlotInvTempShutdownTh();

    ISlotInvEntry clone();

}
