
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.IIpv6IfStatsTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6ifstatstable.IIpv6IfStatsEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.ipv6ifstatstable.Ipv6IfStatsEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Ipv6IfStatsTable
    extends DeviceEntity
    implements Serializable, IIpv6IfStatsTable, ITableAccess<IIpv6IfStatsEntry>
{

    private Map<String, IIpv6IfStatsEntry> ipv6IfStatsEntry = new TreeMap<String, IIpv6IfStatsEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6IfStatsTable() {
    }

    public Map<String, IIpv6IfStatsEntry> getIpv6IfStatsEntry() {
        return this.ipv6IfStatsEntry;
    }

    public IIpv6IfStatsEntry getEntry(String key) {
        return ipv6IfStatsEntry.get(key);
    }

    public void setEntry(String key, IIpv6IfStatsEntry value) {
        ipv6IfStatsEntry.put(key, value);
        ((Ipv6IfStatsEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpv6IfStatsEntry> getEntries() {
        return ipv6IfStatsEntry;
    }

    public Ipv6IfStatsEntry createEntry(String entryIndex) {
        Ipv6IfStatsEntry newEntry = new Ipv6IfStatsEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.55.1.6.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6IfStatsEntry", ipv6IfStatsEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6IfStatsEntry).toHashCode();
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
        Ipv6IfStatsTable rhs = ((Ipv6IfStatsTable) obj);
        return new EqualsBuilder().append(ipv6IfStatsEntry, rhs.ipv6IfStatsEntry).isEquals();
    }

    public Ipv6IfStatsTable clone() {
        Ipv6IfStatsTable _copy = new Ipv6IfStatsTable();
        for (Map.Entry<String, IIpv6IfStatsEntry> _entry: ipv6IfStatsEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.55.1.6"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6IfStatsEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
