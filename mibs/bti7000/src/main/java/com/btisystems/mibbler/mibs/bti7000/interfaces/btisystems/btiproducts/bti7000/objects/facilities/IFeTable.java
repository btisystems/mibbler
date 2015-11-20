
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.fetable.IFeEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IFeTable
    extends IDeviceEntity
{


    Map<String, IFeEntry> getFeEntry();

    IFeTable clone();

}
