
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookupremprimipaddrtable.ISctpLookupRemPrimIPAddrEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpLookupRemPrimIPAddrTable
    extends IDeviceEntity
{


    Map<String, ISctpLookupRemPrimIPAddrEntry> getSctpLookupRemPrimIPAddrEntry();

    ISctpLookupRemPrimIPAddrTable clone();

}
