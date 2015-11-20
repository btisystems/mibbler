
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.protocoldir;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.protocoldir.protocoldirtable.IProtocolDirEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IProtocolDirTable
    extends IDeviceEntity
{


    Map<String, IProtocolDirEntry> getProtocolDirEntry();

    IProtocolDirTable clone();

}
