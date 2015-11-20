
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.geoperations.gelpbkoptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IGeLpbkOpEntry
    extends IDeviceEntity
{


    void setGeLpbkOpShelfIdx(int geLpbkOpShelfIdx);

    int getGeLpbkOpShelfIdx();

    void setGeLpbkOpSlotIdx(int geLpbkOpSlotIdx);

    int getGeLpbkOpSlotIdx();

    void setGeLpbkOpPortIdx(int geLpbkOpPortIdx);

    int getGeLpbkOpPortIdx();

    void setGeLpbkOpCmd(int geLpbkOpCmd);

    int getGeLpbkOpCmd();

    IGeLpbkOpEntry clone();

}
