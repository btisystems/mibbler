
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.geoperations.gelpbkoptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.geoperations.GeLpbkOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.geoperations.gelpbkoptable.IGeLpbkOpEntry;
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

public class GeLpbkOpEntry
    extends DeviceEntity
    implements Serializable, IGeLpbkOpEntry, IIndexed, IVariableBindingSetter
{

    private int geLpbkOpShelfIdx;
    private int geLpbkOpSlotIdx;
    private int geLpbkOpPortIdx;
    private int geLpbkOpCmd;
    private String _index;
    private GeLpbkOpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public GeLpbkOpEntry() {
    }

    public int getGeLpbkOpShelfIdx() {
        return this.geLpbkOpShelfIdx;
    }

    public void setGeLpbkOpShelfIdx(int geLpbkOpShelfIdx) {
        int oldValue = getGeLpbkOpShelfIdx();
        this.geLpbkOpShelfIdx = geLpbkOpShelfIdx;
        notifyChange(1, oldValue, geLpbkOpShelfIdx);
    }

    public int getGeLpbkOpSlotIdx() {
        return this.geLpbkOpSlotIdx;
    }

    public void setGeLpbkOpSlotIdx(int geLpbkOpSlotIdx) {
        int oldValue = getGeLpbkOpSlotIdx();
        this.geLpbkOpSlotIdx = geLpbkOpSlotIdx;
        notifyChange(2, oldValue, geLpbkOpSlotIdx);
    }

    public int getGeLpbkOpPortIdx() {
        return this.geLpbkOpPortIdx;
    }

    public void setGeLpbkOpPortIdx(int geLpbkOpPortIdx) {
        int oldValue = getGeLpbkOpPortIdx();
        this.geLpbkOpPortIdx = geLpbkOpPortIdx;
        notifyChange(3, oldValue, geLpbkOpPortIdx);
    }

    public int getGeLpbkOpCmd() {
        return this.geLpbkOpCmd;
    }

    public void setGeLpbkOpCmd(int geLpbkOpCmd) {
        int oldValue = getGeLpbkOpCmd();
        this.geLpbkOpCmd = geLpbkOpCmd;
        notifyChange(4, oldValue, geLpbkOpCmd);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(14)) {
            case  1 :
                setGeLpbkOpShelfIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setGeLpbkOpSlotIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setGeLpbkOpPortIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setGeLpbkOpCmd(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 15;
        int _len;
        _index = new OID(_oidInts, 15, (oid.size()- 15)).toString();
        setGeLpbkOpShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setGeLpbkOpSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setGeLpbkOpPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(GeLpbkOpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("geLpbkOpShelfIdx", geLpbkOpShelfIdx).append("geLpbkOpSlotIdx", geLpbkOpSlotIdx).append("geLpbkOpPortIdx", geLpbkOpPortIdx).append("geLpbkOpCmd", geLpbkOpCmd).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(geLpbkOpShelfIdx).append(geLpbkOpSlotIdx).append(geLpbkOpPortIdx).append(geLpbkOpCmd).append(_index).toHashCode();
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
        GeLpbkOpEntry rhs = ((GeLpbkOpEntry) obj);
        return new EqualsBuilder().append(geLpbkOpShelfIdx, rhs.geLpbkOpShelfIdx).append(geLpbkOpSlotIdx, rhs.geLpbkOpSlotIdx).append(geLpbkOpPortIdx, rhs.geLpbkOpPortIdx).append(geLpbkOpCmd, rhs.geLpbkOpCmd).append(_index, rhs._index).isEquals();
    }

    public GeLpbkOpEntry clone() {
        GeLpbkOpEntry _copy = new GeLpbkOpEntry();
        _copy.geLpbkOpShelfIdx = geLpbkOpShelfIdx;
        _copy.geLpbkOpSlotIdx = geLpbkOpSlotIdx;
        _copy.geLpbkOpPortIdx = geLpbkOpPortIdx;
        _copy.geLpbkOpCmd = geLpbkOpCmd;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.16.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "geLpbkOpShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "geLpbkOpSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "geLpbkOpPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "geLpbkOpCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
