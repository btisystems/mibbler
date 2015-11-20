
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.hosts;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.hosts.IHostControl2Table;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.hosts.hostcontrol2table.IHostControl2Entry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.hosts.hostcontrol2table.HostControl2Entry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HostControl2Table
    extends DeviceEntity
    implements Serializable, IHostControl2Table, ITableAccess<IHostControl2Entry>
{

    private Map<String, IHostControl2Entry> hostControl2Entry = new TreeMap<String, IHostControl2Entry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HostControl2Table() {
    }

    public Map<String, IHostControl2Entry> getHostControl2Entry() {
        return this.hostControl2Entry;
    }

    public IHostControl2Entry getEntry(String key) {
        return hostControl2Entry.get(key);
    }

    public void setEntry(String key, IHostControl2Entry value) {
        hostControl2Entry.put(key, value);
        ((HostControl2Entry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHostControl2Entry> getEntries() {
        return hostControl2Entry;
    }

    public HostControl2Entry createEntry(String entryIndex) {
        HostControl2Entry newEntry = new HostControl2Entry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.4.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hostControl2Entry", hostControl2Entry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hostControl2Entry).toHashCode();
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
        HostControl2Table rhs = ((HostControl2Table) obj);
        return new EqualsBuilder().append(hostControl2Entry, rhs.hostControl2Entry).isEquals();
    }

    public HostControl2Table clone() {
        HostControl2Table _copy = new HostControl2Table();
        for (Map.Entry<String, IHostControl2Entry> _entry: hostControl2Entry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.4.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hostControl2Entry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
