
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.fcoperations.fclpbkoptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.fcoperations.FcLpbkOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.fcoperations.fclpbkoptable.IFcLpbkOpEntry;
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

public class FcLpbkOpEntry
    extends DeviceEntity
    implements Serializable, IFcLpbkOpEntry, IIndexed, IVariableBindingSetter
{

    private int fcLpbkOpShelfIdx;
    private int fcLpbkOpSlotIdx;
    private int fcLpbkOpPortIdx;
    private int fcLpbkOpCmd;
    private String _index;
    private FcLpbkOpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public FcLpbkOpEntry() {
    }

    public int getFcLpbkOpShelfIdx() {
        return this.fcLpbkOpShelfIdx;
    }

    public void setFcLpbkOpShelfIdx(int fcLpbkOpShelfIdx) {
        int oldValue = getFcLpbkOpShelfIdx();
        this.fcLpbkOpShelfIdx = fcLpbkOpShelfIdx;
        notifyChange(1, oldValue, fcLpbkOpShelfIdx);
    }

    public int getFcLpbkOpSlotIdx() {
        return this.fcLpbkOpSlotIdx;
    }

    public void setFcLpbkOpSlotIdx(int fcLpbkOpSlotIdx) {
        int oldValue = getFcLpbkOpSlotIdx();
        this.fcLpbkOpSlotIdx = fcLpbkOpSlotIdx;
        notifyChange(2, oldValue, fcLpbkOpSlotIdx);
    }

    public int getFcLpbkOpPortIdx() {
        return this.fcLpbkOpPortIdx;
    }

    public void setFcLpbkOpPortIdx(int fcLpbkOpPortIdx) {
        int oldValue = getFcLpbkOpPortIdx();
        this.fcLpbkOpPortIdx = fcLpbkOpPortIdx;
        notifyChange(3, oldValue, fcLpbkOpPortIdx);
    }

    public int getFcLpbkOpCmd() {
        return this.fcLpbkOpCmd;
    }

    public void setFcLpbkOpCmd(int fcLpbkOpCmd) {
        int oldValue = getFcLpbkOpCmd();
        this.fcLpbkOpCmd = fcLpbkOpCmd;
        notifyChange(4, oldValue, fcLpbkOpCmd);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(14)) {
            case  1 :
                setFcLpbkOpShelfIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setFcLpbkOpSlotIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setFcLpbkOpPortIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setFcLpbkOpCmd(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 15;
        int _len;
        _index = new OID(_oidInts, 15, (oid.size()- 15)).toString();
        setFcLpbkOpShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setFcLpbkOpSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setFcLpbkOpPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(FcLpbkOpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("fcLpbkOpShelfIdx", fcLpbkOpShelfIdx).append("fcLpbkOpSlotIdx", fcLpbkOpSlotIdx).append("fcLpbkOpPortIdx", fcLpbkOpPortIdx).append("fcLpbkOpCmd", fcLpbkOpCmd).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(fcLpbkOpShelfIdx).append(fcLpbkOpSlotIdx).append(fcLpbkOpPortIdx).append(fcLpbkOpCmd).append(_index).toHashCode();
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
        FcLpbkOpEntry rhs = ((FcLpbkOpEntry) obj);
        return new EqualsBuilder().append(fcLpbkOpShelfIdx, rhs.fcLpbkOpShelfIdx).append(fcLpbkOpSlotIdx, rhs.fcLpbkOpSlotIdx).append(fcLpbkOpPortIdx, rhs.fcLpbkOpPortIdx).append(fcLpbkOpCmd, rhs.fcLpbkOpCmd).append(_index, rhs._index).isEquals();
    }

    public FcLpbkOpEntry clone() {
        FcLpbkOpEntry _copy = new FcLpbkOpEntry();
        _copy.fcLpbkOpShelfIdx = fcLpbkOpShelfIdx;
        _copy.fcLpbkOpSlotIdx = fcLpbkOpSlotIdx;
        _copy.fcLpbkOpPortIdx = fcLpbkOpPortIdx;
        _copy.fcLpbkOpCmd = fcLpbkOpCmd;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.17.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "fcLpbkOpShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "fcLpbkOpSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "fcLpbkOpPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "fcLpbkOpCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
