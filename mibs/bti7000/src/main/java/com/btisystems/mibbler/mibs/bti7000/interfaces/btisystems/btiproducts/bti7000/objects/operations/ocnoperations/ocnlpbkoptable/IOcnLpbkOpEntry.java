
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.ocnoperations.ocnlpbkoptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOcnLpbkOpEntry
    extends IDeviceEntity
{


    void setOcnLpbkOpTypeIdx(int ocnLpbkOpTypeIdx);

    int getOcnLpbkOpTypeIdx();

    void setOcnLpbkOpShelfIdx(int ocnLpbkOpShelfIdx);

    int getOcnLpbkOpShelfIdx();

    void setOcnLpbkOpSlotIdx(int ocnLpbkOpSlotIdx);

    int getOcnLpbkOpSlotIdx();

    void setOcnLpbkOpPortIdx(int ocnLpbkOpPortIdx);

    int getOcnLpbkOpPortIdx();

    void setOcnLpbkOpCmd(int ocnLpbkOpCmd);

    int getOcnLpbkOpCmd();

    IOcnLpbkOpEntry clone();

}
