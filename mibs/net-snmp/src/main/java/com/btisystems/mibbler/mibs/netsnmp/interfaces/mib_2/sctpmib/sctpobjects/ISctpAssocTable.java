
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctpassoctable.ISctpAssocEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpAssocTable
    extends IDeviceEntity
{


    Map<String, ISctpAssocEntry> getSctpAssocEntry();

    ISctpAssocTable clone();

}
