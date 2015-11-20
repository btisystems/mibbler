
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.gcc0configtable.IGcc0ConfigEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IGcc0ConfigTable
    extends IDeviceEntity
{


    Map<String, IGcc0ConfigEntry> getGcc0ConfigEntry();

    IGcc0ConfigTable clone();

}
