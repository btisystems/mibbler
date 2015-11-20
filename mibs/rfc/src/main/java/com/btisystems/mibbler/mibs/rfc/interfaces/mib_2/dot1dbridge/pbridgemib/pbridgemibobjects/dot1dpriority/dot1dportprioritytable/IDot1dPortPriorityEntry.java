
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dportprioritytable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dPortPriorityEntry
    extends IDeviceEntity
{


    void setDot1dPortDefaultUserPriority(int dot1dPortDefaultUserPriority);

    int getDot1dPortDefaultUserPriority();

    void setDot1dPortNumTrafficClasses(int dot1dPortNumTrafficClasses);

    int getDot1dPortNumTrafficClasses();

    IDot1dPortPriorityEntry clone();

}
