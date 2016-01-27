
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3colltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot3CollEntry
    extends IDeviceEntity
{


    void setDot3CollCount(int dot3CollCount);

    int getDot3CollCount();

    void setDot3CollFrequencies(int dot3CollFrequencies);

    int getDot3CollFrequencies();

    IDot3CollEntry clone();

}
