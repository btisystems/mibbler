
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections.vcnxctable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections.VcnXCTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.vcnxctable.IVcnXCEntry;
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

public class VcnXCEntry
    extends DeviceEntity
    implements Serializable, IVcnXCEntry, IIndexed, IVariableBindingSetter
{

    private int vcnXCVcnTypeIdx;
    private int vcnXCSrcShelfIdx;
    private int vcnXCSrcSlotIdx;
    private int vcnXCSrcPortIdx;
    private int vcnXCSrcIdx;
    private int vcnXCDestShelfIdx;
    private int vcnXCDestSlotIdx;
    private int vcnXCDestPortIdx;
    private int vcnXCDestIdx;
    private int vcnXCType;
    private int vcnXCProtTypeNum;
    private int vcnXCProtShelfNum;
    private int vcnXCProtSlotNum;
    private int vcnXCProtPortNum;
    private int vcnXCProtNum;
    private int vcnXCRowStatus;
    private String _index;
    private VcnXCTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public VcnXCEntry() {
    }

    public int getVcnXCVcnTypeIdx() {
        return this.vcnXCVcnTypeIdx;
    }

    public void setVcnXCVcnTypeIdx(int vcnXCVcnTypeIdx) {
        int oldValue = getVcnXCVcnTypeIdx();
        this.vcnXCVcnTypeIdx = vcnXCVcnTypeIdx;
        notifyChange(1, oldValue, vcnXCVcnTypeIdx);
    }

    public int getVcnXCSrcShelfIdx() {
        return this.vcnXCSrcShelfIdx;
    }

    public void setVcnXCSrcShelfIdx(int vcnXCSrcShelfIdx) {
        int oldValue = getVcnXCSrcShelfIdx();
        this.vcnXCSrcShelfIdx = vcnXCSrcShelfIdx;
        notifyChange(2, oldValue, vcnXCSrcShelfIdx);
    }

    public int getVcnXCSrcSlotIdx() {
        return this.vcnXCSrcSlotIdx;
    }

    public void setVcnXCSrcSlotIdx(int vcnXCSrcSlotIdx) {
        int oldValue = getVcnXCSrcSlotIdx();
        this.vcnXCSrcSlotIdx = vcnXCSrcSlotIdx;
        notifyChange(3, oldValue, vcnXCSrcSlotIdx);
    }

    public int getVcnXCSrcPortIdx() {
        return this.vcnXCSrcPortIdx;
    }

    public void setVcnXCSrcPortIdx(int vcnXCSrcPortIdx) {
        int oldValue = getVcnXCSrcPortIdx();
        this.vcnXCSrcPortIdx = vcnXCSrcPortIdx;
        notifyChange(4, oldValue, vcnXCSrcPortIdx);
    }

    public int getVcnXCSrcIdx() {
        return this.vcnXCSrcIdx;
    }

    public void setVcnXCSrcIdx(int vcnXCSrcIdx) {
        int oldValue = getVcnXCSrcIdx();
        this.vcnXCSrcIdx = vcnXCSrcIdx;
        notifyChange(5, oldValue, vcnXCSrcIdx);
    }

    public int getVcnXCDestShelfIdx() {
        return this.vcnXCDestShelfIdx;
    }

    public void setVcnXCDestShelfIdx(int vcnXCDestShelfIdx) {
        int oldValue = getVcnXCDestShelfIdx();
        this.vcnXCDestShelfIdx = vcnXCDestShelfIdx;
        notifyChange(6, oldValue, vcnXCDestShelfIdx);
    }

    public int getVcnXCDestSlotIdx() {
        return this.vcnXCDestSlotIdx;
    }

    public void setVcnXCDestSlotIdx(int vcnXCDestSlotIdx) {
        int oldValue = getVcnXCDestSlotIdx();
        this.vcnXCDestSlotIdx = vcnXCDestSlotIdx;
        notifyChange(7, oldValue, vcnXCDestSlotIdx);
    }

    public int getVcnXCDestPortIdx() {
        return this.vcnXCDestPortIdx;
    }

    public void setVcnXCDestPortIdx(int vcnXCDestPortIdx) {
        int oldValue = getVcnXCDestPortIdx();
        this.vcnXCDestPortIdx = vcnXCDestPortIdx;
        notifyChange(8, oldValue, vcnXCDestPortIdx);
    }

    public int getVcnXCDestIdx() {
        return this.vcnXCDestIdx;
    }

    public void setVcnXCDestIdx(int vcnXCDestIdx) {
        int oldValue = getVcnXCDestIdx();
        this.vcnXCDestIdx = vcnXCDestIdx;
        notifyChange(9, oldValue, vcnXCDestIdx);
    }

    public int getVcnXCType() {
        return this.vcnXCType;
    }

    public void setVcnXCType(int vcnXCType) {
        int oldValue = getVcnXCType();
        this.vcnXCType = vcnXCType;
        notifyChange(10, oldValue, vcnXCType);
    }

    public int getVcnXCProtTypeNum() {
        return this.vcnXCProtTypeNum;
    }

    public void setVcnXCProtTypeNum(int vcnXCProtTypeNum) {
        int oldValue = getVcnXCProtTypeNum();
        this.vcnXCProtTypeNum = vcnXCProtTypeNum;
        notifyChange(11, oldValue, vcnXCProtTypeNum);
    }

    public int getVcnXCProtShelfNum() {
        return this.vcnXCProtShelfNum;
    }

    public void setVcnXCProtShelfNum(int vcnXCProtShelfNum) {
        int oldValue = getVcnXCProtShelfNum();
        this.vcnXCProtShelfNum = vcnXCProtShelfNum;
        notifyChange(12, oldValue, vcnXCProtShelfNum);
    }

    public int getVcnXCProtSlotNum() {
        return this.vcnXCProtSlotNum;
    }

    public void setVcnXCProtSlotNum(int vcnXCProtSlotNum) {
        int oldValue = getVcnXCProtSlotNum();
        this.vcnXCProtSlotNum = vcnXCProtSlotNum;
        notifyChange(13, oldValue, vcnXCProtSlotNum);
    }

    public int getVcnXCProtPortNum() {
        return this.vcnXCProtPortNum;
    }

    public void setVcnXCProtPortNum(int vcnXCProtPortNum) {
        int oldValue = getVcnXCProtPortNum();
        this.vcnXCProtPortNum = vcnXCProtPortNum;
        notifyChange(14, oldValue, vcnXCProtPortNum);
    }

    public int getVcnXCProtNum() {
        return this.vcnXCProtNum;
    }

    public void setVcnXCProtNum(int vcnXCProtNum) {
        int oldValue = getVcnXCProtNum();
        this.vcnXCProtNum = vcnXCProtNum;
        notifyChange(15, oldValue, vcnXCProtNum);
    }

    public int getVcnXCRowStatus() {
        return this.vcnXCRowStatus;
    }

    public void setVcnXCRowStatus(int vcnXCRowStatus) {
        int oldValue = getVcnXCRowStatus();
        this.vcnXCRowStatus = vcnXCRowStatus;
        notifyChange(100, oldValue, vcnXCRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setVcnXCVcnTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setVcnXCSrcShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setVcnXCSrcSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setVcnXCSrcPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setVcnXCSrcIdx(binding.getVariable().toInt());
                break;
            case  6 :
                setVcnXCDestShelfIdx(binding.getVariable().toInt());
                break;
            case  7 :
                setVcnXCDestSlotIdx(binding.getVariable().toInt());
                break;
            case  8 :
                setVcnXCDestPortIdx(binding.getVariable().toInt());
                break;
            case  9 :
                setVcnXCDestIdx(binding.getVariable().toInt());
                break;
            case  10 :
                setVcnXCType(binding.getVariable().toInt());
                break;
            case  11 :
                setVcnXCProtTypeNum(binding.getVariable().toInt());
                break;
            case  12 :
                setVcnXCProtShelfNum(binding.getVariable().toInt());
                break;
            case  13 :
                setVcnXCProtSlotNum(binding.getVariable().toInt());
                break;
            case  14 :
                setVcnXCProtPortNum(binding.getVariable().toInt());
                break;
            case  15 :
                setVcnXCProtNum(binding.getVariable().toInt());
                break;
            case  100 :
                setVcnXCRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setVcnXCVcnTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcnXCSrcShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcnXCSrcSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcnXCSrcPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcnXCSrcIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcnXCDestShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcnXCDestSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcnXCDestPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcnXCDestIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(VcnXCTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("vcnXCVcnTypeIdx", vcnXCVcnTypeIdx).append("vcnXCSrcShelfIdx", vcnXCSrcShelfIdx).append("vcnXCSrcSlotIdx", vcnXCSrcSlotIdx).append("vcnXCSrcPortIdx", vcnXCSrcPortIdx).append("vcnXCSrcIdx", vcnXCSrcIdx).append("vcnXCDestShelfIdx", vcnXCDestShelfIdx).append("vcnXCDestSlotIdx", vcnXCDestSlotIdx).append("vcnXCDestPortIdx", vcnXCDestPortIdx).append("vcnXCDestIdx", vcnXCDestIdx).append("vcnXCType", vcnXCType).append("vcnXCProtTypeNum", vcnXCProtTypeNum).append("vcnXCProtShelfNum", vcnXCProtShelfNum).append("vcnXCProtSlotNum", vcnXCProtSlotNum).append("vcnXCProtPortNum", vcnXCProtPortNum).append("vcnXCProtNum", vcnXCProtNum).append("vcnXCRowStatus", vcnXCRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(vcnXCVcnTypeIdx).append(vcnXCSrcShelfIdx).append(vcnXCSrcSlotIdx).append(vcnXCSrcPortIdx).append(vcnXCSrcIdx).append(vcnXCDestShelfIdx).append(vcnXCDestSlotIdx).append(vcnXCDestPortIdx).append(vcnXCDestIdx).append(vcnXCType).append(vcnXCProtTypeNum).append(vcnXCProtShelfNum).append(vcnXCProtSlotNum).append(vcnXCProtPortNum).append(vcnXCProtNum).append(vcnXCRowStatus).append(_index).toHashCode();
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
        VcnXCEntry rhs = ((VcnXCEntry) obj);
        return new EqualsBuilder().append(vcnXCVcnTypeIdx, rhs.vcnXCVcnTypeIdx).append(vcnXCSrcShelfIdx, rhs.vcnXCSrcShelfIdx).append(vcnXCSrcSlotIdx, rhs.vcnXCSrcSlotIdx).append(vcnXCSrcPortIdx, rhs.vcnXCSrcPortIdx).append(vcnXCSrcIdx, rhs.vcnXCSrcIdx).append(vcnXCDestShelfIdx, rhs.vcnXCDestShelfIdx).append(vcnXCDestSlotIdx, rhs.vcnXCDestSlotIdx).append(vcnXCDestPortIdx, rhs.vcnXCDestPortIdx).append(vcnXCDestIdx, rhs.vcnXCDestIdx).append(vcnXCType, rhs.vcnXCType).append(vcnXCProtTypeNum, rhs.vcnXCProtTypeNum).append(vcnXCProtShelfNum, rhs.vcnXCProtShelfNum).append(vcnXCProtSlotNum, rhs.vcnXCProtSlotNum).append(vcnXCProtPortNum, rhs.vcnXCProtPortNum).append(vcnXCProtNum, rhs.vcnXCProtNum).append(vcnXCRowStatus, rhs.vcnXCRowStatus).append(_index, rhs._index).isEquals();
    }

    public VcnXCEntry clone() {
        VcnXCEntry _copy = new VcnXCEntry();
        _copy.vcnXCVcnTypeIdx = vcnXCVcnTypeIdx;
        _copy.vcnXCSrcShelfIdx = vcnXCSrcShelfIdx;
        _copy.vcnXCSrcSlotIdx = vcnXCSrcSlotIdx;
        _copy.vcnXCSrcPortIdx = vcnXCSrcPortIdx;
        _copy.vcnXCSrcIdx = vcnXCSrcIdx;
        _copy.vcnXCDestShelfIdx = vcnXCDestShelfIdx;
        _copy.vcnXCDestSlotIdx = vcnXCDestSlotIdx;
        _copy.vcnXCDestPortIdx = vcnXCDestPortIdx;
        _copy.vcnXCDestIdx = vcnXCDestIdx;
        _copy.vcnXCType = vcnXCType;
        _copy.vcnXCProtTypeNum = vcnXCProtTypeNum;
        _copy.vcnXCProtShelfNum = vcnXCProtShelfNum;
        _copy.vcnXCProtSlotNum = vcnXCProtSlotNum;
        _copy.vcnXCProtPortNum = vcnXCProtPortNum;
        _copy.vcnXCProtNum = vcnXCProtNum;
        _copy.vcnXCRowStatus = vcnXCRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.9.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "vcnXCVcnTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "vcnXCSrcShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "vcnXCSrcSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "vcnXCSrcPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "vcnXCSrcIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "vcnXCDestShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "vcnXCDestSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "vcnXCDestPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "vcnXCDestIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "vcnXCType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "vcnXCProtTypeNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "vcnXCProtShelfNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "vcnXCProtSlotNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "vcnXCProtPortNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "vcnXCProtNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "vcnXCRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
