
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.inventory.slotinvdatatable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.inventory.SlotInvDataTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.slotinvdatatable.ISlotInvDataEntry;
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

public class SlotInvDataEntry
    extends DeviceEntity
    implements Serializable, ISlotInvDataEntry, IIndexed, IVariableBindingSetter
{

    private int slotInvDataShelfIdx;
    private int slotInvDataSlotTypeIdx;
    private int slotInvDataSlotIdx;
    private int slotInvDataRecordIdx;
    private int slotInvDataNameIdx;
    private String slotInvDataValue;
    private String _index;
    private SlotInvDataTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SlotInvDataEntry() {
    }

    public int getSlotInvDataShelfIdx() {
        return this.slotInvDataShelfIdx;
    }

    public void setSlotInvDataShelfIdx(int slotInvDataShelfIdx) {
        int oldValue = getSlotInvDataShelfIdx();
        this.slotInvDataShelfIdx = slotInvDataShelfIdx;
        notifyChange(1, oldValue, slotInvDataShelfIdx);
    }

    public int getSlotInvDataSlotTypeIdx() {
        return this.slotInvDataSlotTypeIdx;
    }

    public void setSlotInvDataSlotTypeIdx(int slotInvDataSlotTypeIdx) {
        int oldValue = getSlotInvDataSlotTypeIdx();
        this.slotInvDataSlotTypeIdx = slotInvDataSlotTypeIdx;
        notifyChange(2, oldValue, slotInvDataSlotTypeIdx);
    }

    public int getSlotInvDataSlotIdx() {
        return this.slotInvDataSlotIdx;
    }

    public void setSlotInvDataSlotIdx(int slotInvDataSlotIdx) {
        int oldValue = getSlotInvDataSlotIdx();
        this.slotInvDataSlotIdx = slotInvDataSlotIdx;
        notifyChange(3, oldValue, slotInvDataSlotIdx);
    }

    public int getSlotInvDataRecordIdx() {
        return this.slotInvDataRecordIdx;
    }

    public void setSlotInvDataRecordIdx(int slotInvDataRecordIdx) {
        int oldValue = getSlotInvDataRecordIdx();
        this.slotInvDataRecordIdx = slotInvDataRecordIdx;
        notifyChange(4, oldValue, slotInvDataRecordIdx);
    }

    public int getSlotInvDataNameIdx() {
        return this.slotInvDataNameIdx;
    }

    public void setSlotInvDataNameIdx(int slotInvDataNameIdx) {
        int oldValue = getSlotInvDataNameIdx();
        this.slotInvDataNameIdx = slotInvDataNameIdx;
        notifyChange(5, oldValue, slotInvDataNameIdx);
    }

    public String getSlotInvDataValue() {
        return this.slotInvDataValue;
    }

    public void setSlotInvDataValue(String slotInvDataValue) {
        String oldValue = getSlotInvDataValue();
        this.slotInvDataValue = slotInvDataValue;
        notifyChange(6, oldValue, slotInvDataValue);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setSlotInvDataShelfIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setSlotInvDataSlotTypeIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setSlotInvDataSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setSlotInvDataRecordIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setSlotInvDataNameIdx(binding.getVariable().toInt());
                break;
            case  6 :
                setSlotInvDataValue(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setSlotInvDataShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setSlotInvDataSlotTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setSlotInvDataSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setSlotInvDataRecordIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setSlotInvDataNameIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SlotInvDataTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("slotInvDataShelfIdx", slotInvDataShelfIdx).append("slotInvDataSlotTypeIdx", slotInvDataSlotTypeIdx).append("slotInvDataSlotIdx", slotInvDataSlotIdx).append("slotInvDataRecordIdx", slotInvDataRecordIdx).append("slotInvDataNameIdx", slotInvDataNameIdx).append("slotInvDataValue", slotInvDataValue).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(slotInvDataShelfIdx).append(slotInvDataSlotTypeIdx).append(slotInvDataSlotIdx).append(slotInvDataRecordIdx).append(slotInvDataNameIdx).append(slotInvDataValue).append(_index).toHashCode();
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
        SlotInvDataEntry rhs = ((SlotInvDataEntry) obj);
        return new EqualsBuilder().append(slotInvDataShelfIdx, rhs.slotInvDataShelfIdx).append(slotInvDataSlotTypeIdx, rhs.slotInvDataSlotTypeIdx).append(slotInvDataSlotIdx, rhs.slotInvDataSlotIdx).append(slotInvDataRecordIdx, rhs.slotInvDataRecordIdx).append(slotInvDataNameIdx, rhs.slotInvDataNameIdx).append(slotInvDataValue, rhs.slotInvDataValue).append(_index, rhs._index).isEquals();
    }

    public SlotInvDataEntry clone() {
        SlotInvDataEntry _copy = new SlotInvDataEntry();
        _copy.slotInvDataShelfIdx = slotInvDataShelfIdx;
        _copy.slotInvDataSlotTypeIdx = slotInvDataSlotTypeIdx;
        _copy.slotInvDataSlotIdx = slotInvDataSlotIdx;
        _copy.slotInvDataRecordIdx = slotInvDataRecordIdx;
        _copy.slotInvDataNameIdx = slotInvDataNameIdx;
        _copy.slotInvDataValue = slotInvDataValue;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.2.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "slotInvDataShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "slotInvDataSlotTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "slotInvDataSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "slotInvDataRecordIdx", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "slotInvDataNameIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "slotInvDataValue", DeviceEntityDescription.FieldType.STRING, 255));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
