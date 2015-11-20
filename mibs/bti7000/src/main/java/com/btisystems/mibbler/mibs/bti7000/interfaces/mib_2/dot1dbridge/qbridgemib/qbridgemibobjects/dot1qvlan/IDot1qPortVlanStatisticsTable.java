
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlanstatisticstable.IDot1qPortVlanStatisticsEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qPortVlanStatisticsTable
    extends IDeviceEntity
{


    Map<String, IDot1qPortVlanStatisticsEntry> getDot1qPortVlanStatisticsEntry();

    IDot1qPortVlanStatisticsTable clone();

}
