
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stmnoperations;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stmnoperations.stmnprotswoptable.IStmnProtSwOpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IStmnProtSwOpTable
    extends IDeviceEntity
{


    Map<String, IStmnProtSwOpEntry> getStmnProtSwOpEntry();

    IStmnProtSwOpTable clone();

}
