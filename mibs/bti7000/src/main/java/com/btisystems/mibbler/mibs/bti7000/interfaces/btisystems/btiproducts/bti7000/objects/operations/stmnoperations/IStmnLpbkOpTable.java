
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stmnoperations;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stmnoperations.stmnlpbkoptable.IStmnLpbkOpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IStmnLpbkOpTable
    extends IDeviceEntity
{


    Map<String, IStmnLpbkOpEntry> getStmnLpbkOpEntry();

    IStmnLpbkOpTable clone();

}
