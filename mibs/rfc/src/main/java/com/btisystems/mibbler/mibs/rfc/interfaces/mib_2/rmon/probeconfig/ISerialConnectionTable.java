
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.probeconfig;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.probeconfig.serialconnectiontable.ISerialConnectionEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISerialConnectionTable
    extends IDeviceEntity
{


    Map<String, ISerialConnectionEntry> getSerialConnectionEntry();

    ISerialConnectionTable clone();

}
