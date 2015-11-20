
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qvlancurrenttable.IDot1qVlanCurrentEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qVlanCurrentTable
    extends IDeviceEntity
{


    Map<String, IDot1qVlanCurrentEntry> getDot1qVlanCurrentEntry();

    IDot1qVlanCurrentTable clone();

}
