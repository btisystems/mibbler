
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.IIpDefaultRouterTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipdefaultroutertable.IIpDefaultRouterEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipdefaultroutertable.IpDefaultRouterEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IpDefaultRouterTable
    extends DeviceEntity
    implements Serializable, IIpDefaultRouterTable, ITableAccess<IIpDefaultRouterEntry>
{

    private Map<String, IIpDefaultRouterEntry> ipDefaultRouterEntry = new TreeMap<String, IIpDefaultRouterEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpDefaultRouterTable() {
    }

    public Map<String, IIpDefaultRouterEntry> getIpDefaultRouterEntry() {
        return this.ipDefaultRouterEntry;
    }

    public IIpDefaultRouterEntry getEntry(String key) {
        return ipDefaultRouterEntry.get(key);
    }

    public void setEntry(String key, IIpDefaultRouterEntry value) {
        ipDefaultRouterEntry.put(key, value);
        ((IpDefaultRouterEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpDefaultRouterEntry> getEntries() {
        return ipDefaultRouterEntry;
    }

    public IpDefaultRouterEntry createEntry(String entryIndex) {
        IpDefaultRouterEntry newEntry = new IpDefaultRouterEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.4.37.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipDefaultRouterEntry", ipDefaultRouterEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipDefaultRouterEntry).toHashCode();
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
        IpDefaultRouterTable rhs = ((IpDefaultRouterTable) obj);
        return new EqualsBuilder().append(ipDefaultRouterEntry, rhs.ipDefaultRouterEntry).isEquals();
    }

    public IpDefaultRouterTable clone() {
        IpDefaultRouterTable _copy = new IpDefaultRouterTable();
        for (Map.Entry<String, IIpDefaultRouterEntry> _entry: ipDefaultRouterEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.37"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipDefaultRouterEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
