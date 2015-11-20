
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.almatrix;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.almatrix.almatrixtopncontroltable.IAlMatrixTopNControlEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAlMatrixTopNControlTable
    extends IDeviceEntity
{


    Map<String, IAlMatrixTopNControlEntry> getAlMatrixTopNControlEntry();

    IAlMatrixTopNControlTable clone();

}
