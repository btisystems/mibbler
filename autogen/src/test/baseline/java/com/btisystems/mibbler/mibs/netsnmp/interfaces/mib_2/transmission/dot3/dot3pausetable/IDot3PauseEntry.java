
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3pausetable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot3PauseEntry
    extends IDeviceEntity
{


    void setDot3PauseAdminMode(int dot3PauseAdminMode);

    int getDot3PauseAdminMode();

    void setDot3PauseOperMode(int dot3PauseOperMode);

    int getDot3PauseOperMode();

    void setDot3InPauseFrames(int dot3InPauseFrames);

    int getDot3InPauseFrames();

    void setDot3OutPauseFrames(int dot3OutPauseFrames);

    int getDot3OutPauseFrames();

    void setDot3HCInPauseFrames(long dot3HCInPauseFrames);

    long getDot3HCInPauseFrames();

    void setDot3HCOutPauseFrames(long dot3HCOutPauseFrames);

    long getDot3HCOutPauseFrames();

    IDot3PauseEntry clone();

}
