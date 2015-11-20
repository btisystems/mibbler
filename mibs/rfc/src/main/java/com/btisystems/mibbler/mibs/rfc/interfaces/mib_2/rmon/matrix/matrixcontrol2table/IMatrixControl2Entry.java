
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.matrix.matrixcontrol2table;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMatrixControl2Entry
    extends IDeviceEntity
{


    void setMatrixControlDroppedFrames(int matrixControlDroppedFrames);

    int getMatrixControlDroppedFrames();

    void setMatrixControlCreateTime(int matrixControlCreateTime);

    int getMatrixControlCreateTime();

    IMatrixControl2Entry clone();

}
