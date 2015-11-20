
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.almatrix;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.almatrix.almatrixtopntable.IAlMatrixTopNEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAlMatrixTopNTable
    extends IDeviceEntity
{


    Map<String, IAlMatrixTopNEntry> getAlMatrixTopNEntry();

    IAlMatrixTopNTable clone();

}
