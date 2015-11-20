
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.serialtable.ISerialEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISerialTable
    extends IDeviceEntity
{


    Map<String, ISerialEntry> getSerialEntry();

    ISerialTable clone();

}
