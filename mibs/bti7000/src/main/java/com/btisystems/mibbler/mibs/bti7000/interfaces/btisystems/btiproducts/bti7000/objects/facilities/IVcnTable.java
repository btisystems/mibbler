
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.vcntable.IVcnEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IVcnTable
    extends IDeviceEntity
{


    Map<String, IVcnEntry> getVcnEntry();

    IVcnTable clone();

}
