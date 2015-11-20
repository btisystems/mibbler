
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.event;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.event.logtable.LogEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.event.ILogTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.event.logtable.ILogEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class LogTable
    extends DeviceEntity
    implements Serializable, ILogTable, ITableAccess<ILogEntry>
{

    private Map<String, ILogEntry> logEntry = new TreeMap<String, ILogEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public LogTable() {
    }

    public Map<String, ILogEntry> getLogEntry() {
        return this.logEntry;
    }

    public ILogEntry getEntry(String key) {
        return logEntry.get(key);
    }

    public void setEntry(String key, ILogEntry value) {
        logEntry.put(key, value);
        ((LogEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ILogEntry> getEntries() {
        return logEntry;
    }

    public LogEntry createEntry(String entryIndex) {
        LogEntry newEntry = new LogEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.9.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("logEntry", logEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(logEntry).toHashCode();
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
        LogTable rhs = ((LogTable) obj);
        return new EqualsBuilder().append(logEntry, rhs.logEntry).isEquals();
    }

    public LogTable clone() {
        LogTable _copy = new LogTable();
        for (Map.Entry<String, ILogEntry> _entry: logEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.9.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "logEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
