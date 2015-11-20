
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stmnoperations.stmnprotswoptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IStmnProtSwOpEntry
    extends IDeviceEntity
{


    void setStmnProtSwOpTypeIdx(int stmnProtSwOpTypeIdx);

    int getStmnProtSwOpTypeIdx();

    void setStmnProtSwOpShelfIdx(int stmnProtSwOpShelfIdx);

    int getStmnProtSwOpShelfIdx();

    void setStmnProtSwOpSlotIdx(int stmnProtSwOpSlotIdx);

    int getStmnProtSwOpSlotIdx();

    void setStmnProtSwOpIdx(int stmnProtSwOpIdx);

    int getStmnProtSwOpIdx();

    void setStmnProtSwOpCmd(int stmnProtSwOpCmd);

    int getStmnProtSwOpCmd();

    IStmnProtSwOpEntry clone();

}
