
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.fctable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.FcTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.fctable.IFcEntry;
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

public class FcEntry
    extends DeviceEntity
    implements Serializable, IFcEntry, IIndexed, IVariableBindingSetter
{

    private int fcShelfIdx;
    private int fcSlotIdx;
    private int fcPortIdx;
    private int fcRate;
    private int fcOpticalPwrReceivedMinTh;
    private int fcOpticalPwrReceivedMaxTh;
    private int fcOpticalPwrTransmittedMinTh;
    private int fcOpticalPwrTransmittedMaxTh;
    private int fcOpticalPwrReceived;
    private int fcOpticalPwrTransmitted;
    private String fcPEC;
    private Integer fcAdminStatus;
    private int fcOperStatus;
    private String fcOperStatQlfr;
    private String fcAutoEnableTimer;
    private String fcActAutoEnableTimer;
    private int fcWavelength;
    private String fcVendorPN1;
    private String fcVendorPN2;
    private String fcVendorPN3;
    private Integer fcPhyPMMon;
    private Integer fcFPSD;
    private int fcLaserStatus;
    private String fcId1;
    private Integer fcFiberType;
    private String fcCustom1;
    private Integer fcGfpMode;
    private String fcRemoteId;
    private int fcLaserControl;
    private int fcRowStatus;
    private String _index;
    private FcTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public FcEntry() {
    }

    public int getFcShelfIdx() {
        return this.fcShelfIdx;
    }

    public void setFcShelfIdx(int fcShelfIdx) {
        int oldValue = getFcShelfIdx();
        this.fcShelfIdx = fcShelfIdx;
        notifyChange(1, oldValue, fcShelfIdx);
    }

    public int getFcSlotIdx() {
        return this.fcSlotIdx;
    }

    public void setFcSlotIdx(int fcSlotIdx) {
        int oldValue = getFcSlotIdx();
        this.fcSlotIdx = fcSlotIdx;
        notifyChange(2, oldValue, fcSlotIdx);
    }

    public int getFcPortIdx() {
        return this.fcPortIdx;
    }

    public void setFcPortIdx(int fcPortIdx) {
        int oldValue = getFcPortIdx();
        this.fcPortIdx = fcPortIdx;
        notifyChange(3, oldValue, fcPortIdx);
    }

    public int getFcRate() {
        return this.fcRate;
    }

    public void setFcRate(int fcRate) {
        int oldValue = getFcRate();
        this.fcRate = fcRate;
        notifyChange(4, oldValue, fcRate);
    }

    public int getFcOpticalPwrReceivedMinTh() {
        return this.fcOpticalPwrReceivedMinTh;
    }

    public void setFcOpticalPwrReceivedMinTh(int fcOpticalPwrReceivedMinTh) {
        int oldValue = getFcOpticalPwrReceivedMinTh();
        this.fcOpticalPwrReceivedMinTh = fcOpticalPwrReceivedMinTh;
        notifyChange(5, oldValue, fcOpticalPwrReceivedMinTh);
    }

    public int getFcOpticalPwrReceivedMaxTh() {
        return this.fcOpticalPwrReceivedMaxTh;
    }

    public void setFcOpticalPwrReceivedMaxTh(int fcOpticalPwrReceivedMaxTh) {
        int oldValue = getFcOpticalPwrReceivedMaxTh();
        this.fcOpticalPwrReceivedMaxTh = fcOpticalPwrReceivedMaxTh;
        notifyChange(6, oldValue, fcOpticalPwrReceivedMaxTh);
    }

    public int getFcOpticalPwrTransmittedMinTh() {
        return this.fcOpticalPwrTransmittedMinTh;
    }

    public void setFcOpticalPwrTransmittedMinTh(int fcOpticalPwrTransmittedMinTh) {
        int oldValue = getFcOpticalPwrTransmittedMinTh();
        this.fcOpticalPwrTransmittedMinTh = fcOpticalPwrTransmittedMinTh;
        notifyChange(7, oldValue, fcOpticalPwrTransmittedMinTh);
    }

    public int getFcOpticalPwrTransmittedMaxTh() {
        return this.fcOpticalPwrTransmittedMaxTh;
    }

    public void setFcOpticalPwrTransmittedMaxTh(int fcOpticalPwrTransmittedMaxTh) {
        int oldValue = getFcOpticalPwrTransmittedMaxTh();
        this.fcOpticalPwrTransmittedMaxTh = fcOpticalPwrTransmittedMaxTh;
        notifyChange(8, oldValue, fcOpticalPwrTransmittedMaxTh);
    }

    public int getFcOpticalPwrReceived() {
        return this.fcOpticalPwrReceived;
    }

    public void setFcOpticalPwrReceived(int fcOpticalPwrReceived) {
        int oldValue = getFcOpticalPwrReceived();
        this.fcOpticalPwrReceived = fcOpticalPwrReceived;
        notifyChange(9, oldValue, fcOpticalPwrReceived);
    }

    public int getFcOpticalPwrTransmitted() {
        return this.fcOpticalPwrTransmitted;
    }

    public void setFcOpticalPwrTransmitted(int fcOpticalPwrTransmitted) {
        int oldValue = getFcOpticalPwrTransmitted();
        this.fcOpticalPwrTransmitted = fcOpticalPwrTransmitted;
        notifyChange(10, oldValue, fcOpticalPwrTransmitted);
    }

    public String getFcPEC() {
        if (this.fcPEC == null) {
            return "";
        }
        return this.fcPEC;
    }

    public boolean isFcPECDefined() {
        return (this.fcPEC!= null);
    }

    public void setFcPEC(String fcPEC) {
        String oldValue = getFcPEC();
        this.fcPEC = fcPEC;
        notifyChange(11, oldValue, fcPEC);
    }

    public int getFcAdminStatus() {
        if (this.fcAdminStatus == null) {
            return  1;
        }
        return this.fcAdminStatus;
    }

    public boolean isFcAdminStatusDefined() {
        return (this.fcAdminStatus!= null);
    }

    public void setFcAdminStatus(int fcAdminStatus) {
        int oldValue = getFcAdminStatus();
        this.fcAdminStatus = fcAdminStatus;
        notifyChange(12, oldValue, fcAdminStatus);
    }

    public int getFcOperStatus() {
        return this.fcOperStatus;
    }

    public void setFcOperStatus(int fcOperStatus) {
        int oldValue = getFcOperStatus();
        this.fcOperStatus = fcOperStatus;
        notifyChange(13, oldValue, fcOperStatus);
    }

    public String getFcOperStatQlfr() {
        return this.fcOperStatQlfr;
    }

    public void setFcOperStatQlfr(String fcOperStatQlfr) {
        String oldValue = getFcOperStatQlfr();
        this.fcOperStatQlfr = fcOperStatQlfr;
        notifyChange(14, oldValue, fcOperStatQlfr);
    }

    public String getFcAutoEnableTimer() {
        if (this.fcAutoEnableTimer == null) {
            return "008-00";
        }
        return this.fcAutoEnableTimer;
    }

    public boolean isFcAutoEnableTimerDefined() {
        return (this.fcAutoEnableTimer!= null);
    }

    public void setFcAutoEnableTimer(String fcAutoEnableTimer) {
        String oldValue = getFcAutoEnableTimer();
        this.fcAutoEnableTimer = fcAutoEnableTimer;
        notifyChange(15, oldValue, fcAutoEnableTimer);
    }

    public String getFcActAutoEnableTimer() {
        return this.fcActAutoEnableTimer;
    }

    public void setFcActAutoEnableTimer(String fcActAutoEnableTimer) {
        String oldValue = getFcActAutoEnableTimer();
        this.fcActAutoEnableTimer = fcActAutoEnableTimer;
        notifyChange(16, oldValue, fcActAutoEnableTimer);
    }

    public int getFcWavelength() {
        return this.fcWavelength;
    }

    public void setFcWavelength(int fcWavelength) {
        int oldValue = getFcWavelength();
        this.fcWavelength = fcWavelength;
        notifyChange(17, oldValue, fcWavelength);
    }

    public String getFcVendorPN1() {
        if (this.fcVendorPN1 == null) {
            return "";
        }
        return this.fcVendorPN1;
    }

    public boolean isFcVendorPN1Defined() {
        return (this.fcVendorPN1 != null);
    }

    public void setFcVendorPN1(String fcVendorPN1) {
        String oldValue = getFcVendorPN1();
        this.fcVendorPN1 = fcVendorPN1;
        notifyChange(18, oldValue, fcVendorPN1);
    }

    public String getFcVendorPN2() {
        if (this.fcVendorPN2 == null) {
            return "";
        }
        return this.fcVendorPN2;
    }

    public boolean isFcVendorPN2Defined() {
        return (this.fcVendorPN2 != null);
    }

    public void setFcVendorPN2(String fcVendorPN2) {
        String oldValue = getFcVendorPN2();
        this.fcVendorPN2 = fcVendorPN2;
        notifyChange(19, oldValue, fcVendorPN2);
    }

    public String getFcVendorPN3() {
        if (this.fcVendorPN3 == null) {
            return "";
        }
        return this.fcVendorPN3;
    }

    public boolean isFcVendorPN3Defined() {
        return (this.fcVendorPN3 != null);
    }

    public void setFcVendorPN3(String fcVendorPN3) {
        String oldValue = getFcVendorPN3();
        this.fcVendorPN3 = fcVendorPN3;
        notifyChange(20, oldValue, fcVendorPN3);
    }

    public int getFcPhyPMMon() {
        if (this.fcPhyPMMon == null) {
            return  2;
        }
        return this.fcPhyPMMon;
    }

    public boolean isFcPhyPMMonDefined() {
        return (this.fcPhyPMMon!= null);
    }

    public void setFcPhyPMMon(int fcPhyPMMon) {
        int oldValue = getFcPhyPMMon();
        this.fcPhyPMMon = fcPhyPMMon;
        notifyChange(21, oldValue, fcPhyPMMon);
    }

    public int getFcFPSD() {
        if (this.fcFPSD == null) {
            return  2;
        }
        return this.fcFPSD;
    }

    public boolean isFcFPSDDefined() {
        return (this.fcFPSD!= null);
    }

    public void setFcFPSD(int fcFPSD) {
        int oldValue = getFcFPSD();
        this.fcFPSD = fcFPSD;
        notifyChange(22, oldValue, fcFPSD);
    }

    public int getFcLaserStatus() {
        return this.fcLaserStatus;
    }

    public void setFcLaserStatus(int fcLaserStatus) {
        int oldValue = getFcLaserStatus();
        this.fcLaserStatus = fcLaserStatus;
        notifyChange(23, oldValue, fcLaserStatus);
    }

    public String getFcId1() {
        if (this.fcId1 == null) {
            return "";
        }
        return this.fcId1;
    }

    public boolean isFcId1Defined() {
        return (this.fcId1 != null);
    }

    public void setFcId1(String fcId1) {
        String oldValue = getFcId1();
        this.fcId1 = fcId1;
        notifyChange(24, oldValue, fcId1);
    }

    public int getFcFiberType() {
        if (this.fcFiberType == null) {
            return  1;
        }
        return this.fcFiberType;
    }

    public boolean isFcFiberTypeDefined() {
        return (this.fcFiberType!= null);
    }

    public void setFcFiberType(int fcFiberType) {
        int oldValue = getFcFiberType();
        this.fcFiberType = fcFiberType;
        notifyChange(25, oldValue, fcFiberType);
    }

    public String getFcCustom1() {
        if (this.fcCustom1 == null) {
            return "";
        }
        return this.fcCustom1;
    }

    public boolean isFcCustom1Defined() {
        return (this.fcCustom1 != null);
    }

    public void setFcCustom1(String fcCustom1) {
        String oldValue = getFcCustom1();
        this.fcCustom1 = fcCustom1;
        notifyChange(26, oldValue, fcCustom1);
    }

    public int getFcGfpMode() {
        if (this.fcGfpMode == null) {
            return  2;
        }
        return this.fcGfpMode;
    }

    public boolean isFcGfpModeDefined() {
        return (this.fcGfpMode!= null);
    }

    public void setFcGfpMode(int fcGfpMode) {
        int oldValue = getFcGfpMode();
        this.fcGfpMode = fcGfpMode;
        notifyChange(27, oldValue, fcGfpMode);
    }

    public String getFcRemoteId() {
        if (this.fcRemoteId == null) {
            return "";
        }
        return this.fcRemoteId;
    }

    public boolean isFcRemoteIdDefined() {
        return (this.fcRemoteId!= null);
    }

    public void setFcRemoteId(String fcRemoteId) {
        String oldValue = getFcRemoteId();
        this.fcRemoteId = fcRemoteId;
        notifyChange(28, oldValue, fcRemoteId);
    }

    public int getFcLaserControl() {
        return this.fcLaserControl;
    }

    public void setFcLaserControl(int fcLaserControl) {
        int oldValue = getFcLaserControl();
        this.fcLaserControl = fcLaserControl;
        notifyChange(29, oldValue, fcLaserControl);
    }

    public int getFcRowStatus() {
        return this.fcRowStatus;
    }

    public void setFcRowStatus(int fcRowStatus) {
        int oldValue = getFcRowStatus();
        this.fcRowStatus = fcRowStatus;
        notifyChange(100, oldValue, fcRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setFcShelfIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setFcSlotIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setFcPortIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setFcRate(binding.getVariable().toInt());
                break;
            case  5 :
                setFcOpticalPwrReceivedMinTh(binding.getVariable().toInt());
                break;
            case  6 :
                setFcOpticalPwrReceivedMaxTh(binding.getVariable().toInt());
                break;
            case  7 :
                setFcOpticalPwrTransmittedMinTh(binding.getVariable().toInt());
                break;
            case  8 :
                setFcOpticalPwrTransmittedMaxTh(binding.getVariable().toInt());
                break;
            case  9 :
                setFcOpticalPwrReceived(binding.getVariable().toInt());
                break;
            case  10 :
                setFcOpticalPwrTransmitted(binding.getVariable().toInt());
                break;
            case  11 :
                setFcPEC(binding.getVariable().toString());
                break;
            case  12 :
                setFcAdminStatus(binding.getVariable().toInt());
                break;
            case  13 :
                setFcOperStatus(binding.getVariable().toInt());
                break;
            case  14 :
                setFcOperStatQlfr(binding.getVariable().toString());
                break;
            case  15 :
                setFcAutoEnableTimer(binding.getVariable().toString());
                break;
            case  16 :
                setFcActAutoEnableTimer(binding.getVariable().toString());
                break;
            case  17 :
                setFcWavelength(binding.getVariable().toInt());
                break;
            case  18 :
                setFcVendorPN1(binding.getVariable().toString());
                break;
            case  19 :
                setFcVendorPN2(binding.getVariable().toString());
                break;
            case  20 :
                setFcVendorPN3(binding.getVariable().toString());
                break;
            case  21 :
                setFcPhyPMMon(binding.getVariable().toInt());
                break;
            case  22 :
                setFcFPSD(binding.getVariable().toInt());
                break;
            case  23 :
                setFcLaserStatus(binding.getVariable().toInt());
                break;
            case  24 :
                setFcId1(binding.getVariable().toString());
                break;
            case  25 :
                setFcFiberType(binding.getVariable().toInt());
                break;
            case  26 :
                setFcCustom1(binding.getVariable().toString());
                break;
            case  27 :
                setFcGfpMode(binding.getVariable().toInt());
                break;
            case  28 :
                setFcRemoteId(binding.getVariable().toString());
                break;
            case  29 :
                setFcLaserControl(binding.getVariable().toInt());
                break;
            case  100 :
                setFcRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setFcShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setFcSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setFcPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(FcTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("fcShelfIdx", fcShelfIdx).append("fcSlotIdx", fcSlotIdx).append("fcPortIdx", fcPortIdx).append("fcRate", fcRate).append("fcOpticalPwrReceivedMinTh", fcOpticalPwrReceivedMinTh).append("fcOpticalPwrReceivedMaxTh", fcOpticalPwrReceivedMaxTh).append("fcOpticalPwrTransmittedMinTh", fcOpticalPwrTransmittedMinTh).append("fcOpticalPwrTransmittedMaxTh", fcOpticalPwrTransmittedMaxTh).append("fcOpticalPwrReceived", fcOpticalPwrReceived).append("fcOpticalPwrTransmitted", fcOpticalPwrTransmitted).append("fcPEC", fcPEC).append("fcAdminStatus", fcAdminStatus).append("fcOperStatus", fcOperStatus).append("fcOperStatQlfr", fcOperStatQlfr).append("fcAutoEnableTimer", fcAutoEnableTimer).append("fcActAutoEnableTimer", fcActAutoEnableTimer).append("fcWavelength", fcWavelength).append("fcVendorPN1", fcVendorPN1).append("fcVendorPN2", fcVendorPN2).append("fcVendorPN3", fcVendorPN3).append("fcPhyPMMon", fcPhyPMMon).append("fcFPSD", fcFPSD).append("fcLaserStatus", fcLaserStatus).append("fcId1", fcId1).append("fcFiberType", fcFiberType).append("fcCustom1", fcCustom1).append("fcGfpMode", fcGfpMode).append("fcRemoteId", fcRemoteId).append("fcLaserControl", fcLaserControl).append("fcRowStatus", fcRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(fcShelfIdx).append(fcSlotIdx).append(fcPortIdx).append(fcRate).append(fcOpticalPwrReceivedMinTh).append(fcOpticalPwrReceivedMaxTh).append(fcOpticalPwrTransmittedMinTh).append(fcOpticalPwrTransmittedMaxTh).append(fcOpticalPwrReceived).append(fcOpticalPwrTransmitted).append(fcPEC).append(fcAdminStatus).append(fcOperStatus).append(fcOperStatQlfr).append(fcAutoEnableTimer).append(fcActAutoEnableTimer).append(fcWavelength).append(fcVendorPN1).append(fcVendorPN2).append(fcVendorPN3).append(fcPhyPMMon).append(fcFPSD).append(fcLaserStatus).append(fcId1).append(fcFiberType).append(fcCustom1).append(fcGfpMode).append(fcRemoteId).append(fcLaserControl).append(fcRowStatus).append(_index).toHashCode();
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
        FcEntry rhs = ((FcEntry) obj);
        return new EqualsBuilder().append(fcShelfIdx, rhs.fcShelfIdx).append(fcSlotIdx, rhs.fcSlotIdx).append(fcPortIdx, rhs.fcPortIdx).append(fcRate, rhs.fcRate).append(fcOpticalPwrReceivedMinTh, rhs.fcOpticalPwrReceivedMinTh).append(fcOpticalPwrReceivedMaxTh, rhs.fcOpticalPwrReceivedMaxTh).append(fcOpticalPwrTransmittedMinTh, rhs.fcOpticalPwrTransmittedMinTh).append(fcOpticalPwrTransmittedMaxTh, rhs.fcOpticalPwrTransmittedMaxTh).append(fcOpticalPwrReceived, rhs.fcOpticalPwrReceived).append(fcOpticalPwrTransmitted, rhs.fcOpticalPwrTransmitted).append(fcPEC, rhs.fcPEC).append(fcAdminStatus, rhs.fcAdminStatus).append(fcOperStatus, rhs.fcOperStatus).append(fcOperStatQlfr, rhs.fcOperStatQlfr).append(fcAutoEnableTimer, rhs.fcAutoEnableTimer).append(fcActAutoEnableTimer, rhs.fcActAutoEnableTimer).append(fcWavelength, rhs.fcWavelength).append(fcVendorPN1, rhs.fcVendorPN1).append(fcVendorPN2, rhs.fcVendorPN2).append(fcVendorPN3, rhs.fcVendorPN3).append(fcPhyPMMon, rhs.fcPhyPMMon).append(fcFPSD, rhs.fcFPSD).append(fcLaserStatus, rhs.fcLaserStatus).append(fcId1, rhs.fcId1).append(fcFiberType, rhs.fcFiberType).append(fcCustom1, rhs.fcCustom1).append(fcGfpMode, rhs.fcGfpMode).append(fcRemoteId, rhs.fcRemoteId).append(fcLaserControl, rhs.fcLaserControl).append(fcRowStatus, rhs.fcRowStatus).append(_index, rhs._index).isEquals();
    }

    public FcEntry clone() {
        FcEntry _copy = new FcEntry();
        _copy.fcShelfIdx = fcShelfIdx;
        _copy.fcSlotIdx = fcSlotIdx;
        _copy.fcPortIdx = fcPortIdx;
        _copy.fcRate = fcRate;
        _copy.fcOpticalPwrReceivedMinTh = fcOpticalPwrReceivedMinTh;
        _copy.fcOpticalPwrReceivedMaxTh = fcOpticalPwrReceivedMaxTh;
        _copy.fcOpticalPwrTransmittedMinTh = fcOpticalPwrTransmittedMinTh;
        _copy.fcOpticalPwrTransmittedMaxTh = fcOpticalPwrTransmittedMaxTh;
        _copy.fcOpticalPwrReceived = fcOpticalPwrReceived;
        _copy.fcOpticalPwrTransmitted = fcOpticalPwrTransmitted;
        _copy.fcPEC = fcPEC;
        _copy.fcAdminStatus = fcAdminStatus;
        _copy.fcOperStatus = fcOperStatus;
        _copy.fcOperStatQlfr = fcOperStatQlfr;
        _copy.fcAutoEnableTimer = fcAutoEnableTimer;
        _copy.fcActAutoEnableTimer = fcActAutoEnableTimer;
        _copy.fcWavelength = fcWavelength;
        _copy.fcVendorPN1 = fcVendorPN1;
        _copy.fcVendorPN2 = fcVendorPN2;
        _copy.fcVendorPN3 = fcVendorPN3;
        _copy.fcPhyPMMon = fcPhyPMMon;
        _copy.fcFPSD = fcFPSD;
        _copy.fcLaserStatus = fcLaserStatus;
        _copy.fcId1 = fcId1;
        _copy.fcFiberType = fcFiberType;
        _copy.fcCustom1 = fcCustom1;
        _copy.fcGfpMode = fcGfpMode;
        _copy.fcRemoteId = fcRemoteId;
        _copy.fcLaserControl = fcLaserControl;
        _copy.fcRowStatus = fcRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.12.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "fcShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "fcSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "fcPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "fcRate", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "fcOpticalPwrReceivedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "fcOpticalPwrReceivedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "fcOpticalPwrTransmittedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "fcOpticalPwrTransmittedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "fcOpticalPwrReceived", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "fcOpticalPwrTransmitted", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "fcPEC", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "fcAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "fcOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "fcOperStatQlfr", DeviceEntityDescription.FieldType.STRING, 65));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "fcAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "fcActAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "fcWavelength", DeviceEntityDescription.FieldType.FIXED_X100, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "fcVendorPN1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "fcVendorPN2", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "fcVendorPN3", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "fcPhyPMMon", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "fcFPSD", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "fcLaserStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "fcId1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "fcFiberType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(26, "fcCustom1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(27, "fcGfpMode", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(28, "fcRemoteId", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(29, "fcLaserControl", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "fcRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
