
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix.nlmatrixsdtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlMatrixSDEntry
    extends IDeviceEntity
{


    void setNlMatrixSDTimeMark(int nlMatrixSDTimeMark);

    int getNlMatrixSDTimeMark();

    void setNlMatrixSDSourceAddress(String nlMatrixSDSourceAddress);

    String getNlMatrixSDSourceAddress();

    void setNlMatrixSDDestAddress(String nlMatrixSDDestAddress);

    String getNlMatrixSDDestAddress();

    void setNlMatrixSDPkts(int nlMatrixSDPkts);

    int getNlMatrixSDPkts();

    void setNlMatrixSDOctets(int nlMatrixSDOctets);

    int getNlMatrixSDOctets();

    void setNlMatrixSDCreateTime(int nlMatrixSDCreateTime);

    int getNlMatrixSDCreateTime();

    INlMatrixSDEntry clone();

}
