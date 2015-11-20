
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.addressmap;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.addressmap.addressmapcontroltable.IAddressMapControlEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAddressMapControlTable
    extends IDeviceEntity
{


    Map<String, IAddressMapControlEntry> getAddressMapControlEntry();

    IAddressMapControlTable clone();

}
