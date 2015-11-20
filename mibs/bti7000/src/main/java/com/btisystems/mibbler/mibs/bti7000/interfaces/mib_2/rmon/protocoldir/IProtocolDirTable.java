
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.protocoldir;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.protocoldir.protocoldirtable.IProtocolDirEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IProtocolDirTable
    extends IDeviceEntity
{


    Map<String, IProtocolDirEntry> getProtocolDirEntry();

    IProtocolDirTable clone();

}
