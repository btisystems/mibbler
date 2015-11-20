
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection.ocnprotgrptable.IOcnProtGrpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOcnProtGrpTable
    extends IDeviceEntity
{


    Map<String, IOcnProtGrpEntry> getOcnProtGrpEntry();

    IOcnProtGrpTable clone();

}
