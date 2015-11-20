
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections.vcgxctable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections.VcgXCTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.vcgxctable.IVcgXCEntry;
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

public class VcgXCEntry
    extends DeviceEntity
    implements Serializable, IVcgXCEntry, IIndexed, IVariableBindingSetter
{

    private int vcgXCSrcShelfIdx;
    private int vcgXCSrcSlotIdx;
    private int vcgXCSrcPortIdx;
    private int vcgXCSrcIdx;
    private int vcgXCDestShelfIdx;
    private int vcgXCDestSlotIdx;
    private int vcgXCDestPortIdx;
    private int vcgXCDestIdx;
    private int vcgXCType;
    private int vcgXCProtShelfNum;
    private int vcgXCProtSlotNum;
    private int vcgXCProtPortNum;
    private int vcgXCProtNum;
    private int vcgXCRowStatus;
    private String _index;
    private VcgXCTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public VcgXCEntry() {
    }

    public int getVcgXCSrcShelfIdx() {
        return this.vcgXCSrcShelfIdx;
    }

    public void setVcgXCSrcShelfIdx(int vcgXCSrcShelfIdx) {
        int oldValue = getVcgXCSrcShelfIdx();
        this.vcgXCSrcShelfIdx = vcgXCSrcShelfIdx;
        notifyChange(1, oldValue, vcgXCSrcShelfIdx);
    }

    public int getVcgXCSrcSlotIdx() {
        return this.vcgXCSrcSlotIdx;
    }

    public void setVcgXCSrcSlotIdx(int vcgXCSrcSlotIdx) {
        int oldValue = getVcgXCSrcSlotIdx();
        this.vcgXCSrcSlotIdx = vcgXCSrcSlotIdx;
        notifyChange(2, oldValue, vcgXCSrcSlotIdx);
    }

    public int getVcgXCSrcPortIdx() {
        return this.vcgXCSrcPortIdx;
    }

    public void setVcgXCSrcPortIdx(int vcgXCSrcPortIdx) {
        int oldValue = getVcgXCSrcPortIdx();
        this.vcgXCSrcPortIdx = vcgXCSrcPortIdx;
        notifyChange(3, oldValue, vcgXCSrcPortIdx);
    }

    public int getVcgXCSrcIdx() {
        return this.vcgXCSrcIdx;
    }

    public void setVcgXCSrcIdx(int vcgXCSrcIdx) {
        int oldValue = getVcgXCSrcIdx();
        this.vcgXCSrcIdx = vcgXCSrcIdx;
        notifyChange(4, oldValue, vcgXCSrcIdx);
    }

    public int getVcgXCDestShelfIdx() {
        return this.vcgXCDestShelfIdx;
    }

    public void setVcgXCDestShelfIdx(int vcgXCDestShelfIdx) {
        int oldValue = getVcgXCDestShelfIdx();
        this.vcgXCDestShelfIdx = vcgXCDestShelfIdx;
        notifyChange(5, oldValue, vcgXCDestShelfIdx);
    }

    public int getVcgXCDestSlotIdx() {
        return this.vcgXCDestSlotIdx;
    }

    public void setVcgXCDestSlotIdx(int vcgXCDestSlotIdx) {
        int oldValue = getVcgXCDestSlotIdx();
        this.vcgXCDestSlotIdx = vcgXCDestSlotIdx;
        notifyChange(6, oldValue, vcgXCDestSlotIdx);
    }

    public int getVcgXCDestPortIdx() {
        return this.vcgXCDestPortIdx;
    }

    public void setVcgXCDestPortIdx(int vcgXCDestPortIdx) {
        int oldValue = getVcgXCDestPortIdx();
        this.vcgXCDestPortIdx = vcgXCDestPortIdx;
        notifyChange(7, oldValue, vcgXCDestPortIdx);
    }

    public int getVcgXCDestIdx() {
        return this.vcgXCDestIdx;
    }

    public void setVcgXCDestIdx(int vcgXCDestIdx) {
        int oldValue = getVcgXCDestIdx();
        this.vcgXCDestIdx = vcgXCDestIdx;
        notifyChange(8, oldValue, vcgXCDestIdx);
    }

    public int getVcgXCType() {
        return this.vcgXCType;
    }

    public void setVcgXCType(int vcgXCType) {
        int oldValue = getVcgXCType();
        this.vcgXCType = vcgXCType;
        notifyChange(9, oldValue, vcgXCType);
    }

    public int getVcgXCProtShelfNum() {
        return this.vcgXCProtShelfNum;
    }

    public void setVcgXCProtShelfNum(int vcgXCProtShelfNum) {
        int oldValue = getVcgXCProtShelfNum();
        this.vcgXCProtShelfNum = vcgXCProtShelfNum;
        notifyChange(10, oldValue, vcgXCProtShelfNum);
    }

    public int getVcgXCProtSlotNum() {
        return this.vcgXCProtSlotNum;
    }

    public void setVcgXCProtSlotNum(int vcgXCProtSlotNum) {
        int oldValue = getVcgXCProtSlotNum();
        this.vcgXCProtSlotNum = vcgXCProtSlotNum;
        notifyChange(11, oldValue, vcgXCProtSlotNum);
    }

    public int getVcgXCProtPortNum() {
        return this.vcgXCProtPortNum;
    }

    public void setVcgXCProtPortNum(int vcgXCProtPortNum) {
        int oldValue = getVcgXCProtPortNum();
        this.vcgXCProtPortNum = vcgXCProtPortNum;
        notifyChange(12, oldValue, vcgXCProtPortNum);
    }

    public int getVcgXCProtNum() {
        return this.vcgXCProtNum;
    }

    public void setVcgXCProtNum(int vcgXCProtNum) {
        int oldValue = getVcgXCProtNum();
        this.vcgXCProtNum = vcgXCProtNum;
        notifyChange(13, oldValue, vcgXCProtNum);
    }

    public int getVcgXCRowStatus() {
        return this.vcgXCRowStatus;
    }

    public void setVcgXCRowStatus(int vcgXCRowStatus) {
        int oldValue = getVcgXCRowStatus();
        this.vcgXCRowStatus = vcgXCRowStatus;
        notifyChange(100, oldValue, vcgXCRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setVcgXCSrcShelfIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setVcgXCSrcSlotIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setVcgXCSrcPortIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setVcgXCSrcIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setVcgXCDestShelfIdx(binding.getVariable().toInt());
                break;
            case  6 :
                setVcgXCDestSlotIdx(binding.getVariable().toInt());
                break;
            case  7 :
                setVcgXCDestPortIdx(binding.getVariable().toInt());
                break;
            case  8 :
                setVcgXCDestIdx(binding.getVariable().toInt());
                break;
            case  9 :
                setVcgXCType(binding.getVariable().toInt());
                break;
            case  10 :
                setVcgXCProtShelfNum(binding.getVariable().toInt());
                break;
            case  11 :
                setVcgXCProtSlotNum(binding.getVariable().toInt());
                break;
            case  12 :
                setVcgXCProtPortNum(binding.getVariable().toInt());
                break;
            case  13 :
                setVcgXCProtNum(binding.getVariable().toInt());
                break;
            case  100 :
                setVcgXCRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setVcgXCSrcShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcgXCSrcSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcgXCSrcPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcgXCSrcIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcgXCDestShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcgXCDestSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcgXCDestPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcgXCDestIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(VcgXCTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("vcgXCSrcShelfIdx", vcgXCSrcShelfIdx).append("vcgXCSrcSlotIdx", vcgXCSrcSlotIdx).append("vcgXCSrcPortIdx", vcgXCSrcPortIdx).append("vcgXCSrcIdx", vcgXCSrcIdx).append("vcgXCDestShelfIdx", vcgXCDestShelfIdx).append("vcgXCDestSlotIdx", vcgXCDestSlotIdx).append("vcgXCDestPortIdx", vcgXCDestPortIdx).append("vcgXCDestIdx", vcgXCDestIdx).append("vcgXCType", vcgXCType).append("vcgXCProtShelfNum", vcgXCProtShelfNum).append("vcgXCProtSlotNum", vcgXCProtSlotNum).append("vcgXCProtPortNum", vcgXCProtPortNum).append("vcgXCProtNum", vcgXCProtNum).append("vcgXCRowStatus", vcgXCRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(vcgXCSrcShelfIdx).append(vcgXCSrcSlotIdx).append(vcgXCSrcPortIdx).append(vcgXCSrcIdx).append(vcgXCDestShelfIdx).append(vcgXCDestSlotIdx).append(vcgXCDestPortIdx).append(vcgXCDestIdx).append(vcgXCType).append(vcgXCProtShelfNum).append(vcgXCProtSlotNum).append(vcgXCProtPortNum).append(vcgXCProtNum).append(vcgXCRowStatus).append(_index).toHashCode();
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
        VcgXCEntry rhs = ((VcgXCEntry) obj);
        return new EqualsBuilder().append(vcgXCSrcShelfIdx, rhs.vcgXCSrcShelfIdx).append(vcgXCSrcSlotIdx, rhs.vcgXCSrcSlotIdx).append(vcgXCSrcPortIdx, rhs.vcgXCSrcPortIdx).append(vcgXCSrcIdx, rhs.vcgXCSrcIdx).append(vcgXCDestShelfIdx, rhs.vcgXCDestShelfIdx).append(vcgXCDestSlotIdx, rhs.vcgXCDestSlotIdx).append(vcgXCDestPortIdx, rhs.vcgXCDestPortIdx).append(vcgXCDestIdx, rhs.vcgXCDestIdx).append(vcgXCType, rhs.vcgXCType).append(vcgXCProtShelfNum, rhs.vcgXCProtShelfNum).append(vcgXCProtSlotNum, rhs.vcgXCProtSlotNum).append(vcgXCProtPortNum, rhs.vcgXCProtPortNum).append(vcgXCProtNum, rhs.vcgXCProtNum).append(vcgXCRowStatus, rhs.vcgXCRowStatus).append(_index, rhs._index).isEquals();
    }

    public VcgXCEntry clone() {
        VcgXCEntry _copy = new VcgXCEntry();
        _copy.vcgXCSrcShelfIdx = vcgXCSrcShelfIdx;
        _copy.vcgXCSrcSlotIdx = vcgXCSrcSlotIdx;
        _copy.vcgXCSrcPortIdx = vcgXCSrcPortIdx;
        _copy.vcgXCSrcIdx = vcgXCSrcIdx;
        _copy.vcgXCDestShelfIdx = vcgXCDestShelfIdx;
        _copy.vcgXCDestSlotIdx = vcgXCDestSlotIdx;
        _copy.vcgXCDestPortIdx = vcgXCDestPortIdx;
        _copy.vcgXCDestIdx = vcgXCDestIdx;
        _copy.vcgXCType = vcgXCType;
        _copy.vcgXCProtShelfNum = vcgXCProtShelfNum;
        _copy.vcgXCProtSlotNum = vcgXCProtSlotNum;
        _copy.vcgXCProtPortNum = vcgXCProtPortNum;
        _copy.vcgXCProtNum = vcgXCProtNum;
        _copy.vcgXCRowStatus = vcgXCRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.9.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "vcgXCSrcShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "vcgXCSrcSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "vcgXCSrcPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "vcgXCSrcIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "vcgXCDestShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "vcgXCDestSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "vcgXCDestPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "vcgXCDestIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "vcgXCType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "vcgXCProtShelfNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "vcgXCProtSlotNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "vcgXCProtPortNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "vcgXCProtNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "vcgXCRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
