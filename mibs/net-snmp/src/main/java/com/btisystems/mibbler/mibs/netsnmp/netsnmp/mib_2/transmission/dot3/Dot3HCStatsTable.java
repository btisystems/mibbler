
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.IDot3HCStatsTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3hcstatstable.IDot3HCStatsEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.dot3hcstatstable.Dot3HCStatsEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot3HCStatsTable
    extends DeviceEntity
    implements Serializable, IDot3HCStatsTable, ITableAccess<IDot3HCStatsEntry>
{

    private Map<String, IDot3HCStatsEntry> dot3HCStatsEntry = new TreeMap<String, IDot3HCStatsEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot3HCStatsTable() {
    }

    public Map<String, IDot3HCStatsEntry> getDot3HCStatsEntry() {
        return this.dot3HCStatsEntry;
    }

    public IDot3HCStatsEntry getEntry(String key) {
        return dot3HCStatsEntry.get(key);
    }

    public void setEntry(String key, IDot3HCStatsEntry value) {
        dot3HCStatsEntry.put(key, value);
        ((Dot3HCStatsEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot3HCStatsEntry> getEntries() {
        return dot3HCStatsEntry;
    }

    public Dot3HCStatsEntry createEntry(String entryIndex) {
        Dot3HCStatsEntry newEntry = new Dot3HCStatsEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.10.7.11.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot3HCStatsEntry", dot3HCStatsEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot3HCStatsEntry).toHashCode();
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
        Dot3HCStatsTable rhs = ((Dot3HCStatsTable) obj);
        return new EqualsBuilder().append(dot3HCStatsEntry, rhs.dot3HCStatsEntry).isEquals();
    }

    public Dot3HCStatsTable clone() {
        Dot3HCStatsTable _copy = new Dot3HCStatsTable();
        for (Map.Entry<String, IDot3HCStatsEntry> _entry: dot3HCStatsEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.10.7.11"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot3HCStatsEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
