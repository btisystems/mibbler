
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.IIpv6ScopeZoneIndexTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipv6scopezoneindextable.IIpv6ScopeZoneIndexEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipv6scopezoneindextable.Ipv6ScopeZoneIndexEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Ipv6ScopeZoneIndexTable
    extends DeviceEntity
    implements Serializable, IIpv6ScopeZoneIndexTable, ITableAccess<IIpv6ScopeZoneIndexEntry>
{

    private Map<String, IIpv6ScopeZoneIndexEntry> ipv6ScopeZoneIndexEntry = new TreeMap<String, IIpv6ScopeZoneIndexEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6ScopeZoneIndexTable() {
    }

    public Map<String, IIpv6ScopeZoneIndexEntry> getIpv6ScopeZoneIndexEntry() {
        return this.ipv6ScopeZoneIndexEntry;
    }

    public IIpv6ScopeZoneIndexEntry getEntry(String key) {
        return ipv6ScopeZoneIndexEntry.get(key);
    }

    public void setEntry(String key, IIpv6ScopeZoneIndexEntry value) {
        ipv6ScopeZoneIndexEntry.put(key, value);
        ((Ipv6ScopeZoneIndexEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpv6ScopeZoneIndexEntry> getEntries() {
        return ipv6ScopeZoneIndexEntry;
    }

    public Ipv6ScopeZoneIndexEntry createEntry(String entryIndex) {
        Ipv6ScopeZoneIndexEntry newEntry = new Ipv6ScopeZoneIndexEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.4.36.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6ScopeZoneIndexEntry", ipv6ScopeZoneIndexEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6ScopeZoneIndexEntry).toHashCode();
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
        Ipv6ScopeZoneIndexTable rhs = ((Ipv6ScopeZoneIndexTable) obj);
        return new EqualsBuilder().append(ipv6ScopeZoneIndexEntry, rhs.ipv6ScopeZoneIndexEntry).isEquals();
    }

    public Ipv6ScopeZoneIndexTable clone() {
        Ipv6ScopeZoneIndexTable _copy = new Ipv6ScopeZoneIndexTable();
        for (Map.Entry<String, IIpv6ScopeZoneIndexEntry> _entry: ipv6ScopeZoneIndexEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.36"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6ScopeZoneIndexEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
