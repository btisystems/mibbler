
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.ospfgeneraltable.IOspfGeneralGroupEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOspfGeneralTable
    extends IDeviceEntity
{


    Map<String, IOspfGeneralGroupEntry> getOspfGeneralGroupEntry();

    IOspfGeneralTable clone();

}
