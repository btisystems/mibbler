
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.getable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IGeEntry
    extends IDeviceEntity
{


    void setGeShelfIdx(int geShelfIdx);

    int getGeShelfIdx();

    void setGeSlotIdx(int geSlotIdx);

    int getGeSlotIdx();

    void setGePortIdx(int gePortIdx);

    int getGePortIdx();

    void setGeOpticalPwrReceivedMinTh(int geOpticalPwrReceivedMinTh);

    int getGeOpticalPwrReceivedMinTh();

    void setGeOpticalPwrReceivedMaxTh(int geOpticalPwrReceivedMaxTh);

    int getGeOpticalPwrReceivedMaxTh();

    void setGeOpticalPwrTransmittedMinTh(int geOpticalPwrTransmittedMinTh);

    int getGeOpticalPwrTransmittedMinTh();

    void setGeOpticalPwrTransmittedMaxTh(int geOpticalPwrTransmittedMaxTh);

    int getGeOpticalPwrTransmittedMaxTh();

    void setGeOpticalPwrReceived(int geOpticalPwrReceived);

    int getGeOpticalPwrReceived();

    void setGeOpticalPwrTransmitted(int geOpticalPwrTransmitted);

    int getGeOpticalPwrTransmitted();

    void setGePEC(String gePEC);

    String getGePEC();

    boolean isGePECDefined();

    void setGeAdminStatus(int geAdminStatus);

    int getGeAdminStatus();

    boolean isGeAdminStatusDefined();

    void setGeOperStatus(int geOperStatus);

    int getGeOperStatus();

    void setGeOperStatQlfr(String geOperStatQlfr);

    String getGeOperStatQlfr();

    void setGeAutoEnableTimer(String geAutoEnableTimer);

    String getGeAutoEnableTimer();

    boolean isGeAutoEnableTimerDefined();

    void setGeActAutoEnableTimer(String geActAutoEnableTimer);

    String getGeActAutoEnableTimer();

    void setGeWavelength(int geWavelength);

    int getGeWavelength();

    void setGeVendorPN1(String geVendorPN1);

    String getGeVendorPN1();

    boolean isGeVendorPN1Defined();

    void setGeVendorPN2(String geVendorPN2);

    String getGeVendorPN2();

    boolean isGeVendorPN2Defined();

    void setGeVendorPN3(String geVendorPN3);

    String getGeVendorPN3();

    boolean isGeVendorPN3Defined();

    void setGePhyPMMon(int gePhyPMMon);

    int getGePhyPMMon();

    boolean isGePhyPMMonDefined();

    void setGeFPSD(int geFPSD);

    int getGeFPSD();

    boolean isGeFPSDDefined();

    void setGeLaserStatus(int geLaserStatus);

    int getGeLaserStatus();

    void setGeId1(String geId1);

    String getGeId1();

    boolean isGeId1Defined();

    void setGeFiberType(int geFiberType);

    int getGeFiberType();

    boolean isGeFiberTypeDefined();

    void setGeCustom1(String geCustom1);

    String getGeCustom1();

    boolean isGeCustom1Defined();

    void setGeSpeed(int geSpeed);

    int getGeSpeed();

    void setGeDuplex(int geDuplex);

    int getGeDuplex();

    void setGeMediaRate(int geMediaRate);

    int getGeMediaRate();

    boolean isGeMediaRateDefined();

    void setGeMTU(int geMTU);

    int getGeMTU();

    void setGeMACAddr(String geMACAddr);

    String getGeMACAddr();

    void setGeGfpMode(int geGfpMode);

    int getGeGfpMode();

    boolean isGeGfpModeDefined();

    void setGeFlowControl(int geFlowControl);

    int getGeFlowControl();

    boolean isGeFlowControlDefined();

    void setGeRemoteId(String geRemoteId);

    String getGeRemoteId();

    boolean isGeRemoteIdDefined();

    void setGeLaserControl(int geLaserControl);

    int getGeLaserControl();

    void setGeRowStatus(int geRowStatus);

    int getGeRowStatus();

    IGeEntry clone();

}
