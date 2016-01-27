
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.IIpv6RouteTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6routetable.IIpv6RouteEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.ipv6routetable.Ipv6RouteEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Ipv6RouteTable
    extends DeviceEntity
    implements Serializable, IIpv6RouteTable, ITableAccess<IIpv6RouteEntry>
{

    private Map<String, IIpv6RouteEntry> ipv6RouteEntry = new TreeMap<String, IIpv6RouteEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6RouteTable() {
    }

    public Map<String, IIpv6RouteEntry> getIpv6RouteEntry() {
        return this.ipv6RouteEntry;
    }

    public IIpv6RouteEntry getEntry(String key) {
        return ipv6RouteEntry.get(key);
    }

    public void setEntry(String key, IIpv6RouteEntry value) {
        ipv6RouteEntry.put(key, value);
        ((Ipv6RouteEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpv6RouteEntry> getEntries() {
        return ipv6RouteEntry;
    }

    public Ipv6RouteEntry createEntry(String entryIndex) {
        Ipv6RouteEntry newEntry = new Ipv6RouteEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.55.1.11.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6RouteEntry", ipv6RouteEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6RouteEntry).toHashCode();
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
        Ipv6RouteTable rhs = ((Ipv6RouteTable) obj);
        return new EqualsBuilder().append(ipv6RouteEntry, rhs.ipv6RouteEntry).isEquals();
    }

    public Ipv6RouteTable clone() {
        Ipv6RouteTable _copy = new Ipv6RouteTable();
        for (Map.Entry<String, IIpv6RouteEntry> _entry: ipv6RouteEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.55.1.11"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6RouteEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
