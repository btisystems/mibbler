
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.IIpv6IfTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6iftable.IIpv6IfEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.ipv6iftable.Ipv6IfEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Ipv6IfTable
    extends DeviceEntity
    implements Serializable, IIpv6IfTable, ITableAccess<IIpv6IfEntry>
{

    private Map<String, IIpv6IfEntry> ipv6IfEntry = new TreeMap<String, IIpv6IfEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6IfTable() {
    }

    public Map<String, IIpv6IfEntry> getIpv6IfEntry() {
        return this.ipv6IfEntry;
    }

    public IIpv6IfEntry getEntry(String key) {
        return ipv6IfEntry.get(key);
    }

    public void setEntry(String key, IIpv6IfEntry value) {
        ipv6IfEntry.put(key, value);
        ((Ipv6IfEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpv6IfEntry> getEntries() {
        return ipv6IfEntry;
    }

    public Ipv6IfEntry createEntry(String entryIndex) {
        Ipv6IfEntry newEntry = new Ipv6IfEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.55.1.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6IfEntry", ipv6IfEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6IfEntry).toHashCode();
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
        Ipv6IfTable rhs = ((Ipv6IfTable) obj);
        return new EqualsBuilder().append(ipv6IfEntry, rhs.ipv6IfEntry).isEquals();
    }

    public Ipv6IfTable clone() {
        Ipv6IfTable _copy = new Ipv6IfTable();
        for (Map.Entry<String, IIpv6IfEntry> _entry: ipv6IfEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.55.1.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6IfEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
