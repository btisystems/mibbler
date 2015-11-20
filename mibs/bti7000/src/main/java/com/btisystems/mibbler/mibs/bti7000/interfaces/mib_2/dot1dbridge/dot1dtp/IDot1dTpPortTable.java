
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dtp;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dtp.dot1dtpporttable.IDot1dTpPortEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dTpPortTable
    extends IDeviceEntity
{


    Map<String, IDot1dTpPortEntry> getDot1dTpPortEntry();

    IDot1dTpPortTable clone();

}
