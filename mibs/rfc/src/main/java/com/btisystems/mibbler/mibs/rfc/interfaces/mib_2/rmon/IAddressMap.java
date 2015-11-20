
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon;

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
