
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.hosts;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.hosts.IHostTimeTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.hosts.hosttimetable.IHostTimeEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.hosts.hosttimetable.HostTimeEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HostTimeTable
    extends DeviceEntity
    implements Serializable, IHostTimeTable, ITableAccess<IHostTimeEntry>
{

    private Map<String, IHostTimeEntry> hostTimeEntry = new TreeMap<String, IHostTimeEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HostTimeTable() {
    }

    public Map<String, IHostTimeEntry> getHostTimeEntry() {
        return this.hostTimeEntry;
    }

    public IHostTimeEntry getEntry(String key) {
        return hostTimeEntry.get(key);
    }

    public void setEntry(String key, IHostTimeEntry value) {
        hostTimeEntry.put(key, value);
        ((HostTimeEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHostTimeEntry> getEntries() {
        return hostTimeEntry;
    }

    public HostTimeEntry createEntry(String entryIndex) {
        HostTimeEntry newEntry = new HostTimeEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.4.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hostTimeEntry", hostTimeEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hostTimeEntry).toHashCode();
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
        HostTimeTable rhs = ((HostTimeTable) obj);
        return new EqualsBuilder().append(hostTimeEntry, rhs.hostTimeEntry).isEquals();
    }

    public HostTimeTable clone() {
        HostTimeTable _copy = new HostTimeTable();
        for (Map.Entry<String, IHostTimeEntry> _entry: hostTimeEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.4.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hostTimeEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
