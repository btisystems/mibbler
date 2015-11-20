
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.fcoperations;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.fcoperations.fclpbkoptable.IFcLpbkOpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IFcLpbkOpTable
    extends IDeviceEntity
{


    Map<String, IFcLpbkOpEntry> getFcLpbkOpEntry();

    IFcLpbkOpTable clone();

}
