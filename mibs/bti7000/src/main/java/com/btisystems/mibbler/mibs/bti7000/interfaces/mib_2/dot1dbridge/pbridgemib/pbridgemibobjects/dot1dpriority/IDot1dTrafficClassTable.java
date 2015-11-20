
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dtrafficclasstable.IDot1dTrafficClassEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dTrafficClassTable
    extends IDeviceEntity
{


    Map<String, IDot1dTrafficClassEntry> getDot1dTrafficClassEntry();

    IDot1dTrafficClassTable clone();

}
