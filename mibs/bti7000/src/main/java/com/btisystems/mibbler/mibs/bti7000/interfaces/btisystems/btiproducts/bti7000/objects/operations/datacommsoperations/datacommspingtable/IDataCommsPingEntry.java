
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.datacommsoperations.datacommspingtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDataCommsPingEntry
    extends IDeviceEntity
{


    void setDataCommsPingCpTypeIdx(int dataCommsPingCpTypeIdx);

    int getDataCommsPingCpTypeIdx();

    void setDataCommsPingShelfIdx(int dataCommsPingShelfIdx);

    int getDataCommsPingShelfIdx();

    void setDataCommsPingSlotIdx(int dataCommsPingSlotIdx);

    int getDataCommsPingSlotIdx();

    void setDataCommsPingCmd(int dataCommsPingCmd);

    int getDataCommsPingCmd();

    void setDataCommsPingAddress(String dataCommsPingAddress);

    String getDataCommsPingAddress();

    void setDataCommsPingNumAttempts(int dataCommsPingNumAttempts);

    int getDataCommsPingNumAttempts();

    void setDataCommsPingNumSuccesses(int dataCommsPingNumSuccesses);

    int getDataCommsPingNumSuccesses();

    IDataCommsPingEntry clone();

}
