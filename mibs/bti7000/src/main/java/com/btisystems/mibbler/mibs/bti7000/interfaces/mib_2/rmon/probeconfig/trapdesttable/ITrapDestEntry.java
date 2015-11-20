
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.probeconfig.trapdesttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITrapDestEntry
    extends IDeviceEntity
{


    void setTrapDestIndex(int trapDestIndex);

    int getTrapDestIndex();

    void setTrapDestCommunity(String trapDestCommunity);

    String getTrapDestCommunity();

    void setTrapDestProtocol(int trapDestProtocol);

    int getTrapDestProtocol();

    void setTrapDestAddress(String trapDestAddress);

    String getTrapDestAddress();

    void setTrapDestOwner(String trapDestOwner);

    String getTrapDestOwner();

    void setTrapDestStatus(int trapDestStatus);

    int getTrapDestStatus();

    ITrapDestEntry clone();

}
