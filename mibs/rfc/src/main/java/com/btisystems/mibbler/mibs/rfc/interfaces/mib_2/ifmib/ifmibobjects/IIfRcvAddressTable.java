
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.ifmib.ifmibobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.ifmib.ifmibobjects.ifrcvaddresstable.IIfRcvAddressEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIfRcvAddressTable
    extends IDeviceEntity
{


    Map<String, IIfRcvAddressEntry> getIfRcvAddressEntry();

    IIfRcvAddressTable clone();

}
