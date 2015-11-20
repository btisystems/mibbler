
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.stsntable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.StsnTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.stsntable.IStsnEntry;
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

public class StsnEntry
    extends DeviceEntity
    implements Serializable, IStsnEntry, IIndexed, IVariableBindingSetter
{

    private int stsnTypeIdx;
    private int stsnShelfIdx;
    private int stsnSlotIdx;
    private int stsnPortIdx;
    private int stsnIdx;
    private int stsnProtSwEvtType;
    private int stsnBER;
    private int stsnBERTh;
    private String stsnProtSwStatus;
    private String _index;
    private StsnTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public StsnEntry() {
    }

    public int getStsnTypeIdx() {
        return this.stsnTypeIdx;
    }

    public void setStsnTypeIdx(int stsnTypeIdx) {
        int oldValue = getStsnTypeIdx();
        this.stsnTypeIdx = stsnTypeIdx;
        notifyChange(1, oldValue, stsnTypeIdx);
    }

    public int getStsnShelfIdx() {
        return this.stsnShelfIdx;
    }

    public void setStsnShelfIdx(int stsnShelfIdx) {
        int oldValue = getStsnShelfIdx();
        this.stsnShelfIdx = stsnShelfIdx;
        notifyChange(2, oldValue, stsnShelfIdx);
    }

    public int getStsnSlotIdx() {
        return this.stsnSlotIdx;
    }

    public void setStsnSlotIdx(int stsnSlotIdx) {
        int oldValue = getStsnSlotIdx();
        this.stsnSlotIdx = stsnSlotIdx;
        notifyChange(3, oldValue, stsnSlotIdx);
    }

    public int getStsnPortIdx() {
        return this.stsnPortIdx;
    }

    public void setStsnPortIdx(int stsnPortIdx) {
        int oldValue = getStsnPortIdx();
        this.stsnPortIdx = stsnPortIdx;
        notifyChange(4, oldValue, stsnPortIdx);
    }

    public int getStsnIdx() {
        return this.stsnIdx;
    }

    public void setStsnIdx(int stsnIdx) {
        int oldValue = getStsnIdx();
        this.stsnIdx = stsnIdx;
        notifyChange(5, oldValue, stsnIdx);
    }

    public int getStsnProtSwEvtType() {
        return this.stsnProtSwEvtType;
    }

    public void setStsnProtSwEvtType(int stsnProtSwEvtType) {
        int oldValue = getStsnProtSwEvtType();
        this.stsnProtSwEvtType = stsnProtSwEvtType;
        notifyChange(6, oldValue, stsnProtSwEvtType);
    }

    public int getStsnBER() {
        return this.stsnBER;
    }

    public void setStsnBER(int stsnBER) {
        int oldValue = getStsnBER();
        this.stsnBER = stsnBER;
        notifyChange(7, oldValue, stsnBER);
    }

    public int getStsnBERTh() {
        return this.stsnBERTh;
    }

    public void setStsnBERTh(int stsnBERTh) {
        int oldValue = getStsnBERTh();
        this.stsnBERTh = stsnBERTh;
        notifyChange(8, oldValue, stsnBERTh);
    }

    public String getStsnProtSwStatus() {
        return this.stsnProtSwStatus;
    }

    public void setStsnProtSwStatus(String stsnProtSwStatus) {
        String oldValue = getStsnProtSwStatus();
        this.stsnProtSwStatus = stsnProtSwStatus;
        notifyChange(9, oldValue, stsnProtSwStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setStsnTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setStsnShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setStsnSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setStsnPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setStsnIdx(binding.getVariable().toInt());
                break;
            case  6 :
                setStsnProtSwEvtType(binding.getVariable().toInt());
                break;
            case  7 :
                setStsnBER(binding.getVariable().toInt());
                break;
            case  8 :
                setStsnBERTh(binding.getVariable().toInt());
                break;
            case  9 :
                setStsnProtSwStatus(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setStsnTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStsnShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStsnSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStsnPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStsnIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(StsnTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("stsnTypeIdx", stsnTypeIdx).append("stsnShelfIdx", stsnShelfIdx).append("stsnSlotIdx", stsnSlotIdx).append("stsnPortIdx", stsnPortIdx).append("stsnIdx", stsnIdx).append("stsnProtSwEvtType", stsnProtSwEvtType).append("stsnBER", stsnBER).append("stsnBERTh", stsnBERTh).append("stsnProtSwStatus", stsnProtSwStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(stsnTypeIdx).append(stsnShelfIdx).append(stsnSlotIdx).append(stsnPortIdx).append(stsnIdx).append(stsnProtSwEvtType).append(stsnBER).append(stsnBERTh).append(stsnProtSwStatus).append(_index).toHashCode();
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
        StsnEntry rhs = ((StsnEntry) obj);
        return new EqualsBuilder().append(stsnTypeIdx, rhs.stsnTypeIdx).append(stsnShelfIdx, rhs.stsnShelfIdx).append(stsnSlotIdx, rhs.stsnSlotIdx).append(stsnPortIdx, rhs.stsnPortIdx).append(stsnIdx, rhs.stsnIdx).append(stsnProtSwEvtType, rhs.stsnProtSwEvtType).append(stsnBER, rhs.stsnBER).append(stsnBERTh, rhs.stsnBERTh).append(stsnProtSwStatus, rhs.stsnProtSwStatus).append(_index, rhs._index).isEquals();
    }

    public StsnEntry clone() {
        StsnEntry _copy = new StsnEntry();
        _copy.stsnTypeIdx = stsnTypeIdx;
        _copy.stsnShelfIdx = stsnShelfIdx;
        _copy.stsnSlotIdx = stsnSlotIdx;
        _copy.stsnPortIdx = stsnPortIdx;
        _copy.stsnIdx = stsnIdx;
        _copy.stsnProtSwEvtType = stsnProtSwEvtType;
        _copy.stsnBER = stsnBER;
        _copy.stsnBERTh = stsnBERTh;
        _copy.stsnProtSwStatus = stsnProtSwStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.6.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "stsnTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "stsnShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "stsnSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "stsnPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "stsnIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "stsnProtSwEvtType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "stsnBER", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "stsnBERTh", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "stsnProtSwStatus", DeviceEntityDescription.FieldType.STRING, 65));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
