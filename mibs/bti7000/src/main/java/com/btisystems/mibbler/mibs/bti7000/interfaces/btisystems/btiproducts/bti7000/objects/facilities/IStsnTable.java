
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.stsntable.IStsnEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IStsnTable
    extends IDeviceEntity
{


    Map<String, IStsnEntry> getStsnEntry();

    IStsnTable clone();

}
