
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.amdtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.AmdTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.amdtable.IAmdEntry;
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

public class AmdEntry
    extends DeviceEntity
    implements Serializable, IAmdEntry, IIndexed, IVariableBindingSetter
{

    private int amdTypeIdx;
    private int amdShelfIdx;
    private int amdSlotIdx;
    private int amdLineIdx;
    private int amdPortIdx;
    private int amdOpticalPwrReceivedMinTh;
    private int amdOpticalPwrReceivedMaxTh;
    private int amdOpticalPwrTransmittedTarget;
    private int amdOpticalAttenuationTarget;
    private int amdOpticalPwrReceived;
    private int amdOpticalPwrTransmitted;
    private int amdOpticalAttentuation;
    private Integer amdAdminStatus;
    private int amdOperStatus;
    private String amdOperStatQlfr;
    private String amdAutoEnableTimer;
    private String amdActAutoEnableTimer;
    private int amdWavelength;
    private String amdId1;
    private String amdId2;
    private Integer amdFiberType;
    private Integer amdGrid;
    private String amdCustom1;
    private String amdCustom2;
    private String amdCustom3;
    private int amdRowStatus;
    private String _index;
    private AmdTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AmdEntry() {
    }

    public int getAmdTypeIdx() {
        return this.amdTypeIdx;
    }

    public void setAmdTypeIdx(int amdTypeIdx) {
        int oldValue = getAmdTypeIdx();
        this.amdTypeIdx = amdTypeIdx;
        notifyChange(1, oldValue, amdTypeIdx);
    }

    public int getAmdShelfIdx() {
        return this.amdShelfIdx;
    }

    public void setAmdShelfIdx(int amdShelfIdx) {
        int oldValue = getAmdShelfIdx();
        this.amdShelfIdx = amdShelfIdx;
        notifyChange(2, oldValue, amdShelfIdx);
    }

    public int getAmdSlotIdx() {
        return this.amdSlotIdx;
    }

    public void setAmdSlotIdx(int amdSlotIdx) {
        int oldValue = getAmdSlotIdx();
        this.amdSlotIdx = amdSlotIdx;
        notifyChange(3, oldValue, amdSlotIdx);
    }

    public int getAmdLineIdx() {
        return this.amdLineIdx;
    }

    public void setAmdLineIdx(int amdLineIdx) {
        int oldValue = getAmdLineIdx();
        this.amdLineIdx = amdLineIdx;
        notifyChange(4, oldValue, amdLineIdx);
    }

    public int getAmdPortIdx() {
        return this.amdPortIdx;
    }

    public void setAmdPortIdx(int amdPortIdx) {
        int oldValue = getAmdPortIdx();
        this.amdPortIdx = amdPortIdx;
        notifyChange(5, oldValue, amdPortIdx);
    }

    public int getAmdOpticalPwrReceivedMinTh() {
        return this.amdOpticalPwrReceivedMinTh;
    }

    public void setAmdOpticalPwrReceivedMinTh(int amdOpticalPwrReceivedMinTh) {
        int oldValue = getAmdOpticalPwrReceivedMinTh();
        this.amdOpticalPwrReceivedMinTh = amdOpticalPwrReceivedMinTh;
        notifyChange(6, oldValue, amdOpticalPwrReceivedMinTh);
    }

    public int getAmdOpticalPwrReceivedMaxTh() {
        return this.amdOpticalPwrReceivedMaxTh;
    }

    public void setAmdOpticalPwrReceivedMaxTh(int amdOpticalPwrReceivedMaxTh) {
        int oldValue = getAmdOpticalPwrReceivedMaxTh();
        this.amdOpticalPwrReceivedMaxTh = amdOpticalPwrReceivedMaxTh;
        notifyChange(7, oldValue, amdOpticalPwrReceivedMaxTh);
    }

    public int getAmdOpticalPwrTransmittedTarget() {
        return this.amdOpticalPwrTransmittedTarget;
    }

    public void setAmdOpticalPwrTransmittedTarget(int amdOpticalPwrTransmittedTarget) {
        int oldValue = getAmdOpticalPwrTransmittedTarget();
        this.amdOpticalPwrTransmittedTarget = amdOpticalPwrTransmittedTarget;
        notifyChange(8, oldValue, amdOpticalPwrTransmittedTarget);
    }

    public int getAmdOpticalAttenuationTarget() {
        return this.amdOpticalAttenuationTarget;
    }

    public void setAmdOpticalAttenuationTarget(int amdOpticalAttenuationTarget) {
        int oldValue = getAmdOpticalAttenuationTarget();
        this.amdOpticalAttenuationTarget = amdOpticalAttenuationTarget;
        notifyChange(9, oldValue, amdOpticalAttenuationTarget);
    }

    public int getAmdOpticalPwrReceived() {
        return this.amdOpticalPwrReceived;
    }

    public void setAmdOpticalPwrReceived(int amdOpticalPwrReceived) {
        int oldValue = getAmdOpticalPwrReceived();
        this.amdOpticalPwrReceived = amdOpticalPwrReceived;
        notifyChange(10, oldValue, amdOpticalPwrReceived);
    }

    public int getAmdOpticalPwrTransmitted() {
        return this.amdOpticalPwrTransmitted;
    }

    public void setAmdOpticalPwrTransmitted(int amdOpticalPwrTransmitted) {
        int oldValue = getAmdOpticalPwrTransmitted();
        this.amdOpticalPwrTransmitted = amdOpticalPwrTransmitted;
        notifyChange(11, oldValue, amdOpticalPwrTransmitted);
    }

    public int getAmdOpticalAttentuation() {
        return this.amdOpticalAttentuation;
    }

    public void setAmdOpticalAttentuation(int amdOpticalAttentuation) {
        int oldValue = getAmdOpticalAttentuation();
        this.amdOpticalAttentuation = amdOpticalAttentuation;
        notifyChange(12, oldValue, amdOpticalAttentuation);
    }

    public int getAmdAdminStatus() {
        if (this.amdAdminStatus == null) {
            return  1;
        }
        return this.amdAdminStatus;
    }

    public boolean isAmdAdminStatusDefined() {
        return (this.amdAdminStatus!= null);
    }

    public void setAmdAdminStatus(int amdAdminStatus) {
        int oldValue = getAmdAdminStatus();
        this.amdAdminStatus = amdAdminStatus;
        notifyChange(13, oldValue, amdAdminStatus);
    }

    public int getAmdOperStatus() {
        return this.amdOperStatus;
    }

    public void setAmdOperStatus(int amdOperStatus) {
        int oldValue = getAmdOperStatus();
        this.amdOperStatus = amdOperStatus;
        notifyChange(14, oldValue, amdOperStatus);
    }

    public String getAmdOperStatQlfr() {
        return this.amdOperStatQlfr;
    }

    public void setAmdOperStatQlfr(String amdOperStatQlfr) {
        String oldValue = getAmdOperStatQlfr();
        this.amdOperStatQlfr = amdOperStatQlfr;
        notifyChange(15, oldValue, amdOperStatQlfr);
    }

    public String getAmdAutoEnableTimer() {
        if (this.amdAutoEnableTimer == null) {
            return "008-00";
        }
        return this.amdAutoEnableTimer;
    }

    public boolean isAmdAutoEnableTimerDefined() {
        return (this.amdAutoEnableTimer!= null);
    }

    public void setAmdAutoEnableTimer(String amdAutoEnableTimer) {
        String oldValue = getAmdAutoEnableTimer();
        this.amdAutoEnableTimer = amdAutoEnableTimer;
        notifyChange(16, oldValue, amdAutoEnableTimer);
    }

    public String getAmdActAutoEnableTimer() {
        return this.amdActAutoEnableTimer;
    }

    public void setAmdActAutoEnableTimer(String amdActAutoEnableTimer) {
        String oldValue = getAmdActAutoEnableTimer();
        this.amdActAutoEnableTimer = amdActAutoEnableTimer;
        notifyChange(17, oldValue, amdActAutoEnableTimer);
    }

    public int getAmdWavelength() {
        return this.amdWavelength;
    }

    public void setAmdWavelength(int amdWavelength) {
        int oldValue = getAmdWavelength();
        this.amdWavelength = amdWavelength;
        notifyChange(18, oldValue, amdWavelength);
    }

    public String getAmdId1() {
        if (this.amdId1 == null) {
            return "";
        }
        return this.amdId1;
    }

    public boolean isAmdId1Defined() {
        return (this.amdId1 != null);
    }

    public void setAmdId1(String amdId1) {
        String oldValue = getAmdId1();
        this.amdId1 = amdId1;
        notifyChange(19, oldValue, amdId1);
    }

    public String getAmdId2() {
        if (this.amdId2 == null) {
            return "";
        }
        return this.amdId2;
    }

    public boolean isAmdId2Defined() {
        return (this.amdId2 != null);
    }

    public void setAmdId2(String amdId2) {
        String oldValue = getAmdId2();
        this.amdId2 = amdId2;
        notifyChange(20, oldValue, amdId2);
    }

    public int getAmdFiberType() {
        if (this.amdFiberType == null) {
            return  1;
        }
        return this.amdFiberType;
    }

    public boolean isAmdFiberTypeDefined() {
        return (this.amdFiberType!= null);
    }

    public void setAmdFiberType(int amdFiberType) {
        int oldValue = getAmdFiberType();
        this.amdFiberType = amdFiberType;
        notifyChange(21, oldValue, amdFiberType);
    }

    public int getAmdGrid() {
        if (this.amdGrid == null) {
            return  1;
        }
        return this.amdGrid;
    }

    public boolean isAmdGridDefined() {
        return (this.amdGrid!= null);
    }

    public void setAmdGrid(int amdGrid) {
        int oldValue = getAmdGrid();
        this.amdGrid = amdGrid;
        notifyChange(22, oldValue, amdGrid);
    }

    public String getAmdCustom1() {
        if (this.amdCustom1 == null) {
            return "";
        }
        return this.amdCustom1;
    }

    public boolean isAmdCustom1Defined() {
        return (this.amdCustom1 != null);
    }

    public void setAmdCustom1(String amdCustom1) {
        String oldValue = getAmdCustom1();
        this.amdCustom1 = amdCustom1;
        notifyChange(23, oldValue, amdCustom1);
    }

    public String getAmdCustom2() {
        if (this.amdCustom2 == null) {
            return "";
        }
        return this.amdCustom2;
    }

    public boolean isAmdCustom2Defined() {
        return (this.amdCustom2 != null);
    }

    public void setAmdCustom2(String amdCustom2) {
        String oldValue = getAmdCustom2();
        this.amdCustom2 = amdCustom2;
        notifyChange(24, oldValue, amdCustom2);
    }

    public String getAmdCustom3() {
        if (this.amdCustom3 == null) {
            return "";
        }
        return this.amdCustom3;
    }

    public boolean isAmdCustom3Defined() {
        return (this.amdCustom3 != null);
    }

    public void setAmdCustom3(String amdCustom3) {
        String oldValue = getAmdCustom3();
        this.amdCustom3 = amdCustom3;
        notifyChange(25, oldValue, amdCustom3);
    }

    public int getAmdRowStatus() {
        return this.amdRowStatus;
    }

    public void setAmdRowStatus(int amdRowStatus) {
        int oldValue = getAmdRowStatus();
        this.amdRowStatus = amdRowStatus;
        notifyChange(100, oldValue, amdRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setAmdTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setAmdShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setAmdSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setAmdLineIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setAmdPortIdx(binding.getVariable().toInt());
                break;
            case  6 :
                setAmdOpticalPwrReceivedMinTh(binding.getVariable().toInt());
                break;
            case  7 :
                setAmdOpticalPwrReceivedMaxTh(binding.getVariable().toInt());
                break;
            case  8 :
                setAmdOpticalPwrTransmittedTarget(binding.getVariable().toInt());
                break;
            case  9 :
                setAmdOpticalAttenuationTarget(binding.getVariable().toInt());
                break;
            case  10 :
                setAmdOpticalPwrReceived(binding.getVariable().toInt());
                break;
            case  11 :
                setAmdOpticalPwrTransmitted(binding.getVariable().toInt());
                break;
            case  12 :
                setAmdOpticalAttentuation(binding.getVariable().toInt());
                break;
            case  13 :
                setAmdAdminStatus(binding.getVariable().toInt());
                break;
            case  14 :
                setAmdOperStatus(binding.getVariable().toInt());
                break;
            case  15 :
                setAmdOperStatQlfr(binding.getVariable().toString());
                break;
            case  16 :
                setAmdAutoEnableTimer(binding.getVariable().toString());
                break;
            case  17 :
                setAmdActAutoEnableTimer(binding.getVariable().toString());
                break;
            case  18 :
                setAmdWavelength(binding.getVariable().toInt());
                break;
            case  19 :
                setAmdId1(binding.getVariable().toString());
                break;
            case  20 :
                setAmdId2(binding.getVariable().toString());
                break;
            case  21 :
                setAmdFiberType(binding.getVariable().toInt());
                break;
            case  22 :
                setAmdGrid(binding.getVariable().toInt());
                break;
            case  23 :
                setAmdCustom1(binding.getVariable().toString());
                break;
            case  24 :
                setAmdCustom2(binding.getVariable().toString());
                break;
            case  25 :
                setAmdCustom3(binding.getVariable().toString());
                break;
            case  100 :
                setAmdRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setAmdTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setAmdShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setAmdSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setAmdLineIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setAmdPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(AmdTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("amdTypeIdx", amdTypeIdx).append("amdShelfIdx", amdShelfIdx).append("amdSlotIdx", amdSlotIdx).append("amdLineIdx", amdLineIdx).append("amdPortIdx", amdPortIdx).append("amdOpticalPwrReceivedMinTh", amdOpticalPwrReceivedMinTh).append("amdOpticalPwrReceivedMaxTh", amdOpticalPwrReceivedMaxTh).append("amdOpticalPwrTransmittedTarget", amdOpticalPwrTransmittedTarget).append("amdOpticalAttenuationTarget", amdOpticalAttenuationTarget).append("amdOpticalPwrReceived", amdOpticalPwrReceived).append("amdOpticalPwrTransmitted", amdOpticalPwrTransmitted).append("amdOpticalAttentuation", amdOpticalAttentuation).append("amdAdminStatus", amdAdminStatus).append("amdOperStatus", amdOperStatus).append("amdOperStatQlfr", amdOperStatQlfr).append("amdAutoEnableTimer", amdAutoEnableTimer).append("amdActAutoEnableTimer", amdActAutoEnableTimer).append("amdWavelength", amdWavelength).append("amdId1", amdId1).append("amdId2", amdId2).append("amdFiberType", amdFiberType).append("amdGrid", amdGrid).append("amdCustom1", amdCustom1).append("amdCustom2", amdCustom2).append("amdCustom3", amdCustom3).append("amdRowStatus", amdRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(amdTypeIdx).append(amdShelfIdx).append(amdSlotIdx).append(amdLineIdx).append(amdPortIdx).append(amdOpticalPwrReceivedMinTh).append(amdOpticalPwrReceivedMaxTh).append(amdOpticalPwrTransmittedTarget).append(amdOpticalAttenuationTarget).append(amdOpticalPwrReceived).append(amdOpticalPwrTransmitted).append(amdOpticalAttentuation).append(amdAdminStatus).append(amdOperStatus).append(amdOperStatQlfr).append(amdAutoEnableTimer).append(amdActAutoEnableTimer).append(amdWavelength).append(amdId1).append(amdId2).append(amdFiberType).append(amdGrid).append(amdCustom1).append(amdCustom2).append(amdCustom3).append(amdRowStatus).append(_index).toHashCode();
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
        AmdEntry rhs = ((AmdEntry) obj);
        return new EqualsBuilder().append(amdTypeIdx, rhs.amdTypeIdx).append(amdShelfIdx, rhs.amdShelfIdx).append(amdSlotIdx, rhs.amdSlotIdx).append(amdLineIdx, rhs.amdLineIdx).append(amdPortIdx, rhs.amdPortIdx).append(amdOpticalPwrReceivedMinTh, rhs.amdOpticalPwrReceivedMinTh).append(amdOpticalPwrReceivedMaxTh, rhs.amdOpticalPwrReceivedMaxTh).append(amdOpticalPwrTransmittedTarget, rhs.amdOpticalPwrTransmittedTarget).append(amdOpticalAttenuationTarget, rhs.amdOpticalAttenuationTarget).append(amdOpticalPwrReceived, rhs.amdOpticalPwrReceived).append(amdOpticalPwrTransmitted, rhs.amdOpticalPwrTransmitted).append(amdOpticalAttentuation, rhs.amdOpticalAttentuation).append(amdAdminStatus, rhs.amdAdminStatus).append(amdOperStatus, rhs.amdOperStatus).append(amdOperStatQlfr, rhs.amdOperStatQlfr).append(amdAutoEnableTimer, rhs.amdAutoEnableTimer).append(amdActAutoEnableTimer, rhs.amdActAutoEnableTimer).append(amdWavelength, rhs.amdWavelength).append(amdId1, rhs.amdId1).append(amdId2, rhs.amdId2).append(amdFiberType, rhs.amdFiberType).append(amdGrid, rhs.amdGrid).append(amdCustom1, rhs.amdCustom1).append(amdCustom2, rhs.amdCustom2).append(amdCustom3, rhs.amdCustom3).append(amdRowStatus, rhs.amdRowStatus).append(_index, rhs._index).isEquals();
    }

    public AmdEntry clone() {
        AmdEntry _copy = new AmdEntry();
        _copy.amdTypeIdx = amdTypeIdx;
        _copy.amdShelfIdx = amdShelfIdx;
        _copy.amdSlotIdx = amdSlotIdx;
        _copy.amdLineIdx = amdLineIdx;
        _copy.amdPortIdx = amdPortIdx;
        _copy.amdOpticalPwrReceivedMinTh = amdOpticalPwrReceivedMinTh;
        _copy.amdOpticalPwrReceivedMaxTh = amdOpticalPwrReceivedMaxTh;
        _copy.amdOpticalPwrTransmittedTarget = amdOpticalPwrTransmittedTarget;
        _copy.amdOpticalAttenuationTarget = amdOpticalAttenuationTarget;
        _copy.amdOpticalPwrReceived = amdOpticalPwrReceived;
        _copy.amdOpticalPwrTransmitted = amdOpticalPwrTransmitted;
        _copy.amdOpticalAttentuation = amdOpticalAttentuation;
        _copy.amdAdminStatus = amdAdminStatus;
        _copy.amdOperStatus = amdOperStatus;
        _copy.amdOperStatQlfr = amdOperStatQlfr;
        _copy.amdAutoEnableTimer = amdAutoEnableTimer;
        _copy.amdActAutoEnableTimer = amdActAutoEnableTimer;
        _copy.amdWavelength = amdWavelength;
        _copy.amdId1 = amdId1;
        _copy.amdId2 = amdId2;
        _copy.amdFiberType = amdFiberType;
        _copy.amdGrid = amdGrid;
        _copy.amdCustom1 = amdCustom1;
        _copy.amdCustom2 = amdCustom2;
        _copy.amdCustom3 = amdCustom3;
        _copy.amdRowStatus = amdRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "amdTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "amdShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "amdSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "amdLineIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "amdPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "amdOpticalPwrReceivedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "amdOpticalPwrReceivedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "amdOpticalPwrTransmittedTarget", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "amdOpticalAttenuationTarget", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "amdOpticalPwrReceived", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "amdOpticalPwrTransmitted", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "amdOpticalAttentuation", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "amdAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "amdOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "amdOperStatQlfr", DeviceEntityDescription.FieldType.STRING, 65));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "amdAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "amdActAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "amdWavelength", DeviceEntityDescription.FieldType.FIXED_X100, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "amdId1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "amdId2", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "amdFiberType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "amdGrid", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "amdCustom1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "amdCustom2", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "amdCustom3", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "amdRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
