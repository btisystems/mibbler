
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookupremhostnametable.ISctpLookupRemHostNameEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpLookupRemHostNameTable
    extends IDeviceEntity
{


    Map<String, ISctpLookupRemHostNameEntry> getSctpLookupRemHostNameEntry();

    ISctpLookupRemHostNameTable clone();

}
