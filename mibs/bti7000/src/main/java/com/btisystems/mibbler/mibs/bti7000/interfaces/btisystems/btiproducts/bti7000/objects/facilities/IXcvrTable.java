
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.xcvrtable.IXcvrEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IXcvrTable
    extends IDeviceEntity
{


    Map<String, IXcvrEntry> getXcvrEntry();

    IXcvrTable clone();

}
