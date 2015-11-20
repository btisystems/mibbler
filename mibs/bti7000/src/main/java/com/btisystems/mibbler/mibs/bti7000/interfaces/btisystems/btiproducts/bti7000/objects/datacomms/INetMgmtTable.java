
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.netmgmttable.INetMgmtEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INetMgmtTable
    extends IDeviceEntity
{


    Map<String, INetMgmtEntry> getNetMgmtEntry();

    INetMgmtTable clone();

}
