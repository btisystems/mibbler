
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.history;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.history.IEtherHistoryTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.history.etherhistorytable.IEtherHistoryEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.history.etherhistorytable.EtherHistoryEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class EtherHistoryTable
    extends DeviceEntity
    implements Serializable, IEtherHistoryTable, ITableAccess<IEtherHistoryEntry>
{

    private Map<String, IEtherHistoryEntry> etherHistoryEntry = new TreeMap<String, IEtherHistoryEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public EtherHistoryTable() {
    }

    public Map<String, IEtherHistoryEntry> getEtherHistoryEntry() {
        return this.etherHistoryEntry;
    }

    public IEtherHistoryEntry getEntry(String key) {
        return etherHistoryEntry.get(key);
    }

    public void setEntry(String key, IEtherHistoryEntry value) {
        etherHistoryEntry.put(key, value);
        ((EtherHistoryEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IEtherHistoryEntry> getEntries() {
        return etherHistoryEntry;
    }

    public EtherHistoryEntry createEntry(String entryIndex) {
        EtherHistoryEntry newEntry = new EtherHistoryEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.2.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("etherHistoryEntry", etherHistoryEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(etherHistoryEntry).toHashCode();
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
        EtherHistoryTable rhs = ((EtherHistoryTable) obj);
        return new EqualsBuilder().append(etherHistoryEntry, rhs.etherHistoryEntry).isEquals();
    }

    public EtherHistoryTable clone() {
        EtherHistoryTable _copy = new EtherHistoryTable();
        for (Map.Entry<String, IEtherHistoryEntry> _entry: etherHistoryEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.2.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "etherHistoryEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
