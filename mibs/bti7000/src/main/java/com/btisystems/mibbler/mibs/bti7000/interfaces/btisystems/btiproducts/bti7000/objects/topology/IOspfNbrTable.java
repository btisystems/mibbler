
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.ospfnbrtable.IOspfNbrEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOspfNbrTable
    extends IDeviceEntity
{


    Map<String, IOspfNbrEntry> getOspfNbrEntry();

    IOspfNbrTable clone();

}
