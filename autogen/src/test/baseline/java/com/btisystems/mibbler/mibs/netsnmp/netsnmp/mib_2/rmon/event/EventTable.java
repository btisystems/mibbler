
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.event;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.event.IEventTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.event.eventtable.IEventEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.event.eventtable.EventEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class EventTable
    extends DeviceEntity
    implements Serializable, IEventTable, ITableAccess<IEventEntry>
{

    private Map<String, IEventEntry> eventEntry = new TreeMap<String, IEventEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public EventTable() {
    }

    public Map<String, IEventEntry> getEventEntry() {
        return this.eventEntry;
    }

    public IEventEntry getEntry(String key) {
        return eventEntry.get(key);
    }

    public void setEntry(String key, IEventEntry value) {
        eventEntry.put(key, value);
        ((EventEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IEventEntry> getEntries() {
        return eventEntry;
    }

    public EventEntry createEntry(String entryIndex) {
        EventEntry newEntry = new EventEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.9.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("eventEntry", eventEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(eventEntry).toHashCode();
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
        EventTable rhs = ((EventTable) obj);
        return new EqualsBuilder().append(eventEntry, rhs.eventEntry).isEquals();
    }

    public EventTable clone() {
        EventTable _copy = new EventTable();
        for (Map.Entry<String, IEventEntry> _entry: eventEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.9.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "eventEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
