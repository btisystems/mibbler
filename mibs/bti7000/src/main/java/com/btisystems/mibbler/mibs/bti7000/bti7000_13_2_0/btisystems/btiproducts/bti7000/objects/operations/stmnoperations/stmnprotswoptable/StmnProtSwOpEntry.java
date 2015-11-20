
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.stmnoperations.stmnprotswoptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.stmnoperations.StmnProtSwOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stmnoperations.stmnprotswoptable.IStmnProtSwOpEntry;
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

public class StmnProtSwOpEntry
    extends DeviceEntity
    implements Serializable, IStmnProtSwOpEntry, IIndexed, IVariableBindingSetter
{

    private int stmnProtSwOpTypeIdx;
    private int stmnProtSwOpShelfIdx;
    private int stmnProtSwOpSlotIdx;
    private int stmnProtSwOpIdx;
    private int stmnProtSwOpCmd;
    private String _index;
    private StmnProtSwOpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public StmnProtSwOpEntry() {
    }

    public int getStmnProtSwOpTypeIdx() {
        return this.stmnProtSwOpTypeIdx;
    }

    public void setStmnProtSwOpTypeIdx(int stmnProtSwOpTypeIdx) {
        int oldValue = getStmnProtSwOpTypeIdx();
        this.stmnProtSwOpTypeIdx = stmnProtSwOpTypeIdx;
        notifyChange(1, oldValue, stmnProtSwOpTypeIdx);
    }

    public int getStmnProtSwOpShelfIdx() {
        return this.stmnProtSwOpShelfIdx;
    }

    public void setStmnProtSwOpShelfIdx(int stmnProtSwOpShelfIdx) {
        int oldValue = getStmnProtSwOpShelfIdx();
        this.stmnProtSwOpShelfIdx = stmnProtSwOpShelfIdx;
        notifyChange(2, oldValue, stmnProtSwOpShelfIdx);
    }

    public int getStmnProtSwOpSlotIdx() {
        return this.stmnProtSwOpSlotIdx;
    }

    public void setStmnProtSwOpSlotIdx(int stmnProtSwOpSlotIdx) {
        int oldValue = getStmnProtSwOpSlotIdx();
        this.stmnProtSwOpSlotIdx = stmnProtSwOpSlotIdx;
        notifyChange(3, oldValue, stmnProtSwOpSlotIdx);
    }

    public int getStmnProtSwOpIdx() {
        return this.stmnProtSwOpIdx;
    }

    public void setStmnProtSwOpIdx(int stmnProtSwOpIdx) {
        int oldValue = getStmnProtSwOpIdx();
        this.stmnProtSwOpIdx = stmnProtSwOpIdx;
        notifyChange(4, oldValue, stmnProtSwOpIdx);
    }

    public int getStmnProtSwOpCmd() {
        return this.stmnProtSwOpCmd;
    }

    public void setStmnProtSwOpCmd(int stmnProtSwOpCmd) {
        int oldValue = getStmnProtSwOpCmd();
        this.stmnProtSwOpCmd = stmnProtSwOpCmd;
        notifyChange(5, oldValue, stmnProtSwOpCmd);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(14)) {
            case  1 :
                setStmnProtSwOpTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setStmnProtSwOpShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setStmnProtSwOpSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setStmnProtSwOpIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setStmnProtSwOpCmd(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 15;
        int _len;
        _index = new OID(_oidInts, 15, (oid.size()- 15)).toString();
        setStmnProtSwOpTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStmnProtSwOpShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStmnProtSwOpSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStmnProtSwOpIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(StmnProtSwOpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("stmnProtSwOpTypeIdx", stmnProtSwOpTypeIdx).append("stmnProtSwOpShelfIdx", stmnProtSwOpShelfIdx).append("stmnProtSwOpSlotIdx", stmnProtSwOpSlotIdx).append("stmnProtSwOpIdx", stmnProtSwOpIdx).append("stmnProtSwOpCmd", stmnProtSwOpCmd).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(stmnProtSwOpTypeIdx).append(stmnProtSwOpShelfIdx).append(stmnProtSwOpSlotIdx).append(stmnProtSwOpIdx).append(stmnProtSwOpCmd).append(_index).toHashCode();
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
        StmnProtSwOpEntry rhs = ((StmnProtSwOpEntry) obj);
        return new EqualsBuilder().append(stmnProtSwOpTypeIdx, rhs.stmnProtSwOpTypeIdx).append(stmnProtSwOpShelfIdx, rhs.stmnProtSwOpShelfIdx).append(stmnProtSwOpSlotIdx, rhs.stmnProtSwOpSlotIdx).append(stmnProtSwOpIdx, rhs.stmnProtSwOpIdx).append(stmnProtSwOpCmd, rhs.stmnProtSwOpCmd).append(_index, rhs._index).isEquals();
    }

    public StmnProtSwOpEntry clone() {
        StmnProtSwOpEntry _copy = new StmnProtSwOpEntry();
        _copy.stmnProtSwOpTypeIdx = stmnProtSwOpTypeIdx;
        _copy.stmnProtSwOpShelfIdx = stmnProtSwOpShelfIdx;
        _copy.stmnProtSwOpSlotIdx = stmnProtSwOpSlotIdx;
        _copy.stmnProtSwOpIdx = stmnProtSwOpIdx;
        _copy.stmnProtSwOpCmd = stmnProtSwOpCmd;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.14.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "stmnProtSwOpTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "stmnProtSwOpShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "stmnProtSwOpSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "stmnProtSwOpIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "stmnProtSwOpCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
