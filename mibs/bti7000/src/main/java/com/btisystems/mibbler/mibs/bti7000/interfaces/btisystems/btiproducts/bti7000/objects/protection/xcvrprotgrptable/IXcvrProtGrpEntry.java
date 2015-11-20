
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection.xcvrprotgrptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IXcvrProtGrpEntry
    extends IDeviceEntity
{


    void setXcvrProtGrpWorkTypeIdx(int xcvrProtGrpWorkTypeIdx);

    int getXcvrProtGrpWorkTypeIdx();

    void setXcvrProtGrpWorkShelfIdx(int xcvrProtGrpWorkShelfIdx);

    int getXcvrProtGrpWorkShelfIdx();

    void setXcvrProtGrpWorkSlotIdx(int xcvrProtGrpWorkSlotIdx);

    int getXcvrProtGrpWorkSlotIdx();

    void setXcvrProtGrpWorkIdx(int xcvrProtGrpWorkIdx);

    int getXcvrProtGrpWorkIdx();

    void setXcvrProtGrpProtTypeIdx(int xcvrProtGrpProtTypeIdx);

    int getXcvrProtGrpProtTypeIdx();

    void setXcvrProtGrpProtShelfIdx(int xcvrProtGrpProtShelfIdx);

    int getXcvrProtGrpProtShelfIdx();

    void setXcvrProtGrpProtSlotIdx(int xcvrProtGrpProtSlotIdx);

    int getXcvrProtGrpProtSlotIdx();

    void setXcvrProtGrpProtIdx(int xcvrProtGrpProtIdx);

    int getXcvrProtGrpProtIdx();

    void setXcvrProtGrpId(String xcvrProtGrpId);

    String getXcvrProtGrpId();

    boolean isXcvrProtGrpIdDefined();

    void setXcvrProtGrpPSDirn(int xcvrProtGrpPSDirn);

    int getXcvrProtGrpPSDirn();

    void setXcvrProtGrpRowStatus(int xcvrProtGrpRowStatus);

    int getXcvrProtGrpRowStatus();

    IXcvrProtGrpEntry clone();

}
