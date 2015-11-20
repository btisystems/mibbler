
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.brioperations;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.brioperations.brilpbkoptable.IBriLpbkOpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IBriLpbkOpTable
    extends IDeviceEntity
{


    Map<String, IBriLpbkOpEntry> getBriLpbkOpEntry();

    IBriLpbkOpTable clone();

}
