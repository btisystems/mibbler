
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.almatrix.almatrixtopntable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAlMatrixTopNEntry
    extends IDeviceEntity
{


    void setAlMatrixTopNIndex(int alMatrixTopNIndex);

    int getAlMatrixTopNIndex();

    void setAlMatrixTopNProtocolDirLocalIndex(int alMatrixTopNProtocolDirLocalIndex);

    int getAlMatrixTopNProtocolDirLocalIndex();

    void setAlMatrixTopNSourceAddress(String alMatrixTopNSourceAddress);

    String getAlMatrixTopNSourceAddress();

    void setAlMatrixTopNDestAddress(String alMatrixTopNDestAddress);

    String getAlMatrixTopNDestAddress();

    void setAlMatrixTopNAppProtocolDirLocalIndex(int alMatrixTopNAppProtocolDirLocalIndex);

    int getAlMatrixTopNAppProtocolDirLocalIndex();

    void setAlMatrixTopNPktRate(int alMatrixTopNPktRate);

    int getAlMatrixTopNPktRate();

    void setAlMatrixTopNReversePktRate(int alMatrixTopNReversePktRate);

    int getAlMatrixTopNReversePktRate();

    void setAlMatrixTopNOctetRate(int alMatrixTopNOctetRate);

    int getAlMatrixTopNOctetRate();

    void setAlMatrixTopNReverseOctetRate(int alMatrixTopNReverseOctetRate);

    int getAlMatrixTopNReverseOctetRate();

    IAlMatrixTopNEntry clone();

}
