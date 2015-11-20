
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.hosttopn;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.hosttopn.IHostTopNControlTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.hosttopn.hosttopncontroltable.IHostTopNControlEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.hosttopn.hosttopncontroltable.HostTopNControlEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HostTopNControlTable
    extends DeviceEntity
    implements Serializable, IHostTopNControlTable, ITableAccess<IHostTopNControlEntry>
{

    private Map<String, IHostTopNControlEntry> hostTopNControlEntry = new TreeMap<String, IHostTopNControlEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HostTopNControlTable() {
    }

    public Map<String, IHostTopNControlEntry> getHostTopNControlEntry() {
        return this.hostTopNControlEntry;
    }

    public IHostTopNControlEntry getEntry(String key) {
        return hostTopNControlEntry.get(key);
    }

    public void setEntry(String key, IHostTopNControlEntry value) {
        hostTopNControlEntry.put(key, value);
        ((HostTopNControlEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHostTopNControlEntry> getEntries() {
        return hostTopNControlEntry;
    }

    public HostTopNControlEntry createEntry(String entryIndex) {
        HostTopNControlEntry newEntry = new HostTopNControlEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.5.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hostTopNControlEntry", hostTopNControlEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hostTopNControlEntry).toHashCode();
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
        HostTopNControlTable rhs = ((HostTopNControlTable) obj);
        return new EqualsBuilder().append(hostTopNControlEntry, rhs.hostTopNControlEntry).isEquals();
    }

    public HostTopNControlTable clone() {
        HostTopNControlTable _copy = new HostTopNControlTable();
        for (Map.Entry<String, IHostTopNControlEntry> _entry: hostTopNControlEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hostTopNControlEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
