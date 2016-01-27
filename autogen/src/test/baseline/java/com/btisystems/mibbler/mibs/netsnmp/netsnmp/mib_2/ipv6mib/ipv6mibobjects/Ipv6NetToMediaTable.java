
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.IIpv6NetToMediaTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6nettomediatable.IIpv6NetToMediaEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.ipv6nettomediatable.Ipv6NetToMediaEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Ipv6NetToMediaTable
    extends DeviceEntity
    implements Serializable, IIpv6NetToMediaTable, ITableAccess<IIpv6NetToMediaEntry>
{

    private Map<String, IIpv6NetToMediaEntry> ipv6NetToMediaEntry = new TreeMap<String, IIpv6NetToMediaEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6NetToMediaTable() {
    }

    public Map<String, IIpv6NetToMediaEntry> getIpv6NetToMediaEntry() {
        return this.ipv6NetToMediaEntry;
    }

    public IIpv6NetToMediaEntry getEntry(String key) {
        return ipv6NetToMediaEntry.get(key);
    }

    public void setEntry(String key, IIpv6NetToMediaEntry value) {
        ipv6NetToMediaEntry.put(key, value);
        ((Ipv6NetToMediaEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpv6NetToMediaEntry> getEntries() {
        return ipv6NetToMediaEntry;
    }

    public Ipv6NetToMediaEntry createEntry(String entryIndex) {
        Ipv6NetToMediaEntry newEntry = new Ipv6NetToMediaEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.55.1.12.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6NetToMediaEntry", ipv6NetToMediaEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6NetToMediaEntry).toHashCode();
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
        Ipv6NetToMediaTable rhs = ((Ipv6NetToMediaTable) obj);
        return new EqualsBuilder().append(ipv6NetToMediaEntry, rhs.ipv6NetToMediaEntry).isEquals();
    }

    public Ipv6NetToMediaTable clone() {
        Ipv6NetToMediaTable _copy = new Ipv6NetToMediaTable();
        for (Map.Entry<String, IIpv6NetToMediaEntry> _entry: ipv6NetToMediaEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.55.1.12"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6NetToMediaEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
