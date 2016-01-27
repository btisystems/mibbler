
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.mtagrouperrortable.IMtaGroupErrorEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMtaGroupErrorTable
    extends IDeviceEntity
{


    Map<String, IMtaGroupErrorEntry> getMtaGroupErrorEntry();

    IMtaGroupErrorTable clone();

}
