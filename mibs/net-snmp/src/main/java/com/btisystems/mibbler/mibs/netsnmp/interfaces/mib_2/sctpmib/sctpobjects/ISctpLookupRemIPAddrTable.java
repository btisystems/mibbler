
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookupremipaddrtable.ISctpLookupRemIPAddrEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpLookupRemIPAddrTable
    extends IDeviceEntity
{


    Map<String, ISctpLookupRemIPAddrEntry> getSctpLookupRemIPAddrEntry();

    ISctpLookupRemIPAddrTable clone();

}
