
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.ocnoperations.ocnlpbkoptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.ocnoperations.OcnLpbkOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.ocnoperations.ocnlpbkoptable.IOcnLpbkOpEntry;
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

public class OcnLpbkOpEntry
    extends DeviceEntity
    implements Serializable, IOcnLpbkOpEntry, IIndexed, IVariableBindingSetter
{

    private int ocnLpbkOpTypeIdx;
    private int ocnLpbkOpShelfIdx;
    private int ocnLpbkOpSlotIdx;
    private int ocnLpbkOpPortIdx;
    private int ocnLpbkOpCmd;
    private String _index;
    private OcnLpbkOpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OcnLpbkOpEntry() {
    }

    public int getOcnLpbkOpTypeIdx() {
        return this.ocnLpbkOpTypeIdx;
    }

    public void setOcnLpbkOpTypeIdx(int ocnLpbkOpTypeIdx) {
        int oldValue = getOcnLpbkOpTypeIdx();
        this.ocnLpbkOpTypeIdx = ocnLpbkOpTypeIdx;
        notifyChange(1, oldValue, ocnLpbkOpTypeIdx);
    }

    public int getOcnLpbkOpShelfIdx() {
        return this.ocnLpbkOpShelfIdx;
    }

    public void setOcnLpbkOpShelfIdx(int ocnLpbkOpShelfIdx) {
        int oldValue = getOcnLpbkOpShelfIdx();
        this.ocnLpbkOpShelfIdx = ocnLpbkOpShelfIdx;
        notifyChange(2, oldValue, ocnLpbkOpShelfIdx);
    }

    public int getOcnLpbkOpSlotIdx() {
        return this.ocnLpbkOpSlotIdx;
    }

    public void setOcnLpbkOpSlotIdx(int ocnLpbkOpSlotIdx) {
        int oldValue = getOcnLpbkOpSlotIdx();
        this.ocnLpbkOpSlotIdx = ocnLpbkOpSlotIdx;
        notifyChange(3, oldValue, ocnLpbkOpSlotIdx);
    }

    public int getOcnLpbkOpPortIdx() {
        return this.ocnLpbkOpPortIdx;
    }

    public void setOcnLpbkOpPortIdx(int ocnLpbkOpPortIdx) {
        int oldValue = getOcnLpbkOpPortIdx();
        this.ocnLpbkOpPortIdx = ocnLpbkOpPortIdx;
        notifyChange(4, oldValue, ocnLpbkOpPortIdx);
    }

    public int getOcnLpbkOpCmd() {
        return this.ocnLpbkOpCmd;
    }

    public void setOcnLpbkOpCmd(int ocnLpbkOpCmd) {
        int oldValue = getOcnLpbkOpCmd();
        this.ocnLpbkOpCmd = ocnLpbkOpCmd;
        notifyChange(5, oldValue, ocnLpbkOpCmd);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(14)) {
            case  1 :
                setOcnLpbkOpTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setOcnLpbkOpShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setOcnLpbkOpSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setOcnLpbkOpPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setOcnLpbkOpCmd(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 15;
        int _len;
        _index = new OID(_oidInts, 15, (oid.size()- 15)).toString();
        setOcnLpbkOpTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOcnLpbkOpShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOcnLpbkOpSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOcnLpbkOpPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(OcnLpbkOpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ocnLpbkOpTypeIdx", ocnLpbkOpTypeIdx).append("ocnLpbkOpShelfIdx", ocnLpbkOpShelfIdx).append("ocnLpbkOpSlotIdx", ocnLpbkOpSlotIdx).append("ocnLpbkOpPortIdx", ocnLpbkOpPortIdx).append("ocnLpbkOpCmd", ocnLpbkOpCmd).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ocnLpbkOpTypeIdx).append(ocnLpbkOpShelfIdx).append(ocnLpbkOpSlotIdx).append(ocnLpbkOpPortIdx).append(ocnLpbkOpCmd).append(_index).toHashCode();
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
        OcnLpbkOpEntry rhs = ((OcnLpbkOpEntry) obj);
        return new EqualsBuilder().append(ocnLpbkOpTypeIdx, rhs.ocnLpbkOpTypeIdx).append(ocnLpbkOpShelfIdx, rhs.ocnLpbkOpShelfIdx).append(ocnLpbkOpSlotIdx, rhs.ocnLpbkOpSlotIdx).append(ocnLpbkOpPortIdx, rhs.ocnLpbkOpPortIdx).append(ocnLpbkOpCmd, rhs.ocnLpbkOpCmd).append(_index, rhs._index).isEquals();
    }

    public OcnLpbkOpEntry clone() {
        OcnLpbkOpEntry _copy = new OcnLpbkOpEntry();
        _copy.ocnLpbkOpTypeIdx = ocnLpbkOpTypeIdx;
        _copy.ocnLpbkOpShelfIdx = ocnLpbkOpShelfIdx;
        _copy.ocnLpbkOpSlotIdx = ocnLpbkOpSlotIdx;
        _copy.ocnLpbkOpPortIdx = ocnLpbkOpPortIdx;
        _copy.ocnLpbkOpCmd = ocnLpbkOpCmd;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.12.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ocnLpbkOpTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ocnLpbkOpShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ocnLpbkOpSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ocnLpbkOpPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ocnLpbkOpCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
