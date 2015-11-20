
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.amdtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAmdEntry
    extends IDeviceEntity
{


    void setAmdTypeIdx(int amdTypeIdx);

    int getAmdTypeIdx();

    void setAmdShelfIdx(int amdShelfIdx);

    int getAmdShelfIdx();

    void setAmdSlotIdx(int amdSlotIdx);

    int getAmdSlotIdx();

    void setAmdLineIdx(int amdLineIdx);

    int getAmdLineIdx();

    void setAmdPortIdx(int amdPortIdx);

    int getAmdPortIdx();

    void setAmdOpticalPwrReceivedMinTh(int amdOpticalPwrReceivedMinTh);

    int getAmdOpticalPwrReceivedMinTh();

    void setAmdOpticalPwrReceivedMaxTh(int amdOpticalPwrReceivedMaxTh);

    int getAmdOpticalPwrReceivedMaxTh();

    void setAmdOpticalPwrTransmittedTarget(int amdOpticalPwrTransmittedTarget);

    int getAmdOpticalPwrTransmittedTarget();

    void setAmdOpticalAttenuationTarget(int amdOpticalAttenuationTarget);

    int getAmdOpticalAttenuationTarget();

    void setAmdOpticalPwrReceived(int amdOpticalPwrReceived);

    int getAmdOpticalPwrReceived();

    void setAmdOpticalPwrTransmitted(int amdOpticalPwrTransmitted);

    int getAmdOpticalPwrTransmitted();

    void setAmdOpticalAttentuation(int amdOpticalAttentuation);

    int getAmdOpticalAttentuation();

    void setAmdAdminStatus(int amdAdminStatus);

    int getAmdAdminStatus();

    boolean isAmdAdminStatusDefined();

    void setAmdOperStatus(int amdOperStatus);

    int getAmdOperStatus();

    void setAmdOperStatQlfr(String amdOperStatQlfr);

    String getAmdOperStatQlfr();

    void setAmdAutoEnableTimer(String amdAutoEnableTimer);

    String getAmdAutoEnableTimer();

    boolean isAmdAutoEnableTimerDefined();

    void setAmdActAutoEnableTimer(String amdActAutoEnableTimer);

    String getAmdActAutoEnableTimer();

    void setAmdWavelength(int amdWavelength);

    int getAmdWavelength();

    void setAmdId1(String amdId1);

    String getAmdId1();

    boolean isAmdId1Defined();

    void setAmdId2(String amdId2);

    String getAmdId2();

    boolean isAmdId2Defined();

    void setAmdFiberType(int amdFiberType);

    int getAmdFiberType();

    boolean isAmdFiberTypeDefined();

    void setAmdGrid(int amdGrid);

    int getAmdGrid();

    boolean isAmdGridDefined();

    void setAmdCustom1(String amdCustom1);

    String getAmdCustom1();

    boolean isAmdCustom1Defined();

    void setAmdCustom2(String amdCustom2);

    String getAmdCustom2();

    boolean isAmdCustom2Defined();

    void setAmdCustom3(String amdCustom3);

    String getAmdCustom3();

    boolean isAmdCustom3Defined();

    void setAmdRowStatus(int amdRowStatus);

    int getAmdRowStatus();

    IAmdEntry clone();

}
