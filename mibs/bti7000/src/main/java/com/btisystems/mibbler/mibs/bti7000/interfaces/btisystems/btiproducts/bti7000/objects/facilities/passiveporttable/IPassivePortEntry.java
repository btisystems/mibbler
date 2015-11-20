
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.passiveporttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IPassivePortEntry
    extends IDeviceEntity
{


    void setPassivePortCpTypeIdx(int passivePortCpTypeIdx);

    int getPassivePortCpTypeIdx();

    void setPassivePortShelfIdx(int passivePortShelfIdx);

    int getPassivePortShelfIdx();

    void setPassivePortSlotIdx(int passivePortSlotIdx);

    int getPassivePortSlotIdx();

    void setPassivePortLineIdx(int passivePortLineIdx);

    int getPassivePortLineIdx();

    void setPassivePortTypeIdx(int passivePortTypeIdx);

    int getPassivePortTypeIdx();

    void setPassivePortId1(String passivePortId1);

    String getPassivePortId1();

    void setPassivePortId2(String passivePortId2);

    String getPassivePortId2();

    void setPassivePortFiberType(int passivePortFiberType);

    int getPassivePortFiberType();

    void setPassivePortGrid(int passivePortGrid);

    int getPassivePortGrid();

    void setPassivePortNumChannels(int passivePortNumChannels);

    int getPassivePortNumChannels();

    void setPassivePortWavelength(int passivePortWavelength);

    int getPassivePortWavelength();

    void setPassivePortCustom1(String passivePortCustom1);

    String getPassivePortCustom1();

    void setPassivePortCustom2(String passivePortCustom2);

    String getPassivePortCustom2();

    void setPassivePortCustom3(String passivePortCustom3);

    String getPassivePortCustom3();

    void setPassivePortRemoteId(String passivePortRemoteId);

    String getPassivePortRemoteId();

    boolean isPassivePortRemoteIdDefined();

    void setPassivePortRowStatus(int passivePortRowStatus);

    int getPassivePortRowStatus();

    IPassivePortEntry clone();

}
