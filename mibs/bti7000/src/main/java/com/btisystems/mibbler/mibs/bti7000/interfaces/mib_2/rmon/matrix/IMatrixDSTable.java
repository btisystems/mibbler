
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.matrix;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.matrix.matrixdstable.IMatrixDSEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMatrixDSTable
    extends IDeviceEntity
{


    Map<String, IMatrixDSEntry> getMatrixDSEntry();

    IMatrixDSTable clone();

}
