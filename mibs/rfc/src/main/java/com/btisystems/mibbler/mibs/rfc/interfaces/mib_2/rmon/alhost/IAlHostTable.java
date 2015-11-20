
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.alhost;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.alhost.alhosttable.IAlHostEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAlHostTable
    extends IDeviceEntity
{


    Map<String, IAlHostEntry> getAlHostEntry();

    IAlHostTable clone();

}
