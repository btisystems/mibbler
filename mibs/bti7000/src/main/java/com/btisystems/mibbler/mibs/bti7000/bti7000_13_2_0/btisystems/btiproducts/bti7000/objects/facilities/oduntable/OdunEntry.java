
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.oduntable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.OdunTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.oduntable.IOdunEntry;
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

public class OdunEntry
    extends DeviceEntity
    implements Serializable, IOdunEntry, IIndexed, IVariableBindingSetter
{

    private int odunTypeIdx;
    private int odunShelfIdx;
    private int odunSlotIdx;
    private int odunPortIdx;
    private int odunIdx;
    private String _index;
    private OdunTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OdunEntry() {
    }

    public int getOdunTypeIdx() {
        return this.odunTypeIdx;
    }

    public void setOdunTypeIdx(int odunTypeIdx) {
        int oldValue = getOdunTypeIdx();
        this.odunTypeIdx = odunTypeIdx;
        notifyChange(1, oldValue, odunTypeIdx);
    }

    public int getOdunShelfIdx() {
        return this.odunShelfIdx;
    }

    public void setOdunShelfIdx(int odunShelfIdx) {
        int oldValue = getOdunShelfIdx();
        this.odunShelfIdx = odunShelfIdx;
        notifyChange(2, oldValue, odunShelfIdx);
    }

    public int getOdunSlotIdx() {
        return this.odunSlotIdx;
    }

    public void setOdunSlotIdx(int odunSlotIdx) {
        int oldValue = getOdunSlotIdx();
        this.odunSlotIdx = odunSlotIdx;
        notifyChange(3, oldValue, odunSlotIdx);
    }

    public int getOdunPortIdx() {
        return this.odunPortIdx;
    }

    public void setOdunPortIdx(int odunPortIdx) {
        int oldValue = getOdunPortIdx();
        this.odunPortIdx = odunPortIdx;
        notifyChange(4, oldValue, odunPortIdx);
    }

    public int getOdunIdx() {
        return this.odunIdx;
    }

    public void setOdunIdx(int odunIdx) {
        int oldValue = getOdunIdx();
        this.odunIdx = odunIdx;
        notifyChange(5, oldValue, odunIdx);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setOdunTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setOdunShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setOdunSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setOdunPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setOdunIdx(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setOdunTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOdunShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOdunSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOdunPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(OdunTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("odunTypeIdx", odunTypeIdx).append("odunShelfIdx", odunShelfIdx).append("odunSlotIdx", odunSlotIdx).append("odunPortIdx", odunPortIdx).append("odunIdx", odunIdx).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(odunTypeIdx).append(odunShelfIdx).append(odunSlotIdx).append(odunPortIdx).append(odunIdx).append(_index).toHashCode();
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
        OdunEntry rhs = ((OdunEntry) obj);
        return new EqualsBuilder().append(odunTypeIdx, rhs.odunTypeIdx).append(odunShelfIdx, rhs.odunShelfIdx).append(odunSlotIdx, rhs.odunSlotIdx).append(odunPortIdx, rhs.odunPortIdx).append(odunIdx, rhs.odunIdx).append(_index, rhs._index).isEquals();
    }

    public OdunEntry clone() {
        OdunEntry _copy = new OdunEntry();
        _copy.odunTypeIdx = odunTypeIdx;
        _copy.odunShelfIdx = odunShelfIdx;
        _copy.odunSlotIdx = odunSlotIdx;
        _copy.odunPortIdx = odunPortIdx;
        _copy.odunIdx = odunIdx;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.15.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "odunTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "odunShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "odunSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "odunPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "odunIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
