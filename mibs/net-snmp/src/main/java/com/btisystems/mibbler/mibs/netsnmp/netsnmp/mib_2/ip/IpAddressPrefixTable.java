
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.IIpAddressPrefixTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipaddressprefixtable.IIpAddressPrefixEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipaddressprefixtable.IpAddressPrefixEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IpAddressPrefixTable
    extends DeviceEntity
    implements Serializable, IIpAddressPrefixTable, ITableAccess<IIpAddressPrefixEntry>
{

    private Map<String, IIpAddressPrefixEntry> ipAddressPrefixEntry = new TreeMap<String, IIpAddressPrefixEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpAddressPrefixTable() {
    }

    public Map<String, IIpAddressPrefixEntry> getIpAddressPrefixEntry() {
        return this.ipAddressPrefixEntry;
    }

    public IIpAddressPrefixEntry getEntry(String key) {
        return ipAddressPrefixEntry.get(key);
    }

    public void setEntry(String key, IIpAddressPrefixEntry value) {
        ipAddressPrefixEntry.put(key, value);
        ((IpAddressPrefixEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpAddressPrefixEntry> getEntries() {
        return ipAddressPrefixEntry;
    }

    public IpAddressPrefixEntry createEntry(String entryIndex) {
        IpAddressPrefixEntry newEntry = new IpAddressPrefixEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.4.32.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipAddressPrefixEntry", ipAddressPrefixEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipAddressPrefixEntry).toHashCode();
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
        IpAddressPrefixTable rhs = ((IpAddressPrefixTable) obj);
        return new EqualsBuilder().append(ipAddressPrefixEntry, rhs.ipAddressPrefixEntry).isEquals();
    }

    public IpAddressPrefixTable clone() {
        IpAddressPrefixTable _copy = new IpAddressPrefixTable();
        for (Map.Entry<String, IIpAddressPrefixEntry> _entry: ipAddressPrefixEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.32"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipAddressPrefixEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
