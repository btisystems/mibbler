
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dextbase;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dextbase.dot1dportcapabilitiestable.IDot1dPortCapabilitiesEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dPortCapabilitiesTable
    extends IDeviceEntity
{


    Map<String, IDot1dPortCapabilitiesEntry> getDot1dPortCapabilitiesEntry();

    IDot1dPortCapabilitiesTable clone();

}
