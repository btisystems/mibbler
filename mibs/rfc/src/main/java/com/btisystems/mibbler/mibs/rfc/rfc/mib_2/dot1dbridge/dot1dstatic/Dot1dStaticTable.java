
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dstatic;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dstatic.IDot1dStaticTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dstatic.dot1dstatictable.IDot1dStaticEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dstatic.dot1dstatictable.Dot1dStaticEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1dStaticTable
    extends DeviceEntity
    implements Serializable, IDot1dStaticTable, ITableAccess<IDot1dStaticEntry>
{

    private Map<String, IDot1dStaticEntry> dot1dStaticEntry = new TreeMap<String, IDot1dStaticEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dStaticTable() {
    }

    public Map<String, IDot1dStaticEntry> getDot1dStaticEntry() {
        return this.dot1dStaticEntry;
    }

    public IDot1dStaticEntry getEntry(String key) {
        return dot1dStaticEntry.get(key);
    }

    public void setEntry(String key, IDot1dStaticEntry value) {
        dot1dStaticEntry.put(key, value);
        ((Dot1dStaticEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1dStaticEntry> getEntries() {
        return dot1dStaticEntry;
    }

    public Dot1dStaticEntry createEntry(String entryIndex) {
        Dot1dStaticEntry newEntry = new Dot1dStaticEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.5.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dStaticEntry", dot1dStaticEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dStaticEntry).toHashCode();
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
        Dot1dStaticTable rhs = ((Dot1dStaticTable) obj);
        return new EqualsBuilder().append(dot1dStaticEntry, rhs.dot1dStaticEntry).isEquals();
    }

    public Dot1dStaticTable clone() {
        Dot1dStaticTable _copy = new Dot1dStaticTable();
        for (Map.Entry<String, IDot1dStaticEntry> _entry: dot1dStaticEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dStaticEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
