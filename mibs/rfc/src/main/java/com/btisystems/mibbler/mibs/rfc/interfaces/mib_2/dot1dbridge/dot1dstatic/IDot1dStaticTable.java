
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dstatic;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dstatic.dot1dstatictable.IDot1dStaticEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dStaticTable
    extends IDeviceEntity
{


    Map<String, IDot1dStaticEntry> getDot1dStaticEntry();

    IDot1dStaticTable clone();

}
