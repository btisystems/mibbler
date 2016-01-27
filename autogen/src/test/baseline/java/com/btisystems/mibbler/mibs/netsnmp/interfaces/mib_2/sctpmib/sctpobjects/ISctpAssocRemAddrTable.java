
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctpassocremaddrtable.ISctpAssocRemAddrEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpAssocRemAddrTable
    extends IDeviceEntity
{


    Map<String, ISctpAssocRemAddrEntry> getSctpAssocRemAddrEntry();

    ISctpAssocRemAddrTable clone();

}
