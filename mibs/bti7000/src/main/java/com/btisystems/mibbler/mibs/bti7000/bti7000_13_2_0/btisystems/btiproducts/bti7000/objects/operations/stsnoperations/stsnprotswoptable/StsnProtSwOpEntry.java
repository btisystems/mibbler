
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.stsnoperations.stsnprotswoptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.stsnoperations.StsnProtSwOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stsnoperations.stsnprotswoptable.IStsnProtSwOpEntry;
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

public class StsnProtSwOpEntry
    extends DeviceEntity
    implements Serializable, IStsnProtSwOpEntry, IIndexed, IVariableBindingSetter
{

    private int stsnProtSwOpTypeIdx;
    private int stsnProtSwOpShelfIdx;
    private int stsnProtSwOpSlotIdx;
    private int stsnProtSwOpPortIdx;
    private int stsnProtSwOpIdx;
    private int stsnProtSwOpCmd;
    private String _index;
    private StsnProtSwOpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public StsnProtSwOpEntry() {
    }

    public int getStsnProtSwOpTypeIdx() {
        return this.stsnProtSwOpTypeIdx;
    }

    public void setStsnProtSwOpTypeIdx(int stsnProtSwOpTypeIdx) {
        int oldValue = getStsnProtSwOpTypeIdx();
        this.stsnProtSwOpTypeIdx = stsnProtSwOpTypeIdx;
        notifyChange(1, oldValue, stsnProtSwOpTypeIdx);
    }

    public int getStsnProtSwOpShelfIdx() {
        return this.stsnProtSwOpShelfIdx;
    }

    public void setStsnProtSwOpShelfIdx(int stsnProtSwOpShelfIdx) {
        int oldValue = getStsnProtSwOpShelfIdx();
        this.stsnProtSwOpShelfIdx = stsnProtSwOpShelfIdx;
        notifyChange(2, oldValue, stsnProtSwOpShelfIdx);
    }

    public int getStsnProtSwOpSlotIdx() {
        return this.stsnProtSwOpSlotIdx;
    }

    public void setStsnProtSwOpSlotIdx(int stsnProtSwOpSlotIdx) {
        int oldValue = getStsnProtSwOpSlotIdx();
        this.stsnProtSwOpSlotIdx = stsnProtSwOpSlotIdx;
        notifyChange(3, oldValue, stsnProtSwOpSlotIdx);
    }

    public int getStsnProtSwOpPortIdx() {
        return this.stsnProtSwOpPortIdx;
    }

    public void setStsnProtSwOpPortIdx(int stsnProtSwOpPortIdx) {
        int oldValue = getStsnProtSwOpPortIdx();
        this.stsnProtSwOpPortIdx = stsnProtSwOpPortIdx;
        notifyChange(4, oldValue, stsnProtSwOpPortIdx);
    }

    public int getStsnProtSwOpIdx() {
        return this.stsnProtSwOpIdx;
    }

    public void setStsnProtSwOpIdx(int stsnProtSwOpIdx) {
        int oldValue = getStsnProtSwOpIdx();
        this.stsnProtSwOpIdx = stsnProtSwOpIdx;
        notifyChange(5, oldValue, stsnProtSwOpIdx);
    }

    public int getStsnProtSwOpCmd() {
        return this.stsnProtSwOpCmd;
    }

    public void setStsnProtSwOpCmd(int stsnProtSwOpCmd) {
        int oldValue = getStsnProtSwOpCmd();
        this.stsnProtSwOpCmd = stsnProtSwOpCmd;
        notifyChange(6, oldValue, stsnProtSwOpCmd);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(14)) {
            case  1 :
                setStsnProtSwOpTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setStsnProtSwOpShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setStsnProtSwOpSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setStsnProtSwOpPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setStsnProtSwOpIdx(binding.getVariable().toInt());
                break;
            case  6 :
                setStsnProtSwOpCmd(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 15;
        int _len;
        _index = new OID(_oidInts, 15, (oid.size()- 15)).toString();
        setStsnProtSwOpTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStsnProtSwOpShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStsnProtSwOpSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStsnProtSwOpPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStsnProtSwOpIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(StsnProtSwOpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("stsnProtSwOpTypeIdx", stsnProtSwOpTypeIdx).append("stsnProtSwOpShelfIdx", stsnProtSwOpShelfIdx).append("stsnProtSwOpSlotIdx", stsnProtSwOpSlotIdx).append("stsnProtSwOpPortIdx", stsnProtSwOpPortIdx).append("stsnProtSwOpIdx", stsnProtSwOpIdx).append("stsnProtSwOpCmd", stsnProtSwOpCmd).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(stsnProtSwOpTypeIdx).append(stsnProtSwOpShelfIdx).append(stsnProtSwOpSlotIdx).append(stsnProtSwOpPortIdx).append(stsnProtSwOpIdx).append(stsnProtSwOpCmd).append(_index).toHashCode();
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
        StsnProtSwOpEntry rhs = ((StsnProtSwOpEntry) obj);
        return new EqualsBuilder().append(stsnProtSwOpTypeIdx, rhs.stsnProtSwOpTypeIdx).append(stsnProtSwOpShelfIdx, rhs.stsnProtSwOpShelfIdx).append(stsnProtSwOpSlotIdx, rhs.stsnProtSwOpSlotIdx).append(stsnProtSwOpPortIdx, rhs.stsnProtSwOpPortIdx).append(stsnProtSwOpIdx, rhs.stsnProtSwOpIdx).append(stsnProtSwOpCmd, rhs.stsnProtSwOpCmd).append(_index, rhs._index).isEquals();
    }

    public StsnProtSwOpEntry clone() {
        StsnProtSwOpEntry _copy = new StsnProtSwOpEntry();
        _copy.stsnProtSwOpTypeIdx = stsnProtSwOpTypeIdx;
        _copy.stsnProtSwOpShelfIdx = stsnProtSwOpShelfIdx;
        _copy.stsnProtSwOpSlotIdx = stsnProtSwOpSlotIdx;
        _copy.stsnProtSwOpPortIdx = stsnProtSwOpPortIdx;
        _copy.stsnProtSwOpIdx = stsnProtSwOpIdx;
        _copy.stsnProtSwOpCmd = stsnProtSwOpCmd;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.13.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "stsnProtSwOpTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "stsnProtSwOpShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "stsnProtSwOpSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "stsnProtSwOpPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "stsnProtSwOpIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "stsnProtSwOpCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
