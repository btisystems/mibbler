
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlmatrix;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlmatrix.nlmatrixsdtable.INlMatrixSDEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlMatrixSDTable
    extends IDeviceEntity
{


    Map<String, INlMatrixSDEntry> getNlMatrixSDEntry();

    INlMatrixSDTable clone();

}
