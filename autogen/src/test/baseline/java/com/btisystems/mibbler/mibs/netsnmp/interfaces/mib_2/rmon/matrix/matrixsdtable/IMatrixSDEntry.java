
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.matrix.matrixsdtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMatrixSDEntry
    extends IDeviceEntity
{


    void setMatrixSDSourceAddress(String matrixSDSourceAddress);

    String getMatrixSDSourceAddress();

    void setMatrixSDDestAddress(String matrixSDDestAddress);

    String getMatrixSDDestAddress();

    void setMatrixSDIndex(int matrixSDIndex);

    int getMatrixSDIndex();

    void setMatrixSDPkts(int matrixSDPkts);

    int getMatrixSDPkts();

    void setMatrixSDOctets(int matrixSDOctets);

    int getMatrixSDOctets();

    void setMatrixSDErrors(int matrixSDErrors);

    int getMatrixSDErrors();

    IMatrixSDEntry clone();

}
