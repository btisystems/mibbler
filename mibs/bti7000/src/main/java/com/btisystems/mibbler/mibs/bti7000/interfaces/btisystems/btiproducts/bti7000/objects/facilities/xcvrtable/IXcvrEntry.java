
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.xcvrtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IXcvrEntry
    extends IDeviceEntity
{


    void setXcvrTypeIdx(int xcvrTypeIdx);

    int getXcvrTypeIdx();

    void setXcvrShelfIdx(int xcvrShelfIdx);

    int getXcvrShelfIdx();

    void setXcvrSlotIdx(int xcvrSlotIdx);

    int getXcvrSlotIdx();

    void setXcvrIdx(int xcvrIdx);

    int getXcvrIdx();

    void setXcvrOpticalPwrReceivedMinTh(int xcvrOpticalPwrReceivedMinTh);

    int getXcvrOpticalPwrReceivedMinTh();

    void setXcvrOpticalPwrReceivedMaxTh(int xcvrOpticalPwrReceivedMaxTh);

    int getXcvrOpticalPwrReceivedMaxTh();

    void setXcvrOpticalPwrTransmittedMinTh(int xcvrOpticalPwrTransmittedMinTh);

    int getXcvrOpticalPwrTransmittedMinTh();

    void setXcvrOpticalPwrTransmittedMaxTh(int xcvrOpticalPwrTransmittedMaxTh);

    int getXcvrOpticalPwrTransmittedMaxTh();

    void setXcvrOpticalPwrReceived(int xcvrOpticalPwrReceived);

    int getXcvrOpticalPwrReceived();

    void setXcvrOpticalPwrTransmitted(int xcvrOpticalPwrTransmitted);

    int getXcvrOpticalPwrTransmitted();

    void setXcvrProtSwEvtType(int xcvrProtSwEvtType);

    int getXcvrProtSwEvtType();

    void setXcvrPEC(String xcvrPEC);

    String getXcvrPEC();

    boolean isXcvrPECDefined();

    void setXcvrAdminStatus(int xcvrAdminStatus);

    int getXcvrAdminStatus();

    boolean isXcvrAdminStatusDefined();

    void setXcvrOperStatus(int xcvrOperStatus);

    int getXcvrOperStatus();

    void setXcvrOperStatQlfr(String xcvrOperStatQlfr);

    String getXcvrOperStatQlfr();

    void setXcvrAutoEnableTimer(String xcvrAutoEnableTimer);

    String getXcvrAutoEnableTimer();

    boolean isXcvrAutoEnableTimerDefined();

    void setXcvrActAutoEnableTimer(String xcvrActAutoEnableTimer);

    String getXcvrActAutoEnableTimer();

    void setXcvrProtocol(int xcvrProtocol);

    int getXcvrProtocol();

    void setXcvrWavelength(int xcvrWavelength);

    int getXcvrWavelength();

    void setXcvrVendorPN1(String xcvrVendorPN1);

    String getXcvrVendorPN1();

    boolean isXcvrVendorPN1Defined();

    void setXcvrVendorPN2(String xcvrVendorPN2);

    String getXcvrVendorPN2();

    boolean isXcvrVendorPN2Defined();

    void setXcvrVendorPN3(String xcvrVendorPN3);

    String getXcvrVendorPN3();

    boolean isXcvrVendorPN3Defined();

    void setXcvrPhyPMMon(int xcvrPhyPMMon);

    int getXcvrPhyPMMon();

    boolean isXcvrPhyPMMonDefined();

    void setXcvrFPSD(int xcvrFPSD);

    int getXcvrFPSD();

    boolean isXcvrFPSDDefined();

    void setXcvrLaserStatus(int xcvrLaserStatus);

    int getXcvrLaserStatus();

    void setXcvrId1(String xcvrId1);

    String getXcvrId1();

    boolean isXcvrId1Defined();

    void setXcvrId2(String xcvrId2);

    String getXcvrId2();

    boolean isXcvrId2Defined();

    void setXcvrFiberType(int xcvrFiberType);

    int getXcvrFiberType();

    boolean isXcvrFiberTypeDefined();

    void setXcvrGrid(int xcvrGrid);

    int getXcvrGrid();

    boolean isXcvrGridDefined();

    void setXcvrCustom1(String xcvrCustom1);

    String getXcvrCustom1();

    boolean isXcvrCustom1Defined();

    void setXcvrCustom2(String xcvrCustom2);

    String getXcvrCustom2();

    boolean isXcvrCustom2Defined();

    void setXcvrCustom3(String xcvrCustom3);

    String getXcvrCustom3();

    boolean isXcvrCustom3Defined();

    void setXcvrTraceLabel(String xcvrTraceLabel);

    String getXcvrTraceLabel();

    boolean isXcvrTraceLabelDefined();

    void setXcvrExpectedTraceLabel(String xcvrExpectedTraceLabel);

    String getXcvrExpectedTraceLabel();

    boolean isXcvrExpectedTraceLabelDefined();

    void setXcvrReceivedTraceLabel(String xcvrReceivedTraceLabel);

    String getXcvrReceivedTraceLabel();

    void setXcvrSDBERTh(int xcvrSDBERTh);

    int getXcvrSDBERTh();

    boolean isXcvrSDBERThDefined();

    void setXcvrLoopbackType(int xcvrLoopbackType);

    int getXcvrLoopbackType();

    boolean isXcvrLoopbackTypeDefined();

    void setXcvrRemoteId(String xcvrRemoteId);

    String getXcvrRemoteId();

    boolean isXcvrRemoteIdDefined();

    void setXcvrLaserControl(int xcvrLaserControl);

    int getXcvrLaserControl();

    void setXcvrRowStatus(int xcvrRowStatus);

    int getXcvrRowStatus();

    IXcvrEntry clone();

}
