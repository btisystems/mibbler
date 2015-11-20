
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.addressmap.addressmaptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAddressMapEntry
    extends IDeviceEntity
{


    void setAddressMapTimeMark(int addressMapTimeMark);

    int getAddressMapTimeMark();

    void setAddressMapNetworkAddress(String addressMapNetworkAddress);

    String getAddressMapNetworkAddress();

    void setAddressMapSource(String addressMapSource);

    String getAddressMapSource();

    void setAddressMapPhysicalAddress(String addressMapPhysicalAddress);

    String getAddressMapPhysicalAddress();

    void setAddressMapLastChange(int addressMapLastChange);

    int getAddressMapLastChange();

    IAddressMapEntry clone();

}
