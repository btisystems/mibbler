
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.xcvroperations.xcvrprotswoptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IXcvrProtSwOpEntry
    extends IDeviceEntity
{


    void setXcvrProtSwOpTypeIdx(int xcvrProtSwOpTypeIdx);

    int getXcvrProtSwOpTypeIdx();

    void setXcvrProtSwOpShelfIdx(int xcvrProtSwOpShelfIdx);

    int getXcvrProtSwOpShelfIdx();

    void setXcvrProtSwOpSlotIdx(int xcvrProtSwOpSlotIdx);

    int getXcvrProtSwOpSlotIdx();

    void setXcvrProtSwOpIdx(int xcvrProtSwOpIdx);

    int getXcvrProtSwOpIdx();

    void setXcvrProtSwOpCmd(int xcvrProtSwOpCmd);

    int getXcvrProtSwOpCmd();

    IXcvrProtSwOpEntry clone();

}
