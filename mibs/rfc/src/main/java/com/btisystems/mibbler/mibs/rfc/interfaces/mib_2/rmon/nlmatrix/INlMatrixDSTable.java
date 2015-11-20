
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix.nlmatrixdstable.INlMatrixDSEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlMatrixDSTable
    extends IDeviceEntity
{


    Map<String, INlMatrixDSEntry> getNlMatrixDSEntry();

    INlMatrixDSTable clone();

}
