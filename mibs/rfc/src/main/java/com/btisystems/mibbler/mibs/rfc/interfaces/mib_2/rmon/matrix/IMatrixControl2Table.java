
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.matrix;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.matrix.matrixcontrol2table.IMatrixControl2Entry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMatrixControl2Table
    extends IDeviceEntity
{


    Map<String, IMatrixControl2Entry> getMatrixControl2Entry();

    IMatrixControl2Table clone();

}
