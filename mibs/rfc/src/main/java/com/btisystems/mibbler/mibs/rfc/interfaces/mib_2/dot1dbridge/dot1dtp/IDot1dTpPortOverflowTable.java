
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dtp;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dtp.dot1dtpportoverflowtable.IDot1dTpPortOverflowEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dTpPortOverflowTable
    extends IDeviceEntity
{


    Map<String, IDot1dTpPortOverflowEntry> getDot1dTpPortOverflowEntry();

    IDot1dTpPortOverflowTable clone();

}
