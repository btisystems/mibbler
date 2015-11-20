
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.ethintftable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.EthIntfTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.ethintftable.IEthIntfEntry;
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

public class EthIntfEntry
    extends DeviceEntity
    implements Serializable, IEthIntfEntry, IIndexed, IVariableBindingSetter
{

    private int ethIntfShelfIdx;
    private int ethIntfSlotIdx;
    private int ethIntfPortTypeIdx;
    private int ethIntfPortIdx;
    private int ethIntfOpticalPwrReceivedMinTh;
    private int ethIntfOpticalPwrReceivedMaxTh;
    private int ethIntfOpticalPwrTransmittedMinTh;
    private int ethIntfOpticalPwrTransmittedMaxTh;
    private int ethIntfOpticalPwrReceived;
    private int ethIntfOpticalPwrTransmitted;
    private String ethIntfPEC;
    private Integer ethIntfAdminStatus;
    private int ethIntfOperStatus;
    private String ethIntfOperStatQlfr;
    private String ethIntfAutoEnableTimer;
    private String ethIntfActAutoEnableTimer;
    private int ethIntfWavelength;
    private String ethIntfVendorPN1;
    private String ethIntfVendorPN2;
    private String ethIntfVendorPN3;
    private Integer ethIntfPhyPMMon;
    private Integer ethIntfFPSD;
    private int ethIntfLaserStatus;
    private String ethIntfId1;
    private Integer ethIntfFiberType;
    private String ethIntfCustom1;
    private int ethIntfSpeed;
    private int ethIntfDuplex;
    private Integer ethIntfMediaRate;
    private Integer ethIntfMTU;
    private int ethIntfLinkStatus;
    private int ethIntfLagId;
    private int ethIntfLagPortPriority;
    private Integer ethIntfBER;
    private String ethIntfMACAddr;
    private Integer ethIntfLineMapping;
    private Integer ethIntfErrorCorrection;
    private int ethIntfLpbkOpCmd;
    private String ethIntfRemoteId;
    private Integer ethIntfMirrorConfig;
    private Integer ethIntfLldpAdminStatus;
    private int ethIntfLldpRemChassisIdSubtype;
    private String ethIntfLldpRemChassisId;
    private int ethIntfLldpRemPortIdSubtype;
    private String ethIntfLldpRemPortId;
    private int ethIntfBouncingStateChangeCount;
    private int ethIntfLaserControl;
    private int ethIntfRowStatus;
    private String _index;
    private EthIntfTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public EthIntfEntry() {
    }

    public int getEthIntfShelfIdx() {
        return this.ethIntfShelfIdx;
    }

    public void setEthIntfShelfIdx(int ethIntfShelfIdx) {
        int oldValue = getEthIntfShelfIdx();
        this.ethIntfShelfIdx = ethIntfShelfIdx;
        notifyChange(1, oldValue, ethIntfShelfIdx);
    }

    public int getEthIntfSlotIdx() {
        return this.ethIntfSlotIdx;
    }

    public void setEthIntfSlotIdx(int ethIntfSlotIdx) {
        int oldValue = getEthIntfSlotIdx();
        this.ethIntfSlotIdx = ethIntfSlotIdx;
        notifyChange(2, oldValue, ethIntfSlotIdx);
    }

    public int getEthIntfPortTypeIdx() {
        return this.ethIntfPortTypeIdx;
    }

    public void setEthIntfPortTypeIdx(int ethIntfPortTypeIdx) {
        int oldValue = getEthIntfPortTypeIdx();
        this.ethIntfPortTypeIdx = ethIntfPortTypeIdx;
        notifyChange(3, oldValue, ethIntfPortTypeIdx);
    }

    public int getEthIntfPortIdx() {
        return this.ethIntfPortIdx;
    }

    public void setEthIntfPortIdx(int ethIntfPortIdx) {
        int oldValue = getEthIntfPortIdx();
        this.ethIntfPortIdx = ethIntfPortIdx;
        notifyChange(4, oldValue, ethIntfPortIdx);
    }

    public int getEthIntfOpticalPwrReceivedMinTh() {
        return this.ethIntfOpticalPwrReceivedMinTh;
    }

    public void setEthIntfOpticalPwrReceivedMinTh(int ethIntfOpticalPwrReceivedMinTh) {
        int oldValue = getEthIntfOpticalPwrReceivedMinTh();
        this.ethIntfOpticalPwrReceivedMinTh = ethIntfOpticalPwrReceivedMinTh;
        notifyChange(5, oldValue, ethIntfOpticalPwrReceivedMinTh);
    }

    public int getEthIntfOpticalPwrReceivedMaxTh() {
        return this.ethIntfOpticalPwrReceivedMaxTh;
    }

    public void setEthIntfOpticalPwrReceivedMaxTh(int ethIntfOpticalPwrReceivedMaxTh) {
        int oldValue = getEthIntfOpticalPwrReceivedMaxTh();
        this.ethIntfOpticalPwrReceivedMaxTh = ethIntfOpticalPwrReceivedMaxTh;
        notifyChange(6, oldValue, ethIntfOpticalPwrReceivedMaxTh);
    }

    public int getEthIntfOpticalPwrTransmittedMinTh() {
        return this.ethIntfOpticalPwrTransmittedMinTh;
    }

    public void setEthIntfOpticalPwrTransmittedMinTh(int ethIntfOpticalPwrTransmittedMinTh) {
        int oldValue = getEthIntfOpticalPwrTransmittedMinTh();
        this.ethIntfOpticalPwrTransmittedMinTh = ethIntfOpticalPwrTransmittedMinTh;
        notifyChange(7, oldValue, ethIntfOpticalPwrTransmittedMinTh);
    }

    public int getEthIntfOpticalPwrTransmittedMaxTh() {
        return this.ethIntfOpticalPwrTransmittedMaxTh;
    }

    public void setEthIntfOpticalPwrTransmittedMaxTh(int ethIntfOpticalPwrTransmittedMaxTh) {
        int oldValue = getEthIntfOpticalPwrTransmittedMaxTh();
        this.ethIntfOpticalPwrTransmittedMaxTh = ethIntfOpticalPwrTransmittedMaxTh;
        notifyChange(8, oldValue, ethIntfOpticalPwrTransmittedMaxTh);
    }

    public int getEthIntfOpticalPwrReceived() {
        return this.ethIntfOpticalPwrReceived;
    }

    public void setEthIntfOpticalPwrReceived(int ethIntfOpticalPwrReceived) {
        int oldValue = getEthIntfOpticalPwrReceived();
        this.ethIntfOpticalPwrReceived = ethIntfOpticalPwrReceived;
        notifyChange(9, oldValue, ethIntfOpticalPwrReceived);
    }

    public int getEthIntfOpticalPwrTransmitted() {
        return this.ethIntfOpticalPwrTransmitted;
    }

    public void setEthIntfOpticalPwrTransmitted(int ethIntfOpticalPwrTransmitted) {
        int oldValue = getEthIntfOpticalPwrTransmitted();
        this.ethIntfOpticalPwrTransmitted = ethIntfOpticalPwrTransmitted;
        notifyChange(10, oldValue, ethIntfOpticalPwrTransmitted);
    }

    public String getEthIntfPEC() {
        if (this.ethIntfPEC == null) {
            return "";
        }
        return this.ethIntfPEC;
    }

    public boolean isEthIntfPECDefined() {
        return (this.ethIntfPEC!= null);
    }

    public void setEthIntfPEC(String ethIntfPEC) {
        String oldValue = getEthIntfPEC();
        this.ethIntfPEC = ethIntfPEC;
        notifyChange(11, oldValue, ethIntfPEC);
    }

    public int getEthIntfAdminStatus() {
        if (this.ethIntfAdminStatus == null) {
            return  1;
        }
        return this.ethIntfAdminStatus;
    }

    public boolean isEthIntfAdminStatusDefined() {
        return (this.ethIntfAdminStatus!= null);
    }

    public void setEthIntfAdminStatus(int ethIntfAdminStatus) {
        int oldValue = getEthIntfAdminStatus();
        this.ethIntfAdminStatus = ethIntfAdminStatus;
        notifyChange(12, oldValue, ethIntfAdminStatus);
    }

    public int getEthIntfOperStatus() {
        return this.ethIntfOperStatus;
    }

    public void setEthIntfOperStatus(int ethIntfOperStatus) {
        int oldValue = getEthIntfOperStatus();
        this.ethIntfOperStatus = ethIntfOperStatus;
        notifyChange(13, oldValue, ethIntfOperStatus);
    }

    public String getEthIntfOperStatQlfr() {
        return this.ethIntfOperStatQlfr;
    }

    public void setEthIntfOperStatQlfr(String ethIntfOperStatQlfr) {
        String oldValue = getEthIntfOperStatQlfr();
        this.ethIntfOperStatQlfr = ethIntfOperStatQlfr;
        notifyChange(14, oldValue, ethIntfOperStatQlfr);
    }

    public String getEthIntfAutoEnableTimer() {
        if (this.ethIntfAutoEnableTimer == null) {
            return "008-00";
        }
        return this.ethIntfAutoEnableTimer;
    }

    public boolean isEthIntfAutoEnableTimerDefined() {
        return (this.ethIntfAutoEnableTimer!= null);
    }

    public void setEthIntfAutoEnableTimer(String ethIntfAutoEnableTimer) {
        String oldValue = getEthIntfAutoEnableTimer();
        this.ethIntfAutoEnableTimer = ethIntfAutoEnableTimer;
        notifyChange(15, oldValue, ethIntfAutoEnableTimer);
    }

    public String getEthIntfActAutoEnableTimer() {
        return this.ethIntfActAutoEnableTimer;
    }

    public void setEthIntfActAutoEnableTimer(String ethIntfActAutoEnableTimer) {
        String oldValue = getEthIntfActAutoEnableTimer();
        this.ethIntfActAutoEnableTimer = ethIntfActAutoEnableTimer;
        notifyChange(16, oldValue, ethIntfActAutoEnableTimer);
    }

    public int getEthIntfWavelength() {
        return this.ethIntfWavelength;
    }

    public void setEthIntfWavelength(int ethIntfWavelength) {
        int oldValue = getEthIntfWavelength();
        this.ethIntfWavelength = ethIntfWavelength;
        notifyChange(17, oldValue, ethIntfWavelength);
    }

    public String getEthIntfVendorPN1() {
        if (this.ethIntfVendorPN1 == null) {
            return "";
        }
        return this.ethIntfVendorPN1;
    }

    public boolean isEthIntfVendorPN1Defined() {
        return (this.ethIntfVendorPN1 != null);
    }

    public void setEthIntfVendorPN1(String ethIntfVendorPN1) {
        String oldValue = getEthIntfVendorPN1();
        this.ethIntfVendorPN1 = ethIntfVendorPN1;
        notifyChange(18, oldValue, ethIntfVendorPN1);
    }

    public String getEthIntfVendorPN2() {
        if (this.ethIntfVendorPN2 == null) {
            return "";
        }
        return this.ethIntfVendorPN2;
    }

    public boolean isEthIntfVendorPN2Defined() {
        return (this.ethIntfVendorPN2 != null);
    }

    public void setEthIntfVendorPN2(String ethIntfVendorPN2) {
        String oldValue = getEthIntfVendorPN2();
        this.ethIntfVendorPN2 = ethIntfVendorPN2;
        notifyChange(19, oldValue, ethIntfVendorPN2);
    }

    public String getEthIntfVendorPN3() {
        if (this.ethIntfVendorPN3 == null) {
            return "";
        }
        return this.ethIntfVendorPN3;
    }

    public boolean isEthIntfVendorPN3Defined() {
        return (this.ethIntfVendorPN3 != null);
    }

    public void setEthIntfVendorPN3(String ethIntfVendorPN3) {
        String oldValue = getEthIntfVendorPN3();
        this.ethIntfVendorPN3 = ethIntfVendorPN3;
        notifyChange(20, oldValue, ethIntfVendorPN3);
    }

    public int getEthIntfPhyPMMon() {
        if (this.ethIntfPhyPMMon == null) {
            return  2;
        }
        return this.ethIntfPhyPMMon;
    }

    public boolean isEthIntfPhyPMMonDefined() {
        return (this.ethIntfPhyPMMon!= null);
    }

    public void setEthIntfPhyPMMon(int ethIntfPhyPMMon) {
        int oldValue = getEthIntfPhyPMMon();
        this.ethIntfPhyPMMon = ethIntfPhyPMMon;
        notifyChange(21, oldValue, ethIntfPhyPMMon);
    }

    public int getEthIntfFPSD() {
        if (this.ethIntfFPSD == null) {
            return  2;
        }
        return this.ethIntfFPSD;
    }

    public boolean isEthIntfFPSDDefined() {
        return (this.ethIntfFPSD!= null);
    }

    public void setEthIntfFPSD(int ethIntfFPSD) {
        int oldValue = getEthIntfFPSD();
        this.ethIntfFPSD = ethIntfFPSD;
        notifyChange(22, oldValue, ethIntfFPSD);
    }

    public int getEthIntfLaserStatus() {
        return this.ethIntfLaserStatus;
    }

    public void setEthIntfLaserStatus(int ethIntfLaserStatus) {
        int oldValue = getEthIntfLaserStatus();
        this.ethIntfLaserStatus = ethIntfLaserStatus;
        notifyChange(23, oldValue, ethIntfLaserStatus);
    }

    public String getEthIntfId1() {
        if (this.ethIntfId1 == null) {
            return "";
        }
        return this.ethIntfId1;
    }

    public boolean isEthIntfId1Defined() {
        return (this.ethIntfId1 != null);
    }

    public void setEthIntfId1(String ethIntfId1) {
        String oldValue = getEthIntfId1();
        this.ethIntfId1 = ethIntfId1;
        notifyChange(24, oldValue, ethIntfId1);
    }

    public int getEthIntfFiberType() {
        if (this.ethIntfFiberType == null) {
            return  1;
        }
        return this.ethIntfFiberType;
    }

    public boolean isEthIntfFiberTypeDefined() {
        return (this.ethIntfFiberType!= null);
    }

    public void setEthIntfFiberType(int ethIntfFiberType) {
        int oldValue = getEthIntfFiberType();
        this.ethIntfFiberType = ethIntfFiberType;
        notifyChange(25, oldValue, ethIntfFiberType);
    }

    public String getEthIntfCustom1() {
        if (this.ethIntfCustom1 == null) {
            return "";
        }
        return this.ethIntfCustom1;
    }

    public boolean isEthIntfCustom1Defined() {
        return (this.ethIntfCustom1 != null);
    }

    public void setEthIntfCustom1(String ethIntfCustom1) {
        String oldValue = getEthIntfCustom1();
        this.ethIntfCustom1 = ethIntfCustom1;
        notifyChange(26, oldValue, ethIntfCustom1);
    }

    public int getEthIntfSpeed() {
        return this.ethIntfSpeed;
    }

    public void setEthIntfSpeed(int ethIntfSpeed) {
        int oldValue = getEthIntfSpeed();
        this.ethIntfSpeed = ethIntfSpeed;
        notifyChange(27, oldValue, ethIntfSpeed);
    }

    public int getEthIntfDuplex() {
        return this.ethIntfDuplex;
    }

    public void setEthIntfDuplex(int ethIntfDuplex) {
        int oldValue = getEthIntfDuplex();
        this.ethIntfDuplex = ethIntfDuplex;
        notifyChange(28, oldValue, ethIntfDuplex);
    }

    public int getEthIntfMediaRate() {
        if (this.ethIntfMediaRate == null) {
            return  2;
        }
        return this.ethIntfMediaRate;
    }

    public boolean isEthIntfMediaRateDefined() {
        return (this.ethIntfMediaRate!= null);
    }

    public void setEthIntfMediaRate(int ethIntfMediaRate) {
        int oldValue = getEthIntfMediaRate();
        this.ethIntfMediaRate = ethIntfMediaRate;
        notifyChange(29, oldValue, ethIntfMediaRate);
    }

    public int getEthIntfMTU() {
        if (this.ethIntfMTU == null) {
            return  1518;
        }
        return this.ethIntfMTU;
    }

    public boolean isEthIntfMTUDefined() {
        return (this.ethIntfMTU!= null);
    }

    public void setEthIntfMTU(int ethIntfMTU) {
        int oldValue = getEthIntfMTU();
        this.ethIntfMTU = ethIntfMTU;
        notifyChange(30, oldValue, ethIntfMTU);
    }

    public int getEthIntfLinkStatus() {
        return this.ethIntfLinkStatus;
    }

    public void setEthIntfLinkStatus(int ethIntfLinkStatus) {
        int oldValue = getEthIntfLinkStatus();
        this.ethIntfLinkStatus = ethIntfLinkStatus;
        notifyChange(31, oldValue, ethIntfLinkStatus);
    }

    public int getEthIntfLagId() {
        return this.ethIntfLagId;
    }

    public void setEthIntfLagId(int ethIntfLagId) {
        int oldValue = getEthIntfLagId();
        this.ethIntfLagId = ethIntfLagId;
        notifyChange(32, oldValue, ethIntfLagId);
    }

    public int getEthIntfLagPortPriority() {
        return this.ethIntfLagPortPriority;
    }

    public void setEthIntfLagPortPriority(int ethIntfLagPortPriority) {
        int oldValue = getEthIntfLagPortPriority();
        this.ethIntfLagPortPriority = ethIntfLagPortPriority;
        notifyChange(33, oldValue, ethIntfLagPortPriority);
    }

    public int getEthIntfBER() {
        if (this.ethIntfBER == null) {
            return  6;
        }
        return this.ethIntfBER;
    }

    public boolean isEthIntfBERDefined() {
        return (this.ethIntfBER!= null);
    }

    public void setEthIntfBER(int ethIntfBER) {
        int oldValue = getEthIntfBER();
        this.ethIntfBER = ethIntfBER;
        notifyChange(37, oldValue, ethIntfBER);
    }

    public String getEthIntfMACAddr() {
        return this.ethIntfMACAddr;
    }

    public void setEthIntfMACAddr(String ethIntfMACAddr) {
        String oldValue = getEthIntfMACAddr();
        this.ethIntfMACAddr = ethIntfMACAddr;
        notifyChange(39, oldValue, ethIntfMACAddr);
    }

    public int getEthIntfLineMapping() {
        if (this.ethIntfLineMapping == null) {
            return  1;
        }
        return this.ethIntfLineMapping;
    }

    public boolean isEthIntfLineMappingDefined() {
        return (this.ethIntfLineMapping!= null);
    }

    public void setEthIntfLineMapping(int ethIntfLineMapping) {
        int oldValue = getEthIntfLineMapping();
        this.ethIntfLineMapping = ethIntfLineMapping;
        notifyChange(40, oldValue, ethIntfLineMapping);
    }

    public int getEthIntfErrorCorrection() {
        if (this.ethIntfErrorCorrection == null) {
            return  1;
        }
        return this.ethIntfErrorCorrection;
    }

    public boolean isEthIntfErrorCorrectionDefined() {
        return (this.ethIntfErrorCorrection!= null);
    }

    public void setEthIntfErrorCorrection(int ethIntfErrorCorrection) {
        int oldValue = getEthIntfErrorCorrection();
        this.ethIntfErrorCorrection = ethIntfErrorCorrection;
        notifyChange(41, oldValue, ethIntfErrorCorrection);
    }

    public int getEthIntfLpbkOpCmd() {
        return this.ethIntfLpbkOpCmd;
    }

    public void setEthIntfLpbkOpCmd(int ethIntfLpbkOpCmd) {
        int oldValue = getEthIntfLpbkOpCmd();
        this.ethIntfLpbkOpCmd = ethIntfLpbkOpCmd;
        notifyChange(42, oldValue, ethIntfLpbkOpCmd);
    }

    public String getEthIntfRemoteId() {
        if (this.ethIntfRemoteId == null) {
            return "";
        }
        return this.ethIntfRemoteId;
    }

    public boolean isEthIntfRemoteIdDefined() {
        return (this.ethIntfRemoteId!= null);
    }

    public void setEthIntfRemoteId(String ethIntfRemoteId) {
        String oldValue = getEthIntfRemoteId();
        this.ethIntfRemoteId = ethIntfRemoteId;
        notifyChange(43, oldValue, ethIntfRemoteId);
    }

    public int getEthIntfMirrorConfig() {
        if (this.ethIntfMirrorConfig == null) {
            return  1;
        }
        return this.ethIntfMirrorConfig;
    }

    public boolean isEthIntfMirrorConfigDefined() {
        return (this.ethIntfMirrorConfig!= null);
    }

    public void setEthIntfMirrorConfig(int ethIntfMirrorConfig) {
        int oldValue = getEthIntfMirrorConfig();
        this.ethIntfMirrorConfig = ethIntfMirrorConfig;
        notifyChange(44, oldValue, ethIntfMirrorConfig);
    }

    public int getEthIntfLldpAdminStatus() {
        if (this.ethIntfLldpAdminStatus == null) {
            return  1;
        }
        return this.ethIntfLldpAdminStatus;
    }

    public boolean isEthIntfLldpAdminStatusDefined() {
        return (this.ethIntfLldpAdminStatus!= null);
    }

    public void setEthIntfLldpAdminStatus(int ethIntfLldpAdminStatus) {
        int oldValue = getEthIntfLldpAdminStatus();
        this.ethIntfLldpAdminStatus = ethIntfLldpAdminStatus;
        notifyChange(45, oldValue, ethIntfLldpAdminStatus);
    }

    public int getEthIntfLldpRemChassisIdSubtype() {
        return this.ethIntfLldpRemChassisIdSubtype;
    }

    public void setEthIntfLldpRemChassisIdSubtype(int ethIntfLldpRemChassisIdSubtype) {
        int oldValue = getEthIntfLldpRemChassisIdSubtype();
        this.ethIntfLldpRemChassisIdSubtype = ethIntfLldpRemChassisIdSubtype;
        notifyChange(46, oldValue, ethIntfLldpRemChassisIdSubtype);
    }

    public String getEthIntfLldpRemChassisId() {
        return this.ethIntfLldpRemChassisId;
    }

    public void setEthIntfLldpRemChassisId(String ethIntfLldpRemChassisId) {
        String oldValue = getEthIntfLldpRemChassisId();
        this.ethIntfLldpRemChassisId = ethIntfLldpRemChassisId;
        notifyChange(47, oldValue, ethIntfLldpRemChassisId);
    }

    public int getEthIntfLldpRemPortIdSubtype() {
        return this.ethIntfLldpRemPortIdSubtype;
    }

    public void setEthIntfLldpRemPortIdSubtype(int ethIntfLldpRemPortIdSubtype) {
        int oldValue = getEthIntfLldpRemPortIdSubtype();
        this.ethIntfLldpRemPortIdSubtype = ethIntfLldpRemPortIdSubtype;
        notifyChange(48, oldValue, ethIntfLldpRemPortIdSubtype);
    }

    public String getEthIntfLldpRemPortId() {
        return this.ethIntfLldpRemPortId;
    }

    public void setEthIntfLldpRemPortId(String ethIntfLldpRemPortId) {
        String oldValue = getEthIntfLldpRemPortId();
        this.ethIntfLldpRemPortId = ethIntfLldpRemPortId;
        notifyChange(49, oldValue, ethIntfLldpRemPortId);
    }

    public int getEthIntfBouncingStateChangeCount() {
        return this.ethIntfBouncingStateChangeCount;
    }

    public void setEthIntfBouncingStateChangeCount(int ethIntfBouncingStateChangeCount) {
        int oldValue = getEthIntfBouncingStateChangeCount();
        this.ethIntfBouncingStateChangeCount = ethIntfBouncingStateChangeCount;
        notifyChange(50, oldValue, ethIntfBouncingStateChangeCount);
    }

    public int getEthIntfLaserControl() {
        return this.ethIntfLaserControl;
    }

    public void setEthIntfLaserControl(int ethIntfLaserControl) {
        int oldValue = getEthIntfLaserControl();
        this.ethIntfLaserControl = ethIntfLaserControl;
        notifyChange(51, oldValue, ethIntfLaserControl);
    }

    public int getEthIntfRowStatus() {
        return this.ethIntfRowStatus;
    }

    public void setEthIntfRowStatus(int ethIntfRowStatus) {
        int oldValue = getEthIntfRowStatus();
        this.ethIntfRowStatus = ethIntfRowStatus;
        notifyChange(100, oldValue, ethIntfRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setEthIntfShelfIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setEthIntfSlotIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setEthIntfPortTypeIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setEthIntfPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setEthIntfOpticalPwrReceivedMinTh(binding.getVariable().toInt());
                break;
            case  6 :
                setEthIntfOpticalPwrReceivedMaxTh(binding.getVariable().toInt());
                break;
            case  7 :
                setEthIntfOpticalPwrTransmittedMinTh(binding.getVariable().toInt());
                break;
            case  8 :
                setEthIntfOpticalPwrTransmittedMaxTh(binding.getVariable().toInt());
                break;
            case  9 :
                setEthIntfOpticalPwrReceived(binding.getVariable().toInt());
                break;
            case  10 :
                setEthIntfOpticalPwrTransmitted(binding.getVariable().toInt());
                break;
            case  11 :
                setEthIntfPEC(binding.getVariable().toString());
                break;
            case  12 :
                setEthIntfAdminStatus(binding.getVariable().toInt());
                break;
            case  13 :
                setEthIntfOperStatus(binding.getVariable().toInt());
                break;
            case  14 :
                setEthIntfOperStatQlfr(binding.getVariable().toString());
                break;
            case  15 :
                setEthIntfAutoEnableTimer(binding.getVariable().toString());
                break;
            case  16 :
                setEthIntfActAutoEnableTimer(binding.getVariable().toString());
                break;
            case  17 :
                setEthIntfWavelength(binding.getVariable().toInt());
                break;
            case  18 :
                setEthIntfVendorPN1(binding.getVariable().toString());
                break;
            case  19 :
                setEthIntfVendorPN2(binding.getVariable().toString());
                break;
            case  20 :
                setEthIntfVendorPN3(binding.getVariable().toString());
                break;
            case  21 :
                setEthIntfPhyPMMon(binding.getVariable().toInt());
                break;
            case  22 :
                setEthIntfFPSD(binding.getVariable().toInt());
                break;
            case  23 :
                setEthIntfLaserStatus(binding.getVariable().toInt());
                break;
            case  24 :
                setEthIntfId1(binding.getVariable().toString());
                break;
            case  25 :
                setEthIntfFiberType(binding.getVariable().toInt());
                break;
            case  26 :
                setEthIntfCustom1(binding.getVariable().toString());
                break;
            case  27 :
                setEthIntfSpeed(binding.getVariable().toInt());
                break;
            case  28 :
                setEthIntfDuplex(binding.getVariable().toInt());
                break;
            case  29 :
                setEthIntfMediaRate(binding.getVariable().toInt());
                break;
            case  30 :
                setEthIntfMTU(binding.getVariable().toInt());
                break;
            case  31 :
                setEthIntfLinkStatus(binding.getVariable().toInt());
                break;
            case  32 :
                setEthIntfLagId(binding.getVariable().toInt());
                break;
            case  33 :
                setEthIntfLagPortPriority(binding.getVariable().toInt());
                break;
            case  37 :
                setEthIntfBER(binding.getVariable().toInt());
                break;
            case  39 :
                setEthIntfMACAddr(binding.getVariable().toString());
                break;
            case  40 :
                setEthIntfLineMapping(binding.getVariable().toInt());
                break;
            case  41 :
                setEthIntfErrorCorrection(binding.getVariable().toInt());
                break;
            case  42 :
                setEthIntfLpbkOpCmd(binding.getVariable().toInt());
                break;
            case  43 :
                setEthIntfRemoteId(binding.getVariable().toString());
                break;
            case  44 :
                setEthIntfMirrorConfig(binding.getVariable().toInt());
                break;
            case  45 :
                setEthIntfLldpAdminStatus(binding.getVariable().toInt());
                break;
            case  46 :
                setEthIntfLldpRemChassisIdSubtype(binding.getVariable().toInt());
                break;
            case  47 :
                setEthIntfLldpRemChassisId(binding.getVariable().toString());
                break;
            case  48 :
                setEthIntfLldpRemPortIdSubtype(binding.getVariable().toInt());
                break;
            case  49 :
                setEthIntfLldpRemPortId(binding.getVariable().toString());
                break;
            case  50 :
                setEthIntfBouncingStateChangeCount(binding.getVariable().toInt());
                break;
            case  51 :
                setEthIntfLaserControl(binding.getVariable().toInt());
                break;
            case  100 :
                setEthIntfRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setEthIntfShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setEthIntfSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setEthIntfPortTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setEthIntfPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(EthIntfTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ethIntfShelfIdx", ethIntfShelfIdx).append("ethIntfSlotIdx", ethIntfSlotIdx).append("ethIntfPortTypeIdx", ethIntfPortTypeIdx).append("ethIntfPortIdx", ethIntfPortIdx).append("ethIntfOpticalPwrReceivedMinTh", ethIntfOpticalPwrReceivedMinTh).append("ethIntfOpticalPwrReceivedMaxTh", ethIntfOpticalPwrReceivedMaxTh).append("ethIntfOpticalPwrTransmittedMinTh", ethIntfOpticalPwrTransmittedMinTh).append("ethIntfOpticalPwrTransmittedMaxTh", ethIntfOpticalPwrTransmittedMaxTh).append("ethIntfOpticalPwrReceived", ethIntfOpticalPwrReceived).append("ethIntfOpticalPwrTransmitted", ethIntfOpticalPwrTransmitted).append("ethIntfPEC", ethIntfPEC).append("ethIntfAdminStatus", ethIntfAdminStatus).append("ethIntfOperStatus", ethIntfOperStatus).append("ethIntfOperStatQlfr", ethIntfOperStatQlfr).append("ethIntfAutoEnableTimer", ethIntfAutoEnableTimer).append("ethIntfActAutoEnableTimer", ethIntfActAutoEnableTimer).append("ethIntfWavelength", ethIntfWavelength).append("ethIntfVendorPN1", ethIntfVendorPN1).append("ethIntfVendorPN2", ethIntfVendorPN2).append("ethIntfVendorPN3", ethIntfVendorPN3).append("ethIntfPhyPMMon", ethIntfPhyPMMon).append("ethIntfFPSD", ethIntfFPSD).append("ethIntfLaserStatus", ethIntfLaserStatus).append("ethIntfId1", ethIntfId1).append("ethIntfFiberType", ethIntfFiberType).append("ethIntfCustom1", ethIntfCustom1).append("ethIntfSpeed", ethIntfSpeed).append("ethIntfDuplex", ethIntfDuplex).append("ethIntfMediaRate", ethIntfMediaRate).append("ethIntfMTU", ethIntfMTU).append("ethIntfLinkStatus", ethIntfLinkStatus).append("ethIntfLagId", ethIntfLagId).append("ethIntfLagPortPriority", ethIntfLagPortPriority).append("ethIntfBER", ethIntfBER).append("ethIntfMACAddr", ethIntfMACAddr).append("ethIntfLineMapping", ethIntfLineMapping).append("ethIntfErrorCorrection", ethIntfErrorCorrection).append("ethIntfLpbkOpCmd", ethIntfLpbkOpCmd).append("ethIntfRemoteId", ethIntfRemoteId).append("ethIntfMirrorConfig", ethIntfMirrorConfig).append("ethIntfLldpAdminStatus", ethIntfLldpAdminStatus).append("ethIntfLldpRemChassisIdSubtype", ethIntfLldpRemChassisIdSubtype).append("ethIntfLldpRemChassisId", ethIntfLldpRemChassisId).append("ethIntfLldpRemPortIdSubtype", ethIntfLldpRemPortIdSubtype).append("ethIntfLldpRemPortId", ethIntfLldpRemPortId).append("ethIntfBouncingStateChangeCount", ethIntfBouncingStateChangeCount).append("ethIntfLaserControl", ethIntfLaserControl).append("ethIntfRowStatus", ethIntfRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ethIntfShelfIdx).append(ethIntfSlotIdx).append(ethIntfPortTypeIdx).append(ethIntfPortIdx).append(ethIntfOpticalPwrReceivedMinTh).append(ethIntfOpticalPwrReceivedMaxTh).append(ethIntfOpticalPwrTransmittedMinTh).append(ethIntfOpticalPwrTransmittedMaxTh).append(ethIntfOpticalPwrReceived).append(ethIntfOpticalPwrTransmitted).append(ethIntfPEC).append(ethIntfAdminStatus).append(ethIntfOperStatus).append(ethIntfOperStatQlfr).append(ethIntfAutoEnableTimer).append(ethIntfActAutoEnableTimer).append(ethIntfWavelength).append(ethIntfVendorPN1).append(ethIntfVendorPN2).append(ethIntfVendorPN3).append(ethIntfPhyPMMon).append(ethIntfFPSD).append(ethIntfLaserStatus).append(ethIntfId1).append(ethIntfFiberType).append(ethIntfCustom1).append(ethIntfSpeed).append(ethIntfDuplex).append(ethIntfMediaRate).append(ethIntfMTU).append(ethIntfLinkStatus).append(ethIntfLagId).append(ethIntfLagPortPriority).append(ethIntfBER).append(ethIntfMACAddr).append(ethIntfLineMapping).append(ethIntfErrorCorrection).append(ethIntfLpbkOpCmd).append(ethIntfRemoteId).append(ethIntfMirrorConfig).append(ethIntfLldpAdminStatus).append(ethIntfLldpRemChassisIdSubtype).append(ethIntfLldpRemChassisId).append(ethIntfLldpRemPortIdSubtype).append(ethIntfLldpRemPortId).append(ethIntfBouncingStateChangeCount).append(ethIntfLaserControl).append(ethIntfRowStatus).append(_index).toHashCode();
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
        EthIntfEntry rhs = ((EthIntfEntry) obj);
        return new EqualsBuilder().append(ethIntfShelfIdx, rhs.ethIntfShelfIdx).append(ethIntfSlotIdx, rhs.ethIntfSlotIdx).append(ethIntfPortTypeIdx, rhs.ethIntfPortTypeIdx).append(ethIntfPortIdx, rhs.ethIntfPortIdx).append(ethIntfOpticalPwrReceivedMinTh, rhs.ethIntfOpticalPwrReceivedMinTh).append(ethIntfOpticalPwrReceivedMaxTh, rhs.ethIntfOpticalPwrReceivedMaxTh).append(ethIntfOpticalPwrTransmittedMinTh, rhs.ethIntfOpticalPwrTransmittedMinTh).append(ethIntfOpticalPwrTransmittedMaxTh, rhs.ethIntfOpticalPwrTransmittedMaxTh).append(ethIntfOpticalPwrReceived, rhs.ethIntfOpticalPwrReceived).append(ethIntfOpticalPwrTransmitted, rhs.ethIntfOpticalPwrTransmitted).append(ethIntfPEC, rhs.ethIntfPEC).append(ethIntfAdminStatus, rhs.ethIntfAdminStatus).append(ethIntfOperStatus, rhs.ethIntfOperStatus).append(ethIntfOperStatQlfr, rhs.ethIntfOperStatQlfr).append(ethIntfAutoEnableTimer, rhs.ethIntfAutoEnableTimer).append(ethIntfActAutoEnableTimer, rhs.ethIntfActAutoEnableTimer).append(ethIntfWavelength, rhs.ethIntfWavelength).append(ethIntfVendorPN1, rhs.ethIntfVendorPN1).append(ethIntfVendorPN2, rhs.ethIntfVendorPN2).append(ethIntfVendorPN3, rhs.ethIntfVendorPN3).append(ethIntfPhyPMMon, rhs.ethIntfPhyPMMon).append(ethIntfFPSD, rhs.ethIntfFPSD).append(ethIntfLaserStatus, rhs.ethIntfLaserStatus).append(ethIntfId1, rhs.ethIntfId1).append(ethIntfFiberType, rhs.ethIntfFiberType).append(ethIntfCustom1, rhs.ethIntfCustom1).append(ethIntfSpeed, rhs.ethIntfSpeed).append(ethIntfDuplex, rhs.ethIntfDuplex).append(ethIntfMediaRate, rhs.ethIntfMediaRate).append(ethIntfMTU, rhs.ethIntfMTU).append(ethIntfLinkStatus, rhs.ethIntfLinkStatus).append(ethIntfLagId, rhs.ethIntfLagId).append(ethIntfLagPortPriority, rhs.ethIntfLagPortPriority).append(ethIntfBER, rhs.ethIntfBER).append(ethIntfMACAddr, rhs.ethIntfMACAddr).append(ethIntfLineMapping, rhs.ethIntfLineMapping).append(ethIntfErrorCorrection, rhs.ethIntfErrorCorrection).append(ethIntfLpbkOpCmd, rhs.ethIntfLpbkOpCmd).append(ethIntfRemoteId, rhs.ethIntfRemoteId).append(ethIntfMirrorConfig, rhs.ethIntfMirrorConfig).append(ethIntfLldpAdminStatus, rhs.ethIntfLldpAdminStatus).append(ethIntfLldpRemChassisIdSubtype, rhs.ethIntfLldpRemChassisIdSubtype).append(ethIntfLldpRemChassisId, rhs.ethIntfLldpRemChassisId).append(ethIntfLldpRemPortIdSubtype, rhs.ethIntfLldpRemPortIdSubtype).append(ethIntfLldpRemPortId, rhs.ethIntfLldpRemPortId).append(ethIntfBouncingStateChangeCount, rhs.ethIntfBouncingStateChangeCount).append(ethIntfLaserControl, rhs.ethIntfLaserControl).append(ethIntfRowStatus, rhs.ethIntfRowStatus).append(_index, rhs._index).isEquals();
    }

    public EthIntfEntry clone() {
        EthIntfEntry _copy = new EthIntfEntry();
        _copy.ethIntfShelfIdx = ethIntfShelfIdx;
        _copy.ethIntfSlotIdx = ethIntfSlotIdx;
        _copy.ethIntfPortTypeIdx = ethIntfPortTypeIdx;
        _copy.ethIntfPortIdx = ethIntfPortIdx;
        _copy.ethIntfOpticalPwrReceivedMinTh = ethIntfOpticalPwrReceivedMinTh;
        _copy.ethIntfOpticalPwrReceivedMaxTh = ethIntfOpticalPwrReceivedMaxTh;
        _copy.ethIntfOpticalPwrTransmittedMinTh = ethIntfOpticalPwrTransmittedMinTh;
        _copy.ethIntfOpticalPwrTransmittedMaxTh = ethIntfOpticalPwrTransmittedMaxTh;
        _copy.ethIntfOpticalPwrReceived = ethIntfOpticalPwrReceived;
        _copy.ethIntfOpticalPwrTransmitted = ethIntfOpticalPwrTransmitted;
        _copy.ethIntfPEC = ethIntfPEC;
        _copy.ethIntfAdminStatus = ethIntfAdminStatus;
        _copy.ethIntfOperStatus = ethIntfOperStatus;
        _copy.ethIntfOperStatQlfr = ethIntfOperStatQlfr;
        _copy.ethIntfAutoEnableTimer = ethIntfAutoEnableTimer;
        _copy.ethIntfActAutoEnableTimer = ethIntfActAutoEnableTimer;
        _copy.ethIntfWavelength = ethIntfWavelength;
        _copy.ethIntfVendorPN1 = ethIntfVendorPN1;
        _copy.ethIntfVendorPN2 = ethIntfVendorPN2;
        _copy.ethIntfVendorPN3 = ethIntfVendorPN3;
        _copy.ethIntfPhyPMMon = ethIntfPhyPMMon;
        _copy.ethIntfFPSD = ethIntfFPSD;
        _copy.ethIntfLaserStatus = ethIntfLaserStatus;
        _copy.ethIntfId1 = ethIntfId1;
        _copy.ethIntfFiberType = ethIntfFiberType;
        _copy.ethIntfCustom1 = ethIntfCustom1;
        _copy.ethIntfSpeed = ethIntfSpeed;
        _copy.ethIntfDuplex = ethIntfDuplex;
        _copy.ethIntfMediaRate = ethIntfMediaRate;
        _copy.ethIntfMTU = ethIntfMTU;
        _copy.ethIntfLinkStatus = ethIntfLinkStatus;
        _copy.ethIntfLagId = ethIntfLagId;
        _copy.ethIntfLagPortPriority = ethIntfLagPortPriority;
        _copy.ethIntfBER = ethIntfBER;
        _copy.ethIntfMACAddr = ethIntfMACAddr;
        _copy.ethIntfLineMapping = ethIntfLineMapping;
        _copy.ethIntfErrorCorrection = ethIntfErrorCorrection;
        _copy.ethIntfLpbkOpCmd = ethIntfLpbkOpCmd;
        _copy.ethIntfRemoteId = ethIntfRemoteId;
        _copy.ethIntfMirrorConfig = ethIntfMirrorConfig;
        _copy.ethIntfLldpAdminStatus = ethIntfLldpAdminStatus;
        _copy.ethIntfLldpRemChassisIdSubtype = ethIntfLldpRemChassisIdSubtype;
        _copy.ethIntfLldpRemChassisId = ethIntfLldpRemChassisId;
        _copy.ethIntfLldpRemPortIdSubtype = ethIntfLldpRemPortIdSubtype;
        _copy.ethIntfLldpRemPortId = ethIntfLldpRemPortId;
        _copy.ethIntfBouncingStateChangeCount = ethIntfBouncingStateChangeCount;
        _copy.ethIntfLaserControl = ethIntfLaserControl;
        _copy.ethIntfRowStatus = ethIntfRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.14.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ethIntfShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ethIntfSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ethIntfPortTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ethIntfPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ethIntfOpticalPwrReceivedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ethIntfOpticalPwrReceivedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ethIntfOpticalPwrTransmittedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ethIntfOpticalPwrTransmittedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ethIntfOpticalPwrReceived", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ethIntfOpticalPwrTransmitted", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ethIntfPEC", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ethIntfAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "ethIntfOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "ethIntfOperStatQlfr", DeviceEntityDescription.FieldType.STRING, 65));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "ethIntfAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "ethIntfActAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "ethIntfWavelength", DeviceEntityDescription.FieldType.FIXED_X100, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "ethIntfVendorPN1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "ethIntfVendorPN2", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "ethIntfVendorPN3", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "ethIntfPhyPMMon", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "ethIntfFPSD", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "ethIntfLaserStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "ethIntfId1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "ethIntfFiberType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(26, "ethIntfCustom1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(27, "ethIntfSpeed", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(28, "ethIntfDuplex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(29, "ethIntfMediaRate", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(30, "ethIntfMTU", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(31, "ethIntfLinkStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(32, "ethIntfLagId", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(33, "ethIntfLagPortPriority", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(37, "ethIntfBER", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(39, "ethIntfMACAddr", DeviceEntityDescription.FieldType.STRING, 18));
        description.addField(new DeviceEntityDescription.FieldDescription(40, "ethIntfLineMapping", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(41, "ethIntfErrorCorrection", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(42, "ethIntfLpbkOpCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(43, "ethIntfRemoteId", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(44, "ethIntfMirrorConfig", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(45, "ethIntfLldpAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(46, "ethIntfLldpRemChassisIdSubtype", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(47, "ethIntfLldpRemChassisId", DeviceEntityDescription.FieldType.STRING, 159));
        description.addField(new DeviceEntityDescription.FieldDescription(48, "ethIntfLldpRemPortIdSubtype", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(49, "ethIntfLldpRemPortId", DeviceEntityDescription.FieldType.STRING, 159));
        description.addField(new DeviceEntityDescription.FieldDescription(50, "ethIntfBouncingStateChangeCount", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(51, "ethIntfLaserControl", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "ethIntfRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
