
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.fcoperations.fclpbkoptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IFcLpbkOpEntry
    extends IDeviceEntity
{


    void setFcLpbkOpShelfIdx(int fcLpbkOpShelfIdx);

    int getFcLpbkOpShelfIdx();

    void setFcLpbkOpSlotIdx(int fcLpbkOpSlotIdx);

    int getFcLpbkOpSlotIdx();

    void setFcLpbkOpPortIdx(int fcLpbkOpPortIdx);

    int getFcLpbkOpPortIdx();

    void setFcLpbkOpCmd(int fcLpbkOpCmd);

    int getFcLpbkOpCmd();

    IFcLpbkOpEntry clone();

}
