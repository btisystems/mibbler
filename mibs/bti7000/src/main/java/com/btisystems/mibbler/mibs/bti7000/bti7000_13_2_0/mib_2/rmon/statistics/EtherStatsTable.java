
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.statistics;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.statistics.etherstatstable.EtherStatsEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics.IEtherStatsTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics.etherstatstable.IEtherStatsEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class EtherStatsTable
    extends DeviceEntity
    implements Serializable, IEtherStatsTable, ITableAccess<IEtherStatsEntry>
{

    private Map<String, IEtherStatsEntry> etherStatsEntry = new TreeMap<String, IEtherStatsEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public EtherStatsTable() {
    }

    public Map<String, IEtherStatsEntry> getEtherStatsEntry() {
        return this.etherStatsEntry;
    }

    public IEtherStatsEntry getEntry(String key) {
        return etherStatsEntry.get(key);
    }

    public void setEntry(String key, IEtherStatsEntry value) {
        etherStatsEntry.put(key, value);
        ((EtherStatsEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IEtherStatsEntry> getEntries() {
        return etherStatsEntry;
    }

    public EtherStatsEntry createEntry(String entryIndex) {
        EtherStatsEntry newEntry = new EtherStatsEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.1.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("etherStatsEntry", etherStatsEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(etherStatsEntry).toHashCode();
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
        EtherStatsTable rhs = ((EtherStatsTable) obj);
        return new EqualsBuilder().append(etherStatsEntry, rhs.etherStatsEntry).isEquals();
    }

    public EtherStatsTable clone() {
        EtherStatsTable _copy = new EtherStatsTable();
        for (Map.Entry<String, IEtherStatsEntry> _entry: etherStatsEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "etherStatsEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
