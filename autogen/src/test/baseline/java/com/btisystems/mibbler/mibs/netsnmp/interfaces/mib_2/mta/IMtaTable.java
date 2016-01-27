
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.mtatable.IMtaEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMtaTable
    extends IDeviceEntity
{


    Map<String, IMtaEntry> getMtaEntry();

    IMtaTable clone();

}
