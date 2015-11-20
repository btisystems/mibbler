
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.datacommsoperations;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.datacommsoperations.datacommspingtable.IDataCommsPingEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDataCommsPingTable
    extends IDeviceEntity
{


    Map<String, IDataCommsPingEntry> getDataCommsPingEntry();

    IDataCommsPingTable clone();

}
