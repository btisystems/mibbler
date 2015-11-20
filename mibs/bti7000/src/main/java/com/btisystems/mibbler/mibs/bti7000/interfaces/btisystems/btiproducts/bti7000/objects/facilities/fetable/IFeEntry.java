
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.fetable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IFeEntry
    extends IDeviceEntity
{


    void setFeShelfIdx(int feShelfIdx);

    int getFeShelfIdx();

    void setFeSlotIdx(int feSlotIdx);

    int getFeSlotIdx();

    void setFePortIdx(int fePortIdx);

    int getFePortIdx();

    void setFeId1(String feId1);

    String getFeId1();

    boolean isFeId1Defined();

    void setFeCustom1(String feCustom1);

    String getFeCustom1();

    boolean isFeCustom1Defined();

    void setFeSpeed(int feSpeed);

    int getFeSpeed();

    void setFeDuplex(int feDuplex);

    int getFeDuplex();

    void setFeMediaRate(int feMediaRate);

    int getFeMediaRate();

    void setFeMTU(int feMTU);

    int getFeMTU();

    void setFeMACAddr(String feMACAddr);

    String getFeMACAddr();

    void setFeRemoteId(String feRemoteId);

    String getFeRemoteId();

    boolean isFeRemoteIdDefined();

    void setFeRowStatus(int feRowStatus);

    int getFeRowStatus();

    IFeEntry clone();

}
