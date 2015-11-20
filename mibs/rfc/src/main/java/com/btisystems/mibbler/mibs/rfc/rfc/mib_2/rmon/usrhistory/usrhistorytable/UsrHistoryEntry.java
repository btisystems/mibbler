
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.usrhistory.usrhistorytable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.usrhistory.usrhistorytable.IUsrHistoryEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.usrhistory.UsrHistoryTable;
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

public class UsrHistoryEntry
    extends DeviceEntity
    implements Serializable, IUsrHistoryEntry, IIndexed, IVariableBindingSetter
{

    private int usrHistorySampleIndex;
    private int usrHistoryIntervalStart;
    private int usrHistoryIntervalEnd;
    private int usrHistoryAbsValue;
    private int usrHistoryValStatus;
    private String _index;
    private UsrHistoryTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public UsrHistoryEntry() {
    }

    public int getUsrHistorySampleIndex() {
        return this.usrHistorySampleIndex;
    }

    public void setUsrHistorySampleIndex(int usrHistorySampleIndex) {
        int oldValue = getUsrHistorySampleIndex();
        this.usrHistorySampleIndex = usrHistorySampleIndex;
        notifyChange(1, oldValue, usrHistorySampleIndex);
    }

    public int getUsrHistoryIntervalStart() {
        return this.usrHistoryIntervalStart;
    }

    public void setUsrHistoryIntervalStart(int usrHistoryIntervalStart) {
        int oldValue = getUsrHistoryIntervalStart();
        this.usrHistoryIntervalStart = usrHistoryIntervalStart;
        notifyChange(2, oldValue, usrHistoryIntervalStart);
    }

    public int getUsrHistoryIntervalEnd() {
        return this.usrHistoryIntervalEnd;
    }

    public void setUsrHistoryIntervalEnd(int usrHistoryIntervalEnd) {
        int oldValue = getUsrHistoryIntervalEnd();
        this.usrHistoryIntervalEnd = usrHistoryIntervalEnd;
        notifyChange(3, oldValue, usrHistoryIntervalEnd);
    }

    public int getUsrHistoryAbsValue() {
        return this.usrHistoryAbsValue;
    }

    public void setUsrHistoryAbsValue(int usrHistoryAbsValue) {
        int oldValue = getUsrHistoryAbsValue();
        this.usrHistoryAbsValue = usrHistoryAbsValue;
        notifyChange(4, oldValue, usrHistoryAbsValue);
    }

    public int getUsrHistoryValStatus() {
        return this.usrHistoryValStatus;
    }

    public void setUsrHistoryValStatus(int usrHistoryValStatus) {
        int oldValue = getUsrHistoryValStatus();
        this.usrHistoryValStatus = usrHistoryValStatus;
        notifyChange(5, oldValue, usrHistoryValStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setUsrHistorySampleIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setUsrHistoryIntervalStart(binding.getVariable().toInt());
                break;
            case  3 :
                setUsrHistoryIntervalEnd(binding.getVariable().toInt());
                break;
            case  4 :
                setUsrHistoryAbsValue(binding.getVariable().toInt());
                break;
            case  5 :
                setUsrHistoryValStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        arrayOffset += 1;
        setUsrHistorySampleIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(UsrHistoryTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("usrHistorySampleIndex", usrHistorySampleIndex).append("usrHistoryIntervalStart", usrHistoryIntervalStart).append("usrHistoryIntervalEnd", usrHistoryIntervalEnd).append("usrHistoryAbsValue", usrHistoryAbsValue).append("usrHistoryValStatus", usrHistoryValStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(usrHistorySampleIndex).append(usrHistoryIntervalStart).append(usrHistoryIntervalEnd).append(usrHistoryAbsValue).append(usrHistoryValStatus).append(_index).toHashCode();
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
        UsrHistoryEntry rhs = ((UsrHistoryEntry) obj);
        return new EqualsBuilder().append(usrHistorySampleIndex, rhs.usrHistorySampleIndex).append(usrHistoryIntervalStart, rhs.usrHistoryIntervalStart).append(usrHistoryIntervalEnd, rhs.usrHistoryIntervalEnd).append(usrHistoryAbsValue, rhs.usrHistoryAbsValue).append(usrHistoryValStatus, rhs.usrHistoryValStatus).append(_index, rhs._index).isEquals();
    }

    public UsrHistoryEntry clone() {
        UsrHistoryEntry _copy = new UsrHistoryEntry();
        _copy.usrHistorySampleIndex = usrHistorySampleIndex;
        _copy.usrHistoryIntervalStart = usrHistoryIntervalStart;
        _copy.usrHistoryIntervalEnd = usrHistoryIntervalEnd;
        _copy.usrHistoryAbsValue = usrHistoryAbsValue;
        _copy.usrHistoryValStatus = usrHistoryValStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.18.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "usrHistorySampleIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "usrHistoryIntervalStart", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "usrHistoryIntervalEnd", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "usrHistoryAbsValue", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "usrHistoryValStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
