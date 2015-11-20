
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.IDot3StatsTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3statstable.IDot3StatsEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.dot3statstable.Dot3StatsEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot3StatsTable
    extends DeviceEntity
    implements Serializable, IDot3StatsTable, ITableAccess<IDot3StatsEntry>
{

    private Map<String, IDot3StatsEntry> dot3StatsEntry = new TreeMap<String, IDot3StatsEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot3StatsTable() {
    }

    public Map<String, IDot3StatsEntry> getDot3StatsEntry() {
        return this.dot3StatsEntry;
    }

    public IDot3StatsEntry getEntry(String key) {
        return dot3StatsEntry.get(key);
    }

    public void setEntry(String key, IDot3StatsEntry value) {
        dot3StatsEntry.put(key, value);
        ((Dot3StatsEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot3StatsEntry> getEntries() {
        return dot3StatsEntry;
    }

    public Dot3StatsEntry createEntry(String entryIndex) {
        Dot3StatsEntry newEntry = new Dot3StatsEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.10.7.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot3StatsEntry", dot3StatsEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot3StatsEntry).toHashCode();
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
        Dot3StatsTable rhs = ((Dot3StatsTable) obj);
        return new EqualsBuilder().append(dot3StatsEntry, rhs.dot3StatsEntry).isEquals();
    }

    public Dot3StatsTable clone() {
        Dot3StatsTable _copy = new Dot3StatsTable();
        for (Map.Entry<String, IDot3StatsEntry> _entry: dot3StatsEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.10.7.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot3StatsEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
