
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.addressmap;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.addressmap.addressmaptable.IAddressMapEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAddressMapTable
    extends IDeviceEntity
{


    Map<String, IAddressMapEntry> getAddressMapEntry();

    IAddressMapTable clone();

}
