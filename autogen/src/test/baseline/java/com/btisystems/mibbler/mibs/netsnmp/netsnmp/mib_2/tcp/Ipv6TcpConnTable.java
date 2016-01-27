
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.tcp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp.IIpv6TcpConnTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp.ipv6tcpconntable.IIpv6TcpConnEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.tcp.ipv6tcpconntable.Ipv6TcpConnEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Ipv6TcpConnTable
    extends DeviceEntity
    implements Serializable, IIpv6TcpConnTable, ITableAccess<IIpv6TcpConnEntry>
{

    private Map<String, IIpv6TcpConnEntry> ipv6TcpConnEntry = new TreeMap<String, IIpv6TcpConnEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6TcpConnTable() {
    }

    public Map<String, IIpv6TcpConnEntry> getIpv6TcpConnEntry() {
        return this.ipv6TcpConnEntry;
    }

    public IIpv6TcpConnEntry getEntry(String key) {
        return ipv6TcpConnEntry.get(key);
    }

    public void setEntry(String key, IIpv6TcpConnEntry value) {
        ipv6TcpConnEntry.put(key, value);
        ((Ipv6TcpConnEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpv6TcpConnEntry> getEntries() {
        return ipv6TcpConnEntry;
    }

    public Ipv6TcpConnEntry createEntry(String entryIndex) {
        Ipv6TcpConnEntry newEntry = new Ipv6TcpConnEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.6.16.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6TcpConnEntry", ipv6TcpConnEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6TcpConnEntry).toHashCode();
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
        Ipv6TcpConnTable rhs = ((Ipv6TcpConnTable) obj);
        return new EqualsBuilder().append(ipv6TcpConnEntry, rhs.ipv6TcpConnEntry).isEquals();
    }

    public Ipv6TcpConnTable clone() {
        Ipv6TcpConnTable _copy = new Ipv6TcpConnTable();
        for (Map.Entry<String, IIpv6TcpConnEntry> _entry: ipv6TcpConnEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.6.16"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6TcpConnEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
