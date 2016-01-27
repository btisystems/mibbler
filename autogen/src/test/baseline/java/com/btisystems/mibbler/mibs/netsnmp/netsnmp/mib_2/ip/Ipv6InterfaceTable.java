
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.IIpv6InterfaceTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipv6interfacetable.IIpv6InterfaceEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipv6interfacetable.Ipv6InterfaceEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Ipv6InterfaceTable
    extends DeviceEntity
    implements Serializable, IIpv6InterfaceTable, ITableAccess<IIpv6InterfaceEntry>
{

    private Map<String, IIpv6InterfaceEntry> ipv6InterfaceEntry = new TreeMap<String, IIpv6InterfaceEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6InterfaceTable() {
    }

    public Map<String, IIpv6InterfaceEntry> getIpv6InterfaceEntry() {
        return this.ipv6InterfaceEntry;
    }

    public IIpv6InterfaceEntry getEntry(String key) {
        return ipv6InterfaceEntry.get(key);
    }

    public void setEntry(String key, IIpv6InterfaceEntry value) {
        ipv6InterfaceEntry.put(key, value);
        ((Ipv6InterfaceEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpv6InterfaceEntry> getEntries() {
        return ipv6InterfaceEntry;
    }

    public Ipv6InterfaceEntry createEntry(String entryIndex) {
        Ipv6InterfaceEntry newEntry = new Ipv6InterfaceEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.4.30.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6InterfaceEntry", ipv6InterfaceEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6InterfaceEntry).toHashCode();
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
        Ipv6InterfaceTable rhs = ((Ipv6InterfaceTable) obj);
        return new EqualsBuilder().append(ipv6InterfaceEntry, rhs.ipv6InterfaceEntry).isEquals();
    }

    public Ipv6InterfaceTable clone() {
        Ipv6InterfaceTable _copy = new Ipv6InterfaceTable();
        for (Map.Entry<String, IIpv6InterfaceEntry> _entry: ipv6InterfaceEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.30"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6InterfaceEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
