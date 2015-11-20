
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.pluggableinvoperations.pluggableinvrestartoptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.pluggableinvoperations.PluggableInvRestartOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.pluggableinvoperations.pluggableinvrestartoptable.IPluggableInvRestartOpEntry;
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

public class PluggableInvRestartOpEntry
    extends DeviceEntity
    implements Serializable, IPluggableInvRestartOpEntry, IIndexed, IVariableBindingSetter
{

    private int pluggableInvRestartOpTypeIdx;
    private int pluggableInvRestartOpShelfIdx;
    private int pluggableInvRestartOpSlotIdx;
    private int pluggableInvRestartOpPortIdx;
    private int pluggableInvRestartOpCmd;
    private String _index;
    private PluggableInvRestartOpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public PluggableInvRestartOpEntry() {
    }

    public int getPluggableInvRestartOpTypeIdx() {
        return this.pluggableInvRestartOpTypeIdx;
    }

    public void setPluggableInvRestartOpTypeIdx(int pluggableInvRestartOpTypeIdx) {
        int oldValue = getPluggableInvRestartOpTypeIdx();
        this.pluggableInvRestartOpTypeIdx = pluggableInvRestartOpTypeIdx;
        notifyChange(1, oldValue, pluggableInvRestartOpTypeIdx);
    }

    public int getPluggableInvRestartOpShelfIdx() {
        return this.pluggableInvRestartOpShelfIdx;
    }

    public void setPluggableInvRestartOpShelfIdx(int pluggableInvRestartOpShelfIdx) {
        int oldValue = getPluggableInvRestartOpShelfIdx();
        this.pluggableInvRestartOpShelfIdx = pluggableInvRestartOpShelfIdx;
        notifyChange(2, oldValue, pluggableInvRestartOpShelfIdx);
    }

    public int getPluggableInvRestartOpSlotIdx() {
        return this.pluggableInvRestartOpSlotIdx;
    }

    public void setPluggableInvRestartOpSlotIdx(int pluggableInvRestartOpSlotIdx) {
        int oldValue = getPluggableInvRestartOpSlotIdx();
        this.pluggableInvRestartOpSlotIdx = pluggableInvRestartOpSlotIdx;
        notifyChange(3, oldValue, pluggableInvRestartOpSlotIdx);
    }

    public int getPluggableInvRestartOpPortIdx() {
        return this.pluggableInvRestartOpPortIdx;
    }

    public void setPluggableInvRestartOpPortIdx(int pluggableInvRestartOpPortIdx) {
        int oldValue = getPluggableInvRestartOpPortIdx();
        this.pluggableInvRestartOpPortIdx = pluggableInvRestartOpPortIdx;
        notifyChange(4, oldValue, pluggableInvRestartOpPortIdx);
    }

    public int getPluggableInvRestartOpCmd() {
        return this.pluggableInvRestartOpCmd;
    }

    public void setPluggableInvRestartOpCmd(int pluggableInvRestartOpCmd) {
        int oldValue = getPluggableInvRestartOpCmd();
        this.pluggableInvRestartOpCmd = pluggableInvRestartOpCmd;
        notifyChange(5, oldValue, pluggableInvRestartOpCmd);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(14)) {
            case  1 :
                setPluggableInvRestartOpTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setPluggableInvRestartOpShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setPluggableInvRestartOpSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setPluggableInvRestartOpPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setPluggableInvRestartOpCmd(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 15;
        int _len;
        _index = new OID(_oidInts, 15, (oid.size()- 15)).toString();
        setPluggableInvRestartOpTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setPluggableInvRestartOpShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setPluggableInvRestartOpSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setPluggableInvRestartOpPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(PluggableInvRestartOpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("pluggableInvRestartOpTypeIdx", pluggableInvRestartOpTypeIdx).append("pluggableInvRestartOpShelfIdx", pluggableInvRestartOpShelfIdx).append("pluggableInvRestartOpSlotIdx", pluggableInvRestartOpSlotIdx).append("pluggableInvRestartOpPortIdx", pluggableInvRestartOpPortIdx).append("pluggableInvRestartOpCmd", pluggableInvRestartOpCmd).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(pluggableInvRestartOpTypeIdx).append(pluggableInvRestartOpShelfIdx).append(pluggableInvRestartOpSlotIdx).append(pluggableInvRestartOpPortIdx).append(pluggableInvRestartOpCmd).append(_index).toHashCode();
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
        PluggableInvRestartOpEntry rhs = ((PluggableInvRestartOpEntry) obj);
        return new EqualsBuilder().append(pluggableInvRestartOpTypeIdx, rhs.pluggableInvRestartOpTypeIdx).append(pluggableInvRestartOpShelfIdx, rhs.pluggableInvRestartOpShelfIdx).append(pluggableInvRestartOpSlotIdx, rhs.pluggableInvRestartOpSlotIdx).append(pluggableInvRestartOpPortIdx, rhs.pluggableInvRestartOpPortIdx).append(pluggableInvRestartOpCmd, rhs.pluggableInvRestartOpCmd).append(_index, rhs._index).isEquals();
    }

    public PluggableInvRestartOpEntry clone() {
        PluggableInvRestartOpEntry _copy = new PluggableInvRestartOpEntry();
        _copy.pluggableInvRestartOpTypeIdx = pluggableInvRestartOpTypeIdx;
        _copy.pluggableInvRestartOpShelfIdx = pluggableInvRestartOpShelfIdx;
        _copy.pluggableInvRestartOpSlotIdx = pluggableInvRestartOpSlotIdx;
        _copy.pluggableInvRestartOpPortIdx = pluggableInvRestartOpPortIdx;
        _copy.pluggableInvRestartOpCmd = pluggableInvRestartOpCmd;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.8.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "pluggableInvRestartOpTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "pluggableInvRestartOpShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "pluggableInvRestartOpSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "pluggableInvRestartOpPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "pluggableInvRestartOpCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
