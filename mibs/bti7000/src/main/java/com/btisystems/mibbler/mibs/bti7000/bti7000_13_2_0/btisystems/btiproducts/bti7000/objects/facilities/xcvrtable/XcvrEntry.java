
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.xcvrtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.XcvrTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.xcvrtable.IXcvrEntry;
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

public class XcvrEntry
    extends DeviceEntity
    implements Serializable, IXcvrEntry, IIndexed, IVariableBindingSetter
{

    private int xcvrTypeIdx;
    private int xcvrShelfIdx;
    private int xcvrSlotIdx;
    private int xcvrIdx;
    private int xcvrOpticalPwrReceivedMinTh;
    private int xcvrOpticalPwrReceivedMaxTh;
    private int xcvrOpticalPwrTransmittedMinTh;
    private int xcvrOpticalPwrTransmittedMaxTh;
    private int xcvrOpticalPwrReceived;
    private int xcvrOpticalPwrTransmitted;
    private int xcvrProtSwEvtType;
    private String xcvrPEC;
    private Integer xcvrAdminStatus;
    private int xcvrOperStatus;
    private String xcvrOperStatQlfr;
    private String xcvrAutoEnableTimer;
    private String xcvrActAutoEnableTimer;
    private int xcvrProtocol;
    private int xcvrWavelength;
    private String xcvrVendorPN1;
    private String xcvrVendorPN2;
    private String xcvrVendorPN3;
    private Integer xcvrPhyPMMon;
    private Integer xcvrFPSD;
    private int xcvrLaserStatus;
    private String xcvrId1;
    private String xcvrId2;
    private Integer xcvrFiberType;
    private Integer xcvrGrid;
    private String xcvrCustom1;
    private String xcvrCustom2;
    private String xcvrCustom3;
    private String xcvrTraceLabel;
    private String xcvrExpectedTraceLabel;
    private String xcvrReceivedTraceLabel;
    private Integer xcvrSDBERTh;
    private Integer xcvrLoopbackType;
    private String xcvrRemoteId;
    private int xcvrLaserControl;
    private int xcvrRowStatus;
    private String _index;
    private XcvrTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public XcvrEntry() {
    }

    public int getXcvrTypeIdx() {
        return this.xcvrTypeIdx;
    }

    public void setXcvrTypeIdx(int xcvrTypeIdx) {
        int oldValue = getXcvrTypeIdx();
        this.xcvrTypeIdx = xcvrTypeIdx;
        notifyChange(1, oldValue, xcvrTypeIdx);
    }

    public int getXcvrShelfIdx() {
        return this.xcvrShelfIdx;
    }

    public void setXcvrShelfIdx(int xcvrShelfIdx) {
        int oldValue = getXcvrShelfIdx();
        this.xcvrShelfIdx = xcvrShelfIdx;
        notifyChange(2, oldValue, xcvrShelfIdx);
    }

    public int getXcvrSlotIdx() {
        return this.xcvrSlotIdx;
    }

    public void setXcvrSlotIdx(int xcvrSlotIdx) {
        int oldValue = getXcvrSlotIdx();
        this.xcvrSlotIdx = xcvrSlotIdx;
        notifyChange(3, oldValue, xcvrSlotIdx);
    }

    public int getXcvrIdx() {
        return this.xcvrIdx;
    }

    public void setXcvrIdx(int xcvrIdx) {
        int oldValue = getXcvrIdx();
        this.xcvrIdx = xcvrIdx;
        notifyChange(4, oldValue, xcvrIdx);
    }

    public int getXcvrOpticalPwrReceivedMinTh() {
        return this.xcvrOpticalPwrReceivedMinTh;
    }

    public void setXcvrOpticalPwrReceivedMinTh(int xcvrOpticalPwrReceivedMinTh) {
        int oldValue = getXcvrOpticalPwrReceivedMinTh();
        this.xcvrOpticalPwrReceivedMinTh = xcvrOpticalPwrReceivedMinTh;
        notifyChange(5, oldValue, xcvrOpticalPwrReceivedMinTh);
    }

    public int getXcvrOpticalPwrReceivedMaxTh() {
        return this.xcvrOpticalPwrReceivedMaxTh;
    }

    public void setXcvrOpticalPwrReceivedMaxTh(int xcvrOpticalPwrReceivedMaxTh) {
        int oldValue = getXcvrOpticalPwrReceivedMaxTh();
        this.xcvrOpticalPwrReceivedMaxTh = xcvrOpticalPwrReceivedMaxTh;
        notifyChange(6, oldValue, xcvrOpticalPwrReceivedMaxTh);
    }

    public int getXcvrOpticalPwrTransmittedMinTh() {
        return this.xcvrOpticalPwrTransmittedMinTh;
    }

    public void setXcvrOpticalPwrTransmittedMinTh(int xcvrOpticalPwrTransmittedMinTh) {
        int oldValue = getXcvrOpticalPwrTransmittedMinTh();
        this.xcvrOpticalPwrTransmittedMinTh = xcvrOpticalPwrTransmittedMinTh;
        notifyChange(7, oldValue, xcvrOpticalPwrTransmittedMinTh);
    }

    public int getXcvrOpticalPwrTransmittedMaxTh() {
        return this.xcvrOpticalPwrTransmittedMaxTh;
    }

    public void setXcvrOpticalPwrTransmittedMaxTh(int xcvrOpticalPwrTransmittedMaxTh) {
        int oldValue = getXcvrOpticalPwrTransmittedMaxTh();
        this.xcvrOpticalPwrTransmittedMaxTh = xcvrOpticalPwrTransmittedMaxTh;
        notifyChange(8, oldValue, xcvrOpticalPwrTransmittedMaxTh);
    }

    public int getXcvrOpticalPwrReceived() {
        return this.xcvrOpticalPwrReceived;
    }

    public void setXcvrOpticalPwrReceived(int xcvrOpticalPwrReceived) {
        int oldValue = getXcvrOpticalPwrReceived();
        this.xcvrOpticalPwrReceived = xcvrOpticalPwrReceived;
        notifyChange(9, oldValue, xcvrOpticalPwrReceived);
    }

    public int getXcvrOpticalPwrTransmitted() {
        return this.xcvrOpticalPwrTransmitted;
    }

    public void setXcvrOpticalPwrTransmitted(int xcvrOpticalPwrTransmitted) {
        int oldValue = getXcvrOpticalPwrTransmitted();
        this.xcvrOpticalPwrTransmitted = xcvrOpticalPwrTransmitted;
        notifyChange(10, oldValue, xcvrOpticalPwrTransmitted);
    }

    public int getXcvrProtSwEvtType() {
        return this.xcvrProtSwEvtType;
    }

    public void setXcvrProtSwEvtType(int xcvrProtSwEvtType) {
        int oldValue = getXcvrProtSwEvtType();
        this.xcvrProtSwEvtType = xcvrProtSwEvtType;
        notifyChange(11, oldValue, xcvrProtSwEvtType);
    }

    public String getXcvrPEC() {
        if (this.xcvrPEC == null) {
            return "";
        }
        return this.xcvrPEC;
    }

    public boolean isXcvrPECDefined() {
        return (this.xcvrPEC!= null);
    }

    public void setXcvrPEC(String xcvrPEC) {
        String oldValue = getXcvrPEC();
        this.xcvrPEC = xcvrPEC;
        notifyChange(12, oldValue, xcvrPEC);
    }

    public int getXcvrAdminStatus() {
        if (this.xcvrAdminStatus == null) {
            return  1;
        }
        return this.xcvrAdminStatus;
    }

    public boolean isXcvrAdminStatusDefined() {
        return (this.xcvrAdminStatus!= null);
    }

    public void setXcvrAdminStatus(int xcvrAdminStatus) {
        int oldValue = getXcvrAdminStatus();
        this.xcvrAdminStatus = xcvrAdminStatus;
        notifyChange(13, oldValue, xcvrAdminStatus);
    }

    public int getXcvrOperStatus() {
        return this.xcvrOperStatus;
    }

    public void setXcvrOperStatus(int xcvrOperStatus) {
        int oldValue = getXcvrOperStatus();
        this.xcvrOperStatus = xcvrOperStatus;
        notifyChange(14, oldValue, xcvrOperStatus);
    }

    public String getXcvrOperStatQlfr() {
        return this.xcvrOperStatQlfr;
    }

    public void setXcvrOperStatQlfr(String xcvrOperStatQlfr) {
        String oldValue = getXcvrOperStatQlfr();
        this.xcvrOperStatQlfr = xcvrOperStatQlfr;
        notifyChange(15, oldValue, xcvrOperStatQlfr);
    }

    public String getXcvrAutoEnableTimer() {
        if (this.xcvrAutoEnableTimer == null) {
            return "008-00";
        }
        return this.xcvrAutoEnableTimer;
    }

    public boolean isXcvrAutoEnableTimerDefined() {
        return (this.xcvrAutoEnableTimer!= null);
    }

    public void setXcvrAutoEnableTimer(String xcvrAutoEnableTimer) {
        String oldValue = getXcvrAutoEnableTimer();
        this.xcvrAutoEnableTimer = xcvrAutoEnableTimer;
        notifyChange(16, oldValue, xcvrAutoEnableTimer);
    }

    public String getXcvrActAutoEnableTimer() {
        return this.xcvrActAutoEnableTimer;
    }

    public void setXcvrActAutoEnableTimer(String xcvrActAutoEnableTimer) {
        String oldValue = getXcvrActAutoEnableTimer();
        this.xcvrActAutoEnableTimer = xcvrActAutoEnableTimer;
        notifyChange(17, oldValue, xcvrActAutoEnableTimer);
    }

    public int getXcvrProtocol() {
        return this.xcvrProtocol;
    }

    public void setXcvrProtocol(int xcvrProtocol) {
        int oldValue = getXcvrProtocol();
        this.xcvrProtocol = xcvrProtocol;
        notifyChange(18, oldValue, xcvrProtocol);
    }

    public int getXcvrWavelength() {
        return this.xcvrWavelength;
    }

    public void setXcvrWavelength(int xcvrWavelength) {
        int oldValue = getXcvrWavelength();
        this.xcvrWavelength = xcvrWavelength;
        notifyChange(19, oldValue, xcvrWavelength);
    }

    public String getXcvrVendorPN1() {
        if (this.xcvrVendorPN1 == null) {
            return "";
        }
        return this.xcvrVendorPN1;
    }

    public boolean isXcvrVendorPN1Defined() {
        return (this.xcvrVendorPN1 != null);
    }

    public void setXcvrVendorPN1(String xcvrVendorPN1) {
        String oldValue = getXcvrVendorPN1();
        this.xcvrVendorPN1 = xcvrVendorPN1;
        notifyChange(20, oldValue, xcvrVendorPN1);
    }

    public String getXcvrVendorPN2() {
        if (this.xcvrVendorPN2 == null) {
            return "";
        }
        return this.xcvrVendorPN2;
    }

    public boolean isXcvrVendorPN2Defined() {
        return (this.xcvrVendorPN2 != null);
    }

    public void setXcvrVendorPN2(String xcvrVendorPN2) {
        String oldValue = getXcvrVendorPN2();
        this.xcvrVendorPN2 = xcvrVendorPN2;
        notifyChange(21, oldValue, xcvrVendorPN2);
    }

    public String getXcvrVendorPN3() {
        if (this.xcvrVendorPN3 == null) {
            return "";
        }
        return this.xcvrVendorPN3;
    }

    public boolean isXcvrVendorPN3Defined() {
        return (this.xcvrVendorPN3 != null);
    }

    public void setXcvrVendorPN3(String xcvrVendorPN3) {
        String oldValue = getXcvrVendorPN3();
        this.xcvrVendorPN3 = xcvrVendorPN3;
        notifyChange(22, oldValue, xcvrVendorPN3);
    }

    public int getXcvrPhyPMMon() {
        if (this.xcvrPhyPMMon == null) {
            return  2;
        }
        return this.xcvrPhyPMMon;
    }

    public boolean isXcvrPhyPMMonDefined() {
        return (this.xcvrPhyPMMon!= null);
    }

    public void setXcvrPhyPMMon(int xcvrPhyPMMon) {
        int oldValue = getXcvrPhyPMMon();
        this.xcvrPhyPMMon = xcvrPhyPMMon;
        notifyChange(23, oldValue, xcvrPhyPMMon);
    }

    public int getXcvrFPSD() {
        if (this.xcvrFPSD == null) {
            return  2;
        }
        return this.xcvrFPSD;
    }

    public boolean isXcvrFPSDDefined() {
        return (this.xcvrFPSD!= null);
    }

    public void setXcvrFPSD(int xcvrFPSD) {
        int oldValue = getXcvrFPSD();
        this.xcvrFPSD = xcvrFPSD;
        notifyChange(24, oldValue, xcvrFPSD);
    }

    public int getXcvrLaserStatus() {
        return this.xcvrLaserStatus;
    }

    public void setXcvrLaserStatus(int xcvrLaserStatus) {
        int oldValue = getXcvrLaserStatus();
        this.xcvrLaserStatus = xcvrLaserStatus;
        notifyChange(25, oldValue, xcvrLaserStatus);
    }

    public String getXcvrId1() {
        if (this.xcvrId1 == null) {
            return "";
        }
        return this.xcvrId1;
    }

    public boolean isXcvrId1Defined() {
        return (this.xcvrId1 != null);
    }

    public void setXcvrId1(String xcvrId1) {
        String oldValue = getXcvrId1();
        this.xcvrId1 = xcvrId1;
        notifyChange(26, oldValue, xcvrId1);
    }

    public String getXcvrId2() {
        if (this.xcvrId2 == null) {
            return "";
        }
        return this.xcvrId2;
    }

    public boolean isXcvrId2Defined() {
        return (this.xcvrId2 != null);
    }

    public void setXcvrId2(String xcvrId2) {
        String oldValue = getXcvrId2();
        this.xcvrId2 = xcvrId2;
        notifyChange(27, oldValue, xcvrId2);
    }

    public int getXcvrFiberType() {
        if (this.xcvrFiberType == null) {
            return  1;
        }
        return this.xcvrFiberType;
    }

    public boolean isXcvrFiberTypeDefined() {
        return (this.xcvrFiberType!= null);
    }

    public void setXcvrFiberType(int xcvrFiberType) {
        int oldValue = getXcvrFiberType();
        this.xcvrFiberType = xcvrFiberType;
        notifyChange(28, oldValue, xcvrFiberType);
    }

    public int getXcvrGrid() {
        if (this.xcvrGrid == null) {
            return  1;
        }
        return this.xcvrGrid;
    }

    public boolean isXcvrGridDefined() {
        return (this.xcvrGrid!= null);
    }

    public void setXcvrGrid(int xcvrGrid) {
        int oldValue = getXcvrGrid();
        this.xcvrGrid = xcvrGrid;
        notifyChange(29, oldValue, xcvrGrid);
    }

    public String getXcvrCustom1() {
        if (this.xcvrCustom1 == null) {
            return "";
        }
        return this.xcvrCustom1;
    }

    public boolean isXcvrCustom1Defined() {
        return (this.xcvrCustom1 != null);
    }

    public void setXcvrCustom1(String xcvrCustom1) {
        String oldValue = getXcvrCustom1();
        this.xcvrCustom1 = xcvrCustom1;
        notifyChange(30, oldValue, xcvrCustom1);
    }

    public String getXcvrCustom2() {
        if (this.xcvrCustom2 == null) {
            return "";
        }
        return this.xcvrCustom2;
    }

    public boolean isXcvrCustom2Defined() {
        return (this.xcvrCustom2 != null);
    }

    public void setXcvrCustom2(String xcvrCustom2) {
        String oldValue = getXcvrCustom2();
        this.xcvrCustom2 = xcvrCustom2;
        notifyChange(31, oldValue, xcvrCustom2);
    }

    public String getXcvrCustom3() {
        if (this.xcvrCustom3 == null) {
            return "";
        }
        return this.xcvrCustom3;
    }

    public boolean isXcvrCustom3Defined() {
        return (this.xcvrCustom3 != null);
    }

    public void setXcvrCustom3(String xcvrCustom3) {
        String oldValue = getXcvrCustom3();
        this.xcvrCustom3 = xcvrCustom3;
        notifyChange(32, oldValue, xcvrCustom3);
    }

    public String getXcvrTraceLabel() {
        if (this.xcvrTraceLabel == null) {
            return "";
        }
        return this.xcvrTraceLabel;
    }

    public boolean isXcvrTraceLabelDefined() {
        return (this.xcvrTraceLabel!= null);
    }

    public void setXcvrTraceLabel(String xcvrTraceLabel) {
        String oldValue = getXcvrTraceLabel();
        this.xcvrTraceLabel = xcvrTraceLabel;
        notifyChange(33, oldValue, xcvrTraceLabel);
    }

    public String getXcvrExpectedTraceLabel() {
        if (this.xcvrExpectedTraceLabel == null) {
            return "";
        }
        return this.xcvrExpectedTraceLabel;
    }

    public boolean isXcvrExpectedTraceLabelDefined() {
        return (this.xcvrExpectedTraceLabel!= null);
    }

    public void setXcvrExpectedTraceLabel(String xcvrExpectedTraceLabel) {
        String oldValue = getXcvrExpectedTraceLabel();
        this.xcvrExpectedTraceLabel = xcvrExpectedTraceLabel;
        notifyChange(34, oldValue, xcvrExpectedTraceLabel);
    }

    public String getXcvrReceivedTraceLabel() {
        return this.xcvrReceivedTraceLabel;
    }

    public void setXcvrReceivedTraceLabel(String xcvrReceivedTraceLabel) {
        String oldValue = getXcvrReceivedTraceLabel();
        this.xcvrReceivedTraceLabel = xcvrReceivedTraceLabel;
        notifyChange(35, oldValue, xcvrReceivedTraceLabel);
    }

    public int getXcvrSDBERTh() {
        if (this.xcvrSDBERTh == null) {
            return  1;
        }
        return this.xcvrSDBERTh;
    }

    public boolean isXcvrSDBERThDefined() {
        return (this.xcvrSDBERTh!= null);
    }

    public void setXcvrSDBERTh(int xcvrSDBERTh) {
        int oldValue = getXcvrSDBERTh();
        this.xcvrSDBERTh = xcvrSDBERTh;
        notifyChange(36, oldValue, xcvrSDBERTh);
    }

    public int getXcvrLoopbackType() {
        if (this.xcvrLoopbackType == null) {
            return  0;
        }
        return this.xcvrLoopbackType;
    }

    public boolean isXcvrLoopbackTypeDefined() {
        return (this.xcvrLoopbackType!= null);
    }

    public void setXcvrLoopbackType(int xcvrLoopbackType) {
        int oldValue = getXcvrLoopbackType();
        this.xcvrLoopbackType = xcvrLoopbackType;
        notifyChange(37, oldValue, xcvrLoopbackType);
    }

    public String getXcvrRemoteId() {
        if (this.xcvrRemoteId == null) {
            return "";
        }
        return this.xcvrRemoteId;
    }

    public boolean isXcvrRemoteIdDefined() {
        return (this.xcvrRemoteId!= null);
    }

    public void setXcvrRemoteId(String xcvrRemoteId) {
        String oldValue = getXcvrRemoteId();
        this.xcvrRemoteId = xcvrRemoteId;
        notifyChange(38, oldValue, xcvrRemoteId);
    }

    public int getXcvrLaserControl() {
        return this.xcvrLaserControl;
    }

    public void setXcvrLaserControl(int xcvrLaserControl) {
        int oldValue = getXcvrLaserControl();
        this.xcvrLaserControl = xcvrLaserControl;
        notifyChange(39, oldValue, xcvrLaserControl);
    }

    public int getXcvrRowStatus() {
        return this.xcvrRowStatus;
    }

    public void setXcvrRowStatus(int xcvrRowStatus) {
        int oldValue = getXcvrRowStatus();
        this.xcvrRowStatus = xcvrRowStatus;
        notifyChange(100, oldValue, xcvrRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setXcvrTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setXcvrShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setXcvrSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setXcvrIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setXcvrOpticalPwrReceivedMinTh(binding.getVariable().toInt());
                break;
            case  6 :
                setXcvrOpticalPwrReceivedMaxTh(binding.getVariable().toInt());
                break;
            case  7 :
                setXcvrOpticalPwrTransmittedMinTh(binding.getVariable().toInt());
                break;
            case  8 :
                setXcvrOpticalPwrTransmittedMaxTh(binding.getVariable().toInt());
                break;
            case  9 :
                setXcvrOpticalPwrReceived(binding.getVariable().toInt());
                break;
            case  10 :
                setXcvrOpticalPwrTransmitted(binding.getVariable().toInt());
                break;
            case  11 :
                setXcvrProtSwEvtType(binding.getVariable().toInt());
                break;
            case  12 :
                setXcvrPEC(binding.getVariable().toString());
                break;
            case  13 :
                setXcvrAdminStatus(binding.getVariable().toInt());
                break;
            case  14 :
                setXcvrOperStatus(binding.getVariable().toInt());
                break;
            case  15 :
                setXcvrOperStatQlfr(binding.getVariable().toString());
                break;
            case  16 :
                setXcvrAutoEnableTimer(binding.getVariable().toString());
                break;
            case  17 :
                setXcvrActAutoEnableTimer(binding.getVariable().toString());
                break;
            case  18 :
                setXcvrProtocol(binding.getVariable().toInt());
                break;
            case  19 :
                setXcvrWavelength(binding.getVariable().toInt());
                break;
            case  20 :
                setXcvrVendorPN1(binding.getVariable().toString());
                break;
            case  21 :
                setXcvrVendorPN2(binding.getVariable().toString());
                break;
            case  22 :
                setXcvrVendorPN3(binding.getVariable().toString());
                break;
            case  23 :
                setXcvrPhyPMMon(binding.getVariable().toInt());
                break;
            case  24 :
                setXcvrFPSD(binding.getVariable().toInt());
                break;
            case  25 :
                setXcvrLaserStatus(binding.getVariable().toInt());
                break;
            case  26 :
                setXcvrId1(binding.getVariable().toString());
                break;
            case  27 :
                setXcvrId2(binding.getVariable().toString());
                break;
            case  28 :
                setXcvrFiberType(binding.getVariable().toInt());
                break;
            case  29 :
                setXcvrGrid(binding.getVariable().toInt());
                break;
            case  30 :
                setXcvrCustom1(binding.getVariable().toString());
                break;
            case  31 :
                setXcvrCustom2(binding.getVariable().toString());
                break;
            case  32 :
                setXcvrCustom3(binding.getVariable().toString());
                break;
            case  33 :
                setXcvrTraceLabel(binding.getVariable().toString());
                break;
            case  34 :
                setXcvrExpectedTraceLabel(binding.getVariable().toString());
                break;
            case  35 :
                setXcvrReceivedTraceLabel(binding.getVariable().toString());
                break;
            case  36 :
                setXcvrSDBERTh(binding.getVariable().toInt());
                break;
            case  37 :
                setXcvrLoopbackType(binding.getVariable().toInt());
                break;
            case  38 :
                setXcvrRemoteId(binding.getVariable().toString());
                break;
            case  39 :
                setXcvrLaserControl(binding.getVariable().toInt());
                break;
            case  100 :
                setXcvrRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setXcvrTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(XcvrTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("xcvrTypeIdx", xcvrTypeIdx).append("xcvrShelfIdx", xcvrShelfIdx).append("xcvrSlotIdx", xcvrSlotIdx).append("xcvrIdx", xcvrIdx).append("xcvrOpticalPwrReceivedMinTh", xcvrOpticalPwrReceivedMinTh).append("xcvrOpticalPwrReceivedMaxTh", xcvrOpticalPwrReceivedMaxTh).append("xcvrOpticalPwrTransmittedMinTh", xcvrOpticalPwrTransmittedMinTh).append("xcvrOpticalPwrTransmittedMaxTh", xcvrOpticalPwrTransmittedMaxTh).append("xcvrOpticalPwrReceived", xcvrOpticalPwrReceived).append("xcvrOpticalPwrTransmitted", xcvrOpticalPwrTransmitted).append("xcvrProtSwEvtType", xcvrProtSwEvtType).append("xcvrPEC", xcvrPEC).append("xcvrAdminStatus", xcvrAdminStatus).append("xcvrOperStatus", xcvrOperStatus).append("xcvrOperStatQlfr", xcvrOperStatQlfr).append("xcvrAutoEnableTimer", xcvrAutoEnableTimer).append("xcvrActAutoEnableTimer", xcvrActAutoEnableTimer).append("xcvrProtocol", xcvrProtocol).append("xcvrWavelength", xcvrWavelength).append("xcvrVendorPN1", xcvrVendorPN1).append("xcvrVendorPN2", xcvrVendorPN2).append("xcvrVendorPN3", xcvrVendorPN3).append("xcvrPhyPMMon", xcvrPhyPMMon).append("xcvrFPSD", xcvrFPSD).append("xcvrLaserStatus", xcvrLaserStatus).append("xcvrId1", xcvrId1).append("xcvrId2", xcvrId2).append("xcvrFiberType", xcvrFiberType).append("xcvrGrid", xcvrGrid).append("xcvrCustom1", xcvrCustom1).append("xcvrCustom2", xcvrCustom2).append("xcvrCustom3", xcvrCustom3).append("xcvrTraceLabel", xcvrTraceLabel).append("xcvrExpectedTraceLabel", xcvrExpectedTraceLabel).append("xcvrReceivedTraceLabel", xcvrReceivedTraceLabel).append("xcvrSDBERTh", xcvrSDBERTh).append("xcvrLoopbackType", xcvrLoopbackType).append("xcvrRemoteId", xcvrRemoteId).append("xcvrLaserControl", xcvrLaserControl).append("xcvrRowStatus", xcvrRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(xcvrTypeIdx).append(xcvrShelfIdx).append(xcvrSlotIdx).append(xcvrIdx).append(xcvrOpticalPwrReceivedMinTh).append(xcvrOpticalPwrReceivedMaxTh).append(xcvrOpticalPwrTransmittedMinTh).append(xcvrOpticalPwrTransmittedMaxTh).append(xcvrOpticalPwrReceived).append(xcvrOpticalPwrTransmitted).append(xcvrProtSwEvtType).append(xcvrPEC).append(xcvrAdminStatus).append(xcvrOperStatus).append(xcvrOperStatQlfr).append(xcvrAutoEnableTimer).append(xcvrActAutoEnableTimer).append(xcvrProtocol).append(xcvrWavelength).append(xcvrVendorPN1).append(xcvrVendorPN2).append(xcvrVendorPN3).append(xcvrPhyPMMon).append(xcvrFPSD).append(xcvrLaserStatus).append(xcvrId1).append(xcvrId2).append(xcvrFiberType).append(xcvrGrid).append(xcvrCustom1).append(xcvrCustom2).append(xcvrCustom3).append(xcvrTraceLabel).append(xcvrExpectedTraceLabel).append(xcvrReceivedTraceLabel).append(xcvrSDBERTh).append(xcvrLoopbackType).append(xcvrRemoteId).append(xcvrLaserControl).append(xcvrRowStatus).append(_index).toHashCode();
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
        XcvrEntry rhs = ((XcvrEntry) obj);
        return new EqualsBuilder().append(xcvrTypeIdx, rhs.xcvrTypeIdx).append(xcvrShelfIdx, rhs.xcvrShelfIdx).append(xcvrSlotIdx, rhs.xcvrSlotIdx).append(xcvrIdx, rhs.xcvrIdx).append(xcvrOpticalPwrReceivedMinTh, rhs.xcvrOpticalPwrReceivedMinTh).append(xcvrOpticalPwrReceivedMaxTh, rhs.xcvrOpticalPwrReceivedMaxTh).append(xcvrOpticalPwrTransmittedMinTh, rhs.xcvrOpticalPwrTransmittedMinTh).append(xcvrOpticalPwrTransmittedMaxTh, rhs.xcvrOpticalPwrTransmittedMaxTh).append(xcvrOpticalPwrReceived, rhs.xcvrOpticalPwrReceived).append(xcvrOpticalPwrTransmitted, rhs.xcvrOpticalPwrTransmitted).append(xcvrProtSwEvtType, rhs.xcvrProtSwEvtType).append(xcvrPEC, rhs.xcvrPEC).append(xcvrAdminStatus, rhs.xcvrAdminStatus).append(xcvrOperStatus, rhs.xcvrOperStatus).append(xcvrOperStatQlfr, rhs.xcvrOperStatQlfr).append(xcvrAutoEnableTimer, rhs.xcvrAutoEnableTimer).append(xcvrActAutoEnableTimer, rhs.xcvrActAutoEnableTimer).append(xcvrProtocol, rhs.xcvrProtocol).append(xcvrWavelength, rhs.xcvrWavelength).append(xcvrVendorPN1, rhs.xcvrVendorPN1).append(xcvrVendorPN2, rhs.xcvrVendorPN2).append(xcvrVendorPN3, rhs.xcvrVendorPN3).append(xcvrPhyPMMon, rhs.xcvrPhyPMMon).append(xcvrFPSD, rhs.xcvrFPSD).append(xcvrLaserStatus, rhs.xcvrLaserStatus).append(xcvrId1, rhs.xcvrId1).append(xcvrId2, rhs.xcvrId2).append(xcvrFiberType, rhs.xcvrFiberType).append(xcvrGrid, rhs.xcvrGrid).append(xcvrCustom1, rhs.xcvrCustom1).append(xcvrCustom2, rhs.xcvrCustom2).append(xcvrCustom3, rhs.xcvrCustom3).append(xcvrTraceLabel, rhs.xcvrTraceLabel).append(xcvrExpectedTraceLabel, rhs.xcvrExpectedTraceLabel).append(xcvrReceivedTraceLabel, rhs.xcvrReceivedTraceLabel).append(xcvrSDBERTh, rhs.xcvrSDBERTh).append(xcvrLoopbackType, rhs.xcvrLoopbackType).append(xcvrRemoteId, rhs.xcvrRemoteId).append(xcvrLaserControl, rhs.xcvrLaserControl).append(xcvrRowStatus, rhs.xcvrRowStatus).append(_index, rhs._index).isEquals();
    }

    public XcvrEntry clone() {
        XcvrEntry _copy = new XcvrEntry();
        _copy.xcvrTypeIdx = xcvrTypeIdx;
        _copy.xcvrShelfIdx = xcvrShelfIdx;
        _copy.xcvrSlotIdx = xcvrSlotIdx;
        _copy.xcvrIdx = xcvrIdx;
        _copy.xcvrOpticalPwrReceivedMinTh = xcvrOpticalPwrReceivedMinTh;
        _copy.xcvrOpticalPwrReceivedMaxTh = xcvrOpticalPwrReceivedMaxTh;
        _copy.xcvrOpticalPwrTransmittedMinTh = xcvrOpticalPwrTransmittedMinTh;
        _copy.xcvrOpticalPwrTransmittedMaxTh = xcvrOpticalPwrTransmittedMaxTh;
        _copy.xcvrOpticalPwrReceived = xcvrOpticalPwrReceived;
        _copy.xcvrOpticalPwrTransmitted = xcvrOpticalPwrTransmitted;
        _copy.xcvrProtSwEvtType = xcvrProtSwEvtType;
        _copy.xcvrPEC = xcvrPEC;
        _copy.xcvrAdminStatus = xcvrAdminStatus;
        _copy.xcvrOperStatus = xcvrOperStatus;
        _copy.xcvrOperStatQlfr = xcvrOperStatQlfr;
        _copy.xcvrAutoEnableTimer = xcvrAutoEnableTimer;
        _copy.xcvrActAutoEnableTimer = xcvrActAutoEnableTimer;
        _copy.xcvrProtocol = xcvrProtocol;
        _copy.xcvrWavelength = xcvrWavelength;
        _copy.xcvrVendorPN1 = xcvrVendorPN1;
        _copy.xcvrVendorPN2 = xcvrVendorPN2;
        _copy.xcvrVendorPN3 = xcvrVendorPN3;
        _copy.xcvrPhyPMMon = xcvrPhyPMMon;
        _copy.xcvrFPSD = xcvrFPSD;
        _copy.xcvrLaserStatus = xcvrLaserStatus;
        _copy.xcvrId1 = xcvrId1;
        _copy.xcvrId2 = xcvrId2;
        _copy.xcvrFiberType = xcvrFiberType;
        _copy.xcvrGrid = xcvrGrid;
        _copy.xcvrCustom1 = xcvrCustom1;
        _copy.xcvrCustom2 = xcvrCustom2;
        _copy.xcvrCustom3 = xcvrCustom3;
        _copy.xcvrTraceLabel = xcvrTraceLabel;
        _copy.xcvrExpectedTraceLabel = xcvrExpectedTraceLabel;
        _copy.xcvrReceivedTraceLabel = xcvrReceivedTraceLabel;
        _copy.xcvrSDBERTh = xcvrSDBERTh;
        _copy.xcvrLoopbackType = xcvrLoopbackType;
        _copy.xcvrRemoteId = xcvrRemoteId;
        _copy.xcvrLaserControl = xcvrLaserControl;
        _copy.xcvrRowStatus = xcvrRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "xcvrTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "xcvrShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "xcvrSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "xcvrIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "xcvrOpticalPwrReceivedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "xcvrOpticalPwrReceivedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "xcvrOpticalPwrTransmittedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "xcvrOpticalPwrTransmittedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "xcvrOpticalPwrReceived", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "xcvrOpticalPwrTransmitted", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "xcvrProtSwEvtType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "xcvrPEC", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "xcvrAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "xcvrOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "xcvrOperStatQlfr", DeviceEntityDescription.FieldType.STRING, 65));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "xcvrAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "xcvrActAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "xcvrProtocol", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "xcvrWavelength", DeviceEntityDescription.FieldType.FIXED_X100, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "xcvrVendorPN1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "xcvrVendorPN2", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "xcvrVendorPN3", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "xcvrPhyPMMon", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "xcvrFPSD", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "xcvrLaserStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(26, "xcvrId1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(27, "xcvrId2", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(28, "xcvrFiberType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(29, "xcvrGrid", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(30, "xcvrCustom1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(31, "xcvrCustom2", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(32, "xcvrCustom3", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(33, "xcvrTraceLabel", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(34, "xcvrExpectedTraceLabel", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(35, "xcvrReceivedTraceLabel", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(36, "xcvrSDBERTh", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(37, "xcvrLoopbackType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(38, "xcvrRemoteId", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(39, "xcvrLaserControl", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "xcvrRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
