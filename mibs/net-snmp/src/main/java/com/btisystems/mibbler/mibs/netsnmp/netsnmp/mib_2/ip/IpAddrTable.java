
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.IIpAddrTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipaddrtable.IIpAddrEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipaddrtable.IpAddrEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IpAddrTable
    extends DeviceEntity
    implements Serializable, IIpAddrTable, ITableAccess<IIpAddrEntry>
{

    private Map<String, IIpAddrEntry> ipAddrEntry = new TreeMap<String, IIpAddrEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpAddrTable() {
    }

    public Map<String, IIpAddrEntry> getIpAddrEntry() {
        return this.ipAddrEntry;
    }

    public IIpAddrEntry getEntry(String key) {
        return ipAddrEntry.get(key);
    }

    public void setEntry(String key, IIpAddrEntry value) {
        ipAddrEntry.put(key, value);
        ((IpAddrEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpAddrEntry> getEntries() {
        return ipAddrEntry;
    }

    public IpAddrEntry createEntry(String entryIndex) {
        IpAddrEntry newEntry = new IpAddrEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.4.20.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipAddrEntry", ipAddrEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipAddrEntry).toHashCode();
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
        IpAddrTable rhs = ((IpAddrTable) obj);
        return new EqualsBuilder().append(ipAddrEntry, rhs.ipAddrEntry).isEquals();
    }

    public IpAddrTable clone() {
        IpAddrTable _copy = new IpAddrTable();
        for (Map.Entry<String, IIpAddrEntry> _entry: ipAddrEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.20"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipAddrEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
