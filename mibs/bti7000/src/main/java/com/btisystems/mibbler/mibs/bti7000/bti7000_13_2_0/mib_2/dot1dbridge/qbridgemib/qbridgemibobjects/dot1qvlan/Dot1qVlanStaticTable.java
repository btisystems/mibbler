
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qvlanstatictable.Dot1qVlanStaticEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.IDot1qVlanStaticTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qvlanstatictable.IDot1qVlanStaticEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1qVlanStaticTable
    extends DeviceEntity
    implements Serializable, IDot1qVlanStaticTable, ITableAccess<IDot1qVlanStaticEntry>
{

    private Map<String, IDot1qVlanStaticEntry> dot1qVlanStaticEntry = new TreeMap<String, IDot1qVlanStaticEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qVlanStaticTable() {
    }

    public Map<String, IDot1qVlanStaticEntry> getDot1qVlanStaticEntry() {
        return this.dot1qVlanStaticEntry;
    }

    public IDot1qVlanStaticEntry getEntry(String key) {
        return dot1qVlanStaticEntry.get(key);
    }

    public void setEntry(String key, IDot1qVlanStaticEntry value) {
        dot1qVlanStaticEntry.put(key, value);
        ((Dot1qVlanStaticEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1qVlanStaticEntry> getEntries() {
        return dot1qVlanStaticEntry;
    }

    public Dot1qVlanStaticEntry createEntry(String entryIndex) {
        Dot1qVlanStaticEntry newEntry = new Dot1qVlanStaticEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.7.1.4.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qVlanStaticEntry", dot1qVlanStaticEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qVlanStaticEntry).toHashCode();
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
        Dot1qVlanStaticTable rhs = ((Dot1qVlanStaticTable) obj);
        return new EqualsBuilder().append(dot1qVlanStaticEntry, rhs.dot1qVlanStaticEntry).isEquals();
    }

    public Dot1qVlanStaticTable clone() {
        Dot1qVlanStaticTable _copy = new Dot1qVlanStaticTable();
        for (Map.Entry<String, IDot1qVlanStaticEntry> _entry: dot1qVlanStaticEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.4.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qVlanStaticEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
