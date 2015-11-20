
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics.tokenringpstats2table.ITokenRingPStats2Entry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITokenRingPStats2Table
    extends IDeviceEntity
{


    Map<String, ITokenRingPStats2Entry> getTokenRingPStats2Entry();

    ITokenRingPStats2Table clone();

}
