
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.ethintftable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IEthIntfEntry
    extends IDeviceEntity
{


    void setEthIntfShelfIdx(int ethIntfShelfIdx);

    int getEthIntfShelfIdx();

    void setEthIntfSlotIdx(int ethIntfSlotIdx);

    int getEthIntfSlotIdx();

    void setEthIntfPortTypeIdx(int ethIntfPortTypeIdx);

    int getEthIntfPortTypeIdx();

    void setEthIntfPortIdx(int ethIntfPortIdx);

    int getEthIntfPortIdx();

    void setEthIntfOpticalPwrReceivedMinTh(int ethIntfOpticalPwrReceivedMinTh);

    int getEthIntfOpticalPwrReceivedMinTh();

    void setEthIntfOpticalPwrReceivedMaxTh(int ethIntfOpticalPwrReceivedMaxTh);

    int getEthIntfOpticalPwrReceivedMaxTh();

    void setEthIntfOpticalPwrTransmittedMinTh(int ethIntfOpticalPwrTransmittedMinTh);

    int getEthIntfOpticalPwrTransmittedMinTh();

    void setEthIntfOpticalPwrTransmittedMaxTh(int ethIntfOpticalPwrTransmittedMaxTh);

    int getEthIntfOpticalPwrTransmittedMaxTh();

    void setEthIntfOpticalPwrReceived(int ethIntfOpticalPwrReceived);

    int getEthIntfOpticalPwrReceived();

    void setEthIntfOpticalPwrTransmitted(int ethIntfOpticalPwrTransmitted);

    int getEthIntfOpticalPwrTransmitted();

    void setEthIntfPEC(String ethIntfPEC);

    String getEthIntfPEC();

    boolean isEthIntfPECDefined();

    void setEthIntfAdminStatus(int ethIntfAdminStatus);

    int getEthIntfAdminStatus();

    boolean isEthIntfAdminStatusDefined();

    void setEthIntfOperStatus(int ethIntfOperStatus);

    int getEthIntfOperStatus();

    void setEthIntfOperStatQlfr(String ethIntfOperStatQlfr);

    String getEthIntfOperStatQlfr();

    void setEthIntfAutoEnableTimer(String ethIntfAutoEnableTimer);

    String getEthIntfAutoEnableTimer();

    boolean isEthIntfAutoEnableTimerDefined();

    void setEthIntfActAutoEnableTimer(String ethIntfActAutoEnableTimer);

    String getEthIntfActAutoEnableTimer();

    void setEthIntfWavelength(int ethIntfWavelength);

    int getEthIntfWavelength();

    void setEthIntfVendorPN1(String ethIntfVendorPN1);

    String getEthIntfVendorPN1();

    boolean isEthIntfVendorPN1Defined();

    void setEthIntfVendorPN2(String ethIntfVendorPN2);

    String getEthIntfVendorPN2();

    boolean isEthIntfVendorPN2Defined();

    void setEthIntfVendorPN3(String ethIntfVendorPN3);

    String getEthIntfVendorPN3();

    boolean isEthIntfVendorPN3Defined();

    void setEthIntfPhyPMMon(int ethIntfPhyPMMon);

    int getEthIntfPhyPMMon();

    boolean isEthIntfPhyPMMonDefined();

    void setEthIntfFPSD(int ethIntfFPSD);

    int getEthIntfFPSD();

    boolean isEthIntfFPSDDefined();

    void setEthIntfLaserStatus(int ethIntfLaserStatus);

    int getEthIntfLaserStatus();

    void setEthIntfId1(String ethIntfId1);

    String getEthIntfId1();

    boolean isEthIntfId1Defined();

    void setEthIntfFiberType(int ethIntfFiberType);

    int getEthIntfFiberType();

    boolean isEthIntfFiberTypeDefined();

    void setEthIntfCustom1(String ethIntfCustom1);

    String getEthIntfCustom1();

    boolean isEthIntfCustom1Defined();

    void setEthIntfSpeed(int ethIntfSpeed);

    int getEthIntfSpeed();

    void setEthIntfDuplex(int ethIntfDuplex);

    int getEthIntfDuplex();

    void setEthIntfMediaRate(int ethIntfMediaRate);

    int getEthIntfMediaRate();

    boolean isEthIntfMediaRateDefined();

    void setEthIntfMTU(int ethIntfMTU);

    int getEthIntfMTU();

    boolean isEthIntfMTUDefined();

    void setEthIntfLinkStatus(int ethIntfLinkStatus);

    int getEthIntfLinkStatus();

    void setEthIntfLagId(int ethIntfLagId);

    int getEthIntfLagId();

    void setEthIntfLagPortPriority(int ethIntfLagPortPriority);

    int getEthIntfLagPortPriority();

    void setEthIntfBER(int ethIntfBER);

    int getEthIntfBER();

    boolean isEthIntfBERDefined();

    void setEthIntfMACAddr(String ethIntfMACAddr);

    String getEthIntfMACAddr();

    void setEthIntfLineMapping(int ethIntfLineMapping);

    int getEthIntfLineMapping();

    boolean isEthIntfLineMappingDefined();

    void setEthIntfErrorCorrection(int ethIntfErrorCorrection);

    int getEthIntfErrorCorrection();

    boolean isEthIntfErrorCorrectionDefined();

    void setEthIntfLpbkOpCmd(int ethIntfLpbkOpCmd);

    int getEthIntfLpbkOpCmd();

    void setEthIntfRemoteId(String ethIntfRemoteId);

    String getEthIntfRemoteId();

    boolean isEthIntfRemoteIdDefined();

    void setEthIntfMirrorConfig(int ethIntfMirrorConfig);

    int getEthIntfMirrorConfig();

    boolean isEthIntfMirrorConfigDefined();

    void setEthIntfLldpAdminStatus(int ethIntfLldpAdminStatus);

    int getEthIntfLldpAdminStatus();

    boolean isEthIntfLldpAdminStatusDefined();

    void setEthIntfLldpRemChassisIdSubtype(int ethIntfLldpRemChassisIdSubtype);

    int getEthIntfLldpRemChassisIdSubtype();

    void setEthIntfLldpRemChassisId(String ethIntfLldpRemChassisId);

    String getEthIntfLldpRemChassisId();

    void setEthIntfLldpRemPortIdSubtype(int ethIntfLldpRemPortIdSubtype);

    int getEthIntfLldpRemPortIdSubtype();

    void setEthIntfLldpRemPortId(String ethIntfLldpRemPortId);

    String getEthIntfLldpRemPortId();

    void setEthIntfBouncingStateChangeCount(int ethIntfBouncingStateChangeCount);

    int getEthIntfBouncingStateChangeCount();

    void setEthIntfLaserControl(int ethIntfLaserControl);

    int getEthIntfLaserControl();

    void setEthIntfRowStatus(int ethIntfRowStatus);

    int getEthIntfRowStatus();

    IEthIntfEntry clone();

}
