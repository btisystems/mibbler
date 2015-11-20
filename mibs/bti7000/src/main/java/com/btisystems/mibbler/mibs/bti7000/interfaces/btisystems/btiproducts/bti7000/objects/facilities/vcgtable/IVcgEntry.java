
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.vcgtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IVcgEntry
    extends IDeviceEntity
{


    void setVcgShelfIdx(int vcgShelfIdx);

    int getVcgShelfIdx();

    void setVcgSlotIdx(int vcgSlotIdx);

    int getVcgSlotIdx();

    void setVcgPortIdx(int vcgPortIdx);

    int getVcgPortIdx();

    void setVcgIdx(int vcgIdx);

    int getVcgIdx();

    void setVcgType(int vcgType);

    int getVcgType();

    void setVcgTimeSlotIndices(String vcgTimeSlotIndices);

    String getVcgTimeSlotIndices();

    void setVcgRowStatus(int vcgRowStatus);

    int getVcgRowStatus();

    IVcgEntry clone();

}
