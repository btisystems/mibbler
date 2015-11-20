
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.oatable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOaEntry
    extends IDeviceEntity
{


    void setOaTypeIdx(int oaTypeIdx);

    int getOaTypeIdx();

    void setOaShelfIdx(int oaShelfIdx);

    int getOaShelfIdx();

    void setOaSlotIdx(int oaSlotIdx);

    int getOaSlotIdx();

    void setOaIdx(int oaIdx);

    int getOaIdx();

    void setOaCaseTempMaxTh(int oaCaseTempMaxTh);

    int getOaCaseTempMaxTh();

    boolean isOaCaseTempMaxThDefined();

    void setOaCaseTempMaxShutdownTh(int oaCaseTempMaxShutdownTh);

    int getOaCaseTempMaxShutdownTh();

    void setOaLaserTempMinShutdownTh(int oaLaserTempMinShutdownTh);

    int getOaLaserTempMinShutdownTh();

    void setOaLaserTempMaxShutdownTh(int oaLaserTempMaxShutdownTh);

    int getOaLaserTempMaxShutdownTh();

    void setOaOpticalPwrReceivedMinTh(int oaOpticalPwrReceivedMinTh);

    int getOaOpticalPwrReceivedMinTh();

    void setOaOpticalPwrReceivedMaxTh(int oaOpticalPwrReceivedMaxTh);

    int getOaOpticalPwrReceivedMaxTh();

    void setOaSSIOpticalPwrReceivedMaxTh(int oaSSIOpticalPwrReceivedMaxTh);

    int getOaSSIOpticalPwrReceivedMaxTh();

    void setOaOpticalPwrTransmittedMinTh(int oaOpticalPwrTransmittedMinTh);

    int getOaOpticalPwrTransmittedMinTh();

    void setOaOpticalPwrTransmittedMaxTh(int oaOpticalPwrTransmittedMaxTh);

    int getOaOpticalPwrTransmittedMaxTh();

    void setOaBackReflectionSafetyTh(int oaBackReflectionSafetyTh);

    int getOaBackReflectionSafetyTh();

    void setOaMSInsertionLossMaxTh(int oaMSInsertionLossMaxTh);

    int getOaMSInsertionLossMaxTh();

    void setOaCaseTemp(int oaCaseTemp);

    int getOaCaseTemp();

    void setOaLaser1Temp(int oaLaser1Temp);

    int getOaLaser1Temp();

    void setOaLaser2Temp(int oaLaser2Temp);

    int getOaLaser2Temp();

    void setOaOpticalPwrReceived(int oaOpticalPwrReceived);

    int getOaOpticalPwrReceived();

    void setOaSSIOpticalPwrReceived(int oaSSIOpticalPwrReceived);

    int getOaSSIOpticalPwrReceived();

    void setOaOpticalPwrTransmitted(int oaOpticalPwrTransmitted);

    int getOaOpticalPwrTransmitted();

    void setOaMSInsertionLoss(int oaMSInsertionLoss);

    int getOaMSInsertionLoss();

    void setOaEffectiveGain(int oaEffectiveGain);

    int getOaEffectiveGain();

    void setOaFSOOpticalPwrTransmitted(int oaFSOOpticalPwrTransmitted);

    int getOaFSOOpticalPwrTransmitted();

    void setOaLaser1Current(int oaLaser1Current);

    int getOaLaser1Current();

    void setOaLaser2Current(int oaLaser2Current);

    int getOaLaser2Current();

    void setOaLaser1Power(int oaLaser1Power);

    int getOaLaser1Power();

    void setOaLaser2Power(int oaLaser2Power);

    int getOaLaser2Power();

    void setOaOpticalBackReflection(int oaOpticalBackReflection);

    int getOaOpticalBackReflection();

    void setOaVariableOpticalAttenuation(int oaVariableOpticalAttenuation);

    int getOaVariableOpticalAttenuation();

    void setOaAdminStatus(int oaAdminStatus);

    int getOaAdminStatus();

    boolean isOaAdminStatusDefined();

    void setOaOperStatus(int oaOperStatus);

    int getOaOperStatus();

    void setOaOperStatQlfr(String oaOperStatQlfr);

    String getOaOperStatQlfr();

    void setOaAutoEnableTimer(String oaAutoEnableTimer);

    String getOaAutoEnableTimer();

    boolean isOaAutoEnableTimerDefined();

    void setOaActAutoEnableTimer(String oaActAutoEnableTimer);

    String getOaActAutoEnableTimer();

    void setOaModeSetting(int oaModeSetting);

    int getOaModeSetting();

    boolean isOaModeSettingDefined();

    void setOaGainSetting(int oaGainSetting);

    int getOaGainSetting();

    void setOaPwrSetting(int oaPwrSetting);

    int getOaPwrSetting();

    void setOaTiltCompSetting(int oaTiltCompSetting);

    int getOaTiltCompSetting();

    boolean isOaTiltCompSettingDefined();

    void setOaStatus(int oaStatus);

    int getOaStatus();

    void setOaLaserStatus(int oaLaserStatus);

    int getOaLaserStatus();

    void setOaId1(String oaId1);

    String getOaId1();

    boolean isOaId1Defined();

    void setOaId2(String oaId2);

    String getOaId2();

    boolean isOaId2Defined();

    void setOaFiberType(int oaFiberType);

    int getOaFiberType();

    boolean isOaFiberTypeDefined();

    void setOaGrid(int oaGrid);

    int getOaGrid();

    boolean isOaGridDefined();

    void setOaNumChannels(int oaNumChannels);

    int getOaNumChannels();

    boolean isOaNumChannelsDefined();

    void setOaCustom1(String oaCustom1);

    String getOaCustom1();

    boolean isOaCustom1Defined();

    void setOaCustom2(String oaCustom2);

    String getOaCustom2();

    boolean isOaCustom2Defined();

    void setOaCustom3(String oaCustom3);

    String getOaCustom3();

    boolean isOaCustom3Defined();

    void setOaWavelength(int oaWavelength);

    int getOaWavelength();

    void setOaRemoteId(String oaRemoteId);

    String getOaRemoteId();

    boolean isOaRemoteIdDefined();

    void setOaSSIOpticalPwrReceivedMinTh(int oaSSIOpticalPwrReceivedMinTh);

    int getOaSSIOpticalPwrReceivedMinTh();

    void setOaFSOOpticalPwrTransmittedMaxTh(int oaFSOOpticalPwrTransmittedMaxTh);

    int getOaFSOOpticalPwrTransmittedMaxTh();

    void setOaFSOOpticalPwrTransmittedMinTh(int oaFSOOpticalPwrTransmittedMinTh);

    int getOaFSOOpticalPwrTransmittedMinTh();

    void setOaTiltMarginMax(int oaTiltMarginMax);

    int getOaTiltMarginMax();

    void setOaTiltMarginMin(int oaTiltMarginMin);

    int getOaTiltMarginMin();

    void setOaGainMarginMax(int oaGainMarginMax);

    int getOaGainMarginMax();

    void setOaGainMarginMin(int oaGainMarginMin);

    int getOaGainMarginMin();

    void setOaMonitorPortLoss(int oaMonitorPortLoss);

    int getOaMonitorPortLoss();

    void setOaOpticalPwrReceivedMin(int oaOpticalPwrReceivedMin);

    int getOaOpticalPwrReceivedMin();

    void setOaOpticalPwrReceivedMax(int oaOpticalPwrReceivedMax);

    int getOaOpticalPwrReceivedMax();

    void setOaOpticalPwrReceivedAvg(int oaOpticalPwrReceivedAvg);

    int getOaOpticalPwrReceivedAvg();

    void setOaOpticalPwrTransmittedMin(int oaOpticalPwrTransmittedMin);

    int getOaOpticalPwrTransmittedMin();

    void setOaOpticalPwrTransmittedMax(int oaOpticalPwrTransmittedMax);

    int getOaOpticalPwrTransmittedMax();

    void setOaOpticalPwrTransmittedAvg(int oaOpticalPwrTransmittedAvg);

    int getOaOpticalPwrTransmittedAvg();

    void setOaTiltAchieved(int oaTiltAchieved);

    int getOaTiltAchieved();

    void setOaRowStatus(int oaRowStatus);

    int getOaRowStatus();

    IOaEntry clone();

}
