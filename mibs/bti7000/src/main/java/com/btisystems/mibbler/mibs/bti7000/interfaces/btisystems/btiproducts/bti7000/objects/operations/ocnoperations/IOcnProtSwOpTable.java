
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.ocnoperations;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.ocnoperations.ocnprotswoptable.IOcnProtSwOpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOcnProtSwOpTable
    extends IDeviceEntity
{


    Map<String, IOcnProtSwOpEntry> getOcnProtSwOpEntry();

    IOcnProtSwOpTable clone();

}
