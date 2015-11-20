
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3statstable.IDot3StatsEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot3StatsTable
    extends IDeviceEntity
{


    Map<String, IDot3StatsEntry> getDot3StatsEntry();

    IDot3StatsTable clone();

}
