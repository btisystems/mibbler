
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.IIpv6RouterAdvertTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipv6routeradverttable.IIpv6RouterAdvertEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipv6routeradverttable.Ipv6RouterAdvertEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Ipv6RouterAdvertTable
    extends DeviceEntity
    implements Serializable, IIpv6RouterAdvertTable, ITableAccess<IIpv6RouterAdvertEntry>
{

    private Map<String, IIpv6RouterAdvertEntry> ipv6RouterAdvertEntry = new TreeMap<String, IIpv6RouterAdvertEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6RouterAdvertTable() {
    }

    public Map<String, IIpv6RouterAdvertEntry> getIpv6RouterAdvertEntry() {
        return this.ipv6RouterAdvertEntry;
    }

    public IIpv6RouterAdvertEntry getEntry(String key) {
        return ipv6RouterAdvertEntry.get(key);
    }

    public void setEntry(String key, IIpv6RouterAdvertEntry value) {
        ipv6RouterAdvertEntry.put(key, value);
        ((Ipv6RouterAdvertEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpv6RouterAdvertEntry> getEntries() {
        return ipv6RouterAdvertEntry;
    }

    public Ipv6RouterAdvertEntry createEntry(String entryIndex) {
        Ipv6RouterAdvertEntry newEntry = new Ipv6RouterAdvertEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.4.39.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6RouterAdvertEntry", ipv6RouterAdvertEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6RouterAdvertEntry).toHashCode();
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
        Ipv6RouterAdvertTable rhs = ((Ipv6RouterAdvertTable) obj);
        return new EqualsBuilder().append(ipv6RouterAdvertEntry, rhs.ipv6RouterAdvertEntry).isEquals();
    }

    public Ipv6RouterAdvertTable clone() {
        Ipv6RouterAdvertTable _copy = new Ipv6RouterAdvertTable();
        for (Map.Entry<String, IIpv6RouterAdvertEntry> _entry: ipv6RouterAdvertEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.39"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6RouterAdvertEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
