
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlanhcstatisticstable.IDot1qPortVlanHCStatisticsEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qPortVlanHCStatisticsTable
    extends IDeviceEntity
{


    Map<String, IDot1qPortVlanHCStatisticsEntry> getDot1qPortVlanHCStatisticsEntry();

    IDot1qPortVlanHCStatisticsTable clone();

}
