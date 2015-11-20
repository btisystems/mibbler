
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dtp;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dtp.dot1dtphcporttable.IDot1dTpHCPortEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dTpHCPortTable
    extends IDeviceEntity
{


    Map<String, IDot1dTpHCPortEntry> getDot1dTpHCPortEntry();

    IDot1dTpHCPortTable clone();

}
