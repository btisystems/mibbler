
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stsnoperations.stsnprotswoptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IStsnProtSwOpEntry
    extends IDeviceEntity
{


    void setStsnProtSwOpTypeIdx(int stsnProtSwOpTypeIdx);

    int getStsnProtSwOpTypeIdx();

    void setStsnProtSwOpShelfIdx(int stsnProtSwOpShelfIdx);

    int getStsnProtSwOpShelfIdx();

    void setStsnProtSwOpSlotIdx(int stsnProtSwOpSlotIdx);

    int getStsnProtSwOpSlotIdx();

    void setStsnProtSwOpPortIdx(int stsnProtSwOpPortIdx);

    int getStsnProtSwOpPortIdx();

    void setStsnProtSwOpIdx(int stsnProtSwOpIdx);

    int getStsnProtSwOpIdx();

    void setStsnProtSwOpCmd(int stsnProtSwOpCmd);

    int getStsnProtSwOpCmd();

    IStsnProtSwOpEntry clone();

}
