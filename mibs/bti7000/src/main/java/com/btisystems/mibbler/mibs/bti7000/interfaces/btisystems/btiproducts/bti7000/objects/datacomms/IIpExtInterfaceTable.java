
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.ipextinterfacetable.IIpExtInterfaceTableEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpExtInterfaceTable
    extends IDeviceEntity
{


    Map<String, IIpExtInterfaceTableEntry> getIpExtInterfaceTableEntry();

    IIpExtInterfaceTable clone();

}
