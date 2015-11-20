
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.ocntable.IOcnEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOcnTable
    extends IDeviceEntity
{


    Map<String, IOcnEntry> getOcnEntry();

    IOcnTable clone();

}
