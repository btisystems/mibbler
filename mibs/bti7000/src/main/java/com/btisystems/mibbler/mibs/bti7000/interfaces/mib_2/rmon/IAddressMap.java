
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAddressMap
    extends IDeviceEntity
{


    void setAddressMapInserts(int addressMapInserts);

    int getAddressMapInserts();

    void setAddressMapDeletes(int addressMapDeletes);

    int getAddressMapDeletes();

    void setAddressMapMaxDesiredEntries(int addressMapMaxDesiredEntries);

    int getAddressMapMaxDesiredEntries();

    IAddressMap clone();

}
