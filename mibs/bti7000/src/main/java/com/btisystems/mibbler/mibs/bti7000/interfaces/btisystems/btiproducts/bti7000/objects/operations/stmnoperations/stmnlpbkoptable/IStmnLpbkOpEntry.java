
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stmnoperations.stmnlpbkoptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IStmnLpbkOpEntry
    extends IDeviceEntity
{


    void setStmnLpbkOpTypeIdx(int stmnLpbkOpTypeIdx);

    int getStmnLpbkOpTypeIdx();

    void setStmnLpbkOpShelfIdx(int stmnLpbkOpShelfIdx);

    int getStmnLpbkOpShelfIdx();

    void setStmnLpbkOpSlotIdx(int stmnLpbkOpSlotIdx);

    int getStmnLpbkOpSlotIdx();

    void setStmnLpbkOpPortIdx(int stmnLpbkOpPortIdx);

    int getStmnLpbkOpPortIdx();

    void setStmnLpbkOpCmd(int stmnLpbkOpCmd);

    int getStmnLpbkOpCmd();

    IStmnLpbkOpEntry clone();

}
