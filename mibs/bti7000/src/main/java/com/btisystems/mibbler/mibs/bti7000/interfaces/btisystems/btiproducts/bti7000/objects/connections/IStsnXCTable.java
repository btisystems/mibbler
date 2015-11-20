
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.stsnxctable.IStsnXCEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IStsnXCTable
    extends IDeviceEntity
{


    Map<String, IStsnXCEntry> getStsnXCEntry();

    IStsnXCTable clone();

}
