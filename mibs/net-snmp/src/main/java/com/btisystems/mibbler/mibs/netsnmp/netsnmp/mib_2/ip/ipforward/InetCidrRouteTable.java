
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipforward;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipforward.IInetCidrRouteTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipforward.inetcidrroutetable.IInetCidrRouteEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipforward.inetcidrroutetable.InetCidrRouteEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class InetCidrRouteTable
    extends DeviceEntity
    implements Serializable, IInetCidrRouteTable, ITableAccess<IInetCidrRouteEntry>
{

    private Map<String, IInetCidrRouteEntry> inetCidrRouteEntry = new TreeMap<String, IInetCidrRouteEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public InetCidrRouteTable() {
    }

    public Map<String, IInetCidrRouteEntry> getInetCidrRouteEntry() {
        return this.inetCidrRouteEntry;
    }

    public IInetCidrRouteEntry getEntry(String key) {
        return inetCidrRouteEntry.get(key);
    }

    public void setEntry(String key, IInetCidrRouteEntry value) {
        inetCidrRouteEntry.put(key, value);
        ((InetCidrRouteEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IInetCidrRouteEntry> getEntries() {
        return inetCidrRouteEntry;
    }

    public InetCidrRouteEntry createEntry(String entryIndex) {
        InetCidrRouteEntry newEntry = new InetCidrRouteEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.4.24.7.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("inetCidrRouteEntry", inetCidrRouteEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(inetCidrRouteEntry).toHashCode();
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
        InetCidrRouteTable rhs = ((InetCidrRouteTable) obj);
        return new EqualsBuilder().append(inetCidrRouteEntry, rhs.inetCidrRouteEntry).isEquals();
    }

    public InetCidrRouteTable clone() {
        InetCidrRouteTable _copy = new InetCidrRouteTable();
        for (Map.Entry<String, IInetCidrRouteEntry> _entry: inetCidrRouteEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.24.7"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "inetCidrRouteEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
