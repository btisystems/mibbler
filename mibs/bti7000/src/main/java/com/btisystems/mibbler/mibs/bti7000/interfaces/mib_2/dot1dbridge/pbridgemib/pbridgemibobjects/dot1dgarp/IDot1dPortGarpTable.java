
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgarp;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgarp.dot1dportgarptable.IDot1dPortGarpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dPortGarpTable
    extends IDeviceEntity
{


    Map<String, IDot1dPortGarpEntry> getDot1dPortGarpEntry();

    IDot1dPortGarpTable clone();

}
