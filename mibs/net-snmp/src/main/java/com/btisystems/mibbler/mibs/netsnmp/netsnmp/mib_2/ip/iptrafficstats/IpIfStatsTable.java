
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.iptrafficstats;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.iptrafficstats.IIpIfStatsTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.iptrafficstats.ipifstatstable.IIpIfStatsEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.iptrafficstats.ipifstatstable.IpIfStatsEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IpIfStatsTable
    extends DeviceEntity
    implements Serializable, IIpIfStatsTable, ITableAccess<IIpIfStatsEntry>
{

    private Map<String, IIpIfStatsEntry> ipIfStatsEntry = new TreeMap<String, IIpIfStatsEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpIfStatsTable() {
    }

    public Map<String, IIpIfStatsEntry> getIpIfStatsEntry() {
        return this.ipIfStatsEntry;
    }

    public IIpIfStatsEntry getEntry(String key) {
        return ipIfStatsEntry.get(key);
    }

    public void setEntry(String key, IIpIfStatsEntry value) {
        ipIfStatsEntry.put(key, value);
        ((IpIfStatsEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpIfStatsEntry> getEntries() {
        return ipIfStatsEntry;
    }

    public IpIfStatsEntry createEntry(String entryIndex) {
        IpIfStatsEntry newEntry = new IpIfStatsEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.4.31.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipIfStatsEntry", ipIfStatsEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipIfStatsEntry).toHashCode();
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
        IpIfStatsTable rhs = ((IpIfStatsTable) obj);
        return new EqualsBuilder().append(ipIfStatsEntry, rhs.ipIfStatsEntry).isEquals();
    }

    public IpIfStatsTable clone() {
        IpIfStatsTable _copy = new IpIfStatsTable();
        for (Map.Entry<String, IIpIfStatsEntry> _entry: ipIfStatsEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.31.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipIfStatsEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
