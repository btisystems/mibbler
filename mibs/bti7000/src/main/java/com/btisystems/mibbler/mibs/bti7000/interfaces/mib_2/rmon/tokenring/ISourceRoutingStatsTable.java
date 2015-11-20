
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.sourceroutingstatstable.ISourceRoutingStatsEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISourceRoutingStatsTable
    extends IDeviceEntity
{


    Map<String, ISourceRoutingStatsEntry> getSourceRoutingStatsEntry();

    ISourceRoutingStatsTable clone();

}
