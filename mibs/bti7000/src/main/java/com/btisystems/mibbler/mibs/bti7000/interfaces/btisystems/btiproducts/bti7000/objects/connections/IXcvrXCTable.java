
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.xcvrxctable.IXcvrXCEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IXcvrXCTable
    extends IDeviceEntity
{


    Map<String, IXcvrXCEntry> getXcvrXCEntry();

    IXcvrXCTable clone();

}
