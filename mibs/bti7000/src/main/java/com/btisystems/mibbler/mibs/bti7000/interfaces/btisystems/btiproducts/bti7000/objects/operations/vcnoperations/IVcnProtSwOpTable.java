
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.vcnoperations;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.vcnoperations.vcnprotswoptable.IVcnProtSwOpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IVcnProtSwOpTable
    extends IDeviceEntity
{


    Map<String, IVcnProtSwOpEntry> getVcnProtSwOpEntry();

    IVcnProtSwOpTable clone();

}
