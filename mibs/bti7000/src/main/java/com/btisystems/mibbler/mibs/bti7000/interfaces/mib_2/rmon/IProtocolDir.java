
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IProtocolDir
    extends IDeviceEntity
{


    void setProtocolDirLastChange(int protocolDirLastChange);

    int getProtocolDirLastChange();

    IProtocolDir clone();

}
