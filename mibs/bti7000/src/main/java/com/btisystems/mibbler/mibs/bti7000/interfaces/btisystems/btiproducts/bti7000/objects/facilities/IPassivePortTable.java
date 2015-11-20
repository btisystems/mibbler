
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.passiveporttable.IPassivePortEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IPassivePortTable
    extends IDeviceEntity
{


    Map<String, IPassivePortEntry> getPassivePortEntry();

    IPassivePortTable clone();

}
