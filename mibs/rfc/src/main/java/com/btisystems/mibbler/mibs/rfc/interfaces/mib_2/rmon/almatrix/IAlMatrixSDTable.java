
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.almatrix;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.almatrix.almatrixsdtable.IAlMatrixSDEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAlMatrixSDTable
    extends IDeviceEntity
{


    Map<String, IAlMatrixSDEntry> getAlMatrixSDEntry();

    IAlMatrixSDTable clone();

}
