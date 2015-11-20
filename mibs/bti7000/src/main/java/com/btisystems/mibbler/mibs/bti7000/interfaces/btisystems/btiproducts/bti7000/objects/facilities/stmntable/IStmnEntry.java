
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.stmntable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IStmnEntry
    extends IDeviceEntity
{


    void setStmnTypeIdx(int stmnTypeIdx);

    int getStmnTypeIdx();

    void setStmnShelfIdx(int stmnShelfIdx);

    int getStmnShelfIdx();

    void setStmnSlotIdx(int stmnSlotIdx);

    int getStmnSlotIdx();

    void setStmnPortIdx(int stmnPortIdx);

    int getStmnPortIdx();

    void setStmnOpticalPwrReceivedMinTh(int stmnOpticalPwrReceivedMinTh);

    int getStmnOpticalPwrReceivedMinTh();

    void setStmnOpticalPwrReceivedMaxTh(int stmnOpticalPwrReceivedMaxTh);

    int getStmnOpticalPwrReceivedMaxTh();

    void setStmnOpticalPwrTransmittedMinTh(int stmnOpticalPwrTransmittedMinTh);

    int getStmnOpticalPwrTransmittedMinTh();

    void setStmnOpticalPwrTransmittedMaxTh(int stmnOpticalPwrTransmittedMaxTh);

    int getStmnOpticalPwrTransmittedMaxTh();

    void setStmnOpticalPwrReceived(int stmnOpticalPwrReceived);

    int getStmnOpticalPwrReceived();

    void setStmnOpticalPwrTransmitted(int stmnOpticalPwrTransmitted);

    int getStmnOpticalPwrTransmitted();

    void setStmnBER(int stmnBER);

    int getStmnBER();

    void setStmnBERTh(int stmnBERTh);

    int getStmnBERTh();

    boolean isStmnBERThDefined();

    void setStmnPEC(String stmnPEC);

    String getStmnPEC();

    boolean isStmnPECDefined();

    void setStmnAdminStatus(int stmnAdminStatus);

    int getStmnAdminStatus();

    boolean isStmnAdminStatusDefined();

    void setStmnOperStatus(int stmnOperStatus);

    int getStmnOperStatus();

    void setStmnOperStatQlfr(String stmnOperStatQlfr);

    String getStmnOperStatQlfr();

    void setStmnAutoEnableTimer(String stmnAutoEnableTimer);

    String getStmnAutoEnableTimer();

    boolean isStmnAutoEnableTimerDefined();

    void setStmnActAutoEnableTimer(String stmnActAutoEnableTimer);

    String getStmnActAutoEnableTimer();

    void setStmnWavelength(int stmnWavelength);

    int getStmnWavelength();

    void setStmnVendorPN1(String stmnVendorPN1);

    String getStmnVendorPN1();

    boolean isStmnVendorPN1Defined();

    void setStmnVendorPN2(String stmnVendorPN2);

    String getStmnVendorPN2();

    boolean isStmnVendorPN2Defined();

    void setStmnVendorPN3(String stmnVendorPN3);

    String getStmnVendorPN3();

    boolean isStmnVendorPN3Defined();

    void setStmnPhyPMMon(int stmnPhyPMMon);

    int getStmnPhyPMMon();

    boolean isStmnPhyPMMonDefined();

    void setStmnLaserStatus(int stmnLaserStatus);

    int getStmnLaserStatus();

    void setStmnId1(String stmnId1);

    String getStmnId1();

    boolean isStmnId1Defined();

    void setStmnFiberType(int stmnFiberType);

    int getStmnFiberType();

    boolean isStmnFiberTypeDefined();

    void setStmnCustom1(String stmnCustom1);

    String getStmnCustom1();

    boolean isStmnCustom1Defined();

    void setStmnTOHTransparency(int stmnTOHTransparency);

    int getStmnTOHTransparency();

    boolean isStmnTOHTransparencyDefined();

    void setStmnLineMapping(int stmnLineMapping);

    int getStmnLineMapping();

    boolean isStmnLineMappingDefined();

    void setStmnProtSwEvtType(int stmnProtSwEvtType);

    int getStmnProtSwEvtType();

    void setStmnDCCTransparency(int stmnDCCTransparency);

    int getStmnDCCTransparency();

    boolean isStmnDCCTransparencyDefined();

    void setStmnTransparencyChannel(int stmnTransparencyChannel);

    int getStmnTransparencyChannel();

    boolean isStmnTransparencyChannelDefined();

    void setStmnRemoteId(String stmnRemoteId);

    String getStmnRemoteId();

    boolean isStmnRemoteIdDefined();

    void setStmnLaserControl(int stmnLaserControl);

    int getStmnLaserControl();

    void setStmnRowStatus(int stmnRowStatus);

    int getStmnRowStatus();

    IStmnEntry clone();

}
