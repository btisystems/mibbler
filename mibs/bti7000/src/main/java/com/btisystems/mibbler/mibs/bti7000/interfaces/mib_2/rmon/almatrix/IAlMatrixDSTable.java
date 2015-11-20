
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.almatrix;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.almatrix.almatrixdstable.IAlMatrixDSEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAlMatrixDSTable
    extends IDeviceEntity
{


    Map<String, IAlMatrixDSEntry> getAlMatrixDSEntry();

    IAlMatrixDSTable clone();

}
