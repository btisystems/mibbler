
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.britable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IBriEntry
    extends IDeviceEntity
{


    void setBriShelfIdx(int briShelfIdx);

    int getBriShelfIdx();

    void setBriSlotIdx(int briSlotIdx);

    int getBriSlotIdx();

    void setBriPortIdx(int briPortIdx);

    int getBriPortIdx();

    void setBriProtocol(int briProtocol);

    int getBriProtocol();

    void setBriOpticalPwrReceivedMinTh(int briOpticalPwrReceivedMinTh);

    int getBriOpticalPwrReceivedMinTh();

    void setBriOpticalPwrReceivedMaxTh(int briOpticalPwrReceivedMaxTh);

    int getBriOpticalPwrReceivedMaxTh();

    void setBriOpticalPwrTransmittedMinTh(int briOpticalPwrTransmittedMinTh);

    int getBriOpticalPwrTransmittedMinTh();

    void setBriOpticalPwrTransmittedMaxTh(int briOpticalPwrTransmittedMaxTh);

    int getBriOpticalPwrTransmittedMaxTh();

    void setBriOpticalPwrReceived(int briOpticalPwrReceived);

    int getBriOpticalPwrReceived();

    void setBriOpticalPwrTransmitted(int briOpticalPwrTransmitted);

    int getBriOpticalPwrTransmitted();

    void setBriPEC(String briPEC);

    String getBriPEC();

    boolean isBriPECDefined();

    void setBriAdminStatus(int briAdminStatus);

    int getBriAdminStatus();

    boolean isBriAdminStatusDefined();

    void setBriOperStatus(int briOperStatus);

    int getBriOperStatus();

    void setBriOperStatQlfr(String briOperStatQlfr);

    String getBriOperStatQlfr();

    void setBriAutoEnableTimer(String briAutoEnableTimer);

    String getBriAutoEnableTimer();

    boolean isBriAutoEnableTimerDefined();

    void setBriActAutoEnableTimer(String briActAutoEnableTimer);

    String getBriActAutoEnableTimer();

    void setBriWavelength(int briWavelength);

    int getBriWavelength();

    void setBriVendorPN1(String briVendorPN1);

    String getBriVendorPN1();

    boolean isBriVendorPN1Defined();

    void setBriVendorPN2(String briVendorPN2);

    String getBriVendorPN2();

    boolean isBriVendorPN2Defined();

    void setBriVendorPN3(String briVendorPN3);

    String getBriVendorPN3();

    boolean isBriVendorPN3Defined();

    void setBriPhyPMMon(int briPhyPMMon);

    int getBriPhyPMMon();

    boolean isBriPhyPMMonDefined();

    void setBriLaserStatus(int briLaserStatus);

    int getBriLaserStatus();

    void setBriId1(String briId1);

    String getBriId1();

    boolean isBriId1Defined();

    void setBriFiberType(int briFiberType);

    int getBriFiberType();

    boolean isBriFiberTypeDefined();

    void setBriCustom1(String briCustom1);

    String getBriCustom1();

    boolean isBriCustom1Defined();

    void setBriBitRate(int briBitRate);

    int getBriBitRate();

    void setBriRemoteId(String briRemoteId);

    String getBriRemoteId();

    boolean isBriRemoteIdDefined();

    void setBriLaserControl(int briLaserControl);

    int getBriLaserControl();

    void setBriRowStatus(int briRowStatus);

    int getBriRowStatus();

    IBriEntry clone();

}
