
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlhost;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlhost.nlhosttable.INlHostEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlHostTable
    extends IDeviceEntity
{


    Map<String, INlHostEntry> getNlHostEntry();

    INlHostTable clone();

}
