
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.ocnoperations.ocnprotswoptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.ocnoperations.OcnProtSwOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.ocnoperations.ocnprotswoptable.IOcnProtSwOpEntry;
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

public class OcnProtSwOpEntry
    extends DeviceEntity
    implements Serializable, IOcnProtSwOpEntry, IIndexed, IVariableBindingSetter
{

    private int ocnProtSwOpTypeIdx;
    private int ocnProtSwOpShelfIdx;
    private int ocnProtSwOpSlotIdx;
    private int ocnProtSwOpIdx;
    private int ocnProtSwOpCmd;
    private String _index;
    private OcnProtSwOpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OcnProtSwOpEntry() {
    }

    public int getOcnProtSwOpTypeIdx() {
        return this.ocnProtSwOpTypeIdx;
    }

    public void setOcnProtSwOpTypeIdx(int ocnProtSwOpTypeIdx) {
        int oldValue = getOcnProtSwOpTypeIdx();
        this.ocnProtSwOpTypeIdx = ocnProtSwOpTypeIdx;
        notifyChange(1, oldValue, ocnProtSwOpTypeIdx);
    }

    public int getOcnProtSwOpShelfIdx() {
        return this.ocnProtSwOpShelfIdx;
    }

    public void setOcnProtSwOpShelfIdx(int ocnProtSwOpShelfIdx) {
        int oldValue = getOcnProtSwOpShelfIdx();
        this.ocnProtSwOpShelfIdx = ocnProtSwOpShelfIdx;
        notifyChange(2, oldValue, ocnProtSwOpShelfIdx);
    }

    public int getOcnProtSwOpSlotIdx() {
        return this.ocnProtSwOpSlotIdx;
    }

    public void setOcnProtSwOpSlotIdx(int ocnProtSwOpSlotIdx) {
        int oldValue = getOcnProtSwOpSlotIdx();
        this.ocnProtSwOpSlotIdx = ocnProtSwOpSlotIdx;
        notifyChange(3, oldValue, ocnProtSwOpSlotIdx);
    }

    public int getOcnProtSwOpIdx() {
        return this.ocnProtSwOpIdx;
    }

    public void setOcnProtSwOpIdx(int ocnProtSwOpIdx) {
        int oldValue = getOcnProtSwOpIdx();
        this.ocnProtSwOpIdx = ocnProtSwOpIdx;
        notifyChange(4, oldValue, ocnProtSwOpIdx);
    }

    public int getOcnProtSwOpCmd() {
        return this.ocnProtSwOpCmd;
    }

    public void setOcnProtSwOpCmd(int ocnProtSwOpCmd) {
        int oldValue = getOcnProtSwOpCmd();
        this.ocnProtSwOpCmd = ocnProtSwOpCmd;
        notifyChange(5, oldValue, ocnProtSwOpCmd);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(14)) {
            case  1 :
                setOcnProtSwOpTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setOcnProtSwOpShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setOcnProtSwOpSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setOcnProtSwOpIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setOcnProtSwOpCmd(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 15;
        int _len;
        _index = new OID(_oidInts, 15, (oid.size()- 15)).toString();
        setOcnProtSwOpTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOcnProtSwOpShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOcnProtSwOpSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOcnProtSwOpIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(OcnProtSwOpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ocnProtSwOpTypeIdx", ocnProtSwOpTypeIdx).append("ocnProtSwOpShelfIdx", ocnProtSwOpShelfIdx).append("ocnProtSwOpSlotIdx", ocnProtSwOpSlotIdx).append("ocnProtSwOpIdx", ocnProtSwOpIdx).append("ocnProtSwOpCmd", ocnProtSwOpCmd).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ocnProtSwOpTypeIdx).append(ocnProtSwOpShelfIdx).append(ocnProtSwOpSlotIdx).append(ocnProtSwOpIdx).append(ocnProtSwOpCmd).append(_index).toHashCode();
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
        OcnProtSwOpEntry rhs = ((OcnProtSwOpEntry) obj);
        return new EqualsBuilder().append(ocnProtSwOpTypeIdx, rhs.ocnProtSwOpTypeIdx).append(ocnProtSwOpShelfIdx, rhs.ocnProtSwOpShelfIdx).append(ocnProtSwOpSlotIdx, rhs.ocnProtSwOpSlotIdx).append(ocnProtSwOpIdx, rhs.ocnProtSwOpIdx).append(ocnProtSwOpCmd, rhs.ocnProtSwOpCmd).append(_index, rhs._index).isEquals();
    }

    public OcnProtSwOpEntry clone() {
        OcnProtSwOpEntry _copy = new OcnProtSwOpEntry();
        _copy.ocnProtSwOpTypeIdx = ocnProtSwOpTypeIdx;
        _copy.ocnProtSwOpShelfIdx = ocnProtSwOpShelfIdx;
        _copy.ocnProtSwOpSlotIdx = ocnProtSwOpSlotIdx;
        _copy.ocnProtSwOpIdx = ocnProtSwOpIdx;
        _copy.ocnProtSwOpCmd = ocnProtSwOpCmd;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.12.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ocnProtSwOpTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ocnProtSwOpShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ocnProtSwOpSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ocnProtSwOpIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ocnProtSwOpCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
