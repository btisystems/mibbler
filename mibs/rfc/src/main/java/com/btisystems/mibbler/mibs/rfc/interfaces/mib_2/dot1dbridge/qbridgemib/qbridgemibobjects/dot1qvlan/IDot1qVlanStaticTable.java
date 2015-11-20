
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qvlanstatictable.IDot1qVlanStaticEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qVlanStaticTable
    extends IDeviceEntity
{


    Map<String, IDot1qVlanStaticEntry> getDot1qVlanStaticEntry();

    IDot1qVlanStaticTable clone();

}
