
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlmatrix;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlmatrix.hlmatrixcontroltable.IHlMatrixControlEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHlMatrixControlTable
    extends IDeviceEntity
{


    Map<String, IHlMatrixControlEntry> getHlMatrixControlEntry();

    IHlMatrixControlTable clone();

}
