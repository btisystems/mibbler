
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qvlancurrenttable.Dot1qVlanCurrentEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.IDot1qVlanCurrentTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qvlancurrenttable.IDot1qVlanCurrentEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1qVlanCurrentTable
    extends DeviceEntity
    implements Serializable, IDot1qVlanCurrentTable, ITableAccess<IDot1qVlanCurrentEntry>
{

    private Map<String, IDot1qVlanCurrentEntry> dot1qVlanCurrentEntry = new TreeMap<String, IDot1qVlanCurrentEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qVlanCurrentTable() {
    }

    public Map<String, IDot1qVlanCurrentEntry> getDot1qVlanCurrentEntry() {
        return this.dot1qVlanCurrentEntry;
    }

    public IDot1qVlanCurrentEntry getEntry(String key) {
        return dot1qVlanCurrentEntry.get(key);
    }

    public void setEntry(String key, IDot1qVlanCurrentEntry value) {
        dot1qVlanCurrentEntry.put(key, value);
        ((Dot1qVlanCurrentEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1qVlanCurrentEntry> getEntries() {
        return dot1qVlanCurrentEntry;
    }

    public Dot1qVlanCurrentEntry createEntry(String entryIndex) {
        Dot1qVlanCurrentEntry newEntry = new Dot1qVlanCurrentEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.7.1.4.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qVlanCurrentEntry", dot1qVlanCurrentEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qVlanCurrentEntry).toHashCode();
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
        Dot1qVlanCurrentTable rhs = ((Dot1qVlanCurrentTable) obj);
        return new EqualsBuilder().append(dot1qVlanCurrentEntry, rhs.dot1qVlanCurrentEntry).isEquals();
    }

    public Dot1qVlanCurrentTable clone() {
        Dot1qVlanCurrentTable _copy = new Dot1qVlanCurrentTable();
        for (Map.Entry<String, IDot1qVlanCurrentEntry> _entry: dot1qVlanCurrentEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.4.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qVlanCurrentEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
