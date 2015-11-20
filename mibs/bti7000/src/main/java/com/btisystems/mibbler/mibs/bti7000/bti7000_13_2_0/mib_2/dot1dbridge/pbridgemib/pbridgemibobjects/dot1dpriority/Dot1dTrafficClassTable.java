
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dtrafficclasstable.Dot1dTrafficClassEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.IDot1dTrafficClassTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dtrafficclasstable.IDot1dTrafficClassEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1dTrafficClassTable
    extends DeviceEntity
    implements Serializable, IDot1dTrafficClassTable, ITableAccess<IDot1dTrafficClassEntry>
{

    private Map<String, IDot1dTrafficClassEntry> dot1dTrafficClassEntry = new TreeMap<String, IDot1dTrafficClassEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dTrafficClassTable() {
    }

    public Map<String, IDot1dTrafficClassEntry> getDot1dTrafficClassEntry() {
        return this.dot1dTrafficClassEntry;
    }

    public IDot1dTrafficClassEntry getEntry(String key) {
        return dot1dTrafficClassEntry.get(key);
    }

    public void setEntry(String key, IDot1dTrafficClassEntry value) {
        dot1dTrafficClassEntry.put(key, value);
        ((Dot1dTrafficClassEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1dTrafficClassEntry> getEntries() {
        return dot1dTrafficClassEntry;
    }

    public Dot1dTrafficClassEntry createEntry(String entryIndex) {
        Dot1dTrafficClassEntry newEntry = new Dot1dTrafficClassEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.6.1.2.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dTrafficClassEntry", dot1dTrafficClassEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dTrafficClassEntry).toHashCode();
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
        Dot1dTrafficClassTable rhs = ((Dot1dTrafficClassTable) obj);
        return new EqualsBuilder().append(dot1dTrafficClassEntry, rhs.dot1dTrafficClassEntry).isEquals();
    }

    public Dot1dTrafficClassTable clone() {
        Dot1dTrafficClassTable _copy = new Dot1dTrafficClassTable();
        for (Map.Entry<String, IDot1dTrafficClassEntry> _entry: dot1dTrafficClassEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.6.1.2.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dTrafficClassEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
