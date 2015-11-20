
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dstp;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dstp.dot1dstpporttable.IDot1dStpPortEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dStpPortTable
    extends IDeviceEntity
{


    Map<String, IDot1dStpPortEntry> getDot1dStpPortEntry();

    IDot1dStpPortTable clone();

}
