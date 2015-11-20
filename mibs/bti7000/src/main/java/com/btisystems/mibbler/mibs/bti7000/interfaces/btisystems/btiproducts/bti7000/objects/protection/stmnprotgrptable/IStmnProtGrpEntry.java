
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection.stmnprotgrptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IStmnProtGrpEntry
    extends IDeviceEntity
{


    void setStmnProtGrpWorkTypeIdx(int stmnProtGrpWorkTypeIdx);

    int getStmnProtGrpWorkTypeIdx();

    void setStmnProtGrpWorkShelfIdx(int stmnProtGrpWorkShelfIdx);

    int getStmnProtGrpWorkShelfIdx();

    void setStmnProtGrpWorkSlotIdx(int stmnProtGrpWorkSlotIdx);

    int getStmnProtGrpWorkSlotIdx();

    void setStmnProtGrpWorkPortIdx(int stmnProtGrpWorkPortIdx);

    int getStmnProtGrpWorkPortIdx();

    void setStmnProtGrpProtTypeIdx(int stmnProtGrpProtTypeIdx);

    int getStmnProtGrpProtTypeIdx();

    void setStmnProtGrpProtShelfIdx(int stmnProtGrpProtShelfIdx);

    int getStmnProtGrpProtShelfIdx();

    void setStmnProtGrpProtSlotIdx(int stmnProtGrpProtSlotIdx);

    int getStmnProtGrpProtSlotIdx();

    void setStmnProtGrpProtPortIdx(int stmnProtGrpProtPortIdx);

    int getStmnProtGrpProtPortIdx();

    void setStmnProtGrpId(String stmnProtGrpId);

    String getStmnProtGrpId();

    boolean isStmnProtGrpIdDefined();

    void setStmnProtGrpRowStatus(int stmnProtGrpRowStatus);

    int getStmnProtGrpRowStatus();

    IStmnProtGrpEntry clone();

}
