
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.hosttopn;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.hosttopn.IHostTopNTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.hosttopn.hosttopntable.IHostTopNEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.hosttopn.hosttopntable.HostTopNEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HostTopNTable
    extends DeviceEntity
    implements Serializable, IHostTopNTable, ITableAccess<IHostTopNEntry>
{

    private Map<String, IHostTopNEntry> hostTopNEntry = new TreeMap<String, IHostTopNEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HostTopNTable() {
    }

    public Map<String, IHostTopNEntry> getHostTopNEntry() {
        return this.hostTopNEntry;
    }

    public IHostTopNEntry getEntry(String key) {
        return hostTopNEntry.get(key);
    }

    public void setEntry(String key, IHostTopNEntry value) {
        hostTopNEntry.put(key, value);
        ((HostTopNEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHostTopNEntry> getEntries() {
        return hostTopNEntry;
    }

    public HostTopNEntry createEntry(String entryIndex) {
        HostTopNEntry newEntry = new HostTopNEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.5.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hostTopNEntry", hostTopNEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hostTopNEntry).toHashCode();
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
        HostTopNTable rhs = ((HostTopNTable) obj);
        return new EqualsBuilder().append(hostTopNEntry, rhs.hostTopNEntry).isEquals();
    }

    public HostTopNTable clone() {
        HostTopNTable _copy = new HostTopNTable();
        for (Map.Entry<String, IHostTopNEntry> _entry: hostTopNEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.5.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hostTopNEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
