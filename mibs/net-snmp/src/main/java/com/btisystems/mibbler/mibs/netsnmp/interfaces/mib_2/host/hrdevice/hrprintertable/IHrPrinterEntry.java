
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrprintertable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrPrinterEntry
    extends IDeviceEntity
{


    void setHrPrinterStatus(int hrPrinterStatus);

    int getHrPrinterStatus();

    void setHrPrinterDetectedErrorState(String hrPrinterDetectedErrorState);

    String getHrPrinterDetectedErrorState();

    IHrPrinterEntry clone();

}
