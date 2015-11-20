
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.dot1qstaticmulticasttable.IDot1qStaticMulticastEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qStaticMulticastTable
    extends IDeviceEntity
{


    Map<String, IDot1qStaticMulticastEntry> getDot1qStaticMulticastEntry();

    IDot1qStaticMulticastTable clone();

}
