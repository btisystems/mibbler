
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlmatrix.nlmatrixtopntable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlMatrixTopNEntry
    extends IDeviceEntity
{


    void setNlMatrixTopNIndex(int nlMatrixTopNIndex);

    int getNlMatrixTopNIndex();

    void setNlMatrixTopNProtocolDirLocalIndex(int nlMatrixTopNProtocolDirLocalIndex);

    int getNlMatrixTopNProtocolDirLocalIndex();

    void setNlMatrixTopNSourceAddress(String nlMatrixTopNSourceAddress);

    String getNlMatrixTopNSourceAddress();

    void setNlMatrixTopNDestAddress(String nlMatrixTopNDestAddress);

    String getNlMatrixTopNDestAddress();

    void setNlMatrixTopNPktRate(int nlMatrixTopNPktRate);

    int getNlMatrixTopNPktRate();

    void setNlMatrixTopNReversePktRate(int nlMatrixTopNReversePktRate);

    int getNlMatrixTopNReversePktRate();

    void setNlMatrixTopNOctetRate(int nlMatrixTopNOctetRate);

    int getNlMatrixTopNOctetRate();

    void setNlMatrixTopNReverseOctetRate(int nlMatrixTopNReverseOctetRate);

    int getNlMatrixTopNReverseOctetRate();

    INlMatrixTopNEntry clone();

}
