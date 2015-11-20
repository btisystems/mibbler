
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.oatable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.OaTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.oatable.IOaEntry;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IIndexed;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class OaEntry
    extends DeviceEntity
    implements Serializable, IOaEntry, IIndexed, IVariableBindingSetter
{

    private int oaTypeIdx;
    private int oaShelfIdx;
    private int oaSlotIdx;
    private int oaIdx;
    private Integer oaCaseTempMaxTh;
    private int oaCaseTempMaxShutdownTh;
    private int oaLaserTempMinShutdownTh;
    private int oaLaserTempMaxShutdownTh;
    private int oaOpticalPwrReceivedMinTh;
    private int oaOpticalPwrReceivedMaxTh;
    private int oaSSIOpticalPwrReceivedMaxTh;
    private int oaOpticalPwrTransmittedMinTh;
    private int oaOpticalPwrTransmittedMaxTh;
    private int oaBackReflectionSafetyTh;
    private int oaMSInsertionLossMaxTh;
    private int oaCaseTemp;
    private int oaLaser1Temp;
    private int oaLaser2Temp;
    private int oaOpticalPwrReceived;
    private int oaSSIOpticalPwrReceived;
    private int oaOpticalPwrTransmitted;
    private int oaMSInsertionLoss;
    private int oaEffectiveGain;
    private int oaFSOOpticalPwrTransmitted;
    private int oaLaser1Current;
    private int oaLaser2Current;
    private int oaLaser1Power;
    private int oaLaser2Power;
    private int oaOpticalBackReflection;
    private int oaVariableOpticalAttenuation;
    private Integer oaAdminStatus;
    private int oaOperStatus;
    private String oaOperStatQlfr;
    private String oaAutoEnableTimer;
    private String oaActAutoEnableTimer;
    private Integer oaModeSetting;
    private int oaGainSetting;
    private int oaPwrSetting;
    private Integer oaTiltCompSetting;
    private int oaStatus;
    private int oaLaserStatus;
    private String oaId1;
    private String oaId2;
    private Integer oaFiberType;
    private Integer oaGrid;
    private Integer oaNumChannels;
    private String oaCustom1;
    private String oaCustom2;
    private String oaCustom3;
    private int oaWavelength;
    private String oaRemoteId;
    private int oaSSIOpticalPwrReceivedMinTh;
    private int oaFSOOpticalPwrTransmittedMaxTh;
    private int oaFSOOpticalPwrTransmittedMinTh;
    private int oaTiltMarginMax;
    private int oaTiltMarginMin;
    private int oaGainMarginMax;
    private int oaGainMarginMin;
    private int oaMonitorPortLoss;
    private int oaOpticalPwrReceivedMin;
    private int oaOpticalPwrReceivedMax;
    private int oaOpticalPwrReceivedAvg;
    private int oaOpticalPwrTransmittedMin;
    private int oaOpticalPwrTransmittedMax;
    private int oaOpticalPwrTransmittedAvg;
    private int oaTiltAchieved;
    private int oaRowStatus;
    private String _index;
    private OaTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OaEntry() {
    }

    public int getOaTypeIdx() {
        return this.oaTypeIdx;
    }

    public void setOaTypeIdx(int oaTypeIdx) {
        int oldValue = getOaTypeIdx();
        this.oaTypeIdx = oaTypeIdx;
        notifyChange(1, oldValue, oaTypeIdx);
    }

    public int getOaShelfIdx() {
        return this.oaShelfIdx;
    }

    public void setOaShelfIdx(int oaShelfIdx) {
        int oldValue = getOaShelfIdx();
        this.oaShelfIdx = oaShelfIdx;
        notifyChange(2, oldValue, oaShelfIdx);
    }

    public int getOaSlotIdx() {
        return this.oaSlotIdx;
    }

    public void setOaSlotIdx(int oaSlotIdx) {
        int oldValue = getOaSlotIdx();
        this.oaSlotIdx = oaSlotIdx;
        notifyChange(3, oldValue, oaSlotIdx);
    }

    public int getOaIdx() {
        return this.oaIdx;
    }

    public void setOaIdx(int oaIdx) {
        int oldValue = getOaIdx();
        this.oaIdx = oaIdx;
        notifyChange(4, oldValue, oaIdx);
    }

    public int getOaCaseTempMaxTh() {
        if (this.oaCaseTempMaxTh == null) {
            return  60;
        }
        return this.oaCaseTempMaxTh;
    }

    public boolean isOaCaseTempMaxThDefined() {
        return (this.oaCaseTempMaxTh!= null);
    }

    public void setOaCaseTempMaxTh(int oaCaseTempMaxTh) {
        int oldValue = getOaCaseTempMaxTh();
        this.oaCaseTempMaxTh = oaCaseTempMaxTh;
        notifyChange(5, oldValue, oaCaseTempMaxTh);
    }

    public int getOaCaseTempMaxShutdownTh() {
        return this.oaCaseTempMaxShutdownTh;
    }

    public void setOaCaseTempMaxShutdownTh(int oaCaseTempMaxShutdownTh) {
        int oldValue = getOaCaseTempMaxShutdownTh();
        this.oaCaseTempMaxShutdownTh = oaCaseTempMaxShutdownTh;
        notifyChange(6, oldValue, oaCaseTempMaxShutdownTh);
    }

    public int getOaLaserTempMinShutdownTh() {
        return this.oaLaserTempMinShutdownTh;
    }

    public void setOaLaserTempMinShutdownTh(int oaLaserTempMinShutdownTh) {
        int oldValue = getOaLaserTempMinShutdownTh();
        this.oaLaserTempMinShutdownTh = oaLaserTempMinShutdownTh;
        notifyChange(7, oldValue, oaLaserTempMinShutdownTh);
    }

    public int getOaLaserTempMaxShutdownTh() {
        return this.oaLaserTempMaxShutdownTh;
    }

    public void setOaLaserTempMaxShutdownTh(int oaLaserTempMaxShutdownTh) {
        int oldValue = getOaLaserTempMaxShutdownTh();
        this.oaLaserTempMaxShutdownTh = oaLaserTempMaxShutdownTh;
        notifyChange(8, oldValue, oaLaserTempMaxShutdownTh);
    }

    public int getOaOpticalPwrReceivedMinTh() {
        return this.oaOpticalPwrReceivedMinTh;
    }

    public void setOaOpticalPwrReceivedMinTh(int oaOpticalPwrReceivedMinTh) {
        int oldValue = getOaOpticalPwrReceivedMinTh();
        this.oaOpticalPwrReceivedMinTh = oaOpticalPwrReceivedMinTh;
        notifyChange(9, oldValue, oaOpticalPwrReceivedMinTh);
    }

    public int getOaOpticalPwrReceivedMaxTh() {
        return this.oaOpticalPwrReceivedMaxTh;
    }

    public void setOaOpticalPwrReceivedMaxTh(int oaOpticalPwrReceivedMaxTh) {
        int oldValue = getOaOpticalPwrReceivedMaxTh();
        this.oaOpticalPwrReceivedMaxTh = oaOpticalPwrReceivedMaxTh;
        notifyChange(10, oldValue, oaOpticalPwrReceivedMaxTh);
    }

    public int getOaSSIOpticalPwrReceivedMaxTh() {
        return this.oaSSIOpticalPwrReceivedMaxTh;
    }

    public void setOaSSIOpticalPwrReceivedMaxTh(int oaSSIOpticalPwrReceivedMaxTh) {
        int oldValue = getOaSSIOpticalPwrReceivedMaxTh();
        this.oaSSIOpticalPwrReceivedMaxTh = oaSSIOpticalPwrReceivedMaxTh;
        notifyChange(11, oldValue, oaSSIOpticalPwrReceivedMaxTh);
    }

    public int getOaOpticalPwrTransmittedMinTh() {
        return this.oaOpticalPwrTransmittedMinTh;
    }

    public void setOaOpticalPwrTransmittedMinTh(int oaOpticalPwrTransmittedMinTh) {
        int oldValue = getOaOpticalPwrTransmittedMinTh();
        this.oaOpticalPwrTransmittedMinTh = oaOpticalPwrTransmittedMinTh;
        notifyChange(12, oldValue, oaOpticalPwrTransmittedMinTh);
    }

    public int getOaOpticalPwrTransmittedMaxTh() {
        return this.oaOpticalPwrTransmittedMaxTh;
    }

    public void setOaOpticalPwrTransmittedMaxTh(int oaOpticalPwrTransmittedMaxTh) {
        int oldValue = getOaOpticalPwrTransmittedMaxTh();
        this.oaOpticalPwrTransmittedMaxTh = oaOpticalPwrTransmittedMaxTh;
        notifyChange(13, oldValue, oaOpticalPwrTransmittedMaxTh);
    }

    public int getOaBackReflectionSafetyTh() {
        return this.oaBackReflectionSafetyTh;
    }

    public void setOaBackReflectionSafetyTh(int oaBackReflectionSafetyTh) {
        int oldValue = getOaBackReflectionSafetyTh();
        this.oaBackReflectionSafetyTh = oaBackReflectionSafetyTh;
        notifyChange(14, oldValue, oaBackReflectionSafetyTh);
    }

    public int getOaMSInsertionLossMaxTh() {
        return this.oaMSInsertionLossMaxTh;
    }

    public void setOaMSInsertionLossMaxTh(int oaMSInsertionLossMaxTh) {
        int oldValue = getOaMSInsertionLossMaxTh();
        this.oaMSInsertionLossMaxTh = oaMSInsertionLossMaxTh;
        notifyChange(15, oldValue, oaMSInsertionLossMaxTh);
    }

    public int getOaCaseTemp() {
        return this.oaCaseTemp;
    }

    public void setOaCaseTemp(int oaCaseTemp) {
        int oldValue = getOaCaseTemp();
        this.oaCaseTemp = oaCaseTemp;
        notifyChange(16, oldValue, oaCaseTemp);
    }

    public int getOaLaser1Temp() {
        return this.oaLaser1Temp;
    }

    public void setOaLaser1Temp(int oaLaser1Temp) {
        int oldValue = getOaLaser1Temp();
        this.oaLaser1Temp = oaLaser1Temp;
        notifyChange(17, oldValue, oaLaser1Temp);
    }

    public int getOaLaser2Temp() {
        return this.oaLaser2Temp;
    }

    public void setOaLaser2Temp(int oaLaser2Temp) {
        int oldValue = getOaLaser2Temp();
        this.oaLaser2Temp = oaLaser2Temp;
        notifyChange(18, oldValue, oaLaser2Temp);
    }

    public int getOaOpticalPwrReceived() {
        return this.oaOpticalPwrReceived;
    }

    public void setOaOpticalPwrReceived(int oaOpticalPwrReceived) {
        int oldValue = getOaOpticalPwrReceived();
        this.oaOpticalPwrReceived = oaOpticalPwrReceived;
        notifyChange(19, oldValue, oaOpticalPwrReceived);
    }

    public int getOaSSIOpticalPwrReceived() {
        return this.oaSSIOpticalPwrReceived;
    }

    public void setOaSSIOpticalPwrReceived(int oaSSIOpticalPwrReceived) {
        int oldValue = getOaSSIOpticalPwrReceived();
        this.oaSSIOpticalPwrReceived = oaSSIOpticalPwrReceived;
        notifyChange(20, oldValue, oaSSIOpticalPwrReceived);
    }

    public int getOaOpticalPwrTransmitted() {
        return this.oaOpticalPwrTransmitted;
    }

    public void setOaOpticalPwrTransmitted(int oaOpticalPwrTransmitted) {
        int oldValue = getOaOpticalPwrTransmitted();
        this.oaOpticalPwrTransmitted = oaOpticalPwrTransmitted;
        notifyChange(21, oldValue, oaOpticalPwrTransmitted);
    }

    public int getOaMSInsertionLoss() {
        return this.oaMSInsertionLoss;
    }

    public void setOaMSInsertionLoss(int oaMSInsertionLoss) {
        int oldValue = getOaMSInsertionLoss();
        this.oaMSInsertionLoss = oaMSInsertionLoss;
        notifyChange(22, oldValue, oaMSInsertionLoss);
    }

    public int getOaEffectiveGain() {
        return this.oaEffectiveGain;
    }

    public void setOaEffectiveGain(int oaEffectiveGain) {
        int oldValue = getOaEffectiveGain();
        this.oaEffectiveGain = oaEffectiveGain;
        notifyChange(33, oldValue, oaEffectiveGain);
    }

    public int getOaFSOOpticalPwrTransmitted() {
        return this.oaFSOOpticalPwrTransmitted;
    }

    public void setOaFSOOpticalPwrTransmitted(int oaFSOOpticalPwrTransmitted) {
        int oldValue = getOaFSOOpticalPwrTransmitted();
        this.oaFSOOpticalPwrTransmitted = oaFSOOpticalPwrTransmitted;
        notifyChange(34, oldValue, oaFSOOpticalPwrTransmitted);
    }

    public int getOaLaser1Current() {
        return this.oaLaser1Current;
    }

    public void setOaLaser1Current(int oaLaser1Current) {
        int oldValue = getOaLaser1Current();
        this.oaLaser1Current = oaLaser1Current;
        notifyChange(35, oldValue, oaLaser1Current);
    }

    public int getOaLaser2Current() {
        return this.oaLaser2Current;
    }

    public void setOaLaser2Current(int oaLaser2Current) {
        int oldValue = getOaLaser2Current();
        this.oaLaser2Current = oaLaser2Current;
        notifyChange(36, oldValue, oaLaser2Current);
    }

    public int getOaLaser1Power() {
        return this.oaLaser1Power;
    }

    public void setOaLaser1Power(int oaLaser1Power) {
        int oldValue = getOaLaser1Power();
        this.oaLaser1Power = oaLaser1Power;
        notifyChange(37, oldValue, oaLaser1Power);
    }

    public int getOaLaser2Power() {
        return this.oaLaser2Power;
    }

    public void setOaLaser2Power(int oaLaser2Power) {
        int oldValue = getOaLaser2Power();
        this.oaLaser2Power = oaLaser2Power;
        notifyChange(38, oldValue, oaLaser2Power);
    }

    public int getOaOpticalBackReflection() {
        return this.oaOpticalBackReflection;
    }

    public void setOaOpticalBackReflection(int oaOpticalBackReflection) {
        int oldValue = getOaOpticalBackReflection();
        this.oaOpticalBackReflection = oaOpticalBackReflection;
        notifyChange(39, oldValue, oaOpticalBackReflection);
    }

    public int getOaVariableOpticalAttenuation() {
        return this.oaVariableOpticalAttenuation;
    }

    public void setOaVariableOpticalAttenuation(int oaVariableOpticalAttenuation) {
        int oldValue = getOaVariableOpticalAttenuation();
        this.oaVariableOpticalAttenuation = oaVariableOpticalAttenuation;
        notifyChange(40, oldValue, oaVariableOpticalAttenuation);
    }

    public int getOaAdminStatus() {
        if (this.oaAdminStatus == null) {
            return  1;
        }
        return this.oaAdminStatus;
    }

    public boolean isOaAdminStatusDefined() {
        return (this.oaAdminStatus!= null);
    }

    public void setOaAdminStatus(int oaAdminStatus) {
        int oldValue = getOaAdminStatus();
        this.oaAdminStatus = oaAdminStatus;
        notifyChange(41, oldValue, oaAdminStatus);
    }

    public int getOaOperStatus() {
        return this.oaOperStatus;
    }

    public void setOaOperStatus(int oaOperStatus) {
        int oldValue = getOaOperStatus();
        this.oaOperStatus = oaOperStatus;
        notifyChange(42, oldValue, oaOperStatus);
    }

    public String getOaOperStatQlfr() {
        return this.oaOperStatQlfr;
    }

    public void setOaOperStatQlfr(String oaOperStatQlfr) {
        String oldValue = getOaOperStatQlfr();
        this.oaOperStatQlfr = oaOperStatQlfr;
        notifyChange(43, oldValue, oaOperStatQlfr);
    }

    public String getOaAutoEnableTimer() {
        if (this.oaAutoEnableTimer == null) {
            return "008-00";
        }
        return this.oaAutoEnableTimer;
    }

    public boolean isOaAutoEnableTimerDefined() {
        return (this.oaAutoEnableTimer!= null);
    }

    public void setOaAutoEnableTimer(String oaAutoEnableTimer) {
        String oldValue = getOaAutoEnableTimer();
        this.oaAutoEnableTimer = oaAutoEnableTimer;
        notifyChange(44, oldValue, oaAutoEnableTimer);
    }

    public String getOaActAutoEnableTimer() {
        return this.oaActAutoEnableTimer;
    }

    public void setOaActAutoEnableTimer(String oaActAutoEnableTimer) {
        String oldValue = getOaActAutoEnableTimer();
        this.oaActAutoEnableTimer = oaActAutoEnableTimer;
        notifyChange(45, oldValue, oaActAutoEnableTimer);
    }

    public int getOaModeSetting() {
        if (this.oaModeSetting == null) {
            return  2;
        }
        return this.oaModeSetting;
    }

    public boolean isOaModeSettingDefined() {
        return (this.oaModeSetting!= null);
    }

    public void setOaModeSetting(int oaModeSetting) {
        int oldValue = getOaModeSetting();
        this.oaModeSetting = oaModeSetting;
        notifyChange(46, oldValue, oaModeSetting);
    }

    public int getOaGainSetting() {
        return this.oaGainSetting;
    }

    public void setOaGainSetting(int oaGainSetting) {
        int oldValue = getOaGainSetting();
        this.oaGainSetting = oaGainSetting;
        notifyChange(47, oldValue, oaGainSetting);
    }

    public int getOaPwrSetting() {
        return this.oaPwrSetting;
    }

    public void setOaPwrSetting(int oaPwrSetting) {
        int oldValue = getOaPwrSetting();
        this.oaPwrSetting = oaPwrSetting;
        notifyChange(48, oldValue, oaPwrSetting);
    }

    public int getOaTiltCompSetting() {
        if (this.oaTiltCompSetting == null) {
            return  0;
        }
        return this.oaTiltCompSetting;
    }

    public boolean isOaTiltCompSettingDefined() {
        return (this.oaTiltCompSetting!= null);
    }

    public void setOaTiltCompSetting(int oaTiltCompSetting) {
        int oldValue = getOaTiltCompSetting();
        this.oaTiltCompSetting = oaTiltCompSetting;
        notifyChange(49, oldValue, oaTiltCompSetting);
    }

    public int getOaStatus() {
        return this.oaStatus;
    }

    public void setOaStatus(int oaStatus) {
        int oldValue = getOaStatus();
        this.oaStatus = oaStatus;
        notifyChange(50, oldValue, oaStatus);
    }

    public int getOaLaserStatus() {
        return this.oaLaserStatus;
    }

    public void setOaLaserStatus(int oaLaserStatus) {
        int oldValue = getOaLaserStatus();
        this.oaLaserStatus = oaLaserStatus;
        notifyChange(51, oldValue, oaLaserStatus);
    }

    public String getOaId1() {
        if (this.oaId1 == null) {
            return "";
        }
        return this.oaId1;
    }

    public boolean isOaId1Defined() {
        return (this.oaId1 != null);
    }

    public void setOaId1(String oaId1) {
        String oldValue = getOaId1();
        this.oaId1 = oaId1;
        notifyChange(52, oldValue, oaId1);
    }

    public String getOaId2() {
        if (this.oaId2 == null) {
            return "";
        }
        return this.oaId2;
    }

    public boolean isOaId2Defined() {
        return (this.oaId2 != null);
    }

    public void setOaId2(String oaId2) {
        String oldValue = getOaId2();
        this.oaId2 = oaId2;
        notifyChange(53, oldValue, oaId2);
    }

    public int getOaFiberType() {
        if (this.oaFiberType == null) {
            return  1;
        }
        return this.oaFiberType;
    }

    public boolean isOaFiberTypeDefined() {
        return (this.oaFiberType!= null);
    }

    public void setOaFiberType(int oaFiberType) {
        int oldValue = getOaFiberType();
        this.oaFiberType = oaFiberType;
        notifyChange(54, oldValue, oaFiberType);
    }

    public int getOaGrid() {
        if (this.oaGrid == null) {
            return  1;
        }
        return this.oaGrid;
    }

    public boolean isOaGridDefined() {
        return (this.oaGrid!= null);
    }

    public void setOaGrid(int oaGrid) {
        int oldValue = getOaGrid();
        this.oaGrid = oaGrid;
        notifyChange(55, oldValue, oaGrid);
    }

    public int getOaNumChannels() {
        if (this.oaNumChannels == null) {
            return  0;
        }
        return this.oaNumChannels;
    }

    public boolean isOaNumChannelsDefined() {
        return (this.oaNumChannels!= null);
    }

    public void setOaNumChannels(int oaNumChannels) {
        int oldValue = getOaNumChannels();
        this.oaNumChannels = oaNumChannels;
        notifyChange(56, oldValue, oaNumChannels);
    }

    public String getOaCustom1() {
        if (this.oaCustom1 == null) {
            return "";
        }
        return this.oaCustom1;
    }

    public boolean isOaCustom1Defined() {
        return (this.oaCustom1 != null);
    }

    public void setOaCustom1(String oaCustom1) {
        String oldValue = getOaCustom1();
        this.oaCustom1 = oaCustom1;
        notifyChange(57, oldValue, oaCustom1);
    }

    public String getOaCustom2() {
        if (this.oaCustom2 == null) {
            return "";
        }
        return this.oaCustom2;
    }

    public boolean isOaCustom2Defined() {
        return (this.oaCustom2 != null);
    }

    public void setOaCustom2(String oaCustom2) {
        String oldValue = getOaCustom2();
        this.oaCustom2 = oaCustom2;
        notifyChange(58, oldValue, oaCustom2);
    }

    public String getOaCustom3() {
        if (this.oaCustom3 == null) {
            return "";
        }
        return this.oaCustom3;
    }

    public boolean isOaCustom3Defined() {
        return (this.oaCustom3 != null);
    }

    public void setOaCustom3(String oaCustom3) {
        String oldValue = getOaCustom3();
        this.oaCustom3 = oaCustom3;
        notifyChange(59, oldValue, oaCustom3);
    }

    public int getOaWavelength() {
        return this.oaWavelength;
    }

    public void setOaWavelength(int oaWavelength) {
        int oldValue = getOaWavelength();
        this.oaWavelength = oaWavelength;
        notifyChange(60, oldValue, oaWavelength);
    }

    public String getOaRemoteId() {
        if (this.oaRemoteId == null) {
            return "";
        }
        return this.oaRemoteId;
    }

    public boolean isOaRemoteIdDefined() {
        return (this.oaRemoteId!= null);
    }

    public void setOaRemoteId(String oaRemoteId) {
        String oldValue = getOaRemoteId();
        this.oaRemoteId = oaRemoteId;
        notifyChange(61, oldValue, oaRemoteId);
    }

    public int getOaSSIOpticalPwrReceivedMinTh() {
        return this.oaSSIOpticalPwrReceivedMinTh;
    }

    public void setOaSSIOpticalPwrReceivedMinTh(int oaSSIOpticalPwrReceivedMinTh) {
        int oldValue = getOaSSIOpticalPwrReceivedMinTh();
        this.oaSSIOpticalPwrReceivedMinTh = oaSSIOpticalPwrReceivedMinTh;
        notifyChange(62, oldValue, oaSSIOpticalPwrReceivedMinTh);
    }

    public int getOaFSOOpticalPwrTransmittedMaxTh() {
        return this.oaFSOOpticalPwrTransmittedMaxTh;
    }

    public void setOaFSOOpticalPwrTransmittedMaxTh(int oaFSOOpticalPwrTransmittedMaxTh) {
        int oldValue = getOaFSOOpticalPwrTransmittedMaxTh();
        this.oaFSOOpticalPwrTransmittedMaxTh = oaFSOOpticalPwrTransmittedMaxTh;
        notifyChange(63, oldValue, oaFSOOpticalPwrTransmittedMaxTh);
    }

    public int getOaFSOOpticalPwrTransmittedMinTh() {
        return this.oaFSOOpticalPwrTransmittedMinTh;
    }

    public void setOaFSOOpticalPwrTransmittedMinTh(int oaFSOOpticalPwrTransmittedMinTh) {
        int oldValue = getOaFSOOpticalPwrTransmittedMinTh();
        this.oaFSOOpticalPwrTransmittedMinTh = oaFSOOpticalPwrTransmittedMinTh;
        notifyChange(64, oldValue, oaFSOOpticalPwrTransmittedMinTh);
    }

    public int getOaTiltMarginMax() {
        return this.oaTiltMarginMax;
    }

    public void setOaTiltMarginMax(int oaTiltMarginMax) {
        int oldValue = getOaTiltMarginMax();
        this.oaTiltMarginMax = oaTiltMarginMax;
        notifyChange(65, oldValue, oaTiltMarginMax);
    }

    public int getOaTiltMarginMin() {
        return this.oaTiltMarginMin;
    }

    public void setOaTiltMarginMin(int oaTiltMarginMin) {
        int oldValue = getOaTiltMarginMin();
        this.oaTiltMarginMin = oaTiltMarginMin;
        notifyChange(66, oldValue, oaTiltMarginMin);
    }

    public int getOaGainMarginMax() {
        return this.oaGainMarginMax;
    }

    public void setOaGainMarginMax(int oaGainMarginMax) {
        int oldValue = getOaGainMarginMax();
        this.oaGainMarginMax = oaGainMarginMax;
        notifyChange(67, oldValue, oaGainMarginMax);
    }

    public int getOaGainMarginMin() {
        return this.oaGainMarginMin;
    }

    public void setOaGainMarginMin(int oaGainMarginMin) {
        int oldValue = getOaGainMarginMin();
        this.oaGainMarginMin = oaGainMarginMin;
        notifyChange(68, oldValue, oaGainMarginMin);
    }

    public int getOaMonitorPortLoss() {
        return this.oaMonitorPortLoss;
    }

    public void setOaMonitorPortLoss(int oaMonitorPortLoss) {
        int oldValue = getOaMonitorPortLoss();
        this.oaMonitorPortLoss = oaMonitorPortLoss;
        notifyChange(69, oldValue, oaMonitorPortLoss);
    }

    public int getOaOpticalPwrReceivedMin() {
        return this.oaOpticalPwrReceivedMin;
    }

    public void setOaOpticalPwrReceivedMin(int oaOpticalPwrReceivedMin) {
        int oldValue = getOaOpticalPwrReceivedMin();
        this.oaOpticalPwrReceivedMin = oaOpticalPwrReceivedMin;
        notifyChange(70, oldValue, oaOpticalPwrReceivedMin);
    }

    public int getOaOpticalPwrReceivedMax() {
        return this.oaOpticalPwrReceivedMax;
    }

    public void setOaOpticalPwrReceivedMax(int oaOpticalPwrReceivedMax) {
        int oldValue = getOaOpticalPwrReceivedMax();
        this.oaOpticalPwrReceivedMax = oaOpticalPwrReceivedMax;
        notifyChange(71, oldValue, oaOpticalPwrReceivedMax);
    }

    public int getOaOpticalPwrReceivedAvg() {
        return this.oaOpticalPwrReceivedAvg;
    }

    public void setOaOpticalPwrReceivedAvg(int oaOpticalPwrReceivedAvg) {
        int oldValue = getOaOpticalPwrReceivedAvg();
        this.oaOpticalPwrReceivedAvg = oaOpticalPwrReceivedAvg;
        notifyChange(72, oldValue, oaOpticalPwrReceivedAvg);
    }

    public int getOaOpticalPwrTransmittedMin() {
        return this.oaOpticalPwrTransmittedMin;
    }

    public void setOaOpticalPwrTransmittedMin(int oaOpticalPwrTransmittedMin) {
        int oldValue = getOaOpticalPwrTransmittedMin();
        this.oaOpticalPwrTransmittedMin = oaOpticalPwrTransmittedMin;
        notifyChange(73, oldValue, oaOpticalPwrTransmittedMin);
    }

    public int getOaOpticalPwrTransmittedMax() {
        return this.oaOpticalPwrTransmittedMax;
    }

    public void setOaOpticalPwrTransmittedMax(int oaOpticalPwrTransmittedMax) {
        int oldValue = getOaOpticalPwrTransmittedMax();
        this.oaOpticalPwrTransmittedMax = oaOpticalPwrTransmittedMax;
        notifyChange(74, oldValue, oaOpticalPwrTransmittedMax);
    }

    public int getOaOpticalPwrTransmittedAvg() {
        return this.oaOpticalPwrTransmittedAvg;
    }

    public void setOaOpticalPwrTransmittedAvg(int oaOpticalPwrTransmittedAvg) {
        int oldValue = getOaOpticalPwrTransmittedAvg();
        this.oaOpticalPwrTransmittedAvg = oaOpticalPwrTransmittedAvg;
        notifyChange(75, oldValue, oaOpticalPwrTransmittedAvg);
    }

    public int getOaTiltAchieved() {
        return this.oaTiltAchieved;
    }

    public void setOaTiltAchieved(int oaTiltAchieved) {
        int oldValue = getOaTiltAchieved();
        this.oaTiltAchieved = oaTiltAchieved;
        notifyChange(76, oldValue, oaTiltAchieved);
    }

    public int getOaRowStatus() {
        return this.oaRowStatus;
    }

    public void setOaRowStatus(int oaRowStatus) {
        int oldValue = getOaRowStatus();
        this.oaRowStatus = oaRowStatus;
        notifyChange(100, oldValue, oaRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setOaTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setOaShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setOaSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setOaIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setOaCaseTempMaxTh(binding.getVariable().toInt());
                break;
            case  6 :
                setOaCaseTempMaxShutdownTh(binding.getVariable().toInt());
                break;
            case  7 :
                setOaLaserTempMinShutdownTh(binding.getVariable().toInt());
                break;
            case  8 :
                setOaLaserTempMaxShutdownTh(binding.getVariable().toInt());
                break;
            case  9 :
                setOaOpticalPwrReceivedMinTh(binding.getVariable().toInt());
                break;
            case  10 :
                setOaOpticalPwrReceivedMaxTh(binding.getVariable().toInt());
                break;
            case  11 :
                setOaSSIOpticalPwrReceivedMaxTh(binding.getVariable().toInt());
                break;
            case  12 :
                setOaOpticalPwrTransmittedMinTh(binding.getVariable().toInt());
                break;
            case  13 :
                setOaOpticalPwrTransmittedMaxTh(binding.getVariable().toInt());
                break;
            case  14 :
                setOaBackReflectionSafetyTh(binding.getVariable().toInt());
                break;
            case  15 :
                setOaMSInsertionLossMaxTh(binding.getVariable().toInt());
                break;
            case  16 :
                setOaCaseTemp(binding.getVariable().toInt());
                break;
            case  17 :
                setOaLaser1Temp(binding.getVariable().toInt());
                break;
            case  18 :
                setOaLaser2Temp(binding.getVariable().toInt());
                break;
            case  19 :
                setOaOpticalPwrReceived(binding.getVariable().toInt());
                break;
            case  20 :
                setOaSSIOpticalPwrReceived(binding.getVariable().toInt());
                break;
            case  21 :
                setOaOpticalPwrTransmitted(binding.getVariable().toInt());
                break;
            case  22 :
                setOaMSInsertionLoss(binding.getVariable().toInt());
                break;
            case  33 :
                setOaEffectiveGain(binding.getVariable().toInt());
                break;
            case  34 :
                setOaFSOOpticalPwrTransmitted(binding.getVariable().toInt());
                break;
            case  35 :
                setOaLaser1Current(binding.getVariable().toInt());
                break;
            case  36 :
                setOaLaser2Current(binding.getVariable().toInt());
                break;
            case  37 :
                setOaLaser1Power(binding.getVariable().toInt());
                break;
            case  38 :
                setOaLaser2Power(binding.getVariable().toInt());
                break;
            case  39 :
                setOaOpticalBackReflection(binding.getVariable().toInt());
                break;
            case  40 :
                setOaVariableOpticalAttenuation(binding.getVariable().toInt());
                break;
            case  41 :
                setOaAdminStatus(binding.getVariable().toInt());
                break;
            case  42 :
                setOaOperStatus(binding.getVariable().toInt());
                break;
            case  43 :
                setOaOperStatQlfr(binding.getVariable().toString());
                break;
            case  44 :
                setOaAutoEnableTimer(binding.getVariable().toString());
                break;
            case  45 :
                setOaActAutoEnableTimer(binding.getVariable().toString());
                break;
            case  46 :
                setOaModeSetting(binding.getVariable().toInt());
                break;
            case  47 :
                setOaGainSetting(binding.getVariable().toInt());
                break;
            case  48 :
                setOaPwrSetting(binding.getVariable().toInt());
                break;
            case  49 :
                setOaTiltCompSetting(binding.getVariable().toInt());
                break;
            case  50 :
                setOaStatus(binding.getVariable().toInt());
                break;
            case  51 :
                setOaLaserStatus(binding.getVariable().toInt());
                break;
            case  52 :
                setOaId1(binding.getVariable().toString());
                break;
            case  53 :
                setOaId2(binding.getVariable().toString());
                break;
            case  54 :
                setOaFiberType(binding.getVariable().toInt());
                break;
            case  55 :
                setOaGrid(binding.getVariable().toInt());
                break;
            case  56 :
                setOaNumChannels(binding.getVariable().toInt());
                break;
            case  57 :
                setOaCustom1(binding.getVariable().toString());
                break;
            case  58 :
                setOaCustom2(binding.getVariable().toString());
                break;
            case  59 :
                setOaCustom3(binding.getVariable().toString());
                break;
            case  60 :
                setOaWavelength(binding.getVariable().toInt());
                break;
            case  61 :
                setOaRemoteId(binding.getVariable().toString());
                break;
            case  62 :
                setOaSSIOpticalPwrReceivedMinTh(binding.getVariable().toInt());
                break;
            case  63 :
                setOaFSOOpticalPwrTransmittedMaxTh(binding.getVariable().toInt());
                break;
            case  64 :
                setOaFSOOpticalPwrTransmittedMinTh(binding.getVariable().toInt());
                break;
            case  65 :
                setOaTiltMarginMax(binding.getVariable().toInt());
                break;
            case  66 :
                setOaTiltMarginMin(binding.getVariable().toInt());
                break;
            case  67 :
                setOaGainMarginMax(binding.getVariable().toInt());
                break;
            case  68 :
                setOaGainMarginMin(binding.getVariable().toInt());
                break;
            case  69 :
                setOaMonitorPortLoss(binding.getVariable().toInt());
                break;
            case  70 :
                setOaOpticalPwrReceivedMin(binding.getVariable().toInt());
                break;
            case  71 :
                setOaOpticalPwrReceivedMax(binding.getVariable().toInt());
                break;
            case  72 :
                setOaOpticalPwrReceivedAvg(binding.getVariable().toInt());
                break;
            case  73 :
                setOaOpticalPwrTransmittedMin(binding.getVariable().toInt());
                break;
            case  74 :
                setOaOpticalPwrTransmittedMax(binding.getVariable().toInt());
                break;
            case  75 :
                setOaOpticalPwrTransmittedAvg(binding.getVariable().toInt());
                break;
            case  76 :
                setOaTiltAchieved(binding.getVariable().toInt());
                break;
            case  100 :
                setOaRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setOaTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOaShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOaSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOaIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(OaTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("oaTypeIdx", oaTypeIdx).append("oaShelfIdx", oaShelfIdx).append("oaSlotIdx", oaSlotIdx).append("oaIdx", oaIdx).append("oaCaseTempMaxTh", oaCaseTempMaxTh).append("oaCaseTempMaxShutdownTh", oaCaseTempMaxShutdownTh).append("oaLaserTempMinShutdownTh", oaLaserTempMinShutdownTh).append("oaLaserTempMaxShutdownTh", oaLaserTempMaxShutdownTh).append("oaOpticalPwrReceivedMinTh", oaOpticalPwrReceivedMinTh).append("oaOpticalPwrReceivedMaxTh", oaOpticalPwrReceivedMaxTh).append("oaSSIOpticalPwrReceivedMaxTh", oaSSIOpticalPwrReceivedMaxTh).append("oaOpticalPwrTransmittedMinTh", oaOpticalPwrTransmittedMinTh).append("oaOpticalPwrTransmittedMaxTh", oaOpticalPwrTransmittedMaxTh).append("oaBackReflectionSafetyTh", oaBackReflectionSafetyTh).append("oaMSInsertionLossMaxTh", oaMSInsertionLossMaxTh).append("oaCaseTemp", oaCaseTemp).append("oaLaser1Temp", oaLaser1Temp).append("oaLaser2Temp", oaLaser2Temp).append("oaOpticalPwrReceived", oaOpticalPwrReceived).append("oaSSIOpticalPwrReceived", oaSSIOpticalPwrReceived).append("oaOpticalPwrTransmitted", oaOpticalPwrTransmitted).append("oaMSInsertionLoss", oaMSInsertionLoss).append("oaEffectiveGain", oaEffectiveGain).append("oaFSOOpticalPwrTransmitted", oaFSOOpticalPwrTransmitted).append("oaLaser1Current", oaLaser1Current).append("oaLaser2Current", oaLaser2Current).append("oaLaser1Power", oaLaser1Power).append("oaLaser2Power", oaLaser2Power).append("oaOpticalBackReflection", oaOpticalBackReflection).append("oaVariableOpticalAttenuation", oaVariableOpticalAttenuation).append("oaAdminStatus", oaAdminStatus).append("oaOperStatus", oaOperStatus).append("oaOperStatQlfr", oaOperStatQlfr).append("oaAutoEnableTimer", oaAutoEnableTimer).append("oaActAutoEnableTimer", oaActAutoEnableTimer).append("oaModeSetting", oaModeSetting).append("oaGainSetting", oaGainSetting).append("oaPwrSetting", oaPwrSetting).append("oaTiltCompSetting", oaTiltCompSetting).append("oaStatus", oaStatus).append("oaLaserStatus", oaLaserStatus).append("oaId1", oaId1).append("oaId2", oaId2).append("oaFiberType", oaFiberType).append("oaGrid", oaGrid).append("oaNumChannels", oaNumChannels).append("oaCustom1", oaCustom1).append("oaCustom2", oaCustom2).append("oaCustom3", oaCustom3).append("oaWavelength", oaWavelength).append("oaRemoteId", oaRemoteId).append("oaSSIOpticalPwrReceivedMinTh", oaSSIOpticalPwrReceivedMinTh).append("oaFSOOpticalPwrTransmittedMaxTh", oaFSOOpticalPwrTransmittedMaxTh).append("oaFSOOpticalPwrTransmittedMinTh", oaFSOOpticalPwrTransmittedMinTh).append("oaTiltMarginMax", oaTiltMarginMax).append("oaTiltMarginMin", oaTiltMarginMin).append("oaGainMarginMax", oaGainMarginMax).append("oaGainMarginMin", oaGainMarginMin).append("oaMonitorPortLoss", oaMonitorPortLoss).append("oaOpticalPwrReceivedMin", oaOpticalPwrReceivedMin).append("oaOpticalPwrReceivedMax", oaOpticalPwrReceivedMax).append("oaOpticalPwrReceivedAvg", oaOpticalPwrReceivedAvg).append("oaOpticalPwrTransmittedMin", oaOpticalPwrTransmittedMin).append("oaOpticalPwrTransmittedMax", oaOpticalPwrTransmittedMax).append("oaOpticalPwrTransmittedAvg", oaOpticalPwrTransmittedAvg).append("oaTiltAchieved", oaTiltAchieved).append("oaRowStatus", oaRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(oaTypeIdx).append(oaShelfIdx).append(oaSlotIdx).append(oaIdx).append(oaCaseTempMaxTh).append(oaCaseTempMaxShutdownTh).append(oaLaserTempMinShutdownTh).append(oaLaserTempMaxShutdownTh).append(oaOpticalPwrReceivedMinTh).append(oaOpticalPwrReceivedMaxTh).append(oaSSIOpticalPwrReceivedMaxTh).append(oaOpticalPwrTransmittedMinTh).append(oaOpticalPwrTransmittedMaxTh).append(oaBackReflectionSafetyTh).append(oaMSInsertionLossMaxTh).append(oaCaseTemp).append(oaLaser1Temp).append(oaLaser2Temp).append(oaOpticalPwrReceived).append(oaSSIOpticalPwrReceived).append(oaOpticalPwrTransmitted).append(oaMSInsertionLoss).append(oaEffectiveGain).append(oaFSOOpticalPwrTransmitted).append(oaLaser1Current).append(oaLaser2Current).append(oaLaser1Power).append(oaLaser2Power).append(oaOpticalBackReflection).append(oaVariableOpticalAttenuation).append(oaAdminStatus).append(oaOperStatus).append(oaOperStatQlfr).append(oaAutoEnableTimer).append(oaActAutoEnableTimer).append(oaModeSetting).append(oaGainSetting).append(oaPwrSetting).append(oaTiltCompSetting).append(oaStatus).append(oaLaserStatus).append(oaId1).append(oaId2).append(oaFiberType).append(oaGrid).append(oaNumChannels).append(oaCustom1).append(oaCustom2).append(oaCustom3).append(oaWavelength).append(oaRemoteId).append(oaSSIOpticalPwrReceivedMinTh).append(oaFSOOpticalPwrTransmittedMaxTh).append(oaFSOOpticalPwrTransmittedMinTh).append(oaTiltMarginMax).append(oaTiltMarginMin).append(oaGainMarginMax).append(oaGainMarginMin).append(oaMonitorPortLoss).append(oaOpticalPwrReceivedMin).append(oaOpticalPwrReceivedMax).append(oaOpticalPwrReceivedAvg).append(oaOpticalPwrTransmittedMin).append(oaOpticalPwrTransmittedMax).append(oaOpticalPwrTransmittedAvg).append(oaTiltAchieved).append(oaRowStatus).append(_index).toHashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass()!= this.getClass()) {
            return false;
        }
        OaEntry rhs = ((OaEntry) obj);
        return new EqualsBuilder().append(oaTypeIdx, rhs.oaTypeIdx).append(oaShelfIdx, rhs.oaShelfIdx).append(oaSlotIdx, rhs.oaSlotIdx).append(oaIdx, rhs.oaIdx).append(oaCaseTempMaxTh, rhs.oaCaseTempMaxTh).append(oaCaseTempMaxShutdownTh, rhs.oaCaseTempMaxShutdownTh).append(oaLaserTempMinShutdownTh, rhs.oaLaserTempMinShutdownTh).append(oaLaserTempMaxShutdownTh, rhs.oaLaserTempMaxShutdownTh).append(oaOpticalPwrReceivedMinTh, rhs.oaOpticalPwrReceivedMinTh).append(oaOpticalPwrReceivedMaxTh, rhs.oaOpticalPwrReceivedMaxTh).append(oaSSIOpticalPwrReceivedMaxTh, rhs.oaSSIOpticalPwrReceivedMaxTh).append(oaOpticalPwrTransmittedMinTh, rhs.oaOpticalPwrTransmittedMinTh).append(oaOpticalPwrTransmittedMaxTh, rhs.oaOpticalPwrTransmittedMaxTh).append(oaBackReflectionSafetyTh, rhs.oaBackReflectionSafetyTh).append(oaMSInsertionLossMaxTh, rhs.oaMSInsertionLossMaxTh).append(oaCaseTemp, rhs.oaCaseTemp).append(oaLaser1Temp, rhs.oaLaser1Temp).append(oaLaser2Temp, rhs.oaLaser2Temp).append(oaOpticalPwrReceived, rhs.oaOpticalPwrReceived).append(oaSSIOpticalPwrReceived, rhs.oaSSIOpticalPwrReceived).append(oaOpticalPwrTransmitted, rhs.oaOpticalPwrTransmitted).append(oaMSInsertionLoss, rhs.oaMSInsertionLoss).append(oaEffectiveGain, rhs.oaEffectiveGain).append(oaFSOOpticalPwrTransmitted, rhs.oaFSOOpticalPwrTransmitted).append(oaLaser1Current, rhs.oaLaser1Current).append(oaLaser2Current, rhs.oaLaser2Current).append(oaLaser1Power, rhs.oaLaser1Power).append(oaLaser2Power, rhs.oaLaser2Power).append(oaOpticalBackReflection, rhs.oaOpticalBackReflection).append(oaVariableOpticalAttenuation, rhs.oaVariableOpticalAttenuation).append(oaAdminStatus, rhs.oaAdminStatus).append(oaOperStatus, rhs.oaOperStatus).append(oaOperStatQlfr, rhs.oaOperStatQlfr).append(oaAutoEnableTimer, rhs.oaAutoEnableTimer).append(oaActAutoEnableTimer, rhs.oaActAutoEnableTimer).append(oaModeSetting, rhs.oaModeSetting).append(oaGainSetting, rhs.oaGainSetting).append(oaPwrSetting, rhs.oaPwrSetting).append(oaTiltCompSetting, rhs.oaTiltCompSetting).append(oaStatus, rhs.oaStatus).append(oaLaserStatus, rhs.oaLaserStatus).append(oaId1, rhs.oaId1).append(oaId2, rhs.oaId2).append(oaFiberType, rhs.oaFiberType).append(oaGrid, rhs.oaGrid).append(oaNumChannels, rhs.oaNumChannels).append(oaCustom1, rhs.oaCustom1).append(oaCustom2, rhs.oaCustom2).append(oaCustom3, rhs.oaCustom3).append(oaWavelength, rhs.oaWavelength).append(oaRemoteId, rhs.oaRemoteId).append(oaSSIOpticalPwrReceivedMinTh, rhs.oaSSIOpticalPwrReceivedMinTh).append(oaFSOOpticalPwrTransmittedMaxTh, rhs.oaFSOOpticalPwrTransmittedMaxTh).append(oaFSOOpticalPwrTransmittedMinTh, rhs.oaFSOOpticalPwrTransmittedMinTh).append(oaTiltMarginMax, rhs.oaTiltMarginMax).append(oaTiltMarginMin, rhs.oaTiltMarginMin).append(oaGainMarginMax, rhs.oaGainMarginMax).append(oaGainMarginMin, rhs.oaGainMarginMin).append(oaMonitorPortLoss, rhs.oaMonitorPortLoss).append(oaOpticalPwrReceivedMin, rhs.oaOpticalPwrReceivedMin).append(oaOpticalPwrReceivedMax, rhs.oaOpticalPwrReceivedMax).append(oaOpticalPwrReceivedAvg, rhs.oaOpticalPwrReceivedAvg).append(oaOpticalPwrTransmittedMin, rhs.oaOpticalPwrTransmittedMin).append(oaOpticalPwrTransmittedMax, rhs.oaOpticalPwrTransmittedMax).append(oaOpticalPwrTransmittedAvg, rhs.oaOpticalPwrTransmittedAvg).append(oaTiltAchieved, rhs.oaTiltAchieved).append(oaRowStatus, rhs.oaRowStatus).append(_index, rhs._index).isEquals();
    }

    public OaEntry clone() {
        OaEntry _copy = new OaEntry();
        _copy.oaTypeIdx = oaTypeIdx;
        _copy.oaShelfIdx = oaShelfIdx;
        _copy.oaSlotIdx = oaSlotIdx;
        _copy.oaIdx = oaIdx;
        _copy.oaCaseTempMaxTh = oaCaseTempMaxTh;
        _copy.oaCaseTempMaxShutdownTh = oaCaseTempMaxShutdownTh;
        _copy.oaLaserTempMinShutdownTh = oaLaserTempMinShutdownTh;
        _copy.oaLaserTempMaxShutdownTh = oaLaserTempMaxShutdownTh;
        _copy.oaOpticalPwrReceivedMinTh = oaOpticalPwrReceivedMinTh;
        _copy.oaOpticalPwrReceivedMaxTh = oaOpticalPwrReceivedMaxTh;
        _copy.oaSSIOpticalPwrReceivedMaxTh = oaSSIOpticalPwrReceivedMaxTh;
        _copy.oaOpticalPwrTransmittedMinTh = oaOpticalPwrTransmittedMinTh;
        _copy.oaOpticalPwrTransmittedMaxTh = oaOpticalPwrTransmittedMaxTh;
        _copy.oaBackReflectionSafetyTh = oaBackReflectionSafetyTh;
        _copy.oaMSInsertionLossMaxTh = oaMSInsertionLossMaxTh;
        _copy.oaCaseTemp = oaCaseTemp;
        _copy.oaLaser1Temp = oaLaser1Temp;
        _copy.oaLaser2Temp = oaLaser2Temp;
        _copy.oaOpticalPwrReceived = oaOpticalPwrReceived;
        _copy.oaSSIOpticalPwrReceived = oaSSIOpticalPwrReceived;
        _copy.oaOpticalPwrTransmitted = oaOpticalPwrTransmitted;
        _copy.oaMSInsertionLoss = oaMSInsertionLoss;
        _copy.oaEffectiveGain = oaEffectiveGain;
        _copy.oaFSOOpticalPwrTransmitted = oaFSOOpticalPwrTransmitted;
        _copy.oaLaser1Current = oaLaser1Current;
        _copy.oaLaser2Current = oaLaser2Current;
        _copy.oaLaser1Power = oaLaser1Power;
        _copy.oaLaser2Power = oaLaser2Power;
        _copy.oaOpticalBackReflection = oaOpticalBackReflection;
        _copy.oaVariableOpticalAttenuation = oaVariableOpticalAttenuation;
        _copy.oaAdminStatus = oaAdminStatus;
        _copy.oaOperStatus = oaOperStatus;
        _copy.oaOperStatQlfr = oaOperStatQlfr;
        _copy.oaAutoEnableTimer = oaAutoEnableTimer;
        _copy.oaActAutoEnableTimer = oaActAutoEnableTimer;
        _copy.oaModeSetting = oaModeSetting;
        _copy.oaGainSetting = oaGainSetting;
        _copy.oaPwrSetting = oaPwrSetting;
        _copy.oaTiltCompSetting = oaTiltCompSetting;
        _copy.oaStatus = oaStatus;
        _copy.oaLaserStatus = oaLaserStatus;
        _copy.oaId1 = oaId1;
        _copy.oaId2 = oaId2;
        _copy.oaFiberType = oaFiberType;
        _copy.oaGrid = oaGrid;
        _copy.oaNumChannels = oaNumChannels;
        _copy.oaCustom1 = oaCustom1;
        _copy.oaCustom2 = oaCustom2;
        _copy.oaCustom3 = oaCustom3;
        _copy.oaWavelength = oaWavelength;
        _copy.oaRemoteId = oaRemoteId;
        _copy.oaSSIOpticalPwrReceivedMinTh = oaSSIOpticalPwrReceivedMinTh;
        _copy.oaFSOOpticalPwrTransmittedMaxTh = oaFSOOpticalPwrTransmittedMaxTh;
        _copy.oaFSOOpticalPwrTransmittedMinTh = oaFSOOpticalPwrTransmittedMinTh;
        _copy.oaTiltMarginMax = oaTiltMarginMax;
        _copy.oaTiltMarginMin = oaTiltMarginMin;
        _copy.oaGainMarginMax = oaGainMarginMax;
        _copy.oaGainMarginMin = oaGainMarginMin;
        _copy.oaMonitorPortLoss = oaMonitorPortLoss;
        _copy.oaOpticalPwrReceivedMin = oaOpticalPwrReceivedMin;
        _copy.oaOpticalPwrReceivedMax = oaOpticalPwrReceivedMax;
        _copy.oaOpticalPwrReceivedAvg = oaOpticalPwrReceivedAvg;
        _copy.oaOpticalPwrTransmittedMin = oaOpticalPwrTransmittedMin;
        _copy.oaOpticalPwrTransmittedMax = oaOpticalPwrTransmittedMax;
        _copy.oaOpticalPwrTransmittedAvg = oaOpticalPwrTransmittedAvg;
        _copy.oaTiltAchieved = oaTiltAchieved;
        _copy.oaRowStatus = oaRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "oaTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "oaShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "oaSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "oaIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "oaCaseTempMaxTh", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "oaCaseTempMaxShutdownTh", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "oaLaserTempMinShutdownTh", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "oaLaserTempMaxShutdownTh", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "oaOpticalPwrReceivedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "oaOpticalPwrReceivedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "oaSSIOpticalPwrReceivedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "oaOpticalPwrTransmittedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "oaOpticalPwrTransmittedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "oaBackReflectionSafetyTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "oaMSInsertionLossMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "oaCaseTemp", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "oaLaser1Temp", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "oaLaser2Temp", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "oaOpticalPwrReceived", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "oaSSIOpticalPwrReceived", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "oaOpticalPwrTransmitted", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "oaMSInsertionLoss", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(33, "oaEffectiveGain", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(34, "oaFSOOpticalPwrTransmitted", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(35, "oaLaser1Current", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(36, "oaLaser2Current", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(37, "oaLaser1Power", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(38, "oaLaser2Power", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(39, "oaOpticalBackReflection", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(40, "oaVariableOpticalAttenuation", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(41, "oaAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(42, "oaOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(43, "oaOperStatQlfr", DeviceEntityDescription.FieldType.STRING, 65));
        description.addField(new DeviceEntityDescription.FieldDescription(44, "oaAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(45, "oaActAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(46, "oaModeSetting", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(47, "oaGainSetting", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(48, "oaPwrSetting", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(49, "oaTiltCompSetting", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(50, "oaStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(51, "oaLaserStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(52, "oaId1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(53, "oaId2", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(54, "oaFiberType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(55, "oaGrid", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(56, "oaNumChannels", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(57, "oaCustom1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(58, "oaCustom2", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(59, "oaCustom3", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(60, "oaWavelength", DeviceEntityDescription.FieldType.FIXED_X100, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(61, "oaRemoteId", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(62, "oaSSIOpticalPwrReceivedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(63, "oaFSOOpticalPwrTransmittedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(64, "oaFSOOpticalPwrTransmittedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(65, "oaTiltMarginMax", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(66, "oaTiltMarginMin", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(67, "oaGainMarginMax", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(68, "oaGainMarginMin", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(69, "oaMonitorPortLoss", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(70, "oaOpticalPwrReceivedMin", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(71, "oaOpticalPwrReceivedMax", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(72, "oaOpticalPwrReceivedAvg", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(73, "oaOpticalPwrTransmittedMin", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(74, "oaOpticalPwrTransmittedMax", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(75, "oaOpticalPwrTransmittedAvg", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(76, "oaTiltAchieved", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "oaRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
