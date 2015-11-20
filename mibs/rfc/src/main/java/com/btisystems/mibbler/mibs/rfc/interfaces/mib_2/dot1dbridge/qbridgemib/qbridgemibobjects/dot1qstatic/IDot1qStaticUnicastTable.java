
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.dot1qstaticunicasttable.IDot1qStaticUnicastEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qStaticUnicastTable
    extends IDeviceEntity
{


    Map<String, IDot1qStaticUnicastEntry> getDot1qStaticUnicastEntry();

    IDot1qStaticUnicastTable clone();

}
