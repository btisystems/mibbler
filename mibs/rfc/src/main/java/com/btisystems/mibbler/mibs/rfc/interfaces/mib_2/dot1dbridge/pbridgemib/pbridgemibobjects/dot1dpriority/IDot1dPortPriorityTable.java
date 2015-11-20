
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dportprioritytable.IDot1dPortPriorityEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dPortPriorityTable
    extends IDeviceEntity
{


    Map<String, IDot1dPortPriorityEntry> getDot1dPortPriorityEntry();

    IDot1dPortPriorityTable clone();

}
