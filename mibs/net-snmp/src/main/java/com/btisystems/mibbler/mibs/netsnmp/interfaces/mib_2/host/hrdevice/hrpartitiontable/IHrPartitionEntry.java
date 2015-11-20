
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrpartitiontable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrPartitionEntry
    extends IDeviceEntity
{


    void setHrPartitionIndex(int hrPartitionIndex);

    int getHrPartitionIndex();

    void setHrPartitionLabel(String hrPartitionLabel);

    String getHrPartitionLabel();

    void setHrPartitionID(String hrPartitionID);

    String getHrPartitionID();

    void setHrPartitionSize(int hrPartitionSize);

    int getHrPartitionSize();

    void setHrPartitionFSIndex(int hrPartitionFSIndex);

    int getHrPartitionFSIndex();

    IHrPartitionEntry clone();

}
