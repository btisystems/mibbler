
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.oaoperations;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.oaoperations.oaoobrsdoptable.IOaOOBRSDOpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOaOOBRSDOpTable
    extends IDeviceEntity
{


    Map<String, IOaOOBRSDOpEntry> getOaOOBRSDOpEntry();

    IOaOOBRSDOpTable clone();

}
