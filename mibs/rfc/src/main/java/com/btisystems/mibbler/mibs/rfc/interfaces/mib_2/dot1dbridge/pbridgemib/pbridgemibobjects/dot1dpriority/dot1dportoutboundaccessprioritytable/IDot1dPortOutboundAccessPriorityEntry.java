
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dportoutboundaccessprioritytable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dPortOutboundAccessPriorityEntry
    extends IDeviceEntity
{


    void setDot1dPortOutboundAccessPriority(int dot1dPortOutboundAccessPriority);

    int getDot1dPortOutboundAccessPriority();

    IDot1dPortOutboundAccessPriorityEntry clone();

}
