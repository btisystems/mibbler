
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.hosts;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.hosts.IHostTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.hosts.hosttable.IHostEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.hosts.hosttable.HostEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HostTable
    extends DeviceEntity
    implements Serializable, IHostTable, ITableAccess<IHostEntry>
{

    private Map<String, IHostEntry> hostEntry = new TreeMap<String, IHostEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HostTable() {
    }

    public Map<String, IHostEntry> getHostEntry() {
        return this.hostEntry;
    }

    public IHostEntry getEntry(String key) {
        return hostEntry.get(key);
    }

    public void setEntry(String key, IHostEntry value) {
        hostEntry.put(key, value);
        ((HostEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHostEntry> getEntries() {
        return hostEntry;
    }

    public HostEntry createEntry(String entryIndex) {
        HostEntry newEntry = new HostEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.4.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hostEntry", hostEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hostEntry).toHashCode();
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
        HostTable rhs = ((HostTable) obj);
        return new EqualsBuilder().append(hostEntry, rhs.hostEntry).isEquals();
    }

    public HostTable clone() {
        HostTable _copy = new HostTable();
        for (Map.Entry<String, IHostEntry> _entry: hostEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.4.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hostEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
