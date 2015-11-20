
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qforwardunregisteredtable.IDot1qForwardUnregisteredEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qForwardUnregisteredTable
    extends IDeviceEntity
{


    Map<String, IDot1qForwardUnregisteredEntry> getDot1qForwardUnregisteredEntry();

    IDot1qForwardUnregisteredTable clone();

}
