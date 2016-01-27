
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.IDot3PauseTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3pausetable.IDot3PauseEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.dot3pausetable.Dot3PauseEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot3PauseTable
    extends DeviceEntity
    implements Serializable, IDot3PauseTable, ITableAccess<IDot3PauseEntry>
{

    private Map<String, IDot3PauseEntry> dot3PauseEntry = new TreeMap<String, IDot3PauseEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot3PauseTable() {
    }

    public Map<String, IDot3PauseEntry> getDot3PauseEntry() {
        return this.dot3PauseEntry;
    }

    public IDot3PauseEntry getEntry(String key) {
        return dot3PauseEntry.get(key);
    }

    public void setEntry(String key, IDot3PauseEntry value) {
        dot3PauseEntry.put(key, value);
        ((Dot3PauseEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot3PauseEntry> getEntries() {
        return dot3PauseEntry;
    }

    public Dot3PauseEntry createEntry(String entryIndex) {
        Dot3PauseEntry newEntry = new Dot3PauseEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.10.7.10.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot3PauseEntry", dot3PauseEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot3PauseEntry).toHashCode();
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
        Dot3PauseTable rhs = ((Dot3PauseTable) obj);
        return new EqualsBuilder().append(dot3PauseEntry, rhs.dot3PauseEntry).isEquals();
    }

    public Dot3PauseTable clone() {
        Dot3PauseTable _copy = new Dot3PauseTable();
        for (Map.Entry<String, IDot3PauseEntry> _entry: dot3PauseEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.10.7.10"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot3PauseEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
