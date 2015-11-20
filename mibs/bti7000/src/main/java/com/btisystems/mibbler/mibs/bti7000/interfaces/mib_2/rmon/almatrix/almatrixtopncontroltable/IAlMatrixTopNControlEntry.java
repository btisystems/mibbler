
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.almatrix.almatrixtopncontroltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAlMatrixTopNControlEntry
    extends IDeviceEntity
{


    void setAlMatrixTopNControlIndex(int alMatrixTopNControlIndex);

    int getAlMatrixTopNControlIndex();

    void setAlMatrixTopNControlMatrixIndex(int alMatrixTopNControlMatrixIndex);

    int getAlMatrixTopNControlMatrixIndex();

    void setAlMatrixTopNControlRateBase(int alMatrixTopNControlRateBase);

    int getAlMatrixTopNControlRateBase();

    void setAlMatrixTopNControlTimeRemaining(int alMatrixTopNControlTimeRemaining);

    int getAlMatrixTopNControlTimeRemaining();

    boolean isAlMatrixTopNControlTimeRemainingDefined();

    void setAlMatrixTopNControlGeneratedReports(int alMatrixTopNControlGeneratedReports);

    int getAlMatrixTopNControlGeneratedReports();

    void setAlMatrixTopNControlDuration(int alMatrixTopNControlDuration);

    int getAlMatrixTopNControlDuration();

    void setAlMatrixTopNControlRequestedSize(int alMatrixTopNControlRequestedSize);

    int getAlMatrixTopNControlRequestedSize();

    boolean isAlMatrixTopNControlRequestedSizeDefined();

    void setAlMatrixTopNControlGrantedSize(int alMatrixTopNControlGrantedSize);

    int getAlMatrixTopNControlGrantedSize();

    void setAlMatrixTopNControlStartTime(int alMatrixTopNControlStartTime);

    int getAlMatrixTopNControlStartTime();

    void setAlMatrixTopNControlOwner(String alMatrixTopNControlOwner);

    String getAlMatrixTopNControlOwner();

    void setAlMatrixTopNControlStatus(int alMatrixTopNControlStatus);

    int getAlMatrixTopNControlStatus();

    IAlMatrixTopNControlEntry clone();

}
