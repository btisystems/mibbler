
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.ocntable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOcnEntry
    extends IDeviceEntity
{


    void setOcnTypeIdx(int ocnTypeIdx);

    int getOcnTypeIdx();

    void setOcnShelfIdx(int ocnShelfIdx);

    int getOcnShelfIdx();

    void setOcnSlotIdx(int ocnSlotIdx);

    int getOcnSlotIdx();

    void setOcnPortIdx(int ocnPortIdx);

    int getOcnPortIdx();

    void setOcnOpticalPwrReceivedMinTh(int ocnOpticalPwrReceivedMinTh);

    int getOcnOpticalPwrReceivedMinTh();

    void setOcnOpticalPwrReceivedMaxTh(int ocnOpticalPwrReceivedMaxTh);

    int getOcnOpticalPwrReceivedMaxTh();

    void setOcnOpticalPwrTransmittedMinTh(int ocnOpticalPwrTransmittedMinTh);

    int getOcnOpticalPwrTransmittedMinTh();

    void setOcnOpticalPwrTransmittedMaxTh(int ocnOpticalPwrTransmittedMaxTh);

    int getOcnOpticalPwrTransmittedMaxTh();

    void setOcnOpticalPwrReceived(int ocnOpticalPwrReceived);

    int getOcnOpticalPwrReceived();

    void setOcnOpticalPwrTransmitted(int ocnOpticalPwrTransmitted);

    int getOcnOpticalPwrTransmitted();

    void setOcnBER(int ocnBER);

    int getOcnBER();

    void setOcnBERTh(int ocnBERTh);

    int getOcnBERTh();

    boolean isOcnBERThDefined();

    void setOcnPEC(String ocnPEC);

    String getOcnPEC();

    boolean isOcnPECDefined();

    void setOcnAdminStatus(int ocnAdminStatus);

    int getOcnAdminStatus();

    boolean isOcnAdminStatusDefined();

    void setOcnOperStatus(int ocnOperStatus);

    int getOcnOperStatus();

    void setOcnOperStatQlfr(String ocnOperStatQlfr);

    String getOcnOperStatQlfr();

    void setOcnAutoEnableTimer(String ocnAutoEnableTimer);

    String getOcnAutoEnableTimer();

    boolean isOcnAutoEnableTimerDefined();

    void setOcnActAutoEnableTimer(String ocnActAutoEnableTimer);

    String getOcnActAutoEnableTimer();

    void setOcnWavelength(int ocnWavelength);

    int getOcnWavelength();

    void setOcnVendorPN1(String ocnVendorPN1);

    String getOcnVendorPN1();

    boolean isOcnVendorPN1Defined();

    void setOcnVendorPN2(String ocnVendorPN2);

    String getOcnVendorPN2();

    boolean isOcnVendorPN2Defined();

    void setOcnVendorPN3(String ocnVendorPN3);

    String getOcnVendorPN3();

    boolean isOcnVendorPN3Defined();

    void setOcnPhyPMMon(int ocnPhyPMMon);

    int getOcnPhyPMMon();

    boolean isOcnPhyPMMonDefined();

    void setOcnLaserStatus(int ocnLaserStatus);

    int getOcnLaserStatus();

    void setOcnId1(String ocnId1);

    String getOcnId1();

    boolean isOcnId1Defined();

    void setOcnFiberType(int ocnFiberType);

    int getOcnFiberType();

    boolean isOcnFiberTypeDefined();

    void setOcnCustom1(String ocnCustom1);

    String getOcnCustom1();

    boolean isOcnCustom1Defined();

    void setOcnTOHTransparency(int ocnTOHTransparency);

    int getOcnTOHTransparency();

    boolean isOcnTOHTransparencyDefined();

    void setOcnLineMapping(int ocnLineMapping);

    int getOcnLineMapping();

    boolean isOcnLineMappingDefined();

    void setOcnProtSwEvtType(int ocnProtSwEvtType);

    int getOcnProtSwEvtType();

    void setOcnDCCTransparency(int ocnDCCTransparency);

    int getOcnDCCTransparency();

    boolean isOcnDCCTransparencyDefined();

    void setOcnTransparencyChannel(int ocnTransparencyChannel);

    int getOcnTransparencyChannel();

    boolean isOcnTransparencyChannelDefined();

    void setOcnRemoteId(String ocnRemoteId);

    String getOcnRemoteId();

    boolean isOcnRemoteIdDefined();

    void setOcnLaserControl(int ocnLaserControl);

    int getOcnLaserControl();

    void setOcnRowStatus(int ocnRowStatus);

    int getOcnRowStatus();

    IOcnEntry clone();

}
