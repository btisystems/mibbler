
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.matrix.matrixdstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMatrixDSEntry
    extends IDeviceEntity
{


    void setMatrixDSSourceAddress(String matrixDSSourceAddress);

    String getMatrixDSSourceAddress();

    void setMatrixDSDestAddress(String matrixDSDestAddress);

    String getMatrixDSDestAddress();

    void setMatrixDSIndex(int matrixDSIndex);

    int getMatrixDSIndex();

    void setMatrixDSPkts(int matrixDSPkts);

    int getMatrixDSPkts();

    void setMatrixDSOctets(int matrixDSOctets);

    int getMatrixDSOctets();

    void setMatrixDSErrors(int matrixDSErrors);

    int getMatrixDSErrors();

    IMatrixDSEntry clone();

}
