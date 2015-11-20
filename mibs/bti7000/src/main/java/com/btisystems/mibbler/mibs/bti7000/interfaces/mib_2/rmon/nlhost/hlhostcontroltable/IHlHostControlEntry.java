
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlhost.hlhostcontroltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHlHostControlEntry
    extends IDeviceEntity
{


    void setHlHostControlIndex(int hlHostControlIndex);

    int getHlHostControlIndex();

    void setHlHostControlDataSource(String hlHostControlDataSource);

    String getHlHostControlDataSource();

    void setHlHostControlNlDroppedFrames(int hlHostControlNlDroppedFrames);

    int getHlHostControlNlDroppedFrames();

    void setHlHostControlNlInserts(int hlHostControlNlInserts);

    int getHlHostControlNlInserts();

    void setHlHostControlNlDeletes(int hlHostControlNlDeletes);

    int getHlHostControlNlDeletes();

    void setHlHostControlNlMaxDesiredEntries(int hlHostControlNlMaxDesiredEntries);

    int getHlHostControlNlMaxDesiredEntries();

    void setHlHostControlAlDroppedFrames(int hlHostControlAlDroppedFrames);

    int getHlHostControlAlDroppedFrames();

    void setHlHostControlAlInserts(int hlHostControlAlInserts);

    int getHlHostControlAlInserts();

    void setHlHostControlAlDeletes(int hlHostControlAlDeletes);

    int getHlHostControlAlDeletes();

    void setHlHostControlAlMaxDesiredEntries(int hlHostControlAlMaxDesiredEntries);

    int getHlHostControlAlMaxDesiredEntries();

    void setHlHostControlOwner(String hlHostControlOwner);

    String getHlHostControlOwner();

    void setHlHostControlStatus(int hlHostControlStatus);

    int getHlHostControlStatus();

    IHlHostControlEntry clone();

}
