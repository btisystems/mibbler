
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.almatrix;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.almatrix.almatrixsdtable.IAlMatrixSDEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAlMatrixSDTable
    extends IDeviceEntity
{


    Map<String, IAlMatrixSDEntry> getAlMatrixSDEntry();

    IAlMatrixSDTable clone();

}
