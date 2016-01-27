
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.hosttopn.hosttopntable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHostTopNEntry
    extends IDeviceEntity
{


    void setHostTopNReport(int hostTopNReport);

    int getHostTopNReport();

    void setHostTopNIndex(int hostTopNIndex);

    int getHostTopNIndex();

    void setHostTopNAddress(String hostTopNAddress);

    String getHostTopNAddress();

    void setHostTopNRate(int hostTopNRate);

    int getHostTopNRate();

    IHostTopNEntry clone();

}
