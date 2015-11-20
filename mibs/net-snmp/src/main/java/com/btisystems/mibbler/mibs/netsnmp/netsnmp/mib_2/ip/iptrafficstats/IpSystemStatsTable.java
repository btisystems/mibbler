
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.iptrafficstats;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.iptrafficstats.IIpSystemStatsTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.iptrafficstats.ipsystemstatstable.IIpSystemStatsEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.iptrafficstats.ipsystemstatstable.IpSystemStatsEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IpSystemStatsTable
    extends DeviceEntity
    implements Serializable, IIpSystemStatsTable, ITableAccess<IIpSystemStatsEntry>
{

    private Map<String, IIpSystemStatsEntry> ipSystemStatsEntry = new TreeMap<String, IIpSystemStatsEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpSystemStatsTable() {
    }

    public Map<String, IIpSystemStatsEntry> getIpSystemStatsEntry() {
        return this.ipSystemStatsEntry;
    }

    public IIpSystemStatsEntry getEntry(String key) {
        return ipSystemStatsEntry.get(key);
    }

    public void setEntry(String key, IIpSystemStatsEntry value) {
        ipSystemStatsEntry.put(key, value);
        ((IpSystemStatsEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpSystemStatsEntry> getEntries() {
        return ipSystemStatsEntry;
    }

    public IpSystemStatsEntry createEntry(String entryIndex) {
        IpSystemStatsEntry newEntry = new IpSystemStatsEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.4.31.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipSystemStatsEntry", ipSystemStatsEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipSystemStatsEntry).toHashCode();
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
        IpSystemStatsTable rhs = ((IpSystemStatsTable) obj);
        return new EqualsBuilder().append(ipSystemStatsEntry, rhs.ipSystemStatsEntry).isEquals();
    }

    public IpSystemStatsTable clone() {
        IpSystemStatsTable _copy = new IpSystemStatsTable();
        for (Map.Entry<String, IIpSystemStatsEntry> _entry: ipSystemStatsEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.31.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipSystemStatsEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
