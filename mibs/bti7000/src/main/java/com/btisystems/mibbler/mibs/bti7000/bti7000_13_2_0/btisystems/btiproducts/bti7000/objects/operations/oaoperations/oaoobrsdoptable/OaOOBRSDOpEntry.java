
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.oaoperations.oaoobrsdoptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.oaoperations.OaOOBRSDOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.oaoperations.oaoobrsdoptable.IOaOOBRSDOpEntry;
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

public class OaOOBRSDOpEntry
    extends DeviceEntity
    implements Serializable, IOaOOBRSDOpEntry, IIndexed, IVariableBindingSetter
{

    private int oaOOBRSDOpTypeIdx;
    private int oaOOBRSDOpShelfIdx;
    private int oaOOBRSDOpSlotIdx;
    private int oaOOBRSDOpIdx;
    private int oaOOBRSDOpCmd;
    private int oaOOBRSDOpTimer;
    private String _index;
    private OaOOBRSDOpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OaOOBRSDOpEntry() {
    }

    public int getOaOOBRSDOpTypeIdx() {
        return this.oaOOBRSDOpTypeIdx;
    }

    public void setOaOOBRSDOpTypeIdx(int oaOOBRSDOpTypeIdx) {
        int oldValue = getOaOOBRSDOpTypeIdx();
        this.oaOOBRSDOpTypeIdx = oaOOBRSDOpTypeIdx;
        notifyChange(1, oldValue, oaOOBRSDOpTypeIdx);
    }

    public int getOaOOBRSDOpShelfIdx() {
        return this.oaOOBRSDOpShelfIdx;
    }

    public void setOaOOBRSDOpShelfIdx(int oaOOBRSDOpShelfIdx) {
        int oldValue = getOaOOBRSDOpShelfIdx();
        this.oaOOBRSDOpShelfIdx = oaOOBRSDOpShelfIdx;
        notifyChange(2, oldValue, oaOOBRSDOpShelfIdx);
    }

    public int getOaOOBRSDOpSlotIdx() {
        return this.oaOOBRSDOpSlotIdx;
    }

    public void setOaOOBRSDOpSlotIdx(int oaOOBRSDOpSlotIdx) {
        int oldValue = getOaOOBRSDOpSlotIdx();
        this.oaOOBRSDOpSlotIdx = oaOOBRSDOpSlotIdx;
        notifyChange(3, oldValue, oaOOBRSDOpSlotIdx);
    }

    public int getOaOOBRSDOpIdx() {
        return this.oaOOBRSDOpIdx;
    }

    public void setOaOOBRSDOpIdx(int oaOOBRSDOpIdx) {
        int oldValue = getOaOOBRSDOpIdx();
        this.oaOOBRSDOpIdx = oaOOBRSDOpIdx;
        notifyChange(4, oldValue, oaOOBRSDOpIdx);
    }

    public int getOaOOBRSDOpCmd() {
        return this.oaOOBRSDOpCmd;
    }

    public void setOaOOBRSDOpCmd(int oaOOBRSDOpCmd) {
        int oldValue = getOaOOBRSDOpCmd();
        this.oaOOBRSDOpCmd = oaOOBRSDOpCmd;
        notifyChange(5, oldValue, oaOOBRSDOpCmd);
    }

    public int getOaOOBRSDOpTimer() {
        return this.oaOOBRSDOpTimer;
    }

    public void setOaOOBRSDOpTimer(int oaOOBRSDOpTimer) {
        int oldValue = getOaOOBRSDOpTimer();
        this.oaOOBRSDOpTimer = oaOOBRSDOpTimer;
        notifyChange(6, oldValue, oaOOBRSDOpTimer);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(14)) {
            case  1 :
                setOaOOBRSDOpTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setOaOOBRSDOpShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setOaOOBRSDOpSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setOaOOBRSDOpIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setOaOOBRSDOpCmd(binding.getVariable().toInt());
                break;
            case  6 :
                setOaOOBRSDOpTimer(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 15;
        int _len;
        _index = new OID(_oidInts, 15, (oid.size()- 15)).toString();
        setOaOOBRSDOpTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOaOOBRSDOpShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOaOOBRSDOpSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOaOOBRSDOpIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(OaOOBRSDOpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("oaOOBRSDOpTypeIdx", oaOOBRSDOpTypeIdx).append("oaOOBRSDOpShelfIdx", oaOOBRSDOpShelfIdx).append("oaOOBRSDOpSlotIdx", oaOOBRSDOpSlotIdx).append("oaOOBRSDOpIdx", oaOOBRSDOpIdx).append("oaOOBRSDOpCmd", oaOOBRSDOpCmd).append("oaOOBRSDOpTimer", oaOOBRSDOpTimer).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(oaOOBRSDOpTypeIdx).append(oaOOBRSDOpShelfIdx).append(oaOOBRSDOpSlotIdx).append(oaOOBRSDOpIdx).append(oaOOBRSDOpCmd).append(oaOOBRSDOpTimer).append(_index).toHashCode();
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
        OaOOBRSDOpEntry rhs = ((OaOOBRSDOpEntry) obj);
        return new EqualsBuilder().append(oaOOBRSDOpTypeIdx, rhs.oaOOBRSDOpTypeIdx).append(oaOOBRSDOpShelfIdx, rhs.oaOOBRSDOpShelfIdx).append(oaOOBRSDOpSlotIdx, rhs.oaOOBRSDOpSlotIdx).append(oaOOBRSDOpIdx, rhs.oaOOBRSDOpIdx).append(oaOOBRSDOpCmd, rhs.oaOOBRSDOpCmd).append(oaOOBRSDOpTimer, rhs.oaOOBRSDOpTimer).append(_index, rhs._index).isEquals();
    }

    public OaOOBRSDOpEntry clone() {
        OaOOBRSDOpEntry _copy = new OaOOBRSDOpEntry();
        _copy.oaOOBRSDOpTypeIdx = oaOOBRSDOpTypeIdx;
        _copy.oaOOBRSDOpShelfIdx = oaOOBRSDOpShelfIdx;
        _copy.oaOOBRSDOpSlotIdx = oaOOBRSDOpSlotIdx;
        _copy.oaOOBRSDOpIdx = oaOOBRSDOpIdx;
        _copy.oaOOBRSDOpCmd = oaOOBRSDOpCmd;
        _copy.oaOOBRSDOpTimer = oaOOBRSDOpTimer;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.6.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "oaOOBRSDOpTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "oaOOBRSDOpShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "oaOOBRSDOpSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "oaOOBRSDOpIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "oaOOBRSDOpCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "oaOOBRSDOpTimer", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
