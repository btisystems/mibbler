
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrdevicetable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrDeviceEntry
    extends IDeviceEntity
{


    void setHrDeviceIndex(int hrDeviceIndex);

    int getHrDeviceIndex();

    void setHrDeviceType(String hrDeviceType);

    String getHrDeviceType();

    void setHrDeviceDescr(String hrDeviceDescr);

    String getHrDeviceDescr();

    void setHrDeviceID(String hrDeviceID);

    String getHrDeviceID();

    void setHrDeviceStatus(int hrDeviceStatus);

    int getHrDeviceStatus();

    void setHrDeviceErrors(int hrDeviceErrors);

    int getHrDeviceErrors();

    IHrDeviceEntry clone();

}
