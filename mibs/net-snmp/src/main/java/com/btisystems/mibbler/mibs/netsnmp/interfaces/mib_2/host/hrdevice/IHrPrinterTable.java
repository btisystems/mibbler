
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrprintertable.IHrPrinterEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrPrinterTable
    extends IDeviceEntity
{


    Map<String, IHrPrinterEntry> getHrPrinterEntry();

    IHrPrinterTable clone();

}
