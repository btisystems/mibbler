
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.probeconfig.netconfigtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INetConfigEntry
    extends IDeviceEntity
{


    void setNetConfigIPAddress(String netConfigIPAddress);

    String getNetConfigIPAddress();

    void setNetConfigSubnetMask(String netConfigSubnetMask);

    String getNetConfigSubnetMask();

    void setNetConfigStatus(int netConfigStatus);

    int getNetConfigStatus();

    INetConfigEntry clone();

}
