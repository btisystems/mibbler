
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.IDot3ControlTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3controltable.IDot3ControlEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.dot3controltable.Dot3ControlEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot3ControlTable
    extends DeviceEntity
    implements Serializable, IDot3ControlTable, ITableAccess<IDot3ControlEntry>
{

    private Map<String, IDot3ControlEntry> dot3ControlEntry = new TreeMap<String, IDot3ControlEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot3ControlTable() {
    }

    public Map<String, IDot3ControlEntry> getDot3ControlEntry() {
        return this.dot3ControlEntry;
    }

    public IDot3ControlEntry getEntry(String key) {
        return dot3ControlEntry.get(key);
    }

    public void setEntry(String key, IDot3ControlEntry value) {
        dot3ControlEntry.put(key, value);
        ((Dot3ControlEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot3ControlEntry> getEntries() {
        return dot3ControlEntry;
    }

    public Dot3ControlEntry createEntry(String entryIndex) {
        Dot3ControlEntry newEntry = new Dot3ControlEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.10.7.9.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot3ControlEntry", dot3ControlEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot3ControlEntry).toHashCode();
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
        Dot3ControlTable rhs = ((Dot3ControlTable) obj);
        return new EqualsBuilder().append(dot3ControlEntry, rhs.dot3ControlEntry).isEquals();
    }

    public Dot3ControlTable clone() {
        Dot3ControlTable _copy = new Dot3ControlTable();
        for (Map.Entry<String, IDot3ControlEntry> _entry: dot3ControlEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.10.7.9"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot3ControlEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
