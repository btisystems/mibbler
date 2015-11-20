
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix.nlmatrixtopncontroltable.INlMatrixTopNControlEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlMatrixTopNControlTable
    extends IDeviceEntity
{


    Map<String, INlMatrixTopNControlEntry> getNlMatrixTopNControlEntry();

    INlMatrixTopNControlTable clone();

}
