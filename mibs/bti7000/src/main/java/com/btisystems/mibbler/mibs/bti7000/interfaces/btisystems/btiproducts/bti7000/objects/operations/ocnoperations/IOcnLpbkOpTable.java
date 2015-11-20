
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.ocnoperations;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.ocnoperations.ocnlpbkoptable.IOcnLpbkOpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOcnLpbkOpTable
    extends IDeviceEntity
{


    Map<String, IOcnLpbkOpEntry> getOcnLpbkOpEntry();

    IOcnLpbkOpTable clone();

}
