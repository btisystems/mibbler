
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.oduntable.IOdunEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOdunTable
    extends IDeviceEntity
{


    Map<String, IOdunEntry> getOdunEntry();

    IOdunTable clone();

}
