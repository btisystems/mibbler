
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.oatable.IOaEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOaTable
    extends IDeviceEntity
{


    Map<String, IOaEntry> getOaEntry();

    IOaTable clone();

}
