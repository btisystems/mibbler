
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.probeconfig.serialconnectiontable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISerialConnectionEntry
    extends IDeviceEntity
{


    void setSerialConnectIndex(int serialConnectIndex);

    int getSerialConnectIndex();

    void setSerialConnectDestIpAddress(String serialConnectDestIpAddress);

    String getSerialConnectDestIpAddress();

    void setSerialConnectType(int serialConnectType);

    int getSerialConnectType();

    boolean isSerialConnectTypeDefined();

    void setSerialConnectDialString(String serialConnectDialString);

    String getSerialConnectDialString();

    void setSerialConnectSwitchConnectSeq(String serialConnectSwitchConnectSeq);

    String getSerialConnectSwitchConnectSeq();

    void setSerialConnectSwitchDisconnectSeq(String serialConnectSwitchDisconnectSeq);

    String getSerialConnectSwitchDisconnectSeq();

    void setSerialConnectSwitchResetSeq(String serialConnectSwitchResetSeq);

    String getSerialConnectSwitchResetSeq();

    void setSerialConnectOwner(String serialConnectOwner);

    String getSerialConnectOwner();

    void setSerialConnectStatus(int serialConnectStatus);

    int getSerialConnectStatus();

    ISerialConnectionEntry clone();

}
