
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.stmntable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.StmnTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.stmntable.IStmnEntry;
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

public class StmnEntry
    extends DeviceEntity
    implements Serializable, IStmnEntry, IIndexed, IVariableBindingSetter
{

    private int stmnTypeIdx;
    private int stmnShelfIdx;
    private int stmnSlotIdx;
    private int stmnPortIdx;
    private int stmnOpticalPwrReceivedMinTh;
    private int stmnOpticalPwrReceivedMaxTh;
    private int stmnOpticalPwrTransmittedMinTh;
    private int stmnOpticalPwrTransmittedMaxTh;
    private int stmnOpticalPwrReceived;
    private int stmnOpticalPwrTransmitted;
    private int stmnBER;
    private Integer stmnBERTh;
    private String stmnPEC;
    private Integer stmnAdminStatus;
    private int stmnOperStatus;
    private String stmnOperStatQlfr;
    private String stmnAutoEnableTimer;
    private String stmnActAutoEnableTimer;
    private int stmnWavelength;
    private String stmnVendorPN1;
    private String stmnVendorPN2;
    private String stmnVendorPN3;
    private Integer stmnPhyPMMon;
    private int stmnLaserStatus;
    private String stmnId1;
    private Integer stmnFiberType;
    private String stmnCustom1;
    private Integer stmnTOHTransparency;
    private Integer stmnLineMapping;
    private int stmnProtSwEvtType;
    private Integer stmnDCCTransparency;
    private Integer stmnTransparencyChannel;
    private String stmnRemoteId;
    private int stmnLaserControl;
    private int stmnRowStatus;
    private String _index;
    private StmnTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public StmnEntry() {
    }

    public int getStmnTypeIdx() {
        return this.stmnTypeIdx;
    }

    public void setStmnTypeIdx(int stmnTypeIdx) {
        int oldValue = getStmnTypeIdx();
        this.stmnTypeIdx = stmnTypeIdx;
        notifyChange(1, oldValue, stmnTypeIdx);
    }

    public int getStmnShelfIdx() {
        return this.stmnShelfIdx;
    }

    public void setStmnShelfIdx(int stmnShelfIdx) {
        int oldValue = getStmnShelfIdx();
        this.stmnShelfIdx = stmnShelfIdx;
        notifyChange(2, oldValue, stmnShelfIdx);
    }

    public int getStmnSlotIdx() {
        return this.stmnSlotIdx;
    }

    public void setStmnSlotIdx(int stmnSlotIdx) {
        int oldValue = getStmnSlotIdx();
        this.stmnSlotIdx = stmnSlotIdx;
        notifyChange(3, oldValue, stmnSlotIdx);
    }

    public int getStmnPortIdx() {
        return this.stmnPortIdx;
    }

    public void setStmnPortIdx(int stmnPortIdx) {
        int oldValue = getStmnPortIdx();
        this.stmnPortIdx = stmnPortIdx;
        notifyChange(4, oldValue, stmnPortIdx);
    }

    public int getStmnOpticalPwrReceivedMinTh() {
        return this.stmnOpticalPwrReceivedMinTh;
    }

    public void setStmnOpticalPwrReceivedMinTh(int stmnOpticalPwrReceivedMinTh) {
        int oldValue = getStmnOpticalPwrReceivedMinTh();
        this.stmnOpticalPwrReceivedMinTh = stmnOpticalPwrReceivedMinTh;
        notifyChange(5, oldValue, stmnOpticalPwrReceivedMinTh);
    }

    public int getStmnOpticalPwrReceivedMaxTh() {
        return this.stmnOpticalPwrReceivedMaxTh;
    }

    public void setStmnOpticalPwrReceivedMaxTh(int stmnOpticalPwrReceivedMaxTh) {
        int oldValue = getStmnOpticalPwrReceivedMaxTh();
        this.stmnOpticalPwrReceivedMaxTh = stmnOpticalPwrReceivedMaxTh;
        notifyChange(6, oldValue, stmnOpticalPwrReceivedMaxTh);
    }

    public int getStmnOpticalPwrTransmittedMinTh() {
        return this.stmnOpticalPwrTransmittedMinTh;
    }

    public void setStmnOpticalPwrTransmittedMinTh(int stmnOpticalPwrTransmittedMinTh) {
        int oldValue = getStmnOpticalPwrTransmittedMinTh();
        this.stmnOpticalPwrTransmittedMinTh = stmnOpticalPwrTransmittedMinTh;
        notifyChange(7, oldValue, stmnOpticalPwrTransmittedMinTh);
    }

    public int getStmnOpticalPwrTransmittedMaxTh() {
        return this.stmnOpticalPwrTransmittedMaxTh;
    }

    public void setStmnOpticalPwrTransmittedMaxTh(int stmnOpticalPwrTransmittedMaxTh) {
        int oldValue = getStmnOpticalPwrTransmittedMaxTh();
        this.stmnOpticalPwrTransmittedMaxTh = stmnOpticalPwrTransmittedMaxTh;
        notifyChange(8, oldValue, stmnOpticalPwrTransmittedMaxTh);
    }

    public int getStmnOpticalPwrReceived() {
        return this.stmnOpticalPwrReceived;
    }

    public void setStmnOpticalPwrReceived(int stmnOpticalPwrReceived) {
        int oldValue = getStmnOpticalPwrReceived();
        this.stmnOpticalPwrReceived = stmnOpticalPwrReceived;
        notifyChange(9, oldValue, stmnOpticalPwrReceived);
    }

    public int getStmnOpticalPwrTransmitted() {
        return this.stmnOpticalPwrTransmitted;
    }

    public void setStmnOpticalPwrTransmitted(int stmnOpticalPwrTransmitted) {
        int oldValue = getStmnOpticalPwrTransmitted();
        this.stmnOpticalPwrTransmitted = stmnOpticalPwrTransmitted;
        notifyChange(10, oldValue, stmnOpticalPwrTransmitted);
    }

    public int getStmnBER() {
        return this.stmnBER;
    }

    public void setStmnBER(int stmnBER) {
        int oldValue = getStmnBER();
        this.stmnBER = stmnBER;
        notifyChange(11, oldValue, stmnBER);
    }

    public int getStmnBERTh() {
        if (this.stmnBERTh == null) {
            return  5;
        }
        return this.stmnBERTh;
    }

    public boolean isStmnBERThDefined() {
        return (this.stmnBERTh!= null);
    }

    public void setStmnBERTh(int stmnBERTh) {
        int oldValue = getStmnBERTh();
        this.stmnBERTh = stmnBERTh;
        notifyChange(12, oldValue, stmnBERTh);
    }

    public String getStmnPEC() {
        if (this.stmnPEC == null) {
            return "";
        }
        return this.stmnPEC;
    }

    public boolean isStmnPECDefined() {
        return (this.stmnPEC!= null);
    }

    public void setStmnPEC(String stmnPEC) {
        String oldValue = getStmnPEC();
        this.stmnPEC = stmnPEC;
        notifyChange(13, oldValue, stmnPEC);
    }

    public int getStmnAdminStatus() {
        if (this.stmnAdminStatus == null) {
            return  1;
        }
        return this.stmnAdminStatus;
    }

    public boolean isStmnAdminStatusDefined() {
        return (this.stmnAdminStatus!= null);
    }

    public void setStmnAdminStatus(int stmnAdminStatus) {
        int oldValue = getStmnAdminStatus();
        this.stmnAdminStatus = stmnAdminStatus;
        notifyChange(14, oldValue, stmnAdminStatus);
    }

    public int getStmnOperStatus() {
        return this.stmnOperStatus;
    }

    public void setStmnOperStatus(int stmnOperStatus) {
        int oldValue = getStmnOperStatus();
        this.stmnOperStatus = stmnOperStatus;
        notifyChange(15, oldValue, stmnOperStatus);
    }

    public String getStmnOperStatQlfr() {
        return this.stmnOperStatQlfr;
    }

    public void setStmnOperStatQlfr(String stmnOperStatQlfr) {
        String oldValue = getStmnOperStatQlfr();
        this.stmnOperStatQlfr = stmnOperStatQlfr;
        notifyChange(16, oldValue, stmnOperStatQlfr);
    }

    public String getStmnAutoEnableTimer() {
        if (this.stmnAutoEnableTimer == null) {
            return "008-00";
        }
        return this.stmnAutoEnableTimer;
    }

    public boolean isStmnAutoEnableTimerDefined() {
        return (this.stmnAutoEnableTimer!= null);
    }

    public void setStmnAutoEnableTimer(String stmnAutoEnableTimer) {
        String oldValue = getStmnAutoEnableTimer();
        this.stmnAutoEnableTimer = stmnAutoEnableTimer;
        notifyChange(17, oldValue, stmnAutoEnableTimer);
    }

    public String getStmnActAutoEnableTimer() {
        return this.stmnActAutoEnableTimer;
    }

    public void setStmnActAutoEnableTimer(String stmnActAutoEnableTimer) {
        String oldValue = getStmnActAutoEnableTimer();
        this.stmnActAutoEnableTimer = stmnActAutoEnableTimer;
        notifyChange(18, oldValue, stmnActAutoEnableTimer);
    }

    public int getStmnWavelength() {
        return this.stmnWavelength;
    }

    public void setStmnWavelength(int stmnWavelength) {
        int oldValue = getStmnWavelength();
        this.stmnWavelength = stmnWavelength;
        notifyChange(19, oldValue, stmnWavelength);
    }

    public String getStmnVendorPN1() {
        if (this.stmnVendorPN1 == null) {
            return "";
        }
        return this.stmnVendorPN1;
    }

    public boolean isStmnVendorPN1Defined() {
        return (this.stmnVendorPN1 != null);
    }

    public void setStmnVendorPN1(String stmnVendorPN1) {
        String oldValue = getStmnVendorPN1();
        this.stmnVendorPN1 = stmnVendorPN1;
        notifyChange(20, oldValue, stmnVendorPN1);
    }

    public String getStmnVendorPN2() {
        if (this.stmnVendorPN2 == null) {
            return "";
        }
        return this.stmnVendorPN2;
    }

    public boolean isStmnVendorPN2Defined() {
        return (this.stmnVendorPN2 != null);
    }

    public void setStmnVendorPN2(String stmnVendorPN2) {
        String oldValue = getStmnVendorPN2();
        this.stmnVendorPN2 = stmnVendorPN2;
        notifyChange(21, oldValue, stmnVendorPN2);
    }

    public String getStmnVendorPN3() {
        if (this.stmnVendorPN3 == null) {
            return "";
        }
        return this.stmnVendorPN3;
    }

    public boolean isStmnVendorPN3Defined() {
        return (this.stmnVendorPN3 != null);
    }

    public void setStmnVendorPN3(String stmnVendorPN3) {
        String oldValue = getStmnVendorPN3();
        this.stmnVendorPN3 = stmnVendorPN3;
        notifyChange(22, oldValue, stmnVendorPN3);
    }

    public int getStmnPhyPMMon() {
        if (this.stmnPhyPMMon == null) {
            return  2;
        }
        return this.stmnPhyPMMon;
    }

    public boolean isStmnPhyPMMonDefined() {
        return (this.stmnPhyPMMon!= null);
    }

    public void setStmnPhyPMMon(int stmnPhyPMMon) {
        int oldValue = getStmnPhyPMMon();
        this.stmnPhyPMMon = stmnPhyPMMon;
        notifyChange(23, oldValue, stmnPhyPMMon);
    }

    public int getStmnLaserStatus() {
        return this.stmnLaserStatus;
    }

    public void setStmnLaserStatus(int stmnLaserStatus) {
        int oldValue = getStmnLaserStatus();
        this.stmnLaserStatus = stmnLaserStatus;
        notifyChange(24, oldValue, stmnLaserStatus);
    }

    public String getStmnId1() {
        if (this.stmnId1 == null) {
            return "";
        }
        return this.stmnId1;
    }

    public boolean isStmnId1Defined() {
        return (this.stmnId1 != null);
    }

    public void setStmnId1(String stmnId1) {
        String oldValue = getStmnId1();
        this.stmnId1 = stmnId1;
        notifyChange(25, oldValue, stmnId1);
    }

    public int getStmnFiberType() {
        if (this.stmnFiberType == null) {
            return  1;
        }
        return this.stmnFiberType;
    }

    public boolean isStmnFiberTypeDefined() {
        return (this.stmnFiberType!= null);
    }

    public void setStmnFiberType(int stmnFiberType) {
        int oldValue = getStmnFiberType();
        this.stmnFiberType = stmnFiberType;
        notifyChange(26, oldValue, stmnFiberType);
    }

    public String getStmnCustom1() {
        if (this.stmnCustom1 == null) {
            return "";
        }
        return this.stmnCustom1;
    }

    public boolean isStmnCustom1Defined() {
        return (this.stmnCustom1 != null);
    }

    public void setStmnCustom1(String stmnCustom1) {
        String oldValue = getStmnCustom1();
        this.stmnCustom1 = stmnCustom1;
        notifyChange(27, oldValue, stmnCustom1);
    }

    public int getStmnTOHTransparency() {
        if (this.stmnTOHTransparency == null) {
            return  2;
        }
        return this.stmnTOHTransparency;
    }

    public boolean isStmnTOHTransparencyDefined() {
        return (this.stmnTOHTransparency!= null);
    }

    public void setStmnTOHTransparency(int stmnTOHTransparency) {
        int oldValue = getStmnTOHTransparency();
        this.stmnTOHTransparency = stmnTOHTransparency;
        notifyChange(28, oldValue, stmnTOHTransparency);
    }

    public int getStmnLineMapping() {
        if (this.stmnLineMapping == null) {
            return  3;
        }
        return this.stmnLineMapping;
    }

    public boolean isStmnLineMappingDefined() {
        return (this.stmnLineMapping!= null);
    }

    public void setStmnLineMapping(int stmnLineMapping) {
        int oldValue = getStmnLineMapping();
        this.stmnLineMapping = stmnLineMapping;
        notifyChange(29, oldValue, stmnLineMapping);
    }

    public int getStmnProtSwEvtType() {
        return this.stmnProtSwEvtType;
    }

    public void setStmnProtSwEvtType(int stmnProtSwEvtType) {
        int oldValue = getStmnProtSwEvtType();
        this.stmnProtSwEvtType = stmnProtSwEvtType;
        notifyChange(30, oldValue, stmnProtSwEvtType);
    }

    public int getStmnDCCTransparency() {
        if (this.stmnDCCTransparency == null) {
            return  2;
        }
        return this.stmnDCCTransparency;
    }

    public boolean isStmnDCCTransparencyDefined() {
        return (this.stmnDCCTransparency!= null);
    }

    public void setStmnDCCTransparency(int stmnDCCTransparency) {
        int oldValue = getStmnDCCTransparency();
        this.stmnDCCTransparency = stmnDCCTransparency;
        notifyChange(31, oldValue, stmnDCCTransparency);
    }

    public int getStmnTransparencyChannel() {
        if (this.stmnTransparencyChannel == null) {
            return  1;
        }
        return this.stmnTransparencyChannel;
    }

    public boolean isStmnTransparencyChannelDefined() {
        return (this.stmnTransparencyChannel!= null);
    }

    public void setStmnTransparencyChannel(int stmnTransparencyChannel) {
        int oldValue = getStmnTransparencyChannel();
        this.stmnTransparencyChannel = stmnTransparencyChannel;
        notifyChange(32, oldValue, stmnTransparencyChannel);
    }

    public String getStmnRemoteId() {
        if (this.stmnRemoteId == null) {
            return "";
        }
        return this.stmnRemoteId;
    }

    public boolean isStmnRemoteIdDefined() {
        return (this.stmnRemoteId!= null);
    }

    public void setStmnRemoteId(String stmnRemoteId) {
        String oldValue = getStmnRemoteId();
        this.stmnRemoteId = stmnRemoteId;
        notifyChange(33, oldValue, stmnRemoteId);
    }

    public int getStmnLaserControl() {
        return this.stmnLaserControl;
    }

    public void setStmnLaserControl(int stmnLaserControl) {
        int oldValue = getStmnLaserControl();
        this.stmnLaserControl = stmnLaserControl;
        notifyChange(34, oldValue, stmnLaserControl);
    }

    public int getStmnRowStatus() {
        return this.stmnRowStatus;
    }

    public void setStmnRowStatus(int stmnRowStatus) {
        int oldValue = getStmnRowStatus();
        this.stmnRowStatus = stmnRowStatus;
        notifyChange(100, oldValue, stmnRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setStmnTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setStmnShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setStmnSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setStmnPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setStmnOpticalPwrReceivedMinTh(binding.getVariable().toInt());
                break;
            case  6 :
                setStmnOpticalPwrReceivedMaxTh(binding.getVariable().toInt());
                break;
            case  7 :
                setStmnOpticalPwrTransmittedMinTh(binding.getVariable().toInt());
                break;
            case  8 :
                setStmnOpticalPwrTransmittedMaxTh(binding.getVariable().toInt());
                break;
            case  9 :
                setStmnOpticalPwrReceived(binding.getVariable().toInt());
                break;
            case  10 :
                setStmnOpticalPwrTransmitted(binding.getVariable().toInt());
                break;
            case  11 :
                setStmnBER(binding.getVariable().toInt());
                break;
            case  12 :
                setStmnBERTh(binding.getVariable().toInt());
                break;
            case  13 :
                setStmnPEC(binding.getVariable().toString());
                break;
            case  14 :
                setStmnAdminStatus(binding.getVariable().toInt());
                break;
            case  15 :
                setStmnOperStatus(binding.getVariable().toInt());
                break;
            case  16 :
                setStmnOperStatQlfr(binding.getVariable().toString());
                break;
            case  17 :
                setStmnAutoEnableTimer(binding.getVariable().toString());
                break;
            case  18 :
                setStmnActAutoEnableTimer(binding.getVariable().toString());
                break;
            case  19 :
                setStmnWavelength(binding.getVariable().toInt());
                break;
            case  20 :
                setStmnVendorPN1(binding.getVariable().toString());
                break;
            case  21 :
                setStmnVendorPN2(binding.getVariable().toString());
                break;
            case  22 :
                setStmnVendorPN3(binding.getVariable().toString());
                break;
            case  23 :
                setStmnPhyPMMon(binding.getVariable().toInt());
                break;
            case  24 :
                setStmnLaserStatus(binding.getVariable().toInt());
                break;
            case  25 :
                setStmnId1(binding.getVariable().toString());
                break;
            case  26 :
                setStmnFiberType(binding.getVariable().toInt());
                break;
            case  27 :
                setStmnCustom1(binding.getVariable().toString());
                break;
            case  28 :
                setStmnTOHTransparency(binding.getVariable().toInt());
                break;
            case  29 :
                setStmnLineMapping(binding.getVariable().toInt());
                break;
            case  30 :
                setStmnProtSwEvtType(binding.getVariable().toInt());
                break;
            case  31 :
                setStmnDCCTransparency(binding.getVariable().toInt());
                break;
            case  32 :
                setStmnTransparencyChannel(binding.getVariable().toInt());
                break;
            case  33 :
                setStmnRemoteId(binding.getVariable().toString());
                break;
            case  34 :
                setStmnLaserControl(binding.getVariable().toInt());
                break;
            case  100 :
                setStmnRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setStmnTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStmnShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStmnSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStmnPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(StmnTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("stmnTypeIdx", stmnTypeIdx).append("stmnShelfIdx", stmnShelfIdx).append("stmnSlotIdx", stmnSlotIdx).append("stmnPortIdx", stmnPortIdx).append("stmnOpticalPwrReceivedMinTh", stmnOpticalPwrReceivedMinTh).append("stmnOpticalPwrReceivedMaxTh", stmnOpticalPwrReceivedMaxTh).append("stmnOpticalPwrTransmittedMinTh", stmnOpticalPwrTransmittedMinTh).append("stmnOpticalPwrTransmittedMaxTh", stmnOpticalPwrTransmittedMaxTh).append("stmnOpticalPwrReceived", stmnOpticalPwrReceived).append("stmnOpticalPwrTransmitted", stmnOpticalPwrTransmitted).append("stmnBER", stmnBER).append("stmnBERTh", stmnBERTh).append("stmnPEC", stmnPEC).append("stmnAdminStatus", stmnAdminStatus).append("stmnOperStatus", stmnOperStatus).append("stmnOperStatQlfr", stmnOperStatQlfr).append("stmnAutoEnableTimer", stmnAutoEnableTimer).append("stmnActAutoEnableTimer", stmnActAutoEnableTimer).append("stmnWavelength", stmnWavelength).append("stmnVendorPN1", stmnVendorPN1).append("stmnVendorPN2", stmnVendorPN2).append("stmnVendorPN3", stmnVendorPN3).append("stmnPhyPMMon", stmnPhyPMMon).append("stmnLaserStatus", stmnLaserStatus).append("stmnId1", stmnId1).append("stmnFiberType", stmnFiberType).append("stmnCustom1", stmnCustom1).append("stmnTOHTransparency", stmnTOHTransparency).append("stmnLineMapping", stmnLineMapping).append("stmnProtSwEvtType", stmnProtSwEvtType).append("stmnDCCTransparency", stmnDCCTransparency).append("stmnTransparencyChannel", stmnTransparencyChannel).append("stmnRemoteId", stmnRemoteId).append("stmnLaserControl", stmnLaserControl).append("stmnRowStatus", stmnRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(stmnTypeIdx).append(stmnShelfIdx).append(stmnSlotIdx).append(stmnPortIdx).append(stmnOpticalPwrReceivedMinTh).append(stmnOpticalPwrReceivedMaxTh).append(stmnOpticalPwrTransmittedMinTh).append(stmnOpticalPwrTransmittedMaxTh).append(stmnOpticalPwrReceived).append(stmnOpticalPwrTransmitted).append(stmnBER).append(stmnBERTh).append(stmnPEC).append(stmnAdminStatus).append(stmnOperStatus).append(stmnOperStatQlfr).append(stmnAutoEnableTimer).append(stmnActAutoEnableTimer).append(stmnWavelength).append(stmnVendorPN1).append(stmnVendorPN2).append(stmnVendorPN3).append(stmnPhyPMMon).append(stmnLaserStatus).append(stmnId1).append(stmnFiberType).append(stmnCustom1).append(stmnTOHTransparency).append(stmnLineMapping).append(stmnProtSwEvtType).append(stmnDCCTransparency).append(stmnTransparencyChannel).append(stmnRemoteId).append(stmnLaserControl).append(stmnRowStatus).append(_index).toHashCode();
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
        StmnEntry rhs = ((StmnEntry) obj);
        return new EqualsBuilder().append(stmnTypeIdx, rhs.stmnTypeIdx).append(stmnShelfIdx, rhs.stmnShelfIdx).append(stmnSlotIdx, rhs.stmnSlotIdx).append(stmnPortIdx, rhs.stmnPortIdx).append(stmnOpticalPwrReceivedMinTh, rhs.stmnOpticalPwrReceivedMinTh).append(stmnOpticalPwrReceivedMaxTh, rhs.stmnOpticalPwrReceivedMaxTh).append(stmnOpticalPwrTransmittedMinTh, rhs.stmnOpticalPwrTransmittedMinTh).append(stmnOpticalPwrTransmittedMaxTh, rhs.stmnOpticalPwrTransmittedMaxTh).append(stmnOpticalPwrReceived, rhs.stmnOpticalPwrReceived).append(stmnOpticalPwrTransmitted, rhs.stmnOpticalPwrTransmitted).append(stmnBER, rhs.stmnBER).append(stmnBERTh, rhs.stmnBERTh).append(stmnPEC, rhs.stmnPEC).append(stmnAdminStatus, rhs.stmnAdminStatus).append(stmnOperStatus, rhs.stmnOperStatus).append(stmnOperStatQlfr, rhs.stmnOperStatQlfr).append(stmnAutoEnableTimer, rhs.stmnAutoEnableTimer).append(stmnActAutoEnableTimer, rhs.stmnActAutoEnableTimer).append(stmnWavelength, rhs.stmnWavelength).append(stmnVendorPN1, rhs.stmnVendorPN1).append(stmnVendorPN2, rhs.stmnVendorPN2).append(stmnVendorPN3, rhs.stmnVendorPN3).append(stmnPhyPMMon, rhs.stmnPhyPMMon).append(stmnLaserStatus, rhs.stmnLaserStatus).append(stmnId1, rhs.stmnId1).append(stmnFiberType, rhs.stmnFiberType).append(stmnCustom1, rhs.stmnCustom1).append(stmnTOHTransparency, rhs.stmnTOHTransparency).append(stmnLineMapping, rhs.stmnLineMapping).append(stmnProtSwEvtType, rhs.stmnProtSwEvtType).append(stmnDCCTransparency, rhs.stmnDCCTransparency).append(stmnTransparencyChannel, rhs.stmnTransparencyChannel).append(stmnRemoteId, rhs.stmnRemoteId).append(stmnLaserControl, rhs.stmnLaserControl).append(stmnRowStatus, rhs.stmnRowStatus).append(_index, rhs._index).isEquals();
    }

    public StmnEntry clone() {
        StmnEntry _copy = new StmnEntry();
        _copy.stmnTypeIdx = stmnTypeIdx;
        _copy.stmnShelfIdx = stmnShelfIdx;
        _copy.stmnSlotIdx = stmnSlotIdx;
        _copy.stmnPortIdx = stmnPortIdx;
        _copy.stmnOpticalPwrReceivedMinTh = stmnOpticalPwrReceivedMinTh;
        _copy.stmnOpticalPwrReceivedMaxTh = stmnOpticalPwrReceivedMaxTh;
        _copy.stmnOpticalPwrTransmittedMinTh = stmnOpticalPwrTransmittedMinTh;
        _copy.stmnOpticalPwrTransmittedMaxTh = stmnOpticalPwrTransmittedMaxTh;
        _copy.stmnOpticalPwrReceived = stmnOpticalPwrReceived;
        _copy.stmnOpticalPwrTransmitted = stmnOpticalPwrTransmitted;
        _copy.stmnBER = stmnBER;
        _copy.stmnBERTh = stmnBERTh;
        _copy.stmnPEC = stmnPEC;
        _copy.stmnAdminStatus = stmnAdminStatus;
        _copy.stmnOperStatus = stmnOperStatus;
        _copy.stmnOperStatQlfr = stmnOperStatQlfr;
        _copy.stmnAutoEnableTimer = stmnAutoEnableTimer;
        _copy.stmnActAutoEnableTimer = stmnActAutoEnableTimer;
        _copy.stmnWavelength = stmnWavelength;
        _copy.stmnVendorPN1 = stmnVendorPN1;
        _copy.stmnVendorPN2 = stmnVendorPN2;
        _copy.stmnVendorPN3 = stmnVendorPN3;
        _copy.stmnPhyPMMon = stmnPhyPMMon;
        _copy.stmnLaserStatus = stmnLaserStatus;
        _copy.stmnId1 = stmnId1;
        _copy.stmnFiberType = stmnFiberType;
        _copy.stmnCustom1 = stmnCustom1;
        _copy.stmnTOHTransparency = stmnTOHTransparency;
        _copy.stmnLineMapping = stmnLineMapping;
        _copy.stmnProtSwEvtType = stmnProtSwEvtType;
        _copy.stmnDCCTransparency = stmnDCCTransparency;
        _copy.stmnTransparencyChannel = stmnTransparencyChannel;
        _copy.stmnRemoteId = stmnRemoteId;
        _copy.stmnLaserControl = stmnLaserControl;
        _copy.stmnRowStatus = stmnRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.7.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "stmnTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "stmnShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "stmnSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "stmnPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "stmnOpticalPwrReceivedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "stmnOpticalPwrReceivedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "stmnOpticalPwrTransmittedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "stmnOpticalPwrTransmittedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "stmnOpticalPwrReceived", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "stmnOpticalPwrTransmitted", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "stmnBER", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "stmnBERTh", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "stmnPEC", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "stmnAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "stmnOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "stmnOperStatQlfr", DeviceEntityDescription.FieldType.STRING, 65));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "stmnAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "stmnActAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "stmnWavelength", DeviceEntityDescription.FieldType.FIXED_X100, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "stmnVendorPN1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "stmnVendorPN2", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "stmnVendorPN3", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "stmnPhyPMMon", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "stmnLaserStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "stmnId1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(26, "stmnFiberType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(27, "stmnCustom1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(28, "stmnTOHTransparency", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(29, "stmnLineMapping", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(30, "stmnProtSwEvtType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(31, "stmnDCCTransparency", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(32, "stmnTransparencyChannel", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(33, "stmnRemoteId", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(34, "stmnLaserControl", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "stmnRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
