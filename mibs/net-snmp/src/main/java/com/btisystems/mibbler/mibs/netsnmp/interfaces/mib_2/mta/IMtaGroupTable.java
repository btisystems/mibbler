
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.mtagrouptable.IMtaGroupEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMtaGroupTable
    extends IDeviceEntity
{


    Map<String, IMtaGroupEntry> getMtaGroupEntry();

    IMtaGroupTable clone();

}
