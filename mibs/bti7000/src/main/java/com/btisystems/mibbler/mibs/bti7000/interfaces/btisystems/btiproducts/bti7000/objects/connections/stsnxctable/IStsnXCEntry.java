
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.stsnxctable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IStsnXCEntry
    extends IDeviceEntity
{


    void setStsnXCStsnTypeIdx(int stsnXCStsnTypeIdx);

    int getStsnXCStsnTypeIdx();

    void setStsnXCSrcShelfIdx(int stsnXCSrcShelfIdx);

    int getStsnXCSrcShelfIdx();

    void setStsnXCSrcSlotIdx(int stsnXCSrcSlotIdx);

    int getStsnXCSrcSlotIdx();

    void setStsnXCSrcPortIdx(int stsnXCSrcPortIdx);

    int getStsnXCSrcPortIdx();

    void setStsnXCSrcIdx(int stsnXCSrcIdx);

    int getStsnXCSrcIdx();

    void setStsnXCDestShelfIdx(int stsnXCDestShelfIdx);

    int getStsnXCDestShelfIdx();

    void setStsnXCDestSlotIdx(int stsnXCDestSlotIdx);

    int getStsnXCDestSlotIdx();

    void setStsnXCDestPortIdx(int stsnXCDestPortIdx);

    int getStsnXCDestPortIdx();

    void setStsnXCDestIdx(int stsnXCDestIdx);

    int getStsnXCDestIdx();

    void setStsnXCType(int stsnXCType);

    int getStsnXCType();

    void setStsnXCProtTypeNum(int stsnXCProtTypeNum);

    int getStsnXCProtTypeNum();

    void setStsnXCProtShelfNum(int stsnXCProtShelfNum);

    int getStsnXCProtShelfNum();

    void setStsnXCProtSlotNum(int stsnXCProtSlotNum);

    int getStsnXCProtSlotNum();

    void setStsnXCProtPortNum(int stsnXCProtPortNum);

    int getStsnXCProtPortNum();

    void setStsnXCProtNum(int stsnXCProtNum);

    int getStsnXCProtNum();

    void setStsnXCRowStatus(int stsnXCRowStatus);

    int getStsnXCRowStatus();

    IStsnXCEntry clone();

}
