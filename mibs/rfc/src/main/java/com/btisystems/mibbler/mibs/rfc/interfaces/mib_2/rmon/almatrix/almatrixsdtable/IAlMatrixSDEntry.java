
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.almatrix.almatrixsdtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAlMatrixSDEntry
    extends IDeviceEntity
{


    void setAlMatrixSDTimeMark(int alMatrixSDTimeMark);

    int getAlMatrixSDTimeMark();

    void setAlMatrixSDPkts(int alMatrixSDPkts);

    int getAlMatrixSDPkts();

    void setAlMatrixSDOctets(int alMatrixSDOctets);

    int getAlMatrixSDOctets();

    void setAlMatrixSDCreateTime(int alMatrixSDCreateTime);

    int getAlMatrixSDCreateTime();

    IAlMatrixSDEntry clone();

}
