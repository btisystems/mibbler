
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.vcgtable.IVcgEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IVcgTable
    extends IDeviceEntity
{


    Map<String, IVcgEntry> getVcgEntry();

    IVcgTable clone();

}
