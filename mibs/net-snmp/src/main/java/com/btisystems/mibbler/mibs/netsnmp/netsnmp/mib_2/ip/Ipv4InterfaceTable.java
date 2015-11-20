
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.IIpv4InterfaceTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipv4interfacetable.IIpv4InterfaceEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipv4interfacetable.Ipv4InterfaceEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Ipv4InterfaceTable
    extends DeviceEntity
    implements Serializable, IIpv4InterfaceTable, ITableAccess<IIpv4InterfaceEntry>
{

    private Map<String, IIpv4InterfaceEntry> ipv4InterfaceEntry = new TreeMap<String, IIpv4InterfaceEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv4InterfaceTable() {
    }

    public Map<String, IIpv4InterfaceEntry> getIpv4InterfaceEntry() {
        return this.ipv4InterfaceEntry;
    }

    public IIpv4InterfaceEntry getEntry(String key) {
        return ipv4InterfaceEntry.get(key);
    }

    public void setEntry(String key, IIpv4InterfaceEntry value) {
        ipv4InterfaceEntry.put(key, value);
        ((Ipv4InterfaceEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpv4InterfaceEntry> getEntries() {
        return ipv4InterfaceEntry;
    }

    public Ipv4InterfaceEntry createEntry(String entryIndex) {
        Ipv4InterfaceEntry newEntry = new Ipv4InterfaceEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.4.28.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv4InterfaceEntry", ipv4InterfaceEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv4InterfaceEntry).toHashCode();
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
        Ipv4InterfaceTable rhs = ((Ipv4InterfaceTable) obj);
        return new EqualsBuilder().append(ipv4InterfaceEntry, rhs.ipv4InterfaceEntry).isEquals();
    }

    public Ipv4InterfaceTable clone() {
        Ipv4InterfaceTable _copy = new Ipv4InterfaceTable();
        for (Map.Entry<String, IIpv4InterfaceEntry> _entry: ipv4InterfaceEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.28"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv4InterfaceEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
