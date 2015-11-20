
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics.etherstats2table.IEtherStats2Entry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IEtherStats2Table
    extends IDeviceEntity
{


    Map<String, IEtherStats2Entry> getEtherStats2Entry();

    IEtherStats2Table clone();

}
