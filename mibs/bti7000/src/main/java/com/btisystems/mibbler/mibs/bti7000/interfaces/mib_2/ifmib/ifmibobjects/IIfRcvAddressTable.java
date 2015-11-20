
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ifmib.ifmibobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ifmib.ifmibobjects.ifrcvaddresstable.IIfRcvAddressEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIfRcvAddressTable
    extends IDeviceEntity
{


    Map<String, IIfRcvAddressEntry> getIfRcvAddressEntry();

    IIfRcvAddressTable clone();

}
