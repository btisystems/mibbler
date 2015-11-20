
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.fctable.IFcEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IFcTable
    extends IDeviceEntity
{


    Map<String, IFcEntry> getFcEntry();

    IFcTable clone();

}
