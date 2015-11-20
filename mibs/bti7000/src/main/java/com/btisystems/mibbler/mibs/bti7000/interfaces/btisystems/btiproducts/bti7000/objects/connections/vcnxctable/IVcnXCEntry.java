
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.vcnxctable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IVcnXCEntry
    extends IDeviceEntity
{


    void setVcnXCVcnTypeIdx(int vcnXCVcnTypeIdx);

    int getVcnXCVcnTypeIdx();

    void setVcnXCSrcShelfIdx(int vcnXCSrcShelfIdx);

    int getVcnXCSrcShelfIdx();

    void setVcnXCSrcSlotIdx(int vcnXCSrcSlotIdx);

    int getVcnXCSrcSlotIdx();

    void setVcnXCSrcPortIdx(int vcnXCSrcPortIdx);

    int getVcnXCSrcPortIdx();

    void setVcnXCSrcIdx(int vcnXCSrcIdx);

    int getVcnXCSrcIdx();

    void setVcnXCDestShelfIdx(int vcnXCDestShelfIdx);

    int getVcnXCDestShelfIdx();

    void setVcnXCDestSlotIdx(int vcnXCDestSlotIdx);

    int getVcnXCDestSlotIdx();

    void setVcnXCDestPortIdx(int vcnXCDestPortIdx);

    int getVcnXCDestPortIdx();

    void setVcnXCDestIdx(int vcnXCDestIdx);

    int getVcnXCDestIdx();

    void setVcnXCType(int vcnXCType);

    int getVcnXCType();

    void setVcnXCProtTypeNum(int vcnXCProtTypeNum);

    int getVcnXCProtTypeNum();

    void setVcnXCProtShelfNum(int vcnXCProtShelfNum);

    int getVcnXCProtShelfNum();

    void setVcnXCProtSlotNum(int vcnXCProtSlotNum);

    int getVcnXCProtSlotNum();

    void setVcnXCProtPortNum(int vcnXCProtPortNum);

    int getVcnXCProtPortNum();

    void setVcnXCProtNum(int vcnXCProtNum);

    int getVcnXCProtNum();

    void setVcnXCRowStatus(int vcnXCRowStatus);

    int getVcnXCRowStatus();

    IVcnXCEntry clone();

}
