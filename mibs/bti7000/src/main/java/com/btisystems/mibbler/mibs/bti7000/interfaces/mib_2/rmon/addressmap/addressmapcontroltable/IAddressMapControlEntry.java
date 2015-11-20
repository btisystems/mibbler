
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.addressmap.addressmapcontroltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAddressMapControlEntry
    extends IDeviceEntity
{


    void setAddressMapControlIndex(int addressMapControlIndex);

    int getAddressMapControlIndex();

    void setAddressMapControlDataSource(String addressMapControlDataSource);

    String getAddressMapControlDataSource();

    void setAddressMapControlDroppedFrames(int addressMapControlDroppedFrames);

    int getAddressMapControlDroppedFrames();

    void setAddressMapControlOwner(String addressMapControlOwner);

    String getAddressMapControlOwner();

    void setAddressMapControlStatus(int addressMapControlStatus);

    int getAddressMapControlStatus();

    IAddressMapControlEntry clone();

}
