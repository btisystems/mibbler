
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.dot1qstaticunicasttable.Dot1qStaticUnicastEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.IDot1qStaticUnicastTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.dot1qstaticunicasttable.IDot1qStaticUnicastEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1qStaticUnicastTable
    extends DeviceEntity
    implements Serializable, IDot1qStaticUnicastTable, ITableAccess<IDot1qStaticUnicastEntry>
{

    private Map<String, IDot1qStaticUnicastEntry> dot1qStaticUnicastEntry = new TreeMap<String, IDot1qStaticUnicastEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qStaticUnicastTable() {
    }

    public Map<String, IDot1qStaticUnicastEntry> getDot1qStaticUnicastEntry() {
        return this.dot1qStaticUnicastEntry;
    }

    public IDot1qStaticUnicastEntry getEntry(String key) {
        return dot1qStaticUnicastEntry.get(key);
    }

    public void setEntry(String key, IDot1qStaticUnicastEntry value) {
        dot1qStaticUnicastEntry.put(key, value);
        ((Dot1qStaticUnicastEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1qStaticUnicastEntry> getEntries() {
        return dot1qStaticUnicastEntry;
    }

    public Dot1qStaticUnicastEntry createEntry(String entryIndex) {
        Dot1qStaticUnicastEntry newEntry = new Dot1qStaticUnicastEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.7.1.3.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qStaticUnicastEntry", dot1qStaticUnicastEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qStaticUnicastEntry).toHashCode();
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
        Dot1qStaticUnicastTable rhs = ((Dot1qStaticUnicastTable) obj);
        return new EqualsBuilder().append(dot1qStaticUnicastEntry, rhs.dot1qStaticUnicastEntry).isEquals();
    }

    public Dot1qStaticUnicastTable clone() {
        Dot1qStaticUnicastTable _copy = new Dot1qStaticUnicastTable();
        for (Map.Entry<String, IDot1qStaticUnicastEntry> _entry: dot1qStaticUnicastEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qStaticUnicastEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
