
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.vcnxctable.IVcnXCEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IVcnXCTable
    extends IDeviceEntity
{


    Map<String, IVcnXCEntry> getVcnXCEntry();

    IVcnXCTable clone();

}
