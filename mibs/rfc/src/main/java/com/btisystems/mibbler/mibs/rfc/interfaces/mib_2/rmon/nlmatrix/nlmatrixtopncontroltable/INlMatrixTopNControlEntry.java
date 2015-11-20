
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix.nlmatrixtopncontroltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlMatrixTopNControlEntry
    extends IDeviceEntity
{


    void setNlMatrixTopNControlIndex(int nlMatrixTopNControlIndex);

    int getNlMatrixTopNControlIndex();

    void setNlMatrixTopNControlMatrixIndex(int nlMatrixTopNControlMatrixIndex);

    int getNlMatrixTopNControlMatrixIndex();

    void setNlMatrixTopNControlRateBase(int nlMatrixTopNControlRateBase);

    int getNlMatrixTopNControlRateBase();

    void setNlMatrixTopNControlTimeRemaining(int nlMatrixTopNControlTimeRemaining);

    int getNlMatrixTopNControlTimeRemaining();

    boolean isNlMatrixTopNControlTimeRemainingDefined();

    void setNlMatrixTopNControlGeneratedReports(int nlMatrixTopNControlGeneratedReports);

    int getNlMatrixTopNControlGeneratedReports();

    void setNlMatrixTopNControlDuration(int nlMatrixTopNControlDuration);

    int getNlMatrixTopNControlDuration();

    void setNlMatrixTopNControlRequestedSize(int nlMatrixTopNControlRequestedSize);

    int getNlMatrixTopNControlRequestedSize();

    boolean isNlMatrixTopNControlRequestedSizeDefined();

    void setNlMatrixTopNControlGrantedSize(int nlMatrixTopNControlGrantedSize);

    int getNlMatrixTopNControlGrantedSize();

    void setNlMatrixTopNControlStartTime(int nlMatrixTopNControlStartTime);

    int getNlMatrixTopNControlStartTime();

    void setNlMatrixTopNControlOwner(String nlMatrixTopNControlOwner);

    String getNlMatrixTopNControlOwner();

    void setNlMatrixTopNControlStatus(int nlMatrixTopNControlStatus);

    int getNlMatrixTopNControlStatus();

    INlMatrixTopNControlEntry clone();

}
