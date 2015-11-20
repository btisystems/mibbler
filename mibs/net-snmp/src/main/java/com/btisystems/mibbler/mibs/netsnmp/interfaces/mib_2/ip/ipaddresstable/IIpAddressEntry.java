
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipaddresstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpAddressEntry
    extends IDeviceEntity
{


    void setIpAddressAddrType(int ipAddressAddrType);

    int getIpAddressAddrType();

    void setIpAddressAddr(String ipAddressAddr);

    String getIpAddressAddr();

    void setIpAddressIfIndex(int ipAddressIfIndex);

    int getIpAddressIfIndex();

    void setIpAddressType(int ipAddressType);

    int getIpAddressType();

    boolean isIpAddressTypeDefined();

    void setIpAddressPrefix(String ipAddressPrefix);

    String getIpAddressPrefix();

    void setIpAddressOrigin(int ipAddressOrigin);

    int getIpAddressOrigin();

    void setIpAddressStatus(int ipAddressStatus);

    int getIpAddressStatus();

    boolean isIpAddressStatusDefined();

    void setIpAddressCreated(int ipAddressCreated);

    int getIpAddressCreated();

    void setIpAddressLastChanged(int ipAddressLastChanged);

    int getIpAddressLastChanged();

    void setIpAddressRowStatus(int ipAddressRowStatus);

    int getIpAddressRowStatus();

    void setIpAddressStorageType(int ipAddressStorageType);

    int getIpAddressStorageType();

    boolean isIpAddressStorageTypeDefined();

    IIpAddressEntry clone();

}
