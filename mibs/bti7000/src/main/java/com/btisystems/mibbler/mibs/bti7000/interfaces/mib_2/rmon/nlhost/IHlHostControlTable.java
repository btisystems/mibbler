
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlhost;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlhost.hlhostcontroltable.IHlHostControlEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHlHostControlTable
    extends IDeviceEntity
{


    Map<String, IHlHostControlEntry> getHlHostControlEntry();

    IHlHostControlTable clone();

}
