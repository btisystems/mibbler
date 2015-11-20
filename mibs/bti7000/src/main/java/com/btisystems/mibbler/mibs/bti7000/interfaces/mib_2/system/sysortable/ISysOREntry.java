
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.system.sysortable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISysOREntry
    extends IDeviceEntity
{


    void setSysORIndex(int sysORIndex);

    int getSysORIndex();

    void setSysORID(String sysORID);

    String getSysORID();

    void setSysORDescr(String sysORDescr);

    String getSysORDescr();

    void setSysORUpTime(int sysORUpTime);

    int getSysORUpTime();

    ISysOREntry clone();

}
