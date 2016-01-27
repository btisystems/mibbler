
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3hcstatstable.IDot3HCStatsEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot3HCStatsTable
    extends IDeviceEntity
{


    Map<String, IDot3HCStatsEntry> getDot3HCStatsEntry();

    IDot3HCStatsTable clone();

}
