
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.stsntable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IStsnEntry
    extends IDeviceEntity
{


    void setStsnTypeIdx(int stsnTypeIdx);

    int getStsnTypeIdx();

    void setStsnShelfIdx(int stsnShelfIdx);

    int getStsnShelfIdx();

    void setStsnSlotIdx(int stsnSlotIdx);

    int getStsnSlotIdx();

    void setStsnPortIdx(int stsnPortIdx);

    int getStsnPortIdx();

    void setStsnIdx(int stsnIdx);

    int getStsnIdx();

    void setStsnProtSwEvtType(int stsnProtSwEvtType);

    int getStsnProtSwEvtType();

    void setStsnBER(int stsnBER);

    int getStsnBER();

    void setStsnBERTh(int stsnBERTh);

    int getStsnBERTh();

    void setStsnProtSwStatus(String stsnProtSwStatus);

    String getStsnProtSwStatus();

    IStsnEntry clone();

}
