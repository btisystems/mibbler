
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.pluggableinvoperations;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.pluggableinvoperations.pluggableinvrestartoptable.IPluggableInvRestartOpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IPluggableInvRestartOpTable
    extends IDeviceEntity
{


    Map<String, IPluggableInvRestartOpEntry> getPluggableInvRestartOpEntry();

    IPluggableInvRestartOpTable clone();

}
