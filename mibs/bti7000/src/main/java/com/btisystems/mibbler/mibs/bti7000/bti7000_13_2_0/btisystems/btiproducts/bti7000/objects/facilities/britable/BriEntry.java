
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.britable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.BriTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.britable.IBriEntry;
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

public class BriEntry
    extends DeviceEntity
    implements Serializable, IBriEntry, IIndexed, IVariableBindingSetter
{

    private int briShelfIdx;
    private int briSlotIdx;
    private int briPortIdx;
    private int briProtocol;
    private int briOpticalPwrReceivedMinTh;
    private int briOpticalPwrReceivedMaxTh;
    private int briOpticalPwrTransmittedMinTh;
    private int briOpticalPwrTransmittedMaxTh;
    private int briOpticalPwrReceived;
    private int briOpticalPwrTransmitted;
    private String briPEC;
    private Integer briAdminStatus;
    private int briOperStatus;
    private String briOperStatQlfr;
    private String briAutoEnableTimer;
    private String briActAutoEnableTimer;
    private int briWavelength;
    private String briVendorPN1;
    private String briVendorPN2;
    private String briVendorPN3;
    private Integer briPhyPMMon;
    private int briLaserStatus;
    private String briId1;
    private Integer briFiberType;
    private String briCustom1;
    private int briBitRate;
    private String briRemoteId;
    private int briLaserControl;
    private int briRowStatus;
    private String _index;
    private BriTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public BriEntry() {
    }

    public int getBriShelfIdx() {
        return this.briShelfIdx;
    }

    public void setBriShelfIdx(int briShelfIdx) {
        int oldValue = getBriShelfIdx();
        this.briShelfIdx = briShelfIdx;
        notifyChange(1, oldValue, briShelfIdx);
    }

    public int getBriSlotIdx() {
        return this.briSlotIdx;
    }

    public void setBriSlotIdx(int briSlotIdx) {
        int oldValue = getBriSlotIdx();
        this.briSlotIdx = briSlotIdx;
        notifyChange(2, oldValue, briSlotIdx);
    }

    public int getBriPortIdx() {
        return this.briPortIdx;
    }

    public void setBriPortIdx(int briPortIdx) {
        int oldValue = getBriPortIdx();
        this.briPortIdx = briPortIdx;
        notifyChange(3, oldValue, briPortIdx);
    }

    public int getBriProtocol() {
        return this.briProtocol;
    }

    public void setBriProtocol(int briProtocol) {
        int oldValue = getBriProtocol();
        this.briProtocol = briProtocol;
        notifyChange(4, oldValue, briProtocol);
    }

    public int getBriOpticalPwrReceivedMinTh() {
        return this.briOpticalPwrReceivedMinTh;
    }

    public void setBriOpticalPwrReceivedMinTh(int briOpticalPwrReceivedMinTh) {
        int oldValue = getBriOpticalPwrReceivedMinTh();
        this.briOpticalPwrReceivedMinTh = briOpticalPwrReceivedMinTh;
        notifyChange(5, oldValue, briOpticalPwrReceivedMinTh);
    }

    public int getBriOpticalPwrReceivedMaxTh() {
        return this.briOpticalPwrReceivedMaxTh;
    }

    public void setBriOpticalPwrReceivedMaxTh(int briOpticalPwrReceivedMaxTh) {
        int oldValue = getBriOpticalPwrReceivedMaxTh();
        this.briOpticalPwrReceivedMaxTh = briOpticalPwrReceivedMaxTh;
        notifyChange(6, oldValue, briOpticalPwrReceivedMaxTh);
    }

    public int getBriOpticalPwrTransmittedMinTh() {
        return this.briOpticalPwrTransmittedMinTh;
    }

    public void setBriOpticalPwrTransmittedMinTh(int briOpticalPwrTransmittedMinTh) {
        int oldValue = getBriOpticalPwrTransmittedMinTh();
        this.briOpticalPwrTransmittedMinTh = briOpticalPwrTransmittedMinTh;
        notifyChange(7, oldValue, briOpticalPwrTransmittedMinTh);
    }

    public int getBriOpticalPwrTransmittedMaxTh() {
        return this.briOpticalPwrTransmittedMaxTh;
    }

    public void setBriOpticalPwrTransmittedMaxTh(int briOpticalPwrTransmittedMaxTh) {
        int oldValue = getBriOpticalPwrTransmittedMaxTh();
        this.briOpticalPwrTransmittedMaxTh = briOpticalPwrTransmittedMaxTh;
        notifyChange(8, oldValue, briOpticalPwrTransmittedMaxTh);
    }

    public int getBriOpticalPwrReceived() {
        return this.briOpticalPwrReceived;
    }

    public void setBriOpticalPwrReceived(int briOpticalPwrReceived) {
        int oldValue = getBriOpticalPwrReceived();
        this.briOpticalPwrReceived = briOpticalPwrReceived;
        notifyChange(9, oldValue, briOpticalPwrReceived);
    }

    public int getBriOpticalPwrTransmitted() {
        return this.briOpticalPwrTransmitted;
    }

    public void setBriOpticalPwrTransmitted(int briOpticalPwrTransmitted) {
        int oldValue = getBriOpticalPwrTransmitted();
        this.briOpticalPwrTransmitted = briOpticalPwrTransmitted;
        notifyChange(10, oldValue, briOpticalPwrTransmitted);
    }

    public String getBriPEC() {
        if (this.briPEC == null) {
            return "";
        }
        return this.briPEC;
    }

    public boolean isBriPECDefined() {
        return (this.briPEC!= null);
    }

    public void setBriPEC(String briPEC) {
        String oldValue = getBriPEC();
        this.briPEC = briPEC;
        notifyChange(11, oldValue, briPEC);
    }

    public int getBriAdminStatus() {
        if (this.briAdminStatus == null) {
            return  1;
        }
        return this.briAdminStatus;
    }

    public boolean isBriAdminStatusDefined() {
        return (this.briAdminStatus!= null);
    }

    public void setBriAdminStatus(int briAdminStatus) {
        int oldValue = getBriAdminStatus();
        this.briAdminStatus = briAdminStatus;
        notifyChange(12, oldValue, briAdminStatus);
    }

    public int getBriOperStatus() {
        return this.briOperStatus;
    }

    public void setBriOperStatus(int briOperStatus) {
        int oldValue = getBriOperStatus();
        this.briOperStatus = briOperStatus;
        notifyChange(13, oldValue, briOperStatus);
    }

    public String getBriOperStatQlfr() {
        return this.briOperStatQlfr;
    }

    public void setBriOperStatQlfr(String briOperStatQlfr) {
        String oldValue = getBriOperStatQlfr();
        this.briOperStatQlfr = briOperStatQlfr;
        notifyChange(14, oldValue, briOperStatQlfr);
    }

    public String getBriAutoEnableTimer() {
        if (this.briAutoEnableTimer == null) {
            return "008-00";
        }
        return this.briAutoEnableTimer;
    }

    public boolean isBriAutoEnableTimerDefined() {
        return (this.briAutoEnableTimer!= null);
    }

    public void setBriAutoEnableTimer(String briAutoEnableTimer) {
        String oldValue = getBriAutoEnableTimer();
        this.briAutoEnableTimer = briAutoEnableTimer;
        notifyChange(15, oldValue, briAutoEnableTimer);
    }

    public String getBriActAutoEnableTimer() {
        return this.briActAutoEnableTimer;
    }

    public void setBriActAutoEnableTimer(String briActAutoEnableTimer) {
        String oldValue = getBriActAutoEnableTimer();
        this.briActAutoEnableTimer = briActAutoEnableTimer;
        notifyChange(16, oldValue, briActAutoEnableTimer);
    }

    public int getBriWavelength() {
        return this.briWavelength;
    }

    public void setBriWavelength(int briWavelength) {
        int oldValue = getBriWavelength();
        this.briWavelength = briWavelength;
        notifyChange(17, oldValue, briWavelength);
    }

    public String getBriVendorPN1() {
        if (this.briVendorPN1 == null) {
            return "";
        }
        return this.briVendorPN1;
    }

    public boolean isBriVendorPN1Defined() {
        return (this.briVendorPN1 != null);
    }

    public void setBriVendorPN1(String briVendorPN1) {
        String oldValue = getBriVendorPN1();
        this.briVendorPN1 = briVendorPN1;
        notifyChange(18, oldValue, briVendorPN1);
    }

    public String getBriVendorPN2() {
        if (this.briVendorPN2 == null) {
            return "";
        }
        return this.briVendorPN2;
    }

    public boolean isBriVendorPN2Defined() {
        return (this.briVendorPN2 != null);
    }

    public void setBriVendorPN2(String briVendorPN2) {
        String oldValue = getBriVendorPN2();
        this.briVendorPN2 = briVendorPN2;
        notifyChange(19, oldValue, briVendorPN2);
    }

    public String getBriVendorPN3() {
        if (this.briVendorPN3 == null) {
            return "";
        }
        return this.briVendorPN3;
    }

    public boolean isBriVendorPN3Defined() {
        return (this.briVendorPN3 != null);
    }

    public void setBriVendorPN3(String briVendorPN3) {
        String oldValue = getBriVendorPN3();
        this.briVendorPN3 = briVendorPN3;
        notifyChange(20, oldValue, briVendorPN3);
    }

    public int getBriPhyPMMon() {
        if (this.briPhyPMMon == null) {
            return  2;
        }
        return this.briPhyPMMon;
    }

    public boolean isBriPhyPMMonDefined() {
        return (this.briPhyPMMon!= null);
    }

    public void setBriPhyPMMon(int briPhyPMMon) {
        int oldValue = getBriPhyPMMon();
        this.briPhyPMMon = briPhyPMMon;
        notifyChange(21, oldValue, briPhyPMMon);
    }

    public int getBriLaserStatus() {
        return this.briLaserStatus;
    }

    public void setBriLaserStatus(int briLaserStatus) {
        int oldValue = getBriLaserStatus();
        this.briLaserStatus = briLaserStatus;
        notifyChange(22, oldValue, briLaserStatus);
    }

    public String getBriId1() {
        if (this.briId1 == null) {
            return "";
        }
        return this.briId1;
    }

    public boolean isBriId1Defined() {
        return (this.briId1 != null);
    }

    public void setBriId1(String briId1) {
        String oldValue = getBriId1();
        this.briId1 = briId1;
        notifyChange(23, oldValue, briId1);
    }

    public int getBriFiberType() {
        if (this.briFiberType == null) {
            return  1;
        }
        return this.briFiberType;
    }

    public boolean isBriFiberTypeDefined() {
        return (this.briFiberType!= null);
    }

    public void setBriFiberType(int briFiberType) {
        int oldValue = getBriFiberType();
        this.briFiberType = briFiberType;
        notifyChange(24, oldValue, briFiberType);
    }

    public String getBriCustom1() {
        if (this.briCustom1 == null) {
            return "";
        }
        return this.briCustom1;
    }

    public boolean isBriCustom1Defined() {
        return (this.briCustom1 != null);
    }

    public void setBriCustom1(String briCustom1) {
        String oldValue = getBriCustom1();
        this.briCustom1 = briCustom1;
        notifyChange(25, oldValue, briCustom1);
    }

    public int getBriBitRate() {
        return this.briBitRate;
    }

    public void setBriBitRate(int briBitRate) {
        int oldValue = getBriBitRate();
        this.briBitRate = briBitRate;
        notifyChange(26, oldValue, briBitRate);
    }

    public String getBriRemoteId() {
        if (this.briRemoteId == null) {
            return "";
        }
        return this.briRemoteId;
    }

    public boolean isBriRemoteIdDefined() {
        return (this.briRemoteId!= null);
    }

    public void setBriRemoteId(String briRemoteId) {
        String oldValue = getBriRemoteId();
        this.briRemoteId = briRemoteId;
        notifyChange(27, oldValue, briRemoteId);
    }

    public int getBriLaserControl() {
        return this.briLaserControl;
    }

    public void setBriLaserControl(int briLaserControl) {
        int oldValue = getBriLaserControl();
        this.briLaserControl = briLaserControl;
        notifyChange(28, oldValue, briLaserControl);
    }

    public int getBriRowStatus() {
        return this.briRowStatus;
    }

    public void setBriRowStatus(int briRowStatus) {
        int oldValue = getBriRowStatus();
        this.briRowStatus = briRowStatus;
        notifyChange(100, oldValue, briRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setBriShelfIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setBriSlotIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setBriPortIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setBriProtocol(binding.getVariable().toInt());
                break;
            case  5 :
                setBriOpticalPwrReceivedMinTh(binding.getVariable().toInt());
                break;
            case  6 :
                setBriOpticalPwrReceivedMaxTh(binding.getVariable().toInt());
                break;
            case  7 :
                setBriOpticalPwrTransmittedMinTh(binding.getVariable().toInt());
                break;
            case  8 :
                setBriOpticalPwrTransmittedMaxTh(binding.getVariable().toInt());
                break;
            case  9 :
                setBriOpticalPwrReceived(binding.getVariable().toInt());
                break;
            case  10 :
                setBriOpticalPwrTransmitted(binding.getVariable().toInt());
                break;
            case  11 :
                setBriPEC(binding.getVariable().toString());
                break;
            case  12 :
                setBriAdminStatus(binding.getVariable().toInt());
                break;
            case  13 :
                setBriOperStatus(binding.getVariable().toInt());
                break;
            case  14 :
                setBriOperStatQlfr(binding.getVariable().toString());
                break;
            case  15 :
                setBriAutoEnableTimer(binding.getVariable().toString());
                break;
            case  16 :
                setBriActAutoEnableTimer(binding.getVariable().toString());
                break;
            case  17 :
                setBriWavelength(binding.getVariable().toInt());
                break;
            case  18 :
                setBriVendorPN1(binding.getVariable().toString());
                break;
            case  19 :
                setBriVendorPN2(binding.getVariable().toString());
                break;
            case  20 :
                setBriVendorPN3(binding.getVariable().toString());
                break;
            case  21 :
                setBriPhyPMMon(binding.getVariable().toInt());
                break;
            case  22 :
                setBriLaserStatus(binding.getVariable().toInt());
                break;
            case  23 :
                setBriId1(binding.getVariable().toString());
                break;
            case  24 :
                setBriFiberType(binding.getVariable().toInt());
                break;
            case  25 :
                setBriCustom1(binding.getVariable().toString());
                break;
            case  26 :
                setBriBitRate(binding.getVariable().toInt());
                break;
            case  27 :
                setBriRemoteId(binding.getVariable().toString());
                break;
            case  28 :
                setBriLaserControl(binding.getVariable().toInt());
                break;
            case  100 :
                setBriRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setBriShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setBriSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setBriPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(BriTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("briShelfIdx", briShelfIdx).append("briSlotIdx", briSlotIdx).append("briPortIdx", briPortIdx).append("briProtocol", briProtocol).append("briOpticalPwrReceivedMinTh", briOpticalPwrReceivedMinTh).append("briOpticalPwrReceivedMaxTh", briOpticalPwrReceivedMaxTh).append("briOpticalPwrTransmittedMinTh", briOpticalPwrTransmittedMinTh).append("briOpticalPwrTransmittedMaxTh", briOpticalPwrTransmittedMaxTh).append("briOpticalPwrReceived", briOpticalPwrReceived).append("briOpticalPwrTransmitted", briOpticalPwrTransmitted).append("briPEC", briPEC).append("briAdminStatus", briAdminStatus).append("briOperStatus", briOperStatus).append("briOperStatQlfr", briOperStatQlfr).append("briAutoEnableTimer", briAutoEnableTimer).append("briActAutoEnableTimer", briActAutoEnableTimer).append("briWavelength", briWavelength).append("briVendorPN1", briVendorPN1).append("briVendorPN2", briVendorPN2).append("briVendorPN3", briVendorPN3).append("briPhyPMMon", briPhyPMMon).append("briLaserStatus", briLaserStatus).append("briId1", briId1).append("briFiberType", briFiberType).append("briCustom1", briCustom1).append("briBitRate", briBitRate).append("briRemoteId", briRemoteId).append("briLaserControl", briLaserControl).append("briRowStatus", briRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(briShelfIdx).append(briSlotIdx).append(briPortIdx).append(briProtocol).append(briOpticalPwrReceivedMinTh).append(briOpticalPwrReceivedMaxTh).append(briOpticalPwrTransmittedMinTh).append(briOpticalPwrTransmittedMaxTh).append(briOpticalPwrReceived).append(briOpticalPwrTransmitted).append(briPEC).append(briAdminStatus).append(briOperStatus).append(briOperStatQlfr).append(briAutoEnableTimer).append(briActAutoEnableTimer).append(briWavelength).append(briVendorPN1).append(briVendorPN2).append(briVendorPN3).append(briPhyPMMon).append(briLaserStatus).append(briId1).append(briFiberType).append(briCustom1).append(briBitRate).append(briRemoteId).append(briLaserControl).append(briRowStatus).append(_index).toHashCode();
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
        BriEntry rhs = ((BriEntry) obj);
        return new EqualsBuilder().append(briShelfIdx, rhs.briShelfIdx).append(briSlotIdx, rhs.briSlotIdx).append(briPortIdx, rhs.briPortIdx).append(briProtocol, rhs.briProtocol).append(briOpticalPwrReceivedMinTh, rhs.briOpticalPwrReceivedMinTh).append(briOpticalPwrReceivedMaxTh, rhs.briOpticalPwrReceivedMaxTh).append(briOpticalPwrTransmittedMinTh, rhs.briOpticalPwrTransmittedMinTh).append(briOpticalPwrTransmittedMaxTh, rhs.briOpticalPwrTransmittedMaxTh).append(briOpticalPwrReceived, rhs.briOpticalPwrReceived).append(briOpticalPwrTransmitted, rhs.briOpticalPwrTransmitted).append(briPEC, rhs.briPEC).append(briAdminStatus, rhs.briAdminStatus).append(briOperStatus, rhs.briOperStatus).append(briOperStatQlfr, rhs.briOperStatQlfr).append(briAutoEnableTimer, rhs.briAutoEnableTimer).append(briActAutoEnableTimer, rhs.briActAutoEnableTimer).append(briWavelength, rhs.briWavelength).append(briVendorPN1, rhs.briVendorPN1).append(briVendorPN2, rhs.briVendorPN2).append(briVendorPN3, rhs.briVendorPN3).append(briPhyPMMon, rhs.briPhyPMMon).append(briLaserStatus, rhs.briLaserStatus).append(briId1, rhs.briId1).append(briFiberType, rhs.briFiberType).append(briCustom1, rhs.briCustom1).append(briBitRate, rhs.briBitRate).append(briRemoteId, rhs.briRemoteId).append(briLaserControl, rhs.briLaserControl).append(briRowStatus, rhs.briRowStatus).append(_index, rhs._index).isEquals();
    }

    public BriEntry clone() {
        BriEntry _copy = new BriEntry();
        _copy.briShelfIdx = briShelfIdx;
        _copy.briSlotIdx = briSlotIdx;
        _copy.briPortIdx = briPortIdx;
        _copy.briProtocol = briProtocol;
        _copy.briOpticalPwrReceivedMinTh = briOpticalPwrReceivedMinTh;
        _copy.briOpticalPwrReceivedMaxTh = briOpticalPwrReceivedMaxTh;
        _copy.briOpticalPwrTransmittedMinTh = briOpticalPwrTransmittedMinTh;
        _copy.briOpticalPwrTransmittedMaxTh = briOpticalPwrTransmittedMaxTh;
        _copy.briOpticalPwrReceived = briOpticalPwrReceived;
        _copy.briOpticalPwrTransmitted = briOpticalPwrTransmitted;
        _copy.briPEC = briPEC;
        _copy.briAdminStatus = briAdminStatus;
        _copy.briOperStatus = briOperStatus;
        _copy.briOperStatQlfr = briOperStatQlfr;
        _copy.briAutoEnableTimer = briAutoEnableTimer;
        _copy.briActAutoEnableTimer = briActAutoEnableTimer;
        _copy.briWavelength = briWavelength;
        _copy.briVendorPN1 = briVendorPN1;
        _copy.briVendorPN2 = briVendorPN2;
        _copy.briVendorPN3 = briVendorPN3;
        _copy.briPhyPMMon = briPhyPMMon;
        _copy.briLaserStatus = briLaserStatus;
        _copy.briId1 = briId1;
        _copy.briFiberType = briFiberType;
        _copy.briCustom1 = briCustom1;
        _copy.briBitRate = briBitRate;
        _copy.briRemoteId = briRemoteId;
        _copy.briLaserControl = briLaserControl;
        _copy.briRowStatus = briRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.16.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "briShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "briSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "briPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "briProtocol", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "briOpticalPwrReceivedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "briOpticalPwrReceivedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "briOpticalPwrTransmittedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "briOpticalPwrTransmittedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "briOpticalPwrReceived", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "briOpticalPwrTransmitted", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "briPEC", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "briAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "briOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "briOperStatQlfr", DeviceEntityDescription.FieldType.STRING, 65));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "briAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "briActAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "briWavelength", DeviceEntityDescription.FieldType.FIXED_X100, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "briVendorPN1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "briVendorPN2", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "briVendorPN3", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "briPhyPMMon", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "briLaserStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "briId1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "briFiberType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "briCustom1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(26, "briBitRate", DeviceEntityDescription.FieldType.FIXED_X100, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(27, "briRemoteId", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(28, "briLaserControl", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "briRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
