
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections.stsnxctable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections.StsnXCTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.stsnxctable.IStsnXCEntry;
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

public class StsnXCEntry
    extends DeviceEntity
    implements Serializable, IStsnXCEntry, IIndexed, IVariableBindingSetter
{

    private int stsnXCStsnTypeIdx;
    private int stsnXCSrcShelfIdx;
    private int stsnXCSrcSlotIdx;
    private int stsnXCSrcPortIdx;
    private int stsnXCSrcIdx;
    private int stsnXCDestShelfIdx;
    private int stsnXCDestSlotIdx;
    private int stsnXCDestPortIdx;
    private int stsnXCDestIdx;
    private int stsnXCType;
    private int stsnXCProtTypeNum;
    private int stsnXCProtShelfNum;
    private int stsnXCProtSlotNum;
    private int stsnXCProtPortNum;
    private int stsnXCProtNum;
    private int stsnXCRowStatus;
    private String _index;
    private StsnXCTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public StsnXCEntry() {
    }

    public int getStsnXCStsnTypeIdx() {
        return this.stsnXCStsnTypeIdx;
    }

    public void setStsnXCStsnTypeIdx(int stsnXCStsnTypeIdx) {
        int oldValue = getStsnXCStsnTypeIdx();
        this.stsnXCStsnTypeIdx = stsnXCStsnTypeIdx;
        notifyChange(1, oldValue, stsnXCStsnTypeIdx);
    }

    public int getStsnXCSrcShelfIdx() {
        return this.stsnXCSrcShelfIdx;
    }

    public void setStsnXCSrcShelfIdx(int stsnXCSrcShelfIdx) {
        int oldValue = getStsnXCSrcShelfIdx();
        this.stsnXCSrcShelfIdx = stsnXCSrcShelfIdx;
        notifyChange(2, oldValue, stsnXCSrcShelfIdx);
    }

    public int getStsnXCSrcSlotIdx() {
        return this.stsnXCSrcSlotIdx;
    }

    public void setStsnXCSrcSlotIdx(int stsnXCSrcSlotIdx) {
        int oldValue = getStsnXCSrcSlotIdx();
        this.stsnXCSrcSlotIdx = stsnXCSrcSlotIdx;
        notifyChange(3, oldValue, stsnXCSrcSlotIdx);
    }

    public int getStsnXCSrcPortIdx() {
        return this.stsnXCSrcPortIdx;
    }

    public void setStsnXCSrcPortIdx(int stsnXCSrcPortIdx) {
        int oldValue = getStsnXCSrcPortIdx();
        this.stsnXCSrcPortIdx = stsnXCSrcPortIdx;
        notifyChange(4, oldValue, stsnXCSrcPortIdx);
    }

    public int getStsnXCSrcIdx() {
        return this.stsnXCSrcIdx;
    }

    public void setStsnXCSrcIdx(int stsnXCSrcIdx) {
        int oldValue = getStsnXCSrcIdx();
        this.stsnXCSrcIdx = stsnXCSrcIdx;
        notifyChange(5, oldValue, stsnXCSrcIdx);
    }

    public int getStsnXCDestShelfIdx() {
        return this.stsnXCDestShelfIdx;
    }

    public void setStsnXCDestShelfIdx(int stsnXCDestShelfIdx) {
        int oldValue = getStsnXCDestShelfIdx();
        this.stsnXCDestShelfIdx = stsnXCDestShelfIdx;
        notifyChange(6, oldValue, stsnXCDestShelfIdx);
    }

    public int getStsnXCDestSlotIdx() {
        return this.stsnXCDestSlotIdx;
    }

    public void setStsnXCDestSlotIdx(int stsnXCDestSlotIdx) {
        int oldValue = getStsnXCDestSlotIdx();
        this.stsnXCDestSlotIdx = stsnXCDestSlotIdx;
        notifyChange(7, oldValue, stsnXCDestSlotIdx);
    }

    public int getStsnXCDestPortIdx() {
        return this.stsnXCDestPortIdx;
    }

    public void setStsnXCDestPortIdx(int stsnXCDestPortIdx) {
        int oldValue = getStsnXCDestPortIdx();
        this.stsnXCDestPortIdx = stsnXCDestPortIdx;
        notifyChange(8, oldValue, stsnXCDestPortIdx);
    }

    public int getStsnXCDestIdx() {
        return this.stsnXCDestIdx;
    }

    public void setStsnXCDestIdx(int stsnXCDestIdx) {
        int oldValue = getStsnXCDestIdx();
        this.stsnXCDestIdx = stsnXCDestIdx;
        notifyChange(9, oldValue, stsnXCDestIdx);
    }

    public int getStsnXCType() {
        return this.stsnXCType;
    }

    public void setStsnXCType(int stsnXCType) {
        int oldValue = getStsnXCType();
        this.stsnXCType = stsnXCType;
        notifyChange(10, oldValue, stsnXCType);
    }

    public int getStsnXCProtTypeNum() {
        return this.stsnXCProtTypeNum;
    }

    public void setStsnXCProtTypeNum(int stsnXCProtTypeNum) {
        int oldValue = getStsnXCProtTypeNum();
        this.stsnXCProtTypeNum = stsnXCProtTypeNum;
        notifyChange(11, oldValue, stsnXCProtTypeNum);
    }

    public int getStsnXCProtShelfNum() {
        return this.stsnXCProtShelfNum;
    }

    public void setStsnXCProtShelfNum(int stsnXCProtShelfNum) {
        int oldValue = getStsnXCProtShelfNum();
        this.stsnXCProtShelfNum = stsnXCProtShelfNum;
        notifyChange(12, oldValue, stsnXCProtShelfNum);
    }

    public int getStsnXCProtSlotNum() {
        return this.stsnXCProtSlotNum;
    }

    public void setStsnXCProtSlotNum(int stsnXCProtSlotNum) {
        int oldValue = getStsnXCProtSlotNum();
        this.stsnXCProtSlotNum = stsnXCProtSlotNum;
        notifyChange(13, oldValue, stsnXCProtSlotNum);
    }

    public int getStsnXCProtPortNum() {
        return this.stsnXCProtPortNum;
    }

    public void setStsnXCProtPortNum(int stsnXCProtPortNum) {
        int oldValue = getStsnXCProtPortNum();
        this.stsnXCProtPortNum = stsnXCProtPortNum;
        notifyChange(14, oldValue, stsnXCProtPortNum);
    }

    public int getStsnXCProtNum() {
        return this.stsnXCProtNum;
    }

    public void setStsnXCProtNum(int stsnXCProtNum) {
        int oldValue = getStsnXCProtNum();
        this.stsnXCProtNum = stsnXCProtNum;
        notifyChange(15, oldValue, stsnXCProtNum);
    }

    public int getStsnXCRowStatus() {
        return this.stsnXCRowStatus;
    }

    public void setStsnXCRowStatus(int stsnXCRowStatus) {
        int oldValue = getStsnXCRowStatus();
        this.stsnXCRowStatus = stsnXCRowStatus;
        notifyChange(100, oldValue, stsnXCRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setStsnXCStsnTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setStsnXCSrcShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setStsnXCSrcSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setStsnXCSrcPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setStsnXCSrcIdx(binding.getVariable().toInt());
                break;
            case  6 :
                setStsnXCDestShelfIdx(binding.getVariable().toInt());
                break;
            case  7 :
                setStsnXCDestSlotIdx(binding.getVariable().toInt());
                break;
            case  8 :
                setStsnXCDestPortIdx(binding.getVariable().toInt());
                break;
            case  9 :
                setStsnXCDestIdx(binding.getVariable().toInt());
                break;
            case  10 :
                setStsnXCType(binding.getVariable().toInt());
                break;
            case  11 :
                setStsnXCProtTypeNum(binding.getVariable().toInt());
                break;
            case  12 :
                setStsnXCProtShelfNum(binding.getVariable().toInt());
                break;
            case  13 :
                setStsnXCProtSlotNum(binding.getVariable().toInt());
                break;
            case  14 :
                setStsnXCProtPortNum(binding.getVariable().toInt());
                break;
            case  15 :
                setStsnXCProtNum(binding.getVariable().toInt());
                break;
            case  100 :
                setStsnXCRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setStsnXCStsnTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStsnXCSrcShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStsnXCSrcSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStsnXCSrcPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStsnXCSrcIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStsnXCDestShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStsnXCDestSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStsnXCDestPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStsnXCDestIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(StsnXCTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("stsnXCStsnTypeIdx", stsnXCStsnTypeIdx).append("stsnXCSrcShelfIdx", stsnXCSrcShelfIdx).append("stsnXCSrcSlotIdx", stsnXCSrcSlotIdx).append("stsnXCSrcPortIdx", stsnXCSrcPortIdx).append("stsnXCSrcIdx", stsnXCSrcIdx).append("stsnXCDestShelfIdx", stsnXCDestShelfIdx).append("stsnXCDestSlotIdx", stsnXCDestSlotIdx).append("stsnXCDestPortIdx", stsnXCDestPortIdx).append("stsnXCDestIdx", stsnXCDestIdx).append("stsnXCType", stsnXCType).append("stsnXCProtTypeNum", stsnXCProtTypeNum).append("stsnXCProtShelfNum", stsnXCProtShelfNum).append("stsnXCProtSlotNum", stsnXCProtSlotNum).append("stsnXCProtPortNum", stsnXCProtPortNum).append("stsnXCProtNum", stsnXCProtNum).append("stsnXCRowStatus", stsnXCRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(stsnXCStsnTypeIdx).append(stsnXCSrcShelfIdx).append(stsnXCSrcSlotIdx).append(stsnXCSrcPortIdx).append(stsnXCSrcIdx).append(stsnXCDestShelfIdx).append(stsnXCDestSlotIdx).append(stsnXCDestPortIdx).append(stsnXCDestIdx).append(stsnXCType).append(stsnXCProtTypeNum).append(stsnXCProtShelfNum).append(stsnXCProtSlotNum).append(stsnXCProtPortNum).append(stsnXCProtNum).append(stsnXCRowStatus).append(_index).toHashCode();
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
        StsnXCEntry rhs = ((StsnXCEntry) obj);
        return new EqualsBuilder().append(stsnXCStsnTypeIdx, rhs.stsnXCStsnTypeIdx).append(stsnXCSrcShelfIdx, rhs.stsnXCSrcShelfIdx).append(stsnXCSrcSlotIdx, rhs.stsnXCSrcSlotIdx).append(stsnXCSrcPortIdx, rhs.stsnXCSrcPortIdx).append(stsnXCSrcIdx, rhs.stsnXCSrcIdx).append(stsnXCDestShelfIdx, rhs.stsnXCDestShelfIdx).append(stsnXCDestSlotIdx, rhs.stsnXCDestSlotIdx).append(stsnXCDestPortIdx, rhs.stsnXCDestPortIdx).append(stsnXCDestIdx, rhs.stsnXCDestIdx).append(stsnXCType, rhs.stsnXCType).append(stsnXCProtTypeNum, rhs.stsnXCProtTypeNum).append(stsnXCProtShelfNum, rhs.stsnXCProtShelfNum).append(stsnXCProtSlotNum, rhs.stsnXCProtSlotNum).append(stsnXCProtPortNum, rhs.stsnXCProtPortNum).append(stsnXCProtNum, rhs.stsnXCProtNum).append(stsnXCRowStatus, rhs.stsnXCRowStatus).append(_index, rhs._index).isEquals();
    }

    public StsnXCEntry clone() {
        StsnXCEntry _copy = new StsnXCEntry();
        _copy.stsnXCStsnTypeIdx = stsnXCStsnTypeIdx;
        _copy.stsnXCSrcShelfIdx = stsnXCSrcShelfIdx;
        _copy.stsnXCSrcSlotIdx = stsnXCSrcSlotIdx;
        _copy.stsnXCSrcPortIdx = stsnXCSrcPortIdx;
        _copy.stsnXCSrcIdx = stsnXCSrcIdx;
        _copy.stsnXCDestShelfIdx = stsnXCDestShelfIdx;
        _copy.stsnXCDestSlotIdx = stsnXCDestSlotIdx;
        _copy.stsnXCDestPortIdx = stsnXCDestPortIdx;
        _copy.stsnXCDestIdx = stsnXCDestIdx;
        _copy.stsnXCType = stsnXCType;
        _copy.stsnXCProtTypeNum = stsnXCProtTypeNum;
        _copy.stsnXCProtShelfNum = stsnXCProtShelfNum;
        _copy.stsnXCProtSlotNum = stsnXCProtSlotNum;
        _copy.stsnXCProtPortNum = stsnXCProtPortNum;
        _copy.stsnXCProtNum = stsnXCProtNum;
        _copy.stsnXCRowStatus = stsnXCRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.9.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "stsnXCStsnTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "stsnXCSrcShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "stsnXCSrcSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "stsnXCSrcPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "stsnXCSrcIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "stsnXCDestShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "stsnXCDestSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "stsnXCDestPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "stsnXCDestIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "stsnXCType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "stsnXCProtTypeNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "stsnXCProtShelfNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "stsnXCProtSlotNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "stsnXCProtPortNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "stsnXCProtNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "stsnXCRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
