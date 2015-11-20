
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.filter;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.filter.channeltable.IChannelEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IChannelTable
    extends IDeviceEntity
{


    Map<String, IChannelEntry> getChannelEntry();

    IChannelTable clone();

}
