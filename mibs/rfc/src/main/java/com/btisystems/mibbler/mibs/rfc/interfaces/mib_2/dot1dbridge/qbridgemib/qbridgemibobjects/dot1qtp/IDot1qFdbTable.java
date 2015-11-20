
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qfdbtable.IDot1qFdbEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qFdbTable
    extends IDeviceEntity
{


    Map<String, IDot1qFdbEntry> getDot1qFdbEntry();

    IDot1qFdbTable clone();

}
