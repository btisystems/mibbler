
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipnettophysicaltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpNetToPhysicalEntry
    extends IDeviceEntity
{


    void setIpNetToPhysicalIfIndex(int ipNetToPhysicalIfIndex);

    int getIpNetToPhysicalIfIndex();

    void setIpNetToPhysicalNetAddressType(int ipNetToPhysicalNetAddressType);

    int getIpNetToPhysicalNetAddressType();

    void setIpNetToPhysicalNetAddress(String ipNetToPhysicalNetAddress);

    String getIpNetToPhysicalNetAddress();

    void setIpNetToPhysicalPhysAddress(String ipNetToPhysicalPhysAddress);

    String getIpNetToPhysicalPhysAddress();

    void setIpNetToPhysicalLastUpdated(int ipNetToPhysicalLastUpdated);

    int getIpNetToPhysicalLastUpdated();

    void setIpNetToPhysicalType(int ipNetToPhysicalType);

    int getIpNetToPhysicalType();

    boolean isIpNetToPhysicalTypeDefined();

    void setIpNetToPhysicalState(int ipNetToPhysicalState);

    int getIpNetToPhysicalState();

    void setIpNetToPhysicalRowStatus(int ipNetToPhysicalRowStatus);

    int getIpNetToPhysicalRowStatus();

    IIpNetToPhysicalEntry clone();

}
