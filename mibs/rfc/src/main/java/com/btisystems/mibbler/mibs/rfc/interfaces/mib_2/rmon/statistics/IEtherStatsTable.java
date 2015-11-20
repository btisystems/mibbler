
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.statistics;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.statistics.etherstatstable.IEtherStatsEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IEtherStatsTable
    extends IDeviceEntity
{


    Map<String, IEtherStatsEntry> getEtherStatsEntry();

    IEtherStatsTable clone();

}
