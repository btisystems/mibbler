
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookupremporttable.ISctpLookupRemPortEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpLookupRemPortTable
    extends IDeviceEntity
{


    Map<String, ISctpLookupRemPortEntry> getSctpLookupRemPortEntry();

    ISctpLookupRemPortTable clone();

}
