
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrSWRun
    extends IDeviceEntity
{


    void setHrSWOSIndex(int hrSWOSIndex);

    int getHrSWOSIndex();

    IHrSWRun clone();

}
