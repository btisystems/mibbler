
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dportoutboundaccessprioritytable.IDot1dPortOutboundAccessPriorityEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dPortOutboundAccessPriorityTable
    extends IDeviceEntity
{


    Map<String, IDot1dPortOutboundAccessPriorityEntry> getDot1dPortOutboundAccessPriorityEntry();

    IDot1dPortOutboundAccessPriorityTable clone();

}
