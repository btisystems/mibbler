
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix.hlmatrixcontroltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHlMatrixControlEntry
    extends IDeviceEntity
{


    void setHlMatrixControlIndex(int hlMatrixControlIndex);

    int getHlMatrixControlIndex();

    void setHlMatrixControlDataSource(String hlMatrixControlDataSource);

    String getHlMatrixControlDataSource();

    void setHlMatrixControlNlDroppedFrames(int hlMatrixControlNlDroppedFrames);

    int getHlMatrixControlNlDroppedFrames();

    void setHlMatrixControlNlInserts(int hlMatrixControlNlInserts);

    int getHlMatrixControlNlInserts();

    void setHlMatrixControlNlDeletes(int hlMatrixControlNlDeletes);

    int getHlMatrixControlNlDeletes();

    void setHlMatrixControlNlMaxDesiredEntries(int hlMatrixControlNlMaxDesiredEntries);

    int getHlMatrixControlNlMaxDesiredEntries();

    void setHlMatrixControlAlDroppedFrames(int hlMatrixControlAlDroppedFrames);

    int getHlMatrixControlAlDroppedFrames();

    void setHlMatrixControlAlInserts(int hlMatrixControlAlInserts);

    int getHlMatrixControlAlInserts();

    void setHlMatrixControlAlDeletes(int hlMatrixControlAlDeletes);

    int getHlMatrixControlAlDeletes();

    void setHlMatrixControlAlMaxDesiredEntries(int hlMatrixControlAlMaxDesiredEntries);

    int getHlMatrixControlAlMaxDesiredEntries();

    void setHlMatrixControlOwner(String hlMatrixControlOwner);

    String getHlMatrixControlOwner();

    void setHlMatrixControlStatus(int hlMatrixControlStatus);

    int getHlMatrixControlStatus();

    IHlMatrixControlEntry clone();

}
