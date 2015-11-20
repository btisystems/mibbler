
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.pluggableinvoperations.pluggableinvrestartoptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IPluggableInvRestartOpEntry
    extends IDeviceEntity
{


    void setPluggableInvRestartOpTypeIdx(int pluggableInvRestartOpTypeIdx);

    int getPluggableInvRestartOpTypeIdx();

    void setPluggableInvRestartOpShelfIdx(int pluggableInvRestartOpShelfIdx);

    int getPluggableInvRestartOpShelfIdx();

    void setPluggableInvRestartOpSlotIdx(int pluggableInvRestartOpSlotIdx);

    int getPluggableInvRestartOpSlotIdx();

    void setPluggableInvRestartOpPortIdx(int pluggableInvRestartOpPortIdx);

    int getPluggableInvRestartOpPortIdx();

    void setPluggableInvRestartOpCmd(int pluggableInvRestartOpCmd);

    int getPluggableInvRestartOpCmd();

    IPluggableInvRestartOpEntry clone();

}
