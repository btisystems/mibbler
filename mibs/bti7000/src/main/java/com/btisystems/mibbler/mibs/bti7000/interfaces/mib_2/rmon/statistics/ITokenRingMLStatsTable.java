
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics.tokenringmlstatstable.ITokenRingMLStatsEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITokenRingMLStatsTable
    extends IDeviceEntity
{


    Map<String, ITokenRingMLStatsEntry> getTokenRingMLStatsEntry();

    ITokenRingMLStatsTable clone();

}
