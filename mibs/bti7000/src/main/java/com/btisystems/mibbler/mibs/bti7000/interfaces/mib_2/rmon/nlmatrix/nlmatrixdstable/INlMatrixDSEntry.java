
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlmatrix.nlmatrixdstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlMatrixDSEntry
    extends IDeviceEntity
{


    void setNlMatrixDSTimeMark(int nlMatrixDSTimeMark);

    int getNlMatrixDSTimeMark();

    void setNlMatrixDSSourceAddress(String nlMatrixDSSourceAddress);

    String getNlMatrixDSSourceAddress();

    void setNlMatrixDSDestAddress(String nlMatrixDSDestAddress);

    String getNlMatrixDSDestAddress();

    void setNlMatrixDSPkts(int nlMatrixDSPkts);

    int getNlMatrixDSPkts();

    void setNlMatrixDSOctets(int nlMatrixDSOctets);

    int getNlMatrixDSOctets();

    void setNlMatrixDSCreateTime(int nlMatrixDSCreateTime);

    int getNlMatrixDSCreateTime();

    INlMatrixDSEntry clone();

}
