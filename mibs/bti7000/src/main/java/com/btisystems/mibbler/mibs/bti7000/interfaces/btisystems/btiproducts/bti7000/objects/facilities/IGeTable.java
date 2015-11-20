
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.getable.IGeEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IGeTable
    extends IDeviceEntity
{


    Map<String, IGeEntry> getGeEntry();

    IGeTable clone();

}
