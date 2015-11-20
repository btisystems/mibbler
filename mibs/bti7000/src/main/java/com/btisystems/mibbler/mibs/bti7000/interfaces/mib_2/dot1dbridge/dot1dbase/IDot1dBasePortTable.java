
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dbase;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dbase.dot1dbaseporttable.IDot1dBasePortEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dBasePortTable
    extends IDeviceEntity
{


    Map<String, IDot1dBasePortEntry> getDot1dBasePortEntry();

    IDot1dBasePortTable clone();

}
