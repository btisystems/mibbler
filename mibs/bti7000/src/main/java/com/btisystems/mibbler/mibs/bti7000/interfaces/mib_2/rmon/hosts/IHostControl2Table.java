
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.hosts;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.hosts.hostcontrol2table.IHostControl2Entry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHostControl2Table
    extends IDeviceEntity
{


    Map<String, IHostControl2Entry> getHostControl2Entry();

    IHostControl2Table clone();

}
