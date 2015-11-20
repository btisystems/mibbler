
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.xcvrxctable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IXcvrXCEntry
    extends IDeviceEntity
{


    void setXcvrXCSrcTypeIdx(int xcvrXCSrcTypeIdx);

    int getXcvrXCSrcTypeIdx();

    void setXcvrXCSrcShelfIdx(int xcvrXCSrcShelfIdx);

    int getXcvrXCSrcShelfIdx();

    void setXcvrXCSrcSlotIdx(int xcvrXCSrcSlotIdx);

    int getXcvrXCSrcSlotIdx();

    void setXcvrXCSrcIdx(int xcvrXCSrcIdx);

    int getXcvrXCSrcIdx();

    void setXcvrXCDestTypeIdx(int xcvrXCDestTypeIdx);

    int getXcvrXCDestTypeIdx();

    void setXcvrXCDestShelfIdx(int xcvrXCDestShelfIdx);

    int getXcvrXCDestShelfIdx();

    void setXcvrXCDestSlotIdx(int xcvrXCDestSlotIdx);

    int getXcvrXCDestSlotIdx();

    void setXcvrXCDestIdx(int xcvrXCDestIdx);

    int getXcvrXCDestIdx();

    void setXcvrXCType(int xcvrXCType);

    int getXcvrXCType();

    void setXcvrXCRowStatus(int xcvrXCRowStatus);

    int getXcvrXCRowStatus();

    IXcvrXCEntry clone();

}
