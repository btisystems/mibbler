
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.cpoperations.cprestartoptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ICpRestartOpEntry
    extends IDeviceEntity
{


    void setCpRestartOpTypeIdx(int cpRestartOpTypeIdx);

    int getCpRestartOpTypeIdx();

    void setCpRestartOpShelfIdx(int cpRestartOpShelfIdx);

    int getCpRestartOpShelfIdx();

    void setCpRestartOpSlotIdx(int cpRestartOpSlotIdx);

    int getCpRestartOpSlotIdx();

    void setCpRestartOpCmd(int cpRestartOpCmd);

    int getCpRestartOpCmd();

    ICpRestartOpEntry clone();

}
