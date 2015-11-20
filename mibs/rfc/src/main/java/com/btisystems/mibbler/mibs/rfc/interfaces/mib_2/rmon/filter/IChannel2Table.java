
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.filter;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.filter.channel2table.IChannel2Entry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IChannel2Table
    extends IDeviceEntity
{


    Map<String, IChannel2Entry> getChannel2Entry();

    IChannel2Table clone();

}
