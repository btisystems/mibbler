
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics.tokenringmlstats2table.ITokenRingMLStats2Entry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITokenRingMLStats2Table
    extends IDeviceEntity
{


    Map<String, ITokenRingMLStats2Entry> getTokenRingMLStats2Entry();

    ITokenRingMLStats2Table clone();

}
