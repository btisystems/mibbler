
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.IIpRouteTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.iproutetable.IIpRouteEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.iproutetable.IpRouteEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IpRouteTable
    extends DeviceEntity
    implements Serializable, IIpRouteTable, ITableAccess<IIpRouteEntry>
{

    private Map<String, IIpRouteEntry> ipRouteEntry = new TreeMap<String, IIpRouteEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpRouteTable() {
    }

    public Map<String, IIpRouteEntry> getIpRouteEntry() {
        return this.ipRouteEntry;
    }

    public IIpRouteEntry getEntry(String key) {
        return ipRouteEntry.get(key);
    }

    public void setEntry(String key, IIpRouteEntry value) {
        ipRouteEntry.put(key, value);
        ((IpRouteEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpRouteEntry> getEntries() {
        return ipRouteEntry;
    }

    public IpRouteEntry createEntry(String entryIndex) {
        IpRouteEntry newEntry = new IpRouteEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.4.21.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipRouteEntry", ipRouteEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipRouteEntry).toHashCode();
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
        IpRouteTable rhs = ((IpRouteTable) obj);
        return new EqualsBuilder().append(ipRouteEntry, rhs.ipRouteEntry).isEquals();
    }

    public IpRouteTable clone() {
        IpRouteTable _copy = new IpRouteTable();
        for (Map.Entry<String, IIpRouteEntry> _entry: ipRouteEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.21"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipRouteEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
