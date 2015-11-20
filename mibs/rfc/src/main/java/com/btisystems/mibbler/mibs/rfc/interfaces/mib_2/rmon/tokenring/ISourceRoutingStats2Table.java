
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.tokenring;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.tokenring.sourceroutingstats2table.ISourceRoutingStats2Entry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISourceRoutingStats2Table
    extends IDeviceEntity
{


    Map<String, ISourceRoutingStats2Entry> getSourceRoutingStats2Entry();

    ISourceRoutingStats2Table clone();

}
