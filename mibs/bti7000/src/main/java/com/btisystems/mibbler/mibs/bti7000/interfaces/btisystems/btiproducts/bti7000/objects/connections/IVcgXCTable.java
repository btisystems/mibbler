
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.vcgxctable.IVcgXCEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IVcgXCTable
    extends IDeviceEntity
{


    Map<String, IVcgXCEntry> getVcgXCEntry();

    IVcgXCTable clone();

}
