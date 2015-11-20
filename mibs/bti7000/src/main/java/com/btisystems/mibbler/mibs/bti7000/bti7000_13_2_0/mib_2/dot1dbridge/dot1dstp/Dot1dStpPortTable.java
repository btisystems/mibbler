
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.dot1dstp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.dot1dstp.dot1dstpporttable.Dot1dStpPortEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dstp.IDot1dStpPortTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dstp.dot1dstpporttable.IDot1dStpPortEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1dStpPortTable
    extends DeviceEntity
    implements Serializable, IDot1dStpPortTable, ITableAccess<IDot1dStpPortEntry>
{

    private Map<String, IDot1dStpPortEntry> dot1dStpPortEntry = new TreeMap<String, IDot1dStpPortEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dStpPortTable() {
    }

    public Map<String, IDot1dStpPortEntry> getDot1dStpPortEntry() {
        return this.dot1dStpPortEntry;
    }

    public IDot1dStpPortEntry getEntry(String key) {
        return dot1dStpPortEntry.get(key);
    }

    public void setEntry(String key, IDot1dStpPortEntry value) {
        dot1dStpPortEntry.put(key, value);
        ((Dot1dStpPortEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1dStpPortEntry> getEntries() {
        return dot1dStpPortEntry;
    }

    public Dot1dStpPortEntry createEntry(String entryIndex) {
        Dot1dStpPortEntry newEntry = new Dot1dStpPortEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.2.15.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dStpPortEntry", dot1dStpPortEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dStpPortEntry).toHashCode();
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
        Dot1dStpPortTable rhs = ((Dot1dStpPortTable) obj);
        return new EqualsBuilder().append(dot1dStpPortEntry, rhs.dot1dStpPortEntry).isEquals();
    }

    public Dot1dStpPortTable clone() {
        Dot1dStpPortTable _copy = new Dot1dStpPortTable();
        for (Map.Entry<String, IDot1dStpPortEntry> _entry: dot1dStpPortEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.2.15"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dStpPortEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
