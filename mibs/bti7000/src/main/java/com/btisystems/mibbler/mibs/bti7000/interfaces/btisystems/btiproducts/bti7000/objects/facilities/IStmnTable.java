
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.stmntable.IStmnEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IStmnTable
    extends IDeviceEntity
{


    Map<String, IStmnEntry> getStmnEntry();

    IStmnTable clone();

}
