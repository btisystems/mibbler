
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qlearningconstraintstable.Dot1qLearningConstraintsEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.IDot1qLearningConstraintsTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qlearningconstraintstable.IDot1qLearningConstraintsEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1qLearningConstraintsTable
    extends DeviceEntity
    implements Serializable, IDot1qLearningConstraintsTable, ITableAccess<IDot1qLearningConstraintsEntry>
{

    private Map<String, IDot1qLearningConstraintsEntry> dot1qLearningConstraintsEntry = new TreeMap<String, IDot1qLearningConstraintsEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qLearningConstraintsTable() {
    }

    public Map<String, IDot1qLearningConstraintsEntry> getDot1qLearningConstraintsEntry() {
        return this.dot1qLearningConstraintsEntry;
    }

    public IDot1qLearningConstraintsEntry getEntry(String key) {
        return dot1qLearningConstraintsEntry.get(key);
    }

    public void setEntry(String key, IDot1qLearningConstraintsEntry value) {
        dot1qLearningConstraintsEntry.put(key, value);
        ((Dot1qLearningConstraintsEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1qLearningConstraintsEntry> getEntries() {
        return dot1qLearningConstraintsEntry;
    }

    public Dot1qLearningConstraintsEntry createEntry(String entryIndex) {
        Dot1qLearningConstraintsEntry newEntry = new Dot1qLearningConstraintsEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.7.1.4.8.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qLearningConstraintsEntry", dot1qLearningConstraintsEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qLearningConstraintsEntry).toHashCode();
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
        Dot1qLearningConstraintsTable rhs = ((Dot1qLearningConstraintsTable) obj);
        return new EqualsBuilder().append(dot1qLearningConstraintsEntry, rhs.dot1qLearningConstraintsEntry).isEquals();
    }

    public Dot1qLearningConstraintsTable clone() {
        Dot1qLearningConstraintsTable _copy = new Dot1qLearningConstraintsTable();
        for (Map.Entry<String, IDot1qLearningConstraintsEntry> _entry: dot1qLearningConstraintsEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.4.8"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qLearningConstraintsEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
