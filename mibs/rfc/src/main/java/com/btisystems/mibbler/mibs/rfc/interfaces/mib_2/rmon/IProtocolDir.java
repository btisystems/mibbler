
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IProtocolDir
    extends IDeviceEntity
{


    void setProtocolDirLastChange(int protocolDirLastChange);

    int getProtocolDirLastChange();

    IProtocolDir clone();

}
