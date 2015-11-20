
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.probeconfig.serialconfigtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISerialConfigEntry
    extends IDeviceEntity
{


    void setSerialMode(int serialMode);

    int getSerialMode();

    boolean isSerialModeDefined();

    void setSerialProtocol(int serialProtocol);

    int getSerialProtocol();

    boolean isSerialProtocolDefined();

    void setSerialTimeout(int serialTimeout);

    int getSerialTimeout();

    boolean isSerialTimeoutDefined();

    void setSerialModemInitString(String serialModemInitString);

    String getSerialModemInitString();

    void setSerialModemHangUpString(String serialModemHangUpString);

    String getSerialModemHangUpString();

    void setSerialModemConnectResp(String serialModemConnectResp);

    String getSerialModemConnectResp();

    void setSerialModemNoConnectResp(String serialModemNoConnectResp);

    String getSerialModemNoConnectResp();

    void setSerialDialoutTimeout(int serialDialoutTimeout);

    int getSerialDialoutTimeout();

    boolean isSerialDialoutTimeoutDefined();

    void setSerialStatus(int serialStatus);

    int getSerialStatus();

    ISerialConfigEntry clone();

}
