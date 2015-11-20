
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.alarm;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.alarm.IAlarmTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.alarm.alarmtable.IAlarmEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.alarm.alarmtable.AlarmEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class AlarmTable
    extends DeviceEntity
    implements Serializable, IAlarmTable, ITableAccess<IAlarmEntry>
{

    private Map<String, IAlarmEntry> alarmEntry = new TreeMap<String, IAlarmEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AlarmTable() {
    }

    public Map<String, IAlarmEntry> getAlarmEntry() {
        return this.alarmEntry;
    }

    public IAlarmEntry getEntry(String key) {
        return alarmEntry.get(key);
    }

    public void setEntry(String key, IAlarmEntry value) {
        alarmEntry.put(key, value);
        ((AlarmEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IAlarmEntry> getEntries() {
        return alarmEntry;
    }

    public AlarmEntry createEntry(String entryIndex) {
        AlarmEntry newEntry = new AlarmEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.3.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("alarmEntry", alarmEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(alarmEntry).toHashCode();
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
        AlarmTable rhs = ((AlarmTable) obj);
        return new EqualsBuilder().append(alarmEntry, rhs.alarmEntry).isEquals();
    }

    public AlarmTable clone() {
        AlarmTable _copy = new AlarmTable();
        for (Map.Entry<String, IAlarmEntry> _entry: alarmEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "alarmEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
