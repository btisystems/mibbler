
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.getable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.GeTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.getable.IGeEntry;
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

public class GeEntry
    extends DeviceEntity
    implements Serializable, IGeEntry, IIndexed, IVariableBindingSetter
{

    private int geShelfIdx;
    private int geSlotIdx;
    private int gePortIdx;
    private int geOpticalPwrReceivedMinTh;
    private int geOpticalPwrReceivedMaxTh;
    private int geOpticalPwrTransmittedMinTh;
    private int geOpticalPwrTransmittedMaxTh;
    private int geOpticalPwrReceived;
    private int geOpticalPwrTransmitted;
    private String gePEC;
    private Integer geAdminStatus;
    private int geOperStatus;
    private String geOperStatQlfr;
    private String geAutoEnableTimer;
    private String geActAutoEnableTimer;
    private int geWavelength;
    private String geVendorPN1;
    private String geVendorPN2;
    private String geVendorPN3;
    private Integer gePhyPMMon;
    private Integer geFPSD;
    private int geLaserStatus;
    private String geId1;
    private Integer geFiberType;
    private String geCustom1;
    private int geSpeed;
    private int geDuplex;
    private Integer geMediaRate;
    private int geMTU;
    private String geMACAddr;
    private Integer geGfpMode;
    private Integer geFlowControl;
    private String geRemoteId;
    private int geLaserControl;
    private int geRowStatus;
    private String _index;
    private GeTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public GeEntry() {
    }

    public int getGeShelfIdx() {
        return this.geShelfIdx;
    }

    public void setGeShelfIdx(int geShelfIdx) {
        int oldValue = getGeShelfIdx();
        this.geShelfIdx = geShelfIdx;
        notifyChange(1, oldValue, geShelfIdx);
    }

    public int getGeSlotIdx() {
        return this.geSlotIdx;
    }

    public void setGeSlotIdx(int geSlotIdx) {
        int oldValue = getGeSlotIdx();
        this.geSlotIdx = geSlotIdx;
        notifyChange(2, oldValue, geSlotIdx);
    }

    public int getGePortIdx() {
        return this.gePortIdx;
    }

    public void setGePortIdx(int gePortIdx) {
        int oldValue = getGePortIdx();
        this.gePortIdx = gePortIdx;
        notifyChange(3, oldValue, gePortIdx);
    }

    public int getGeOpticalPwrReceivedMinTh() {
        return this.geOpticalPwrReceivedMinTh;
    }

    public void setGeOpticalPwrReceivedMinTh(int geOpticalPwrReceivedMinTh) {
        int oldValue = getGeOpticalPwrReceivedMinTh();
        this.geOpticalPwrReceivedMinTh = geOpticalPwrReceivedMinTh;
        notifyChange(4, oldValue, geOpticalPwrReceivedMinTh);
    }

    public int getGeOpticalPwrReceivedMaxTh() {
        return this.geOpticalPwrReceivedMaxTh;
    }

    public void setGeOpticalPwrReceivedMaxTh(int geOpticalPwrReceivedMaxTh) {
        int oldValue = getGeOpticalPwrReceivedMaxTh();
        this.geOpticalPwrReceivedMaxTh = geOpticalPwrReceivedMaxTh;
        notifyChange(5, oldValue, geOpticalPwrReceivedMaxTh);
    }

    public int getGeOpticalPwrTransmittedMinTh() {
        return this.geOpticalPwrTransmittedMinTh;
    }

    public void setGeOpticalPwrTransmittedMinTh(int geOpticalPwrTransmittedMinTh) {
        int oldValue = getGeOpticalPwrTransmittedMinTh();
        this.geOpticalPwrTransmittedMinTh = geOpticalPwrTransmittedMinTh;
        notifyChange(6, oldValue, geOpticalPwrTransmittedMinTh);
    }

    public int getGeOpticalPwrTransmittedMaxTh() {
        return this.geOpticalPwrTransmittedMaxTh;
    }

    public void setGeOpticalPwrTransmittedMaxTh(int geOpticalPwrTransmittedMaxTh) {
        int oldValue = getGeOpticalPwrTransmittedMaxTh();
        this.geOpticalPwrTransmittedMaxTh = geOpticalPwrTransmittedMaxTh;
        notifyChange(7, oldValue, geOpticalPwrTransmittedMaxTh);
    }

    public int getGeOpticalPwrReceived() {
        return this.geOpticalPwrReceived;
    }

    public void setGeOpticalPwrReceived(int geOpticalPwrReceived) {
        int oldValue = getGeOpticalPwrReceived();
        this.geOpticalPwrReceived = geOpticalPwrReceived;
        notifyChange(8, oldValue, geOpticalPwrReceived);
    }

    public int getGeOpticalPwrTransmitted() {
        return this.geOpticalPwrTransmitted;
    }

    public void setGeOpticalPwrTransmitted(int geOpticalPwrTransmitted) {
        int oldValue = getGeOpticalPwrTransmitted();
        this.geOpticalPwrTransmitted = geOpticalPwrTransmitted;
        notifyChange(9, oldValue, geOpticalPwrTransmitted);
    }

    public String getGePEC() {
        if (this.gePEC == null) {
            return "";
        }
        return this.gePEC;
    }

    public boolean isGePECDefined() {
        return (this.gePEC!= null);
    }

    public void setGePEC(String gePEC) {
        String oldValue = getGePEC();
        this.gePEC = gePEC;
        notifyChange(10, oldValue, gePEC);
    }

    public int getGeAdminStatus() {
        if (this.geAdminStatus == null) {
            return  1;
        }
        return this.geAdminStatus;
    }

    public boolean isGeAdminStatusDefined() {
        return (this.geAdminStatus!= null);
    }

    public void setGeAdminStatus(int geAdminStatus) {
        int oldValue = getGeAdminStatus();
        this.geAdminStatus = geAdminStatus;
        notifyChange(11, oldValue, geAdminStatus);
    }

    public int getGeOperStatus() {
        return this.geOperStatus;
    }

    public void setGeOperStatus(int geOperStatus) {
        int oldValue = getGeOperStatus();
        this.geOperStatus = geOperStatus;
        notifyChange(12, oldValue, geOperStatus);
    }

    public String getGeOperStatQlfr() {
        return this.geOperStatQlfr;
    }

    public void setGeOperStatQlfr(String geOperStatQlfr) {
        String oldValue = getGeOperStatQlfr();
        this.geOperStatQlfr = geOperStatQlfr;
        notifyChange(13, oldValue, geOperStatQlfr);
    }

    public String getGeAutoEnableTimer() {
        if (this.geAutoEnableTimer == null) {
            return "008-00";
        }
        return this.geAutoEnableTimer;
    }

    public boolean isGeAutoEnableTimerDefined() {
        return (this.geAutoEnableTimer!= null);
    }

    public void setGeAutoEnableTimer(String geAutoEnableTimer) {
        String oldValue = getGeAutoEnableTimer();
        this.geAutoEnableTimer = geAutoEnableTimer;
        notifyChange(14, oldValue, geAutoEnableTimer);
    }

    public String getGeActAutoEnableTimer() {
        return this.geActAutoEnableTimer;
    }

    public void setGeActAutoEnableTimer(String geActAutoEnableTimer) {
        String oldValue = getGeActAutoEnableTimer();
        this.geActAutoEnableTimer = geActAutoEnableTimer;
        notifyChange(15, oldValue, geActAutoEnableTimer);
    }

    public int getGeWavelength() {
        return this.geWavelength;
    }

    public void setGeWavelength(int geWavelength) {
        int oldValue = getGeWavelength();
        this.geWavelength = geWavelength;
        notifyChange(16, oldValue, geWavelength);
    }

    public String getGeVendorPN1() {
        if (this.geVendorPN1 == null) {
            return "";
        }
        return this.geVendorPN1;
    }

    public boolean isGeVendorPN1Defined() {
        return (this.geVendorPN1 != null);
    }

    public void setGeVendorPN1(String geVendorPN1) {
        String oldValue = getGeVendorPN1();
        this.geVendorPN1 = geVendorPN1;
        notifyChange(17, oldValue, geVendorPN1);
    }

    public String getGeVendorPN2() {
        if (this.geVendorPN2 == null) {
            return "";
        }
        return this.geVendorPN2;
    }

    public boolean isGeVendorPN2Defined() {
        return (this.geVendorPN2 != null);
    }

    public void setGeVendorPN2(String geVendorPN2) {
        String oldValue = getGeVendorPN2();
        this.geVendorPN2 = geVendorPN2;
        notifyChange(18, oldValue, geVendorPN2);
    }

    public String getGeVendorPN3() {
        if (this.geVendorPN3 == null) {
            return "";
        }
        return this.geVendorPN3;
    }

    public boolean isGeVendorPN3Defined() {
        return (this.geVendorPN3 != null);
    }

    public void setGeVendorPN3(String geVendorPN3) {
        String oldValue = getGeVendorPN3();
        this.geVendorPN3 = geVendorPN3;
        notifyChange(19, oldValue, geVendorPN3);
    }

    public int getGePhyPMMon() {
        if (this.gePhyPMMon == null) {
            return  2;
        }
        return this.gePhyPMMon;
    }

    public boolean isGePhyPMMonDefined() {
        return (this.gePhyPMMon!= null);
    }

    public void setGePhyPMMon(int gePhyPMMon) {
        int oldValue = getGePhyPMMon();
        this.gePhyPMMon = gePhyPMMon;
        notifyChange(20, oldValue, gePhyPMMon);
    }

    public int getGeFPSD() {
        if (this.geFPSD == null) {
            return  2;
        }
        return this.geFPSD;
    }

    public boolean isGeFPSDDefined() {
        return (this.geFPSD!= null);
    }

    public void setGeFPSD(int geFPSD) {
        int oldValue = getGeFPSD();
        this.geFPSD = geFPSD;
        notifyChange(21, oldValue, geFPSD);
    }

    public int getGeLaserStatus() {
        return this.geLaserStatus;
    }

    public void setGeLaserStatus(int geLaserStatus) {
        int oldValue = getGeLaserStatus();
        this.geLaserStatus = geLaserStatus;
        notifyChange(22, oldValue, geLaserStatus);
    }

    public String getGeId1() {
        if (this.geId1 == null) {
            return "";
        }
        return this.geId1;
    }

    public boolean isGeId1Defined() {
        return (this.geId1 != null);
    }

    public void setGeId1(String geId1) {
        String oldValue = getGeId1();
        this.geId1 = geId1;
        notifyChange(23, oldValue, geId1);
    }

    public int getGeFiberType() {
        if (this.geFiberType == null) {
            return  1;
        }
        return this.geFiberType;
    }

    public boolean isGeFiberTypeDefined() {
        return (this.geFiberType!= null);
    }

    public void setGeFiberType(int geFiberType) {
        int oldValue = getGeFiberType();
        this.geFiberType = geFiberType;
        notifyChange(24, oldValue, geFiberType);
    }

    public String getGeCustom1() {
        if (this.geCustom1 == null) {
            return "";
        }
        return this.geCustom1;
    }

    public boolean isGeCustom1Defined() {
        return (this.geCustom1 != null);
    }

    public void setGeCustom1(String geCustom1) {
        String oldValue = getGeCustom1();
        this.geCustom1 = geCustom1;
        notifyChange(25, oldValue, geCustom1);
    }

    public int getGeSpeed() {
        return this.geSpeed;
    }

    public void setGeSpeed(int geSpeed) {
        int oldValue = getGeSpeed();
        this.geSpeed = geSpeed;
        notifyChange(26, oldValue, geSpeed);
    }

    public int getGeDuplex() {
        return this.geDuplex;
    }

    public void setGeDuplex(int geDuplex) {
        int oldValue = getGeDuplex();
        this.geDuplex = geDuplex;
        notifyChange(27, oldValue, geDuplex);
    }

    public int getGeMediaRate() {
        if (this.geMediaRate == null) {
            return  2;
        }
        return this.geMediaRate;
    }

    public boolean isGeMediaRateDefined() {
        return (this.geMediaRate!= null);
    }

    public void setGeMediaRate(int geMediaRate) {
        int oldValue = getGeMediaRate();
        this.geMediaRate = geMediaRate;
        notifyChange(28, oldValue, geMediaRate);
    }

    public int getGeMTU() {
        return this.geMTU;
    }

    public void setGeMTU(int geMTU) {
        int oldValue = getGeMTU();
        this.geMTU = geMTU;
        notifyChange(29, oldValue, geMTU);
    }

    public String getGeMACAddr() {
        return this.geMACAddr;
    }

    public void setGeMACAddr(String geMACAddr) {
        String oldValue = getGeMACAddr();
        this.geMACAddr = geMACAddr;
        notifyChange(30, oldValue, geMACAddr);
    }

    public int getGeGfpMode() {
        if (this.geGfpMode == null) {
            return  3;
        }
        return this.geGfpMode;
    }

    public boolean isGeGfpModeDefined() {
        return (this.geGfpMode!= null);
    }

    public void setGeGfpMode(int geGfpMode) {
        int oldValue = getGeGfpMode();
        this.geGfpMode = geGfpMode;
        notifyChange(31, oldValue, geGfpMode);
    }

    public int getGeFlowControl() {
        if (this.geFlowControl == null) {
            return  1;
        }
        return this.geFlowControl;
    }

    public boolean isGeFlowControlDefined() {
        return (this.geFlowControl!= null);
    }

    public void setGeFlowControl(int geFlowControl) {
        int oldValue = getGeFlowControl();
        this.geFlowControl = geFlowControl;
        notifyChange(32, oldValue, geFlowControl);
    }

    public String getGeRemoteId() {
        if (this.geRemoteId == null) {
            return "";
        }
        return this.geRemoteId;
    }

    public boolean isGeRemoteIdDefined() {
        return (this.geRemoteId!= null);
    }

    public void setGeRemoteId(String geRemoteId) {
        String oldValue = getGeRemoteId();
        this.geRemoteId = geRemoteId;
        notifyChange(33, oldValue, geRemoteId);
    }

    public int getGeLaserControl() {
        return this.geLaserControl;
    }

    public void setGeLaserControl(int geLaserControl) {
        int oldValue = getGeLaserControl();
        this.geLaserControl = geLaserControl;
        notifyChange(34, oldValue, geLaserControl);
    }

    public int getGeRowStatus() {
        return this.geRowStatus;
    }

    public void setGeRowStatus(int geRowStatus) {
        int oldValue = getGeRowStatus();
        this.geRowStatus = geRowStatus;
        notifyChange(100, oldValue, geRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setGeShelfIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setGeSlotIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setGePortIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setGeOpticalPwrReceivedMinTh(binding.getVariable().toInt());
                break;
            case  5 :
                setGeOpticalPwrReceivedMaxTh(binding.getVariable().toInt());
                break;
            case  6 :
                setGeOpticalPwrTransmittedMinTh(binding.getVariable().toInt());
                break;
            case  7 :
                setGeOpticalPwrTransmittedMaxTh(binding.getVariable().toInt());
                break;
            case  8 :
                setGeOpticalPwrReceived(binding.getVariable().toInt());
                break;
            case  9 :
                setGeOpticalPwrTransmitted(binding.getVariable().toInt());
                break;
            case  10 :
                setGePEC(binding.getVariable().toString());
                break;
            case  11 :
                setGeAdminStatus(binding.getVariable().toInt());
                break;
            case  12 :
                setGeOperStatus(binding.getVariable().toInt());
                break;
            case  13 :
                setGeOperStatQlfr(binding.getVariable().toString());
                break;
            case  14 :
                setGeAutoEnableTimer(binding.getVariable().toString());
                break;
            case  15 :
                setGeActAutoEnableTimer(binding.getVariable().toString());
                break;
            case  16 :
                setGeWavelength(binding.getVariable().toInt());
                break;
            case  17 :
                setGeVendorPN1(binding.getVariable().toString());
                break;
            case  18 :
                setGeVendorPN2(binding.getVariable().toString());
                break;
            case  19 :
                setGeVendorPN3(binding.getVariable().toString());
                break;
            case  20 :
                setGePhyPMMon(binding.getVariable().toInt());
                break;
            case  21 :
                setGeFPSD(binding.getVariable().toInt());
                break;
            case  22 :
                setGeLaserStatus(binding.getVariable().toInt());
                break;
            case  23 :
                setGeId1(binding.getVariable().toString());
                break;
            case  24 :
                setGeFiberType(binding.getVariable().toInt());
                break;
            case  25 :
                setGeCustom1(binding.getVariable().toString());
                break;
            case  26 :
                setGeSpeed(binding.getVariable().toInt());
                break;
            case  27 :
                setGeDuplex(binding.getVariable().toInt());
                break;
            case  28 :
                setGeMediaRate(binding.getVariable().toInt());
                break;
            case  29 :
                setGeMTU(binding.getVariable().toInt());
                break;
            case  30 :
                setGeMACAddr(binding.getVariable().toString());
                break;
            case  31 :
                setGeGfpMode(binding.getVariable().toInt());
                break;
            case  32 :
                setGeFlowControl(binding.getVariable().toInt());
                break;
            case  33 :
                setGeRemoteId(binding.getVariable().toString());
                break;
            case  34 :
                setGeLaserControl(binding.getVariable().toInt());
                break;
            case  100 :
                setGeRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setGeShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setGeSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setGePortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(GeTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("geShelfIdx", geShelfIdx).append("geSlotIdx", geSlotIdx).append("gePortIdx", gePortIdx).append("geOpticalPwrReceivedMinTh", geOpticalPwrReceivedMinTh).append("geOpticalPwrReceivedMaxTh", geOpticalPwrReceivedMaxTh).append("geOpticalPwrTransmittedMinTh", geOpticalPwrTransmittedMinTh).append("geOpticalPwrTransmittedMaxTh", geOpticalPwrTransmittedMaxTh).append("geOpticalPwrReceived", geOpticalPwrReceived).append("geOpticalPwrTransmitted", geOpticalPwrTransmitted).append("gePEC", gePEC).append("geAdminStatus", geAdminStatus).append("geOperStatus", geOperStatus).append("geOperStatQlfr", geOperStatQlfr).append("geAutoEnableTimer", geAutoEnableTimer).append("geActAutoEnableTimer", geActAutoEnableTimer).append("geWavelength", geWavelength).append("geVendorPN1", geVendorPN1).append("geVendorPN2", geVendorPN2).append("geVendorPN3", geVendorPN3).append("gePhyPMMon", gePhyPMMon).append("geFPSD", geFPSD).append("geLaserStatus", geLaserStatus).append("geId1", geId1).append("geFiberType", geFiberType).append("geCustom1", geCustom1).append("geSpeed", geSpeed).append("geDuplex", geDuplex).append("geMediaRate", geMediaRate).append("geMTU", geMTU).append("geMACAddr", geMACAddr).append("geGfpMode", geGfpMode).append("geFlowControl", geFlowControl).append("geRemoteId", geRemoteId).append("geLaserControl", geLaserControl).append("geRowStatus", geRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(geShelfIdx).append(geSlotIdx).append(gePortIdx).append(geOpticalPwrReceivedMinTh).append(geOpticalPwrReceivedMaxTh).append(geOpticalPwrTransmittedMinTh).append(geOpticalPwrTransmittedMaxTh).append(geOpticalPwrReceived).append(geOpticalPwrTransmitted).append(gePEC).append(geAdminStatus).append(geOperStatus).append(geOperStatQlfr).append(geAutoEnableTimer).append(geActAutoEnableTimer).append(geWavelength).append(geVendorPN1).append(geVendorPN2).append(geVendorPN3).append(gePhyPMMon).append(geFPSD).append(geLaserStatus).append(geId1).append(geFiberType).append(geCustom1).append(geSpeed).append(geDuplex).append(geMediaRate).append(geMTU).append(geMACAddr).append(geGfpMode).append(geFlowControl).append(geRemoteId).append(geLaserControl).append(geRowStatus).append(_index).toHashCode();
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
        GeEntry rhs = ((GeEntry) obj);
        return new EqualsBuilder().append(geShelfIdx, rhs.geShelfIdx).append(geSlotIdx, rhs.geSlotIdx).append(gePortIdx, rhs.gePortIdx).append(geOpticalPwrReceivedMinTh, rhs.geOpticalPwrReceivedMinTh).append(geOpticalPwrReceivedMaxTh, rhs.geOpticalPwrReceivedMaxTh).append(geOpticalPwrTransmittedMinTh, rhs.geOpticalPwrTransmittedMinTh).append(geOpticalPwrTransmittedMaxTh, rhs.geOpticalPwrTransmittedMaxTh).append(geOpticalPwrReceived, rhs.geOpticalPwrReceived).append(geOpticalPwrTransmitted, rhs.geOpticalPwrTransmitted).append(gePEC, rhs.gePEC).append(geAdminStatus, rhs.geAdminStatus).append(geOperStatus, rhs.geOperStatus).append(geOperStatQlfr, rhs.geOperStatQlfr).append(geAutoEnableTimer, rhs.geAutoEnableTimer).append(geActAutoEnableTimer, rhs.geActAutoEnableTimer).append(geWavelength, rhs.geWavelength).append(geVendorPN1, rhs.geVendorPN1).append(geVendorPN2, rhs.geVendorPN2).append(geVendorPN3, rhs.geVendorPN3).append(gePhyPMMon, rhs.gePhyPMMon).append(geFPSD, rhs.geFPSD).append(geLaserStatus, rhs.geLaserStatus).append(geId1, rhs.geId1).append(geFiberType, rhs.geFiberType).append(geCustom1, rhs.geCustom1).append(geSpeed, rhs.geSpeed).append(geDuplex, rhs.geDuplex).append(geMediaRate, rhs.geMediaRate).append(geMTU, rhs.geMTU).append(geMACAddr, rhs.geMACAddr).append(geGfpMode, rhs.geGfpMode).append(geFlowControl, rhs.geFlowControl).append(geRemoteId, rhs.geRemoteId).append(geLaserControl, rhs.geLaserControl).append(geRowStatus, rhs.geRowStatus).append(_index, rhs._index).isEquals();
    }

    public GeEntry clone() {
        GeEntry _copy = new GeEntry();
        _copy.geShelfIdx = geShelfIdx;
        _copy.geSlotIdx = geSlotIdx;
        _copy.gePortIdx = gePortIdx;
        _copy.geOpticalPwrReceivedMinTh = geOpticalPwrReceivedMinTh;
        _copy.geOpticalPwrReceivedMaxTh = geOpticalPwrReceivedMaxTh;
        _copy.geOpticalPwrTransmittedMinTh = geOpticalPwrTransmittedMinTh;
        _copy.geOpticalPwrTransmittedMaxTh = geOpticalPwrTransmittedMaxTh;
        _copy.geOpticalPwrReceived = geOpticalPwrReceived;
        _copy.geOpticalPwrTransmitted = geOpticalPwrTransmitted;
        _copy.gePEC = gePEC;
        _copy.geAdminStatus = geAdminStatus;
        _copy.geOperStatus = geOperStatus;
        _copy.geOperStatQlfr = geOperStatQlfr;
        _copy.geAutoEnableTimer = geAutoEnableTimer;
        _copy.geActAutoEnableTimer = geActAutoEnableTimer;
        _copy.geWavelength = geWavelength;
        _copy.geVendorPN1 = geVendorPN1;
        _copy.geVendorPN2 = geVendorPN2;
        _copy.geVendorPN3 = geVendorPN3;
        _copy.gePhyPMMon = gePhyPMMon;
        _copy.geFPSD = geFPSD;
        _copy.geLaserStatus = geLaserStatus;
        _copy.geId1 = geId1;
        _copy.geFiberType = geFiberType;
        _copy.geCustom1 = geCustom1;
        _copy.geSpeed = geSpeed;
        _copy.geDuplex = geDuplex;
        _copy.geMediaRate = geMediaRate;
        _copy.geMTU = geMTU;
        _copy.geMACAddr = geMACAddr;
        _copy.geGfpMode = geGfpMode;
        _copy.geFlowControl = geFlowControl;
        _copy.geRemoteId = geRemoteId;
        _copy.geLaserControl = geLaserControl;
        _copy.geRowStatus = geRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.9.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "geShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "geSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "gePortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "geOpticalPwrReceivedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "geOpticalPwrReceivedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "geOpticalPwrTransmittedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "geOpticalPwrTransmittedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "geOpticalPwrReceived", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "geOpticalPwrTransmitted", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "gePEC", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "geAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "geOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "geOperStatQlfr", DeviceEntityDescription.FieldType.STRING, 65));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "geAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "geActAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "geWavelength", DeviceEntityDescription.FieldType.FIXED_X100, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "geVendorPN1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "geVendorPN2", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "geVendorPN3", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "gePhyPMMon", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "geFPSD", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "geLaserStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "geId1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "geFiberType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "geCustom1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(26, "geSpeed", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(27, "geDuplex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(28, "geMediaRate", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(29, "geMTU", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(30, "geMACAddr", DeviceEntityDescription.FieldType.STRING, 18));
        description.addField(new DeviceEntityDescription.FieldDescription(31, "geGfpMode", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(32, "geFlowControl", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(33, "geRemoteId", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(34, "geLaserControl", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "geRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
