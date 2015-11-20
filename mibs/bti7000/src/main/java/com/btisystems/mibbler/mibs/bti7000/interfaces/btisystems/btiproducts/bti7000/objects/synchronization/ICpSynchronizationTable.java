
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.synchronization;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.synchronization.cpsynchronizationtable.ICpSynchronizationEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ICpSynchronizationTable
    extends IDeviceEntity
{


    Map<String, ICpSynchronizationEntry> getCpSynchronizationEntry();

    ICpSynchronizationTable clone();

}
