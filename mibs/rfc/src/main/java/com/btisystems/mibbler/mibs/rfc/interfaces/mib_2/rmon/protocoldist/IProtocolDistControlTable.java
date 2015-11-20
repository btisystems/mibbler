
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.protocoldist;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.protocoldist.protocoldistcontroltable.IProtocolDistControlEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IProtocolDistControlTable
    extends IDeviceEntity
{


    Map<String, IProtocolDistControlEntry> getProtocolDistControlEntry();

    IProtocolDistControlTable clone();

}
