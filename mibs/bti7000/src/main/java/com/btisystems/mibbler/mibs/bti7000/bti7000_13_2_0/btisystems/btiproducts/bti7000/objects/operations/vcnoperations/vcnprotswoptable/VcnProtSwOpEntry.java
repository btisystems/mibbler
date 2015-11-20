
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.vcnoperations.vcnprotswoptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.vcnoperations.VcnProtSwOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.vcnoperations.vcnprotswoptable.IVcnProtSwOpEntry;
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

public class VcnProtSwOpEntry
    extends DeviceEntity
    implements Serializable, IVcnProtSwOpEntry, IIndexed, IVariableBindingSetter
{

    private int vcnProtSwOpTypeIdx;
    private int vcnProtSwOpShelfIdx;
    private int vcnProtSwOpSlotIdx;
    private int vcnProtSwOpPortIdx;
    private int vcnProtSwOpIdx;
    private int vcnProtSwOpCmd;
    private String _index;
    private VcnProtSwOpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public VcnProtSwOpEntry() {
    }

    public int getVcnProtSwOpTypeIdx() {
        return this.vcnProtSwOpTypeIdx;
    }

    public void setVcnProtSwOpTypeIdx(int vcnProtSwOpTypeIdx) {
        int oldValue = getVcnProtSwOpTypeIdx();
        this.vcnProtSwOpTypeIdx = vcnProtSwOpTypeIdx;
        notifyChange(1, oldValue, vcnProtSwOpTypeIdx);
    }

    public int getVcnProtSwOpShelfIdx() {
        return this.vcnProtSwOpShelfIdx;
    }

    public void setVcnProtSwOpShelfIdx(int vcnProtSwOpShelfIdx) {
        int oldValue = getVcnProtSwOpShelfIdx();
        this.vcnProtSwOpShelfIdx = vcnProtSwOpShelfIdx;
        notifyChange(2, oldValue, vcnProtSwOpShelfIdx);
    }

    public int getVcnProtSwOpSlotIdx() {
        return this.vcnProtSwOpSlotIdx;
    }

    public void setVcnProtSwOpSlotIdx(int vcnProtSwOpSlotIdx) {
        int oldValue = getVcnProtSwOpSlotIdx();
        this.vcnProtSwOpSlotIdx = vcnProtSwOpSlotIdx;
        notifyChange(3, oldValue, vcnProtSwOpSlotIdx);
    }

    public int getVcnProtSwOpPortIdx() {
        return this.vcnProtSwOpPortIdx;
    }

    public void setVcnProtSwOpPortIdx(int vcnProtSwOpPortIdx) {
        int oldValue = getVcnProtSwOpPortIdx();
        this.vcnProtSwOpPortIdx = vcnProtSwOpPortIdx;
        notifyChange(4, oldValue, vcnProtSwOpPortIdx);
    }

    public int getVcnProtSwOpIdx() {
        return this.vcnProtSwOpIdx;
    }

    public void setVcnProtSwOpIdx(int vcnProtSwOpIdx) {
        int oldValue = getVcnProtSwOpIdx();
        this.vcnProtSwOpIdx = vcnProtSwOpIdx;
        notifyChange(5, oldValue, vcnProtSwOpIdx);
    }

    public int getVcnProtSwOpCmd() {
        return this.vcnProtSwOpCmd;
    }

    public void setVcnProtSwOpCmd(int vcnProtSwOpCmd) {
        int oldValue = getVcnProtSwOpCmd();
        this.vcnProtSwOpCmd = vcnProtSwOpCmd;
        notifyChange(6, oldValue, vcnProtSwOpCmd);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(14)) {
            case  1 :
                setVcnProtSwOpTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setVcnProtSwOpShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setVcnProtSwOpSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setVcnProtSwOpPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setVcnProtSwOpIdx(binding.getVariable().toInt());
                break;
            case  6 :
                setVcnProtSwOpCmd(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 15;
        int _len;
        _index = new OID(_oidInts, 15, (oid.size()- 15)).toString();
        setVcnProtSwOpTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcnProtSwOpShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcnProtSwOpSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcnProtSwOpPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcnProtSwOpIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(VcnProtSwOpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("vcnProtSwOpTypeIdx", vcnProtSwOpTypeIdx).append("vcnProtSwOpShelfIdx", vcnProtSwOpShelfIdx).append("vcnProtSwOpSlotIdx", vcnProtSwOpSlotIdx).append("vcnProtSwOpPortIdx", vcnProtSwOpPortIdx).append("vcnProtSwOpIdx", vcnProtSwOpIdx).append("vcnProtSwOpCmd", vcnProtSwOpCmd).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(vcnProtSwOpTypeIdx).append(vcnProtSwOpShelfIdx).append(vcnProtSwOpSlotIdx).append(vcnProtSwOpPortIdx).append(vcnProtSwOpIdx).append(vcnProtSwOpCmd).append(_index).toHashCode();
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
        VcnProtSwOpEntry rhs = ((VcnProtSwOpEntry) obj);
        return new EqualsBuilder().append(vcnProtSwOpTypeIdx, rhs.vcnProtSwOpTypeIdx).append(vcnProtSwOpShelfIdx, rhs.vcnProtSwOpShelfIdx).append(vcnProtSwOpSlotIdx, rhs.vcnProtSwOpSlotIdx).append(vcnProtSwOpPortIdx, rhs.vcnProtSwOpPortIdx).append(vcnProtSwOpIdx, rhs.vcnProtSwOpIdx).append(vcnProtSwOpCmd, rhs.vcnProtSwOpCmd).append(_index, rhs._index).isEquals();
    }

    public VcnProtSwOpEntry clone() {
        VcnProtSwOpEntry _copy = new VcnProtSwOpEntry();
        _copy.vcnProtSwOpTypeIdx = vcnProtSwOpTypeIdx;
        _copy.vcnProtSwOpShelfIdx = vcnProtSwOpShelfIdx;
        _copy.vcnProtSwOpSlotIdx = vcnProtSwOpSlotIdx;
        _copy.vcnProtSwOpPortIdx = vcnProtSwOpPortIdx;
        _copy.vcnProtSwOpIdx = vcnProtSwOpIdx;
        _copy.vcnProtSwOpCmd = vcnProtSwOpCmd;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.15.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "vcnProtSwOpTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "vcnProtSwOpShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "vcnProtSwOpSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "vcnProtSwOpPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "vcnProtSwOpIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "vcnProtSwOpCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
