
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.fctable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IFcEntry
    extends IDeviceEntity
{


    void setFcShelfIdx(int fcShelfIdx);

    int getFcShelfIdx();

    void setFcSlotIdx(int fcSlotIdx);

    int getFcSlotIdx();

    void setFcPortIdx(int fcPortIdx);

    int getFcPortIdx();

    void setFcRate(int fcRate);

    int getFcRate();

    void setFcOpticalPwrReceivedMinTh(int fcOpticalPwrReceivedMinTh);

    int getFcOpticalPwrReceivedMinTh();

    void setFcOpticalPwrReceivedMaxTh(int fcOpticalPwrReceivedMaxTh);

    int getFcOpticalPwrReceivedMaxTh();

    void setFcOpticalPwrTransmittedMinTh(int fcOpticalPwrTransmittedMinTh);

    int getFcOpticalPwrTransmittedMinTh();

    void setFcOpticalPwrTransmittedMaxTh(int fcOpticalPwrTransmittedMaxTh);

    int getFcOpticalPwrTransmittedMaxTh();

    void setFcOpticalPwrReceived(int fcOpticalPwrReceived);

    int getFcOpticalPwrReceived();

    void setFcOpticalPwrTransmitted(int fcOpticalPwrTransmitted);

    int getFcOpticalPwrTransmitted();

    void setFcPEC(String fcPEC);

    String getFcPEC();

    boolean isFcPECDefined();

    void setFcAdminStatus(int fcAdminStatus);

    int getFcAdminStatus();

    boolean isFcAdminStatusDefined();

    void setFcOperStatus(int fcOperStatus);

    int getFcOperStatus();

    void setFcOperStatQlfr(String fcOperStatQlfr);

    String getFcOperStatQlfr();

    void setFcAutoEnableTimer(String fcAutoEnableTimer);

    String getFcAutoEnableTimer();

    boolean isFcAutoEnableTimerDefined();

    void setFcActAutoEnableTimer(String fcActAutoEnableTimer);

    String getFcActAutoEnableTimer();

    void setFcWavelength(int fcWavelength);

    int getFcWavelength();

    void setFcVendorPN1(String fcVendorPN1);

    String getFcVendorPN1();

    boolean isFcVendorPN1Defined();

    void setFcVendorPN2(String fcVendorPN2);

    String getFcVendorPN2();

    boolean isFcVendorPN2Defined();

    void setFcVendorPN3(String fcVendorPN3);

    String getFcVendorPN3();

    boolean isFcVendorPN3Defined();

    void setFcPhyPMMon(int fcPhyPMMon);

    int getFcPhyPMMon();

    boolean isFcPhyPMMonDefined();

    void setFcFPSD(int fcFPSD);

    int getFcFPSD();

    boolean isFcFPSDDefined();

    void setFcLaserStatus(int fcLaserStatus);

    int getFcLaserStatus();

    void setFcId1(String fcId1);

    String getFcId1();

    boolean isFcId1Defined();

    void setFcFiberType(int fcFiberType);

    int getFcFiberType();

    boolean isFcFiberTypeDefined();

    void setFcCustom1(String fcCustom1);

    String getFcCustom1();

    boolean isFcCustom1Defined();

    void setFcGfpMode(int fcGfpMode);

    int getFcGfpMode();

    boolean isFcGfpModeDefined();

    void setFcRemoteId(String fcRemoteId);

    String getFcRemoteId();

    boolean isFcRemoteIdDefined();

    void setFcLaserControl(int fcLaserControl);

    int getFcLaserControl();

    void setFcRowStatus(int fcRowStatus);

    int getFcRowStatus();

    IFcEntry clone();

}
