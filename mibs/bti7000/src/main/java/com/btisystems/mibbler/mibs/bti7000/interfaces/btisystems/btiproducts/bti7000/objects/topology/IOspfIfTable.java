
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.ospfiftable.IOspfIfEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOspfIfTable
    extends IDeviceEntity
{


    Map<String, IOspfIfEntry> getOspfIfEntry();

    IOspfIfTable clone();

}
