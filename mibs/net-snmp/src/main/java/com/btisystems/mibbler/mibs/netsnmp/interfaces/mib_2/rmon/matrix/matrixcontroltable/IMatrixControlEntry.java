
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.matrix.matrixcontroltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMatrixControlEntry
    extends IDeviceEntity
{


    void setMatrixControlIndex(int matrixControlIndex);

    int getMatrixControlIndex();

    void setMatrixControlDataSource(String matrixControlDataSource);

    String getMatrixControlDataSource();

    void setMatrixControlTableSize(int matrixControlTableSize);

    int getMatrixControlTableSize();

    void setMatrixControlLastDeleteTime(int matrixControlLastDeleteTime);

    int getMatrixControlLastDeleteTime();

    void setMatrixControlOwner(String matrixControlOwner);

    String getMatrixControlOwner();

    void setMatrixControlStatus(int matrixControlStatus);

    int getMatrixControlStatus();

    IMatrixControlEntry clone();

}
