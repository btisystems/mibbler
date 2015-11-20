
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection.ocnprotgrptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOcnProtGrpEntry
    extends IDeviceEntity
{


    void setOcnProtGrpWorkTypeIdx(int ocnProtGrpWorkTypeIdx);

    int getOcnProtGrpWorkTypeIdx();

    void setOcnProtGrpWorkShelfIdx(int ocnProtGrpWorkShelfIdx);

    int getOcnProtGrpWorkShelfIdx();

    void setOcnProtGrpWorkSlotIdx(int ocnProtGrpWorkSlotIdx);

    int getOcnProtGrpWorkSlotIdx();

    void setOcnProtGrpWorkPortIdx(int ocnProtGrpWorkPortIdx);

    int getOcnProtGrpWorkPortIdx();

    void setOcnProtGrpProtTypeIdx(int ocnProtGrpProtTypeIdx);

    int getOcnProtGrpProtTypeIdx();

    void setOcnProtGrpProtShelfIdx(int ocnProtGrpProtShelfIdx);

    int getOcnProtGrpProtShelfIdx();

    void setOcnProtGrpProtSlotIdx(int ocnProtGrpProtSlotIdx);

    int getOcnProtGrpProtSlotIdx();

    void setOcnProtGrpProtPortIdx(int ocnProtGrpProtPortIdx);

    int getOcnProtGrpProtPortIdx();

    void setOcnProtGrpId(String ocnProtGrpId);

    String getOcnProtGrpId();

    boolean isOcnProtGrpIdDefined();

    void setOcnProtGrpRowStatus(int ocnProtGrpRowStatus);

    int getOcnProtGrpRowStatus();

    IOcnProtGrpEntry clone();

}
