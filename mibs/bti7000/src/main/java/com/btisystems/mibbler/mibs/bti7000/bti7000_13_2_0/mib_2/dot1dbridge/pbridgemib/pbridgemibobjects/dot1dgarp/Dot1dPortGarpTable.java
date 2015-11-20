
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgarp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgarp.dot1dportgarptable.Dot1dPortGarpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgarp.IDot1dPortGarpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgarp.dot1dportgarptable.IDot1dPortGarpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1dPortGarpTable
    extends DeviceEntity
    implements Serializable, IDot1dPortGarpTable, ITableAccess<IDot1dPortGarpEntry>
{

    private Map<String, IDot1dPortGarpEntry> dot1dPortGarpEntry = new TreeMap<String, IDot1dPortGarpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dPortGarpTable() {
    }

    public Map<String, IDot1dPortGarpEntry> getDot1dPortGarpEntry() {
        return this.dot1dPortGarpEntry;
    }

    public IDot1dPortGarpEntry getEntry(String key) {
        return dot1dPortGarpEntry.get(key);
    }

    public void setEntry(String key, IDot1dPortGarpEntry value) {
        dot1dPortGarpEntry.put(key, value);
        ((Dot1dPortGarpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1dPortGarpEntry> getEntries() {
        return dot1dPortGarpEntry;
    }

    public Dot1dPortGarpEntry createEntry(String entryIndex) {
        Dot1dPortGarpEntry newEntry = new Dot1dPortGarpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.6.1.3.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dPortGarpEntry", dot1dPortGarpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dPortGarpEntry).toHashCode();
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
        Dot1dPortGarpTable rhs = ((Dot1dPortGarpTable) obj);
        return new EqualsBuilder().append(dot1dPortGarpEntry, rhs.dot1dPortGarpEntry).isEquals();
    }

    public Dot1dPortGarpTable clone() {
        Dot1dPortGarpTable _copy = new Dot1dPortGarpTable();
        for (Map.Entry<String, IDot1dPortGarpEntry> _entry: dot1dPortGarpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.6.1.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dPortGarpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
