
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.almatrix.almatrixdstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAlMatrixDSEntry
    extends IDeviceEntity
{


    void setAlMatrixDSTimeMark(int alMatrixDSTimeMark);

    int getAlMatrixDSTimeMark();

    void setAlMatrixDSPkts(int alMatrixDSPkts);

    int getAlMatrixDSPkts();

    void setAlMatrixDSOctets(int alMatrixDSOctets);

    int getAlMatrixDSOctets();

    void setAlMatrixDSCreateTime(int alMatrixDSCreateTime);

    int getAlMatrixDSCreateTime();

    IAlMatrixDSEntry clone();

}
