
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.stmnoperations.stmnlpbkoptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.stmnoperations.StmnLpbkOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stmnoperations.stmnlpbkoptable.IStmnLpbkOpEntry;
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

public class StmnLpbkOpEntry
    extends DeviceEntity
    implements Serializable, IStmnLpbkOpEntry, IIndexed, IVariableBindingSetter
{

    private int stmnLpbkOpTypeIdx;
    private int stmnLpbkOpShelfIdx;
    private int stmnLpbkOpSlotIdx;
    private int stmnLpbkOpPortIdx;
    private int stmnLpbkOpCmd;
    private String _index;
    private StmnLpbkOpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public StmnLpbkOpEntry() {
    }

    public int getStmnLpbkOpTypeIdx() {
        return this.stmnLpbkOpTypeIdx;
    }

    public void setStmnLpbkOpTypeIdx(int stmnLpbkOpTypeIdx) {
        int oldValue = getStmnLpbkOpTypeIdx();
        this.stmnLpbkOpTypeIdx = stmnLpbkOpTypeIdx;
        notifyChange(1, oldValue, stmnLpbkOpTypeIdx);
    }

    public int getStmnLpbkOpShelfIdx() {
        return this.stmnLpbkOpShelfIdx;
    }

    public void setStmnLpbkOpShelfIdx(int stmnLpbkOpShelfIdx) {
        int oldValue = getStmnLpbkOpShelfIdx();
        this.stmnLpbkOpShelfIdx = stmnLpbkOpShelfIdx;
        notifyChange(2, oldValue, stmnLpbkOpShelfIdx);
    }

    public int getStmnLpbkOpSlotIdx() {
        return this.stmnLpbkOpSlotIdx;
    }

    public void setStmnLpbkOpSlotIdx(int stmnLpbkOpSlotIdx) {
        int oldValue = getStmnLpbkOpSlotIdx();
        this.stmnLpbkOpSlotIdx = stmnLpbkOpSlotIdx;
        notifyChange(3, oldValue, stmnLpbkOpSlotIdx);
    }

    public int getStmnLpbkOpPortIdx() {
        return this.stmnLpbkOpPortIdx;
    }

    public void setStmnLpbkOpPortIdx(int stmnLpbkOpPortIdx) {
        int oldValue = getStmnLpbkOpPortIdx();
        this.stmnLpbkOpPortIdx = stmnLpbkOpPortIdx;
        notifyChange(4, oldValue, stmnLpbkOpPortIdx);
    }

    public int getStmnLpbkOpCmd() {
        return this.stmnLpbkOpCmd;
    }

    public void setStmnLpbkOpCmd(int stmnLpbkOpCmd) {
        int oldValue = getStmnLpbkOpCmd();
        this.stmnLpbkOpCmd = stmnLpbkOpCmd;
        notifyChange(5, oldValue, stmnLpbkOpCmd);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(14)) {
            case  1 :
                setStmnLpbkOpTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setStmnLpbkOpShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setStmnLpbkOpSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setStmnLpbkOpPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setStmnLpbkOpCmd(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 15;
        int _len;
        _index = new OID(_oidInts, 15, (oid.size()- 15)).toString();
        setStmnLpbkOpTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStmnLpbkOpShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStmnLpbkOpSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setStmnLpbkOpPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(StmnLpbkOpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("stmnLpbkOpTypeIdx", stmnLpbkOpTypeIdx).append("stmnLpbkOpShelfIdx", stmnLpbkOpShelfIdx).append("stmnLpbkOpSlotIdx", stmnLpbkOpSlotIdx).append("stmnLpbkOpPortIdx", stmnLpbkOpPortIdx).append("stmnLpbkOpCmd", stmnLpbkOpCmd).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(stmnLpbkOpTypeIdx).append(stmnLpbkOpShelfIdx).append(stmnLpbkOpSlotIdx).append(stmnLpbkOpPortIdx).append(stmnLpbkOpCmd).append(_index).toHashCode();
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
        StmnLpbkOpEntry rhs = ((StmnLpbkOpEntry) obj);
        return new EqualsBuilder().append(stmnLpbkOpTypeIdx, rhs.stmnLpbkOpTypeIdx).append(stmnLpbkOpShelfIdx, rhs.stmnLpbkOpShelfIdx).append(stmnLpbkOpSlotIdx, rhs.stmnLpbkOpSlotIdx).append(stmnLpbkOpPortIdx, rhs.stmnLpbkOpPortIdx).append(stmnLpbkOpCmd, rhs.stmnLpbkOpCmd).append(_index, rhs._index).isEquals();
    }

    public StmnLpbkOpEntry clone() {
        StmnLpbkOpEntry _copy = new StmnLpbkOpEntry();
        _copy.stmnLpbkOpTypeIdx = stmnLpbkOpTypeIdx;
        _copy.stmnLpbkOpShelfIdx = stmnLpbkOpShelfIdx;
        _copy.stmnLpbkOpSlotIdx = stmnLpbkOpSlotIdx;
        _copy.stmnLpbkOpPortIdx = stmnLpbkOpPortIdx;
        _copy.stmnLpbkOpCmd = stmnLpbkOpCmd;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.14.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "stmnLpbkOpTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "stmnLpbkOpShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "stmnLpbkOpSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "stmnLpbkOpPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "stmnLpbkOpCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
