
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.odunxctable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOdunXCEntry
    extends IDeviceEntity
{


    void setOdunXCOdunTypeIdx(int odunXCOdunTypeIdx);

    int getOdunXCOdunTypeIdx();

    void setOdunXCSrcShelfIdx(int odunXCSrcShelfIdx);

    int getOdunXCSrcShelfIdx();

    void setOdunXCSrcSlotIdx(int odunXCSrcSlotIdx);

    int getOdunXCSrcSlotIdx();

    void setOdunXCSrcPortIdx(int odunXCSrcPortIdx);

    int getOdunXCSrcPortIdx();

    void setOdunXCSrcIdx(int odunXCSrcIdx);

    int getOdunXCSrcIdx();

    void setOdunXCDestShelfIdx(int odunXCDestShelfIdx);

    int getOdunXCDestShelfIdx();

    void setOdunXCDestSlotIdx(int odunXCDestSlotIdx);

    int getOdunXCDestSlotIdx();

    void setOdunXCDestPortIdx(int odunXCDestPortIdx);

    int getOdunXCDestPortIdx();

    void setOdunXCDestIdx(int odunXCDestIdx);

    int getOdunXCDestIdx();

    void setOdunXCType(int odunXCType);

    int getOdunXCType();

    void setOdunXCProtTypeNum(int odunXCProtTypeNum);

    int getOdunXCProtTypeNum();

    void setOdunXCProtShelfNum(int odunXCProtShelfNum);

    int getOdunXCProtShelfNum();

    void setOdunXCProtSlotNum(int odunXCProtSlotNum);

    int getOdunXCProtSlotNum();

    void setOdunXCProtPortNum(int odunXCProtPortNum);

    int getOdunXCProtPortNum();

    void setOdunXCProtNum(int odunXCProtNum);

    int getOdunXCProtNum();

    void setOdunXCRowStatus(int odunXCRowStatus);

    int getOdunXCRowStatus();

    IOdunXCEntry clone();

}
