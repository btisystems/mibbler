
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.xcvroperations;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.xcvroperations.xcvrlpbkoptable.IXcvrLpbkOpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IXcvrLpbkOpTable
    extends IDeviceEntity
{


    Map<String, IXcvrLpbkOpEntry> getXcvrLpbkOpEntry();

    IXcvrLpbkOpTable clone();

}
