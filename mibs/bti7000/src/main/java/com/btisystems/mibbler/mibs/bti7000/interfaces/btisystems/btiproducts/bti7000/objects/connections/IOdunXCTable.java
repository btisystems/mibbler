
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.odunxctable.IOdunXCEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOdunXCTable
    extends IDeviceEntity
{


    Map<String, IOdunXCEntry> getOdunXCEntry();

    IOdunXCTable clone();

}
