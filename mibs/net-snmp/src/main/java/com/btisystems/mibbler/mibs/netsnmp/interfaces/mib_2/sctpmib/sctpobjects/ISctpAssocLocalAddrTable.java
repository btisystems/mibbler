
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctpassoclocaladdrtable.ISctpAssocLocalAddrEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpAssocLocalAddrTable
    extends IDeviceEntity
{


    Map<String, ISctpAssocLocalAddrEntry> getSctpAssocLocalAddrEntry();

    ISctpAssocLocalAddrTable clone();

}
