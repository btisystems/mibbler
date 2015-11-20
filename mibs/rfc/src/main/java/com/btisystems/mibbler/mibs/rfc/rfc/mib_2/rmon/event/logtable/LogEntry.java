
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.event.logtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.event.logtable.ILogEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.event.LogTable;
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

public class LogEntry
    extends DeviceEntity
    implements Serializable, ILogEntry, IIndexed, IVariableBindingSetter
{

    private int logEventIndex;
    private int logIndex;
    private int logTime;
    private String logDescription;
    private String _index;
    private LogTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public LogEntry() {
    }

    public int getLogEventIndex() {
        return this.logEventIndex;
    }

    public void setLogEventIndex(int logEventIndex) {
        int oldValue = getLogEventIndex();
        this.logEventIndex = logEventIndex;
        notifyChange(1, oldValue, logEventIndex);
    }

    public int getLogIndex() {
        return this.logIndex;
    }

    public void setLogIndex(int logIndex) {
        int oldValue = getLogIndex();
        this.logIndex = logIndex;
        notifyChange(2, oldValue, logIndex);
    }

    public int getLogTime() {
        return this.logTime;
    }

    public void setLogTime(int logTime) {
        int oldValue = getLogTime();
        this.logTime = logTime;
        notifyChange(3, oldValue, logTime);
    }

    public String getLogDescription() {
        return this.logDescription;
    }

    public void setLogDescription(String logDescription) {
        String oldValue = getLogDescription();
        this.logDescription = logDescription;
        notifyChange(4, oldValue, logDescription);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setLogEventIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setLogIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setLogTime(binding.getVariable().toInt());
                break;
            case  4 :
                setLogDescription(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setLogEventIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setLogIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(LogTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("logEventIndex", logEventIndex).append("logIndex", logIndex).append("logTime", logTime).append("logDescription", logDescription).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(logEventIndex).append(logIndex).append(logTime).append(logDescription).append(_index).toHashCode();
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
        LogEntry rhs = ((LogEntry) obj);
        return new EqualsBuilder().append(logEventIndex, rhs.logEventIndex).append(logIndex, rhs.logIndex).append(logTime, rhs.logTime).append(logDescription, rhs.logDescription).append(_index, rhs._index).isEquals();
    }

    public LogEntry clone() {
        LogEntry _copy = new LogEntry();
        _copy.logEventIndex = logEventIndex;
        _copy.logIndex = logIndex;
        _copy.logTime = logTime;
        _copy.logDescription = logDescription;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.9.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "logEventIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "logIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "logTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "logDescription", DeviceEntityDescription.FieldType.STRING, 255));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
