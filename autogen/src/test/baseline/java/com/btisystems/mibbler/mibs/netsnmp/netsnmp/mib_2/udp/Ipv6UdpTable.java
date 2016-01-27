
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.udp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.udp.IIpv6UdpTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.udp.ipv6udptable.IIpv6UdpEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.udp.ipv6udptable.Ipv6UdpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Ipv6UdpTable
    extends DeviceEntity
    implements Serializable, IIpv6UdpTable, ITableAccess<IIpv6UdpEntry>
{

    private Map<String, IIpv6UdpEntry> ipv6UdpEntry = new TreeMap<String, IIpv6UdpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6UdpTable() {
    }

    public Map<String, IIpv6UdpEntry> getIpv6UdpEntry() {
        return this.ipv6UdpEntry;
    }

    public IIpv6UdpEntry getEntry(String key) {
        return ipv6UdpEntry.get(key);
    }

    public void setEntry(String key, IIpv6UdpEntry value) {
        ipv6UdpEntry.put(key, value);
        ((Ipv6UdpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpv6UdpEntry> getEntries() {
        return ipv6UdpEntry;
    }

    public Ipv6UdpEntry createEntry(String entryIndex) {
        Ipv6UdpEntry newEntry = new Ipv6UdpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.7.6.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6UdpEntry", ipv6UdpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6UdpEntry).toHashCode();
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
        Ipv6UdpTable rhs = ((Ipv6UdpTable) obj);
        return new EqualsBuilder().append(ipv6UdpEntry, rhs.ipv6UdpEntry).isEquals();
    }

    public Ipv6UdpTable clone() {
        Ipv6UdpTable _copy = new Ipv6UdpTable();
        for (Map.Entry<String, IIpv6UdpEntry> _entry: ipv6UdpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.7.6"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6UdpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
