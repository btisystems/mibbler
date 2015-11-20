
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.icmp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.icmp.IIcmpStatsTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.icmp.icmpstatstable.IIcmpStatsEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.icmp.icmpstatstable.IcmpStatsEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IcmpStatsTable
    extends DeviceEntity
    implements Serializable, IIcmpStatsTable, ITableAccess<IIcmpStatsEntry>
{

    private Map<String, IIcmpStatsEntry> icmpStatsEntry = new TreeMap<String, IIcmpStatsEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IcmpStatsTable() {
    }

    public Map<String, IIcmpStatsEntry> getIcmpStatsEntry() {
        return this.icmpStatsEntry;
    }

    public IIcmpStatsEntry getEntry(String key) {
        return icmpStatsEntry.get(key);
    }

    public void setEntry(String key, IIcmpStatsEntry value) {
        icmpStatsEntry.put(key, value);
        ((IcmpStatsEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIcmpStatsEntry> getEntries() {
        return icmpStatsEntry;
    }

    public IcmpStatsEntry createEntry(String entryIndex) {
        IcmpStatsEntry newEntry = new IcmpStatsEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.5.29.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("icmpStatsEntry", icmpStatsEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(icmpStatsEntry).toHashCode();
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
        IcmpStatsTable rhs = ((IcmpStatsTable) obj);
        return new EqualsBuilder().append(icmpStatsEntry, rhs.icmpStatsEntry).isEquals();
    }

    public IcmpStatsTable clone() {
        IcmpStatsTable _copy = new IcmpStatsTable();
        for (Map.Entry<String, IIcmpStatsEntry> _entry: icmpStatsEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.5.29"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "icmpStatsEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
