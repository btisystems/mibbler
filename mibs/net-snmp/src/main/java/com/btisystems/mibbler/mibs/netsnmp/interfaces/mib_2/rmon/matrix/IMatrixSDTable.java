
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.matrix;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.matrix.matrixsdtable.IMatrixSDEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMatrixSDTable
    extends IDeviceEntity
{


    Map<String, IMatrixSDEntry> getMatrixSDEntry();

    IMatrixSDTable clone();

}
