
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.oaoperations.oaoobrsdoptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOaOOBRSDOpEntry
    extends IDeviceEntity
{


    void setOaOOBRSDOpTypeIdx(int oaOOBRSDOpTypeIdx);

    int getOaOOBRSDOpTypeIdx();

    void setOaOOBRSDOpShelfIdx(int oaOOBRSDOpShelfIdx);

    int getOaOOBRSDOpShelfIdx();

    void setOaOOBRSDOpSlotIdx(int oaOOBRSDOpSlotIdx);

    int getOaOOBRSDOpSlotIdx();

    void setOaOOBRSDOpIdx(int oaOOBRSDOpIdx);

    int getOaOOBRSDOpIdx();

    void setOaOOBRSDOpCmd(int oaOOBRSDOpCmd);

    int getOaOOBRSDOpCmd();

    void setOaOOBRSDOpTimer(int oaOOBRSDOpTimer);

    int getOaOOBRSDOpTimer();

    IOaOOBRSDOpEntry clone();

}
