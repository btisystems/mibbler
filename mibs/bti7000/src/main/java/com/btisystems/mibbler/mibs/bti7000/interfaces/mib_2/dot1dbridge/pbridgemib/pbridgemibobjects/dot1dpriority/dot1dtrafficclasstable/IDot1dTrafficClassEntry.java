
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dtrafficclasstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dTrafficClassEntry
    extends IDeviceEntity
{


    void setDot1dTrafficClassPriority(int dot1dTrafficClassPriority);

    int getDot1dTrafficClassPriority();

    void setDot1dTrafficClass(int dot1dTrafficClass);

    int getDot1dTrafficClass();

    IDot1dTrafficClassEntry clone();

}
