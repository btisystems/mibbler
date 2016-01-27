
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswinstalled.hrswinstalledtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrSWInstalledEntry
    extends IDeviceEntity
{


    void setHrSWInstalledIndex(int hrSWInstalledIndex);

    int getHrSWInstalledIndex();

    void setHrSWInstalledName(String hrSWInstalledName);

    String getHrSWInstalledName();

    void setHrSWInstalledID(String hrSWInstalledID);

    String getHrSWInstalledID();

    void setHrSWInstalledType(int hrSWInstalledType);

    int getHrSWInstalledType();

    void setHrSWInstalledDate(String hrSWInstalledDate);

    String getHrSWInstalledDate();

    IHrSWInstalledEntry clone();

}
