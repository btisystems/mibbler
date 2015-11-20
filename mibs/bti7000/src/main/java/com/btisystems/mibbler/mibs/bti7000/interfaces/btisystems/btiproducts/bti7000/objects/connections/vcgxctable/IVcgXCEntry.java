
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.vcgxctable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IVcgXCEntry
    extends IDeviceEntity
{


    void setVcgXCSrcShelfIdx(int vcgXCSrcShelfIdx);

    int getVcgXCSrcShelfIdx();

    void setVcgXCSrcSlotIdx(int vcgXCSrcSlotIdx);

    int getVcgXCSrcSlotIdx();

    void setVcgXCSrcPortIdx(int vcgXCSrcPortIdx);

    int getVcgXCSrcPortIdx();

    void setVcgXCSrcIdx(int vcgXCSrcIdx);

    int getVcgXCSrcIdx();

    void setVcgXCDestShelfIdx(int vcgXCDestShelfIdx);

    int getVcgXCDestShelfIdx();

    void setVcgXCDestSlotIdx(int vcgXCDestSlotIdx);

    int getVcgXCDestSlotIdx();

    void setVcgXCDestPortIdx(int vcgXCDestPortIdx);

    int getVcgXCDestPortIdx();

    void setVcgXCDestIdx(int vcgXCDestIdx);

    int getVcgXCDestIdx();

    void setVcgXCType(int vcgXCType);

    int getVcgXCType();

    void setVcgXCProtShelfNum(int vcgXCProtShelfNum);

    int getVcgXCProtShelfNum();

    void setVcgXCProtSlotNum(int vcgXCProtSlotNum);

    int getVcgXCProtSlotNum();

    void setVcgXCProtPortNum(int vcgXCProtPortNum);

    int getVcgXCProtPortNum();

    void setVcgXCProtNum(int vcgXCProtNum);

    int getVcgXCProtNum();

    void setVcgXCRowStatus(int vcgXCRowStatus);

    int getVcgXCRowStatus();

    IVcgXCEntry clone();

}
