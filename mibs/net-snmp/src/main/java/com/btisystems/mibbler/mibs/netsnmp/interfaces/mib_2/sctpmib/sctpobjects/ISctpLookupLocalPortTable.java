
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookuplocalporttable.ISctpLookupLocalPortEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpLookupLocalPortTable
    extends IDeviceEntity
{


    Map<String, ISctpLookupLocalPortEntry> getSctpLookupLocalPortEntry();

    ISctpLookupLocalPortTable clone();

}
