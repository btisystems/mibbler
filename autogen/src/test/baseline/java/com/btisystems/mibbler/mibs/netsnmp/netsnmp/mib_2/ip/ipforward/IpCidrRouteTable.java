
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipforward;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipforward.IIpCidrRouteTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipforward.ipcidrroutetable.IIpCidrRouteEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipforward.ipcidrroutetable.IpCidrRouteEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IpCidrRouteTable
    extends DeviceEntity
    implements Serializable, IIpCidrRouteTable, ITableAccess<IIpCidrRouteEntry>
{

    private Map<String, IIpCidrRouteEntry> ipCidrRouteEntry = new TreeMap<String, IIpCidrRouteEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpCidrRouteTable() {
    }

    public Map<String, IIpCidrRouteEntry> getIpCidrRouteEntry() {
        return this.ipCidrRouteEntry;
    }

    public IIpCidrRouteEntry getEntry(String key) {
        return ipCidrRouteEntry.get(key);
    }

    public void setEntry(String key, IIpCidrRouteEntry value) {
        ipCidrRouteEntry.put(key, value);
        ((IpCidrRouteEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpCidrRouteEntry> getEntries() {
        return ipCidrRouteEntry;
    }

    public IpCidrRouteEntry createEntry(String entryIndex) {
        IpCidrRouteEntry newEntry = new IpCidrRouteEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.4.24.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipCidrRouteEntry", ipCidrRouteEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipCidrRouteEntry).toHashCode();
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
        IpCidrRouteTable rhs = ((IpCidrRouteTable) obj);
        return new EqualsBuilder().append(ipCidrRouteEntry, rhs.ipCidrRouteEntry).isEquals();
    }

    public IpCidrRouteTable clone() {
        IpCidrRouteTable _copy = new IpCidrRouteTable();
        for (Map.Entry<String, IIpCidrRouteEntry> _entry: ipCidrRouteEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.24.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipCidrRouteEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
