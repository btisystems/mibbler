
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgarp.dot1dportgarptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dPortGarpEntry
    extends IDeviceEntity
{


    void setDot1dPortGarpJoinTime(int dot1dPortGarpJoinTime);

    int getDot1dPortGarpJoinTime();

    boolean isDot1dPortGarpJoinTimeDefined();

    void setDot1dPortGarpLeaveTime(int dot1dPortGarpLeaveTime);

    int getDot1dPortGarpLeaveTime();

    boolean isDot1dPortGarpLeaveTimeDefined();

    void setDot1dPortGarpLeaveAllTime(int dot1dPortGarpLeaveAllTime);

    int getDot1dPortGarpLeaveAllTime();

    boolean isDot1dPortGarpLeaveAllTimeDefined();

    IDot1dPortGarpEntry clone();

}
