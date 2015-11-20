
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.equipment;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.equipment.shelftable.IShelfEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IShelfTable
    extends IDeviceEntity
{


    Map<String, IShelfEntry> getShelfEntry();

    IShelfTable clone();

}
