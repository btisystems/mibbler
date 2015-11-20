
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dtp;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dtp.dot1dtpfdbtable.IDot1dTpFdbEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dTpFdbTable
    extends IDeviceEntity
{


    Map<String, IDot1dTpFdbEntry> getDot1dTpFdbEntry();

    IDot1dTpFdbTable clone();

}
