
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifmib.ifmibobjects.ifrcvaddresstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIfRcvAddressEntry
    extends IDeviceEntity
{


    void setIfRcvAddressAddress(String ifRcvAddressAddress);

    String getIfRcvAddressAddress();

    void setIfRcvAddressStatus(int ifRcvAddressStatus);

    int getIfRcvAddressStatus();

    void setIfRcvAddressType(int ifRcvAddressType);

    int getIfRcvAddressType();

    boolean isIfRcvAddressTypeDefined();

    IIfRcvAddressEntry clone();

}
