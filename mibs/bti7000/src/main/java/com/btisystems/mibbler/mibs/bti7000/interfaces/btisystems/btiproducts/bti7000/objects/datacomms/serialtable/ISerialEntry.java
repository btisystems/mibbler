
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.serialtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISerialEntry
    extends IDeviceEntity
{


    void setSerialPortIdx(int serialPortIdx);

    int getSerialPortIdx();

    void setSerialBaudRate(int serialBaudRate);

    int getSerialBaudRate();

    void setSerialDataBits(int serialDataBits);

    int getSerialDataBits();

    void setSerialParity(int serialParity);

    int getSerialParity();

    void setSerialStopBits(int serialStopBits);

    int getSerialStopBits();

    ISerialEntry clone();

}
