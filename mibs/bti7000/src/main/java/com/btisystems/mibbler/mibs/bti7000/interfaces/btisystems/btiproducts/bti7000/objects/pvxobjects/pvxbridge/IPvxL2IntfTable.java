
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.pvxobjects.pvxbridge;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.pvxobjects.pvxbridge.pvxl2intftable.IPvxL2IntfEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IPvxL2IntfTable
    extends IDeviceEntity
{


    Map<String, IPvxL2IntfEntry> getPvxL2IntfEntry();

    IPvxL2IntfTable clone();

}
