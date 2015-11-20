
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.icmp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.icmp.IIcmpMsgStatsTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.icmp.icmpmsgstatstable.IIcmpMsgStatsEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.icmp.icmpmsgstatstable.IcmpMsgStatsEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IcmpMsgStatsTable
    extends DeviceEntity
    implements Serializable, IIcmpMsgStatsTable, ITableAccess<IIcmpMsgStatsEntry>
{

    private Map<String, IIcmpMsgStatsEntry> icmpMsgStatsEntry = new TreeMap<String, IIcmpMsgStatsEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IcmpMsgStatsTable() {
    }

    public Map<String, IIcmpMsgStatsEntry> getIcmpMsgStatsEntry() {
        return this.icmpMsgStatsEntry;
    }

    public IIcmpMsgStatsEntry getEntry(String key) {
        return icmpMsgStatsEntry.get(key);
    }

    public void setEntry(String key, IIcmpMsgStatsEntry value) {
        icmpMsgStatsEntry.put(key, value);
        ((IcmpMsgStatsEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIcmpMsgStatsEntry> getEntries() {
        return icmpMsgStatsEntry;
    }

    public IcmpMsgStatsEntry createEntry(String entryIndex) {
        IcmpMsgStatsEntry newEntry = new IcmpMsgStatsEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.5.30.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("icmpMsgStatsEntry", icmpMsgStatsEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(icmpMsgStatsEntry).toHashCode();
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
        IcmpMsgStatsTable rhs = ((IcmpMsgStatsTable) obj);
        return new EqualsBuilder().append(icmpMsgStatsEntry, rhs.icmpMsgStatsEntry).isEquals();
    }

    public IcmpMsgStatsTable clone() {
        IcmpMsgStatsTable _copy = new IcmpMsgStatsTable();
        for (Map.Entry<String, IIcmpMsgStatsEntry> _entry: icmpMsgStatsEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.5.30"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "icmpMsgStatsEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
