
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qfdbtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qFdbEntry
    extends IDeviceEntity
{


    void setDot1qFdbId(int dot1qFdbId);

    int getDot1qFdbId();

    void setDot1qFdbDynamicCount(int dot1qFdbDynamicCount);

    int getDot1qFdbDynamicCount();

    IDot1qFdbEntry clone();

}
