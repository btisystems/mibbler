
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.vcnoperations.vcnprotswoptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IVcnProtSwOpEntry
    extends IDeviceEntity
{


    void setVcnProtSwOpTypeIdx(int vcnProtSwOpTypeIdx);

    int getVcnProtSwOpTypeIdx();

    void setVcnProtSwOpShelfIdx(int vcnProtSwOpShelfIdx);

    int getVcnProtSwOpShelfIdx();

    void setVcnProtSwOpSlotIdx(int vcnProtSwOpSlotIdx);

    int getVcnProtSwOpSlotIdx();

    void setVcnProtSwOpPortIdx(int vcnProtSwOpPortIdx);

    int getVcnProtSwOpPortIdx();

    void setVcnProtSwOpIdx(int vcnProtSwOpIdx);

    int getVcnProtSwOpIdx();

    void setVcnProtSwOpCmd(int vcnProtSwOpCmd);

    int getVcnProtSwOpCmd();

    IVcnProtSwOpEntry clone();

}
