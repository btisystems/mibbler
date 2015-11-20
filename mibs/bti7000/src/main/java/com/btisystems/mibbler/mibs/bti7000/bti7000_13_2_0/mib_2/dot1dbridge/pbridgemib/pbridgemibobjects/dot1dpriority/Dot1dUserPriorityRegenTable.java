
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1duserpriorityregentable.Dot1dUserPriorityRegenEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.IDot1dUserPriorityRegenTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1duserpriorityregentable.IDot1dUserPriorityRegenEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1dUserPriorityRegenTable
    extends DeviceEntity
    implements Serializable, IDot1dUserPriorityRegenTable, ITableAccess<IDot1dUserPriorityRegenEntry>
{

    private Map<String, IDot1dUserPriorityRegenEntry> dot1dUserPriorityRegenEntry = new TreeMap<String, IDot1dUserPriorityRegenEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dUserPriorityRegenTable() {
    }

    public Map<String, IDot1dUserPriorityRegenEntry> getDot1dUserPriorityRegenEntry() {
        return this.dot1dUserPriorityRegenEntry;
    }

    public IDot1dUserPriorityRegenEntry getEntry(String key) {
        return dot1dUserPriorityRegenEntry.get(key);
    }

    public void setEntry(String key, IDot1dUserPriorityRegenEntry value) {
        dot1dUserPriorityRegenEntry.put(key, value);
        ((Dot1dUserPriorityRegenEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1dUserPriorityRegenEntry> getEntries() {
        return dot1dUserPriorityRegenEntry;
    }

    public Dot1dUserPriorityRegenEntry createEntry(String entryIndex) {
        Dot1dUserPriorityRegenEntry newEntry = new Dot1dUserPriorityRegenEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.6.1.2.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dUserPriorityRegenEntry", dot1dUserPriorityRegenEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dUserPriorityRegenEntry).toHashCode();
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
        Dot1dUserPriorityRegenTable rhs = ((Dot1dUserPriorityRegenTable) obj);
        return new EqualsBuilder().append(dot1dUserPriorityRegenEntry, rhs.dot1dUserPriorityRegenEntry).isEquals();
    }

    public Dot1dUserPriorityRegenTable clone() {
        Dot1dUserPriorityRegenTable _copy = new Dot1dUserPriorityRegenTable();
        for (Map.Entry<String, IDot1dUserPriorityRegenEntry> _entry: dot1dUserPriorityRegenEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.6.1.2.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dUserPriorityRegenEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
