
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3pausetable.IDot3PauseEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot3PauseTable
    extends IDeviceEntity
{


    Map<String, IDot3PauseEntry> getDot3PauseEntry();

    IDot3PauseTable clone();

}
