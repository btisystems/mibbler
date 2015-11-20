
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrSWInstalled
    extends IDeviceEntity
{


    void setHrSWInstalledLastChange(int hrSWInstalledLastChange);

    int getHrSWInstalledLastChange();

    void setHrSWInstalledLastUpdateTime(int hrSWInstalledLastUpdateTime);

    int getHrSWInstalledLastUpdateTime();

    IHrSWInstalled clone();

}
