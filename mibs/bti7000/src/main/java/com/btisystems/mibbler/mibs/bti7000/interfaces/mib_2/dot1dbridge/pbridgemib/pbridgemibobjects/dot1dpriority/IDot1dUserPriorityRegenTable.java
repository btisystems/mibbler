
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1duserpriorityregentable.IDot1dUserPriorityRegenEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dUserPriorityRegenTable
    extends IDeviceEntity
{


    Map<String, IDot1dUserPriorityRegenEntry> getDot1dUserPriorityRegenEntry();

    IDot1dUserPriorityRegenTable clone();

}
