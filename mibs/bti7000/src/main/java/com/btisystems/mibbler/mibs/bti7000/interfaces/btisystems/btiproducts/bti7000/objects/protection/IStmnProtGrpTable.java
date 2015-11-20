
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection.stmnprotgrptable.IStmnProtGrpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IStmnProtGrpTable
    extends IDeviceEntity
{


    Map<String, IStmnProtGrpEntry> getStmnProtGrpEntry();

    IStmnProtGrpTable clone();

}
