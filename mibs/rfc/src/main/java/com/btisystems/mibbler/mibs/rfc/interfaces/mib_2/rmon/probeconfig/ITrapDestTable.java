
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.probeconfig;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.probeconfig.trapdesttable.ITrapDestEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITrapDestTable
    extends IDeviceEntity
{


    Map<String, ITrapDestEntry> getTrapDestEntry();

    ITrapDestTable clone();

}
