
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.ocnoperations.ocnprotswoptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOcnProtSwOpEntry
    extends IDeviceEntity
{


    void setOcnProtSwOpTypeIdx(int ocnProtSwOpTypeIdx);

    int getOcnProtSwOpTypeIdx();

    void setOcnProtSwOpShelfIdx(int ocnProtSwOpShelfIdx);

    int getOcnProtSwOpShelfIdx();

    void setOcnProtSwOpSlotIdx(int ocnProtSwOpSlotIdx);

    int getOcnProtSwOpSlotIdx();

    void setOcnProtSwOpIdx(int ocnProtSwOpIdx);

    int getOcnProtSwOpIdx();

    void setOcnProtSwOpCmd(int ocnProtSwOpCmd);

    int getOcnProtSwOpCmd();

    IOcnProtSwOpEntry clone();

}
