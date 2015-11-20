
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.ethintftable.IEthIntfEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IEthIntfTable
    extends IDeviceEntity
{


    Map<String, IEthIntfEntry> getEthIntfEntry();

    IEthIntfTable clone();

}
