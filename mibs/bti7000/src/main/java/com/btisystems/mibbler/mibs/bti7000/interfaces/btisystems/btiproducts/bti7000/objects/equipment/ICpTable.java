
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.equipment;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.equipment.cptable.ICpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ICpTable
    extends IDeviceEntity
{


    Map<String, ICpEntry> getCpEntry();

    ICpTable clone();

}
