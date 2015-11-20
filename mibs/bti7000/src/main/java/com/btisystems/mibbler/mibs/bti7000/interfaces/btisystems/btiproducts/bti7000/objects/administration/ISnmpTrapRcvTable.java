
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.administration;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.administration.snmptraprcvtable.ISnmpTrapRcvEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISnmpTrapRcvTable
    extends IDeviceEntity
{


    Map<String, ISnmpTrapRcvEntry> getSnmpTrapRcvEntry();

    ISnmpTrapRcvTable clone();

}
