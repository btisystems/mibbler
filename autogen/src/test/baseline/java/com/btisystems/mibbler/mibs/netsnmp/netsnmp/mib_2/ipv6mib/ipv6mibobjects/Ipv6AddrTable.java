
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.IIpv6AddrTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6addrtable.IIpv6AddrEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.ipv6addrtable.Ipv6AddrEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Ipv6AddrTable
    extends DeviceEntity
    implements Serializable, IIpv6AddrTable, ITableAccess<IIpv6AddrEntry>
{

    private Map<String, IIpv6AddrEntry> ipv6AddrEntry = new TreeMap<String, IIpv6AddrEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6AddrTable() {
    }

    public Map<String, IIpv6AddrEntry> getIpv6AddrEntry() {
        return this.ipv6AddrEntry;
    }

    public IIpv6AddrEntry getEntry(String key) {
        return ipv6AddrEntry.get(key);
    }

    public void setEntry(String key, IIpv6AddrEntry value) {
        ipv6AddrEntry.put(key, value);
        ((Ipv6AddrEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpv6AddrEntry> getEntries() {
        return ipv6AddrEntry;
    }

    public Ipv6AddrEntry createEntry(String entryIndex) {
        Ipv6AddrEntry newEntry = new Ipv6AddrEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.55.1.8.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6AddrEntry", ipv6AddrEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6AddrEntry).toHashCode();
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
        Ipv6AddrTable rhs = ((Ipv6AddrTable) obj);
        return new EqualsBuilder().append(ipv6AddrEntry, rhs.ipv6AddrEntry).isEquals();
    }

    public Ipv6AddrTable clone() {
        Ipv6AddrTable _copy = new Ipv6AddrTable();
        for (Map.Entry<String, IIpv6AddrEntry> _entry: ipv6AddrEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.55.1.8"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6AddrEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
