
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.brioperations.brilpbkoptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.brioperations.BriLpbkOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.brioperations.brilpbkoptable.IBriLpbkOpEntry;
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

public class BriLpbkOpEntry
    extends DeviceEntity
    implements Serializable, IBriLpbkOpEntry, IIndexed, IVariableBindingSetter
{

    private int briLpbkOpShelfIdx;
    private int briLpbkOpSlotIdx;
    private int briLpbkOpPortIdx;
    private int briLpbkOpCmd;
    private String _index;
    private BriLpbkOpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public BriLpbkOpEntry() {
    }

    public int getBriLpbkOpShelfIdx() {
        return this.briLpbkOpShelfIdx;
    }

    public void setBriLpbkOpShelfIdx(int briLpbkOpShelfIdx) {
        int oldValue = getBriLpbkOpShelfIdx();
        this.briLpbkOpShelfIdx = briLpbkOpShelfIdx;
        notifyChange(1, oldValue, briLpbkOpShelfIdx);
    }

    public int getBriLpbkOpSlotIdx() {
        return this.briLpbkOpSlotIdx;
    }

    public void setBriLpbkOpSlotIdx(int briLpbkOpSlotIdx) {
        int oldValue = getBriLpbkOpSlotIdx();
        this.briLpbkOpSlotIdx = briLpbkOpSlotIdx;
        notifyChange(2, oldValue, briLpbkOpSlotIdx);
    }

    public int getBriLpbkOpPortIdx() {
        return this.briLpbkOpPortIdx;
    }

    public void setBriLpbkOpPortIdx(int briLpbkOpPortIdx) {
        int oldValue = getBriLpbkOpPortIdx();
        this.briLpbkOpPortIdx = briLpbkOpPortIdx;
        notifyChange(3, oldValue, briLpbkOpPortIdx);
    }

    public int getBriLpbkOpCmd() {
        return this.briLpbkOpCmd;
    }

    public void setBriLpbkOpCmd(int briLpbkOpCmd) {
        int oldValue = getBriLpbkOpCmd();
        this.briLpbkOpCmd = briLpbkOpCmd;
        notifyChange(4, oldValue, briLpbkOpCmd);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(14)) {
            case  1 :
                setBriLpbkOpShelfIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setBriLpbkOpSlotIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setBriLpbkOpPortIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setBriLpbkOpCmd(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 15;
        int _len;
        _index = new OID(_oidInts, 15, (oid.size()- 15)).toString();
        setBriLpbkOpShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setBriLpbkOpSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setBriLpbkOpPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(BriLpbkOpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("briLpbkOpShelfIdx", briLpbkOpShelfIdx).append("briLpbkOpSlotIdx", briLpbkOpSlotIdx).append("briLpbkOpPortIdx", briLpbkOpPortIdx).append("briLpbkOpCmd", briLpbkOpCmd).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(briLpbkOpShelfIdx).append(briLpbkOpSlotIdx).append(briLpbkOpPortIdx).append(briLpbkOpCmd).append(_index).toHashCode();
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
        BriLpbkOpEntry rhs = ((BriLpbkOpEntry) obj);
        return new EqualsBuilder().append(briLpbkOpShelfIdx, rhs.briLpbkOpShelfIdx).append(briLpbkOpSlotIdx, rhs.briLpbkOpSlotIdx).append(briLpbkOpPortIdx, rhs.briLpbkOpPortIdx).append(briLpbkOpCmd, rhs.briLpbkOpCmd).append(_index, rhs._index).isEquals();
    }

    public BriLpbkOpEntry clone() {
        BriLpbkOpEntry _copy = new BriLpbkOpEntry();
        _copy.briLpbkOpShelfIdx = briLpbkOpShelfIdx;
        _copy.briLpbkOpSlotIdx = briLpbkOpSlotIdx;
        _copy.briLpbkOpPortIdx = briLpbkOpPortIdx;
        _copy.briLpbkOpCmd = briLpbkOpCmd;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.18.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "briLpbkOpShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "briLpbkOpSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "briLpbkOpPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "briLpbkOpCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
