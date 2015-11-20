
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.brioperations.brilpbkoptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IBriLpbkOpEntry
    extends IDeviceEntity
{


    void setBriLpbkOpShelfIdx(int briLpbkOpShelfIdx);

    int getBriLpbkOpShelfIdx();

    void setBriLpbkOpSlotIdx(int briLpbkOpSlotIdx);

    int getBriLpbkOpSlotIdx();

    void setBriLpbkOpPortIdx(int briLpbkOpPortIdx);

    int getBriLpbkOpPortIdx();

    void setBriLpbkOpCmd(int briLpbkOpCmd);

    int getBriLpbkOpCmd();

    IBriLpbkOpEntry clone();

}
