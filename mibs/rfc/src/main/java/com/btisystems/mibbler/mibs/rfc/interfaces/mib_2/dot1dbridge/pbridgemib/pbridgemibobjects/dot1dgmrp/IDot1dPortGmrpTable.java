
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgmrp;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgmrp.dot1dportgmrptable.IDot1dPortGmrpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dPortGmrpTable
    extends IDeviceEntity
{


    Map<String, IDot1dPortGmrpEntry> getDot1dPortGmrpEntry();

    IDot1dPortGmrpTable clone();

}
