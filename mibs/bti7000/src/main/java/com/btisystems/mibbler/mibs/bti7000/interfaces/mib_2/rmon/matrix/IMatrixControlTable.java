
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.matrix;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.matrix.matrixcontroltable.IMatrixControlEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMatrixControlTable
    extends IDeviceEntity
{


    Map<String, IMatrixControlEntry> getMatrixControlEntry();

    IMatrixControlTable clone();

}
