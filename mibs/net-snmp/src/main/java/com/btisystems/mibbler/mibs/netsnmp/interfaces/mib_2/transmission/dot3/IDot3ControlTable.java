
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3controltable.IDot3ControlEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot3ControlTable
    extends IDeviceEntity
{


    Map<String, IDot3ControlEntry> getDot3ControlEntry();

    IDot3ControlTable clone();

}
