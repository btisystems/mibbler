
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.IIpAddressTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipaddresstable.IIpAddressEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipaddresstable.IpAddressEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IpAddressTable
    extends DeviceEntity
    implements Serializable, IIpAddressTable, ITableAccess<IIpAddressEntry>
{

    private Map<String, IIpAddressEntry> ipAddressEntry = new TreeMap<String, IIpAddressEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpAddressTable() {
    }

    public Map<String, IIpAddressEntry> getIpAddressEntry() {
        return this.ipAddressEntry;
    }

    public IIpAddressEntry getEntry(String key) {
        return ipAddressEntry.get(key);
    }

    public void setEntry(String key, IIpAddressEntry value) {
        ipAddressEntry.put(key, value);
        ((IpAddressEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpAddressEntry> getEntries() {
        return ipAddressEntry;
    }

    public IpAddressEntry createEntry(String entryIndex) {
        IpAddressEntry newEntry = new IpAddressEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.4.34.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipAddressEntry", ipAddressEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipAddressEntry).toHashCode();
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
        IpAddressTable rhs = ((IpAddressTable) obj);
        return new EqualsBuilder().append(ipAddressEntry, rhs.ipAddressEntry).isEquals();
    }

    public IpAddressTable clone() {
        IpAddressTable _copy = new IpAddressTable();
        for (Map.Entry<String, IIpAddressEntry> _entry: ipAddressEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.34"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipAddressEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
