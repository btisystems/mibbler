
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.protection.stmnprotgrptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.protection.StmnProtGrpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection.stmnprotgrptable.IStmnProtGrpEntry;
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

public class StmnProtGrpEntry
    extends DeviceEntity
    implements Serializable, IStmnProtGrpEntry, IIndexed, IVariableBindingSetter
{

    private int stmnProtGrpWorkTypeIdx;
    private int stmnProtGrpWorkShelfIdx;
    private int stmnProtGrpWorkSlotIdx;
    private int stmnProtGrpWorkPortIdx;
    private int stmnProtGrpProtTypeIdx;
    private int stmnProtGrpProtShelfIdx;
    private int stmnProtGrpProtSlotIdx;
    private int stmnProtGrpProtPortIdx;
    private String stmnProtGrpId;
    private int stmnProtGrpRowStatus;
    private String _index;
    private StmnProtGrpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public StmnProtGrpEntry() {
    }

    public int getStmnProtGrpWorkTypeIdx() {
        return this.stmnProtGrpWorkTypeIdx;
    }

    public void setStmnProtGrpWorkTypeIdx(int stmnProtGrpWorkTypeIdx) {
        int oldValue = getStmnProtGrpWorkTypeIdx();
        this.stmnProtGrpWorkTypeIdx = stmnProtGrpWorkTypeIdx;
        notifyChange(1, oldValue, stmnProtGrpWorkTypeIdx);
    }

    public int getStmnProtGrpWorkShelfIdx() {
        return this.stmnProtGrpWorkShelfIdx;
    }

    public void setStmnProtGrpWorkShelfIdx(int stmnProtGrpWorkShelfIdx) {
        int oldValue = getStmnProtGrpWorkShelfIdx();
        this.stmnProtGrpWorkShelfIdx = stmnProtGrpWorkShelfIdx;
        notifyChange(2, oldValue, stmnProtGrpWorkShelfIdx);
    }

    public int getStmnProtGrpWorkSlotIdx() {
        return this.stmnProtGrpWorkSlotIdx;
    }

    public void setStmnProtGrpWorkSlotIdx(int stmnProtGrpWorkSlotIdx) {
        int oldValue = getStmnProtGrpWorkSlotIdx();
        this.stmnProtGrpWorkSlotIdx = stmnProtGrpWorkSlotIdx;
        notifyChange(3, oldValue, stmnProtGrpWorkSlotIdx);
    }

    public int getStmnProtGrpWorkPortIdx() {
        return this.stmnProtGrpWorkPortIdx;
    }

    public void setStmnProtGrpWorkPortIdx(int stmnProtGrpWorkPortIdx) {
        int oldValue = getStmnProtGrpWorkPortIdx();
        this.stmnProtGrpWorkPortIdx = stmnProtGrpWorkPortIdx;
        notifyChange(4, oldValue, stmnProtGrpWorkPortIdx);
    }

    public int getStmnProtGrpProtTypeIdx() {
        return this.stmnProtGrpProtTypeIdx;
    }

    public void setStmnProtGrpProtTypeIdx(int stmnProtGrpProtTypeIdx) {
        int oldValue = getStmnProtGrpProtTypeIdx();
        this.stmnProtGrpProtTypeIdx = stmnProtGrpProtTypeIdx;
        notifyChange(5, oldValue, stmnProtGrpProtTypeIdx);
    }

    public int getStmnProtGrpProtShelfIdx() {
        return this.stmnProtGrpProtShelfIdx;
    }

    public void setStmnProtGrpProtShelfIdx(int stmnProtGrpProtShelfIdx) {
        int oldValue = getStmnProtGrpProtShelfIdx();
        this.stmnProtGrpProtShelfIdx = stmnProtGrpProtShelfIdx;
        notifyChange(6, oldValue, stmnProtGrpProtShelfIdx);
    }

    public int getStmnProtGrpProtSlotIdx() {
        return this.stmnProtGrpProtSlotIdx;
    }

    public void setStmnProtGrpProtSlotIdx(int stmnProtGrpProtSlotIdx) {
        int oldValue = getStmnProtGrpProtSlotIdx();
        this.stmnProtGrpProtSlotIdx = stmnProtGrpProtSlotIdx;
        notifyChange(7, oldValue, stmnProtGrpProtSlotIdx);
    }

    public int getStmnProtGrpProtPortIdx() {
        return this.stmnProtGrpProtPortIdx;
    }

    public void setStmnProtGrpProtPortIdx(int stmnProtGrpProtPortIdx) {
        int oldValue = getStmnProtGrpProtPortIdx();
        this.stmnProtGrpProtPortIdx = stmnProtGrpProtPortIdx;
        notifyChange(8, oldValue, stmnProtGrpProtPortIdx);
    }

    public String getStmnProtGrpId() {
        if (this.stmnProtGrpId == null) {
            return "";
        }
        return this.stmnProtGrpId;
    }

    public boolean isStmnProtGrpIdDefined() {
        return (this.stmnProtGrpId!= null);
    }

    public void setStmnProtGrpId(String stmnProtGrpId) {
        String oldValue = getStmnProtGrpId();
        this.stmnProtGrpId = stmnProtGrpId;
        notifyChange(9, oldValue, stmnProtGrpId);
    }

    public int getStmnProtGrpRowStatus() {
        return this.stmnProtGrpRowStatus;
    }

    public void setStmnProtGrpRowStatus(int stmnProtGrpRowStatus) {
        int oldValue = getStmnProtGrpRowStatus();
        this.stmnProtGrpRowStatus = stmnProtGrpRowStatus;
        notifyChange(100, oldValue, stmnProtGrpRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setStmnProtGrpWorkTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setStmnProtGrpWorkShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setStmnProtGrpWorkSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setStmnProtGrpWorkPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setStmnProtGrpProtTypeIdx(binding.getVariable().toInt());
                break;
            case  6 :
                setStmnProtGrpProtShelfIdx(binding.getVariable().toInt());
                break;
            case  7 :
                setStmnProtGrpProtSlotIdx(binding.getVariable().toInt());
                break;
            case  8 :
                setStmnProtGrpProtPortIdx(binding.getVariable().toInt());
                break;
            case  9 :
                setStmnProtGrpId(binding.getVariable().toString());
                break;
            case  100 :
                setStmnProtGrpRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setStmnProtGrpWorkTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStmnProtGrpWorkShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStmnProtGrpWorkSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStmnProtGrpWorkPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStmnProtGrpProtTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStmnProtGrpProtShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStmnProtGrpProtSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStmnProtGrpProtPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(StmnProtGrpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("stmnProtGrpWorkTypeIdx", stmnProtGrpWorkTypeIdx).append("stmnProtGrpWorkShelfIdx", stmnProtGrpWorkShelfIdx).append("stmnProtGrpWorkSlotIdx", stmnProtGrpWorkSlotIdx).append("stmnProtGrpWorkPortIdx", stmnProtGrpWorkPortIdx).append("stmnProtGrpProtTypeIdx", stmnProtGrpProtTypeIdx).append("stmnProtGrpProtShelfIdx", stmnProtGrpProtShelfIdx).append("stmnProtGrpProtSlotIdx", stmnProtGrpProtSlotIdx).append("stmnProtGrpProtPortIdx", stmnProtGrpProtPortIdx).append("stmnProtGrpId", stmnProtGrpId).append("stmnProtGrpRowStatus", stmnProtGrpRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(stmnProtGrpWorkTypeIdx).append(stmnProtGrpWorkShelfIdx).append(stmnProtGrpWorkSlotIdx).append(stmnProtGrpWorkPortIdx).append(stmnProtGrpProtTypeIdx).append(stmnProtGrpProtShelfIdx).append(stmnProtGrpProtSlotIdx).append(stmnProtGrpProtPortIdx).append(stmnProtGrpId).append(stmnProtGrpRowStatus).append(_index).toHashCode();
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
        StmnProtGrpEntry rhs = ((StmnProtGrpEntry) obj);
        return new EqualsBuilder().append(stmnProtGrpWorkTypeIdx, rhs.stmnProtGrpWorkTypeIdx).append(stmnProtGrpWorkShelfIdx, rhs.stmnProtGrpWorkShelfIdx).append(stmnProtGrpWorkSlotIdx, rhs.stmnProtGrpWorkSlotIdx).append(stmnProtGrpWorkPortIdx, rhs.stmnProtGrpWorkPortIdx).append(stmnProtGrpProtTypeIdx, rhs.stmnProtGrpProtTypeIdx).append(stmnProtGrpProtShelfIdx, rhs.stmnProtGrpProtShelfIdx).append(stmnProtGrpProtSlotIdx, rhs.stmnProtGrpProtSlotIdx).append(stmnProtGrpProtPortIdx, rhs.stmnProtGrpProtPortIdx).append(stmnProtGrpId, rhs.stmnProtGrpId).append(stmnProtGrpRowStatus, rhs.stmnProtGrpRowStatus).append(_index, rhs._index).isEquals();
    }

    public StmnProtGrpEntry clone() {
        StmnProtGrpEntry _copy = new StmnProtGrpEntry();
        _copy.stmnProtGrpWorkTypeIdx = stmnProtGrpWorkTypeIdx;
        _copy.stmnProtGrpWorkShelfIdx = stmnProtGrpWorkShelfIdx;
        _copy.stmnProtGrpWorkSlotIdx = stmnProtGrpWorkSlotIdx;
        _copy.stmnProtGrpWorkPortIdx = stmnProtGrpWorkPortIdx;
        _copy.stmnProtGrpProtTypeIdx = stmnProtGrpProtTypeIdx;
        _copy.stmnProtGrpProtShelfIdx = stmnProtGrpProtShelfIdx;
        _copy.stmnProtGrpProtSlotIdx = stmnProtGrpProtSlotIdx;
        _copy.stmnProtGrpProtPortIdx = stmnProtGrpProtPortIdx;
        _copy.stmnProtGrpId = stmnProtGrpId;
        _copy.stmnProtGrpRowStatus = stmnProtGrpRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.10.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "stmnProtGrpWorkTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "stmnProtGrpWorkShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "stmnProtGrpWorkSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "stmnProtGrpWorkPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "stmnProtGrpProtTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "stmnProtGrpProtShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "stmnProtGrpProtSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "stmnProtGrpProtPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "stmnProtGrpId", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "stmnProtGrpRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
