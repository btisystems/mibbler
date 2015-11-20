
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.xcvroperations.xcvrlpbkoptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IXcvrLpbkOpEntry
    extends IDeviceEntity
{


    void setXcvrLpbkOpTypeIdx(int xcvrLpbkOpTypeIdx);

    int getXcvrLpbkOpTypeIdx();

    void setXcvrLpbkOpShelfIdx(int xcvrLpbkOpShelfIdx);

    int getXcvrLpbkOpShelfIdx();

    void setXcvrLpbkOpSlotIdx(int xcvrLpbkOpSlotIdx);

    int getXcvrLpbkOpSlotIdx();

    void setXcvrLpbkOpIdx(int xcvrLpbkOpIdx);

    int getXcvrLpbkOpIdx();

    void setXcvrLpbkOpCmd(int xcvrLpbkOpCmd);

    int getXcvrLpbkOpCmd();

    IXcvrLpbkOpEntry clone();

}
