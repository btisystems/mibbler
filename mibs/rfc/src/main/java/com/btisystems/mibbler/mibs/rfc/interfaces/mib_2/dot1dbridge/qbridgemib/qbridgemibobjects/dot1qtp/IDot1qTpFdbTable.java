
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qtpfdbtable.IDot1qTpFdbEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qTpFdbTable
    extends IDeviceEntity
{


    Map<String, IDot1qTpFdbEntry> getDot1qTpFdbEntry();

    IDot1qTpFdbTable clone();

}
