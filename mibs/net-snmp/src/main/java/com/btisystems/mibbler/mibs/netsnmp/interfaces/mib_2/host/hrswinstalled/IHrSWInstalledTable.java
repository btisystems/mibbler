
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswinstalled;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswinstalled.hrswinstalledtable.IHrSWInstalledEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrSWInstalledTable
    extends IDeviceEntity
{


    Map<String, IHrSWInstalledEntry> getHrSWInstalledEntry();

    IHrSWInstalledTable clone();

}
