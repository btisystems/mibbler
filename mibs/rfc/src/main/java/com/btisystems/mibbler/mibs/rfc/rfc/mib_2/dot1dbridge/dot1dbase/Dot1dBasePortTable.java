
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dbase;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dbase.IDot1dBasePortTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dbase.dot1dbaseporttable.IDot1dBasePortEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dbase.dot1dbaseporttable.Dot1dBasePortEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1dBasePortTable
    extends DeviceEntity
    implements Serializable, IDot1dBasePortTable, ITableAccess<IDot1dBasePortEntry>
{

    private Map<String, IDot1dBasePortEntry> dot1dBasePortEntry = new TreeMap<String, IDot1dBasePortEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dBasePortTable() {
    }

    public Map<String, IDot1dBasePortEntry> getDot1dBasePortEntry() {
        return this.dot1dBasePortEntry;
    }

    public IDot1dBasePortEntry getEntry(String key) {
        return dot1dBasePortEntry.get(key);
    }

    public void setEntry(String key, IDot1dBasePortEntry value) {
        dot1dBasePortEntry.put(key, value);
        ((Dot1dBasePortEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1dBasePortEntry> getEntries() {
        return dot1dBasePortEntry;
    }

    public Dot1dBasePortEntry createEntry(String entryIndex) {
        Dot1dBasePortEntry newEntry = new Dot1dBasePortEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.1.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dBasePortEntry", dot1dBasePortEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dBasePortEntry).toHashCode();
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
        Dot1dBasePortTable rhs = ((Dot1dBasePortTable) obj);
        return new EqualsBuilder().append(dot1dBasePortEntry, rhs.dot1dBasePortEntry).isEquals();
    }

    public Dot1dBasePortTable clone() {
        Dot1dBasePortTable _copy = new Dot1dBasePortTable();
        for (Map.Entry<String, IDot1dBasePortEntry> _entry: dot1dBasePortEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.1.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dBasePortEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
