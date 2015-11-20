
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.geoperations;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.geoperations.gelpbkoptable.IGeLpbkOpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IGeLpbkOpTable
    extends IDeviceEntity
{


    Map<String, IGeLpbkOpEntry> getGeLpbkOpEntry();

    IGeLpbkOpTable clone();

}
