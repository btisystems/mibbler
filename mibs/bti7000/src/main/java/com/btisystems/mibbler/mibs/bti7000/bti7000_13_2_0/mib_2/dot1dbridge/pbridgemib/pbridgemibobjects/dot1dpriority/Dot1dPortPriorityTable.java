
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dportprioritytable.Dot1dPortPriorityEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.IDot1dPortPriorityTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dportprioritytable.IDot1dPortPriorityEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1dPortPriorityTable
    extends DeviceEntity
    implements Serializable, IDot1dPortPriorityTable, ITableAccess<IDot1dPortPriorityEntry>
{

    private Map<String, IDot1dPortPriorityEntry> dot1dPortPriorityEntry = new TreeMap<String, IDot1dPortPriorityEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dPortPriorityTable() {
    }

    public Map<String, IDot1dPortPriorityEntry> getDot1dPortPriorityEntry() {
        return this.dot1dPortPriorityEntry;
    }

    public IDot1dPortPriorityEntry getEntry(String key) {
        return dot1dPortPriorityEntry.get(key);
    }

    public void setEntry(String key, IDot1dPortPriorityEntry value) {
        dot1dPortPriorityEntry.put(key, value);
        ((Dot1dPortPriorityEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1dPortPriorityEntry> getEntries() {
        return dot1dPortPriorityEntry;
    }

    public Dot1dPortPriorityEntry createEntry(String entryIndex) {
        Dot1dPortPriorityEntry newEntry = new Dot1dPortPriorityEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.6.1.2.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dPortPriorityEntry", dot1dPortPriorityEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dPortPriorityEntry).toHashCode();
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
        Dot1dPortPriorityTable rhs = ((Dot1dPortPriorityTable) obj);
        return new EqualsBuilder().append(dot1dPortPriorityEntry, rhs.dot1dPortPriorityEntry).isEquals();
    }

    public Dot1dPortPriorityTable clone() {
        Dot1dPortPriorityTable _copy = new Dot1dPortPriorityTable();
        for (Map.Entry<String, IDot1dPortPriorityEntry> _entry: dot1dPortPriorityEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.6.1.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dPortPriorityEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
