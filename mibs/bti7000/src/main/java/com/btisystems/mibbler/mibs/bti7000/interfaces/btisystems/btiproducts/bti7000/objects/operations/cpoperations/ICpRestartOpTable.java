
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.cpoperations;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.cpoperations.cprestartoptable.ICpRestartOpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ICpRestartOpTable
    extends IDeviceEntity
{


    Map<String, ICpRestartOpEntry> getCpRestartOpEntry();

    ICpRestartOpTable clone();

}
