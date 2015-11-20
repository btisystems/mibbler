
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.administration;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.administration.tl1usertable.ITl1UserEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITl1UserTable
    extends IDeviceEntity
{


    Map<String, ITl1UserEntry> getTl1UserEntry();

    ITl1UserTable clone();

}
