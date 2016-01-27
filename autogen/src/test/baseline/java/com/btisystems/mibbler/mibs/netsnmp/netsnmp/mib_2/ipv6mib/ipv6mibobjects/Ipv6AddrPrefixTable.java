
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.IIpv6AddrPrefixTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6addrprefixtable.IIpv6AddrPrefixEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.ipv6addrprefixtable.Ipv6AddrPrefixEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Ipv6AddrPrefixTable
    extends DeviceEntity
    implements Serializable, IIpv6AddrPrefixTable, ITableAccess<IIpv6AddrPrefixEntry>
{

    private Map<String, IIpv6AddrPrefixEntry> ipv6AddrPrefixEntry = new TreeMap<String, IIpv6AddrPrefixEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6AddrPrefixTable() {
    }

    public Map<String, IIpv6AddrPrefixEntry> getIpv6AddrPrefixEntry() {
        return this.ipv6AddrPrefixEntry;
    }

    public IIpv6AddrPrefixEntry getEntry(String key) {
        return ipv6AddrPrefixEntry.get(key);
    }

    public void setEntry(String key, IIpv6AddrPrefixEntry value) {
        ipv6AddrPrefixEntry.put(key, value);
        ((Ipv6AddrPrefixEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpv6AddrPrefixEntry> getEntries() {
        return ipv6AddrPrefixEntry;
    }

    public Ipv6AddrPrefixEntry createEntry(String entryIndex) {
        Ipv6AddrPrefixEntry newEntry = new Ipv6AddrPrefixEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.55.1.7.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6AddrPrefixEntry", ipv6AddrPrefixEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6AddrPrefixEntry).toHashCode();
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
        Ipv6AddrPrefixTable rhs = ((Ipv6AddrPrefixTable) obj);
        return new EqualsBuilder().append(ipv6AddrPrefixEntry, rhs.ipv6AddrPrefixEntry).isEquals();
    }

    public Ipv6AddrPrefixTable clone() {
        Ipv6AddrPrefixTable _copy = new Ipv6AddrPrefixTable();
        for (Map.Entry<String, IIpv6AddrPrefixEntry> _entry: ipv6AddrPrefixEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.55.1.7"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6AddrPrefixEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
