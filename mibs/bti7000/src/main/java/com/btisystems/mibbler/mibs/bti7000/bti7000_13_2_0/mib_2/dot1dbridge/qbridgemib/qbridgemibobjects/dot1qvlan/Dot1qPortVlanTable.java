
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlantable.Dot1qPortVlanEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.IDot1qPortVlanTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlantable.IDot1qPortVlanEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1qPortVlanTable
    extends DeviceEntity
    implements Serializable, IDot1qPortVlanTable, ITableAccess<IDot1qPortVlanEntry>
{

    private Map<String, IDot1qPortVlanEntry> dot1qPortVlanEntry = new TreeMap<String, IDot1qPortVlanEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qPortVlanTable() {
    }

    public Map<String, IDot1qPortVlanEntry> getDot1qPortVlanEntry() {
        return this.dot1qPortVlanEntry;
    }

    public IDot1qPortVlanEntry getEntry(String key) {
        return dot1qPortVlanEntry.get(key);
    }

    public void setEntry(String key, IDot1qPortVlanEntry value) {
        dot1qPortVlanEntry.put(key, value);
        ((Dot1qPortVlanEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1qPortVlanEntry> getEntries() {
        return dot1qPortVlanEntry;
    }

    public Dot1qPortVlanEntry createEntry(String entryIndex) {
        Dot1qPortVlanEntry newEntry = new Dot1qPortVlanEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.7.1.4.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qPortVlanEntry", dot1qPortVlanEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qPortVlanEntry).toHashCode();
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
        Dot1qPortVlanTable rhs = ((Dot1qPortVlanTable) obj);
        return new EqualsBuilder().append(dot1qPortVlanEntry, rhs.dot1qPortVlanEntry).isEquals();
    }

    public Dot1qPortVlanTable clone() {
        Dot1qPortVlanTable _copy = new Dot1qPortVlanTable();
        for (Map.Entry<String, IDot1qPortVlanEntry> _entry: dot1qPortVlanEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.4.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qPortVlanEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
