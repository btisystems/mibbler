
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISystem
    extends IDeviceEntity
{


    void setSysDescr(String sysDescr);

    String getSysDescr();

    void setSysObjectID(String sysObjectID);

    String getSysObjectID();

    void setSysUpTime(int sysUpTime);

    int getSysUpTime();

    void setSysContact(String sysContact);

    String getSysContact();

    void setSysName(String sysName);

    String getSysName();

    void setSysLocation(String sysLocation);

    String getSysLocation();

    void setSysServices(int sysServices);

    int getSysServices();

    void setSysORLastChange(int sysORLastChange);

    int getSysORLastChange();

    ISystem clone();

}
