
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.protocoldist;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.protocoldist.protocoldiststatstable.IProtocolDistStatsEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IProtocolDistStatsTable
    extends IDeviceEntity
{


    Map<String, IProtocolDistStatsEntry> getProtocolDistStatsEntry();

    IProtocolDistStatsTable clone();

}
