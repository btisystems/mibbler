
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix.nlmatrixtopntable.INlMatrixTopNEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlMatrixTopNTable
    extends IDeviceEntity
{


    Map<String, INlMatrixTopNEntry> getNlMatrixTopNEntry();

    INlMatrixTopNTable clone();

}
