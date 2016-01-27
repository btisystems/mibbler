
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3colltable.IDot3CollEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot3CollTable
    extends IDeviceEntity
{


    Map<String, IDot3CollEntry> getDot3CollEntry();

    IDot3CollTable clone();

}
