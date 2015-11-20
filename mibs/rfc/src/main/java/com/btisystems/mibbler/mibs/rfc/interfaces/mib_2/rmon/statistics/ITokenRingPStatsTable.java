
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.statistics;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.statistics.tokenringpstatstable.ITokenRingPStatsEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITokenRingPStatsTable
    extends IDeviceEntity
{


    Map<String, ITokenRingPStatsEntry> getTokenRingPStatsEntry();

    ITokenRingPStatsTable clone();

}
