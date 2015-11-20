
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.cpoperations.cprestartoptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.cpoperations.CpRestartOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.cpoperations.cprestartoptable.ICpRestartOpEntry;
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

public class CpRestartOpEntry
    extends DeviceEntity
    implements Serializable, ICpRestartOpEntry, IIndexed, IVariableBindingSetter
{

    private int cpRestartOpTypeIdx;
    private int cpRestartOpShelfIdx;
    private int cpRestartOpSlotIdx;
    private int cpRestartOpCmd;
    private String _index;
    private CpRestartOpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public CpRestartOpEntry() {
    }

    public int getCpRestartOpTypeIdx() {
        return this.cpRestartOpTypeIdx;
    }

    public void setCpRestartOpTypeIdx(int cpRestartOpTypeIdx) {
        int oldValue = getCpRestartOpTypeIdx();
        this.cpRestartOpTypeIdx = cpRestartOpTypeIdx;
        notifyChange(1, oldValue, cpRestartOpTypeIdx);
    }

    public int getCpRestartOpShelfIdx() {
        return this.cpRestartOpShelfIdx;
    }

    public void setCpRestartOpShelfIdx(int cpRestartOpShelfIdx) {
        int oldValue = getCpRestartOpShelfIdx();
        this.cpRestartOpShelfIdx = cpRestartOpShelfIdx;
        notifyChange(2, oldValue, cpRestartOpShelfIdx);
    }

    public int getCpRestartOpSlotIdx() {
        return this.cpRestartOpSlotIdx;
    }

    public void setCpRestartOpSlotIdx(int cpRestartOpSlotIdx) {
        int oldValue = getCpRestartOpSlotIdx();
        this.cpRestartOpSlotIdx = cpRestartOpSlotIdx;
        notifyChange(3, oldValue, cpRestartOpSlotIdx);
    }

    public int getCpRestartOpCmd() {
        return this.cpRestartOpCmd;
    }

    public void setCpRestartOpCmd(int cpRestartOpCmd) {
        int oldValue = getCpRestartOpCmd();
        this.cpRestartOpCmd = cpRestartOpCmd;
        notifyChange(4, oldValue, cpRestartOpCmd);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(14)) {
            case  1 :
                setCpRestartOpTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setCpRestartOpShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setCpRestartOpSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setCpRestartOpCmd(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 15;
        int _len;
        _index = new OID(_oidInts, 15, (oid.size()- 15)).toString();
        setCpRestartOpTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setCpRestartOpShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setCpRestartOpSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(CpRestartOpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("cpRestartOpTypeIdx", cpRestartOpTypeIdx).append("cpRestartOpShelfIdx", cpRestartOpShelfIdx).append("cpRestartOpSlotIdx", cpRestartOpSlotIdx).append("cpRestartOpCmd", cpRestartOpCmd).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(cpRestartOpTypeIdx).append(cpRestartOpShelfIdx).append(cpRestartOpSlotIdx).append(cpRestartOpCmd).append(_index).toHashCode();
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
        CpRestartOpEntry rhs = ((CpRestartOpEntry) obj);
        return new EqualsBuilder().append(cpRestartOpTypeIdx, rhs.cpRestartOpTypeIdx).append(cpRestartOpShelfIdx, rhs.cpRestartOpShelfIdx).append(cpRestartOpSlotIdx, rhs.cpRestartOpSlotIdx).append(cpRestartOpCmd, rhs.cpRestartOpCmd).append(_index, rhs._index).isEquals();
    }

    public CpRestartOpEntry clone() {
        CpRestartOpEntry _copy = new CpRestartOpEntry();
        _copy.cpRestartOpTypeIdx = cpRestartOpTypeIdx;
        _copy.cpRestartOpShelfIdx = cpRestartOpShelfIdx;
        _copy.cpRestartOpSlotIdx = cpRestartOpSlotIdx;
        _copy.cpRestartOpCmd = cpRestartOpCmd;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.5.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "cpRestartOpTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "cpRestartOpShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "cpRestartOpSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "cpRestartOpCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
