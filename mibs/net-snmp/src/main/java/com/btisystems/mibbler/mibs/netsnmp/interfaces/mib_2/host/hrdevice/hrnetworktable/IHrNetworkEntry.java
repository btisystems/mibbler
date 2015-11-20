
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrnetworktable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrNetworkEntry
    extends IDeviceEntity
{


    void setHrNetworkIfIndex(int hrNetworkIfIndex);

    int getHrNetworkIfIndex();

    IHrNetworkEntry clone();

}
