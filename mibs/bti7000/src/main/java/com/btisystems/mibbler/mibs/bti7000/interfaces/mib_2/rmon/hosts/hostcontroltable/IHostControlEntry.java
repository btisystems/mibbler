
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.hosts.hostcontroltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHostControlEntry
    extends IDeviceEntity
{


    void setHostControlIndex(int hostControlIndex);

    int getHostControlIndex();

    void setHostControlDataSource(String hostControlDataSource);

    String getHostControlDataSource();

    void setHostControlTableSize(int hostControlTableSize);

    int getHostControlTableSize();

    void setHostControlLastDeleteTime(int hostControlLastDeleteTime);

    int getHostControlLastDeleteTime();

    void setHostControlOwner(String hostControlOwner);

    String getHostControlOwner();

    void setHostControlStatus(int hostControlStatus);

    int getHostControlStatus();

    IHostControlEntry clone();

}
