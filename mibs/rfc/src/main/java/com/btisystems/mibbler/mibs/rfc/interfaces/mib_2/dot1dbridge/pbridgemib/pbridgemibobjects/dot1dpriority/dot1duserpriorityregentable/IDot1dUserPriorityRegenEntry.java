
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1duserpriorityregentable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dUserPriorityRegenEntry
    extends IDeviceEntity
{


    void setDot1dUserPriority(int dot1dUserPriority);

    int getDot1dUserPriority();

    void setDot1dRegenUserPriority(int dot1dRegenUserPriority);

    int getDot1dRegenUserPriority();

    IDot1dUserPriorityRegenEntry clone();

}
