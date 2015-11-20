
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ip.ipnettomediatable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpNetToMediaEntry
    extends IDeviceEntity
{


    void setIpNetToMediaIfIndex(int ipNetToMediaIfIndex);

    int getIpNetToMediaIfIndex();

    void setIpNetToMediaPhysAddress(String ipNetToMediaPhysAddress);

    String getIpNetToMediaPhysAddress();

    void setIpNetToMediaNetAddress(String ipNetToMediaNetAddress);

    String getIpNetToMediaNetAddress();

    void setIpNetToMediaType(int ipNetToMediaType);

    int getIpNetToMediaType();

    void setIpNetToMediaPhyIfUnit(int ipNetToMediaPhyIfUnit);

    int getIpNetToMediaPhyIfUnit();

    void setIpNetToMediaAgingTime(int ipNetToMediaAgingTime);

    int getIpNetToMediaAgingTime();

    IIpNetToMediaEntry clone();

}
