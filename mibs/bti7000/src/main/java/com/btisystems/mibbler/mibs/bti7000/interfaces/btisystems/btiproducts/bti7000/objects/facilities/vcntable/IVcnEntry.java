
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.vcntable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IVcnEntry
    extends IDeviceEntity
{


    void setVcnTypeIdx(int vcnTypeIdx);

    int getVcnTypeIdx();

    void setVcnShelfIdx(int vcnShelfIdx);

    int getVcnShelfIdx();

    void setVcnSlotIdx(int vcnSlotIdx);

    int getVcnSlotIdx();

    void setVcnPortIdx(int vcnPortIdx);

    int getVcnPortIdx();

    void setVcnIdx(int vcnIdx);

    int getVcnIdx();

    void setVcnProtSwEvtType(int vcnProtSwEvtType);

    int getVcnProtSwEvtType();

    void setVcnBER(int vcnBER);

    int getVcnBER();

    void setVcnBERTh(int vcnBERTh);

    int getVcnBERTh();

    void setVcnProtSwStatus(String vcnProtSwStatus);

    String getVcnProtSwStatus();

    IVcnEntry clone();

}
