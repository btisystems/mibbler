
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.ospflsdbtable.IOspfLsdbEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOspfLsdbTable
    extends IDeviceEntity
{


    Map<String, IOspfLsdbEntry> getOspfLsdbEntry();

    IOspfLsdbTable clone();

}
