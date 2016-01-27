
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.hosts;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.hosts.IHostControlTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.hosts.hostcontroltable.IHostControlEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.hosts.hostcontroltable.HostControlEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HostControlTable
    extends DeviceEntity
    implements Serializable, IHostControlTable, ITableAccess<IHostControlEntry>
{

    private Map<String, IHostControlEntry> hostControlEntry = new TreeMap<String, IHostControlEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HostControlTable() {
    }

    public Map<String, IHostControlEntry> getHostControlEntry() {
        return this.hostControlEntry;
    }

    public IHostControlEntry getEntry(String key) {
        return hostControlEntry.get(key);
    }

    public void setEntry(String key, IHostControlEntry value) {
        hostControlEntry.put(key, value);
        ((HostControlEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHostControlEntry> getEntries() {
        return hostControlEntry;
    }

    public HostControlEntry createEntry(String entryIndex) {
        HostControlEntry newEntry = new HostControlEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.4.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hostControlEntry", hostControlEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hostControlEntry).toHashCode();
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
        HostControlTable rhs = ((HostControlTable) obj);
        return new EqualsBuilder().append(hostControlEntry, rhs.hostControlEntry).isEquals();
    }

    public HostControlTable clone() {
        HostControlTable _copy = new HostControlTable();
        for (Map.Entry<String, IHostControlEntry> _entry: hostControlEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hostControlEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
