
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.dot1dtp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.dot1dtp.dot1dtpporttable.Dot1dTpPortEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dtp.IDot1dTpPortTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dtp.dot1dtpporttable.IDot1dTpPortEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1dTpPortTable
    extends DeviceEntity
    implements Serializable, IDot1dTpPortTable, ITableAccess<IDot1dTpPortEntry>
{

    private Map<String, IDot1dTpPortEntry> dot1dTpPortEntry = new TreeMap<String, IDot1dTpPortEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dTpPortTable() {
    }

    public Map<String, IDot1dTpPortEntry> getDot1dTpPortEntry() {
        return this.dot1dTpPortEntry;
    }

    public IDot1dTpPortEntry getEntry(String key) {
        return dot1dTpPortEntry.get(key);
    }

    public void setEntry(String key, IDot1dTpPortEntry value) {
        dot1dTpPortEntry.put(key, value);
        ((Dot1dTpPortEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1dTpPortEntry> getEntries() {
        return dot1dTpPortEntry;
    }

    public Dot1dTpPortEntry createEntry(String entryIndex) {
        Dot1dTpPortEntry newEntry = new Dot1dTpPortEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.4.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dTpPortEntry", dot1dTpPortEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dTpPortEntry).toHashCode();
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
        Dot1dTpPortTable rhs = ((Dot1dTpPortTable) obj);
        return new EqualsBuilder().append(dot1dTpPortEntry, rhs.dot1dTpPortEntry).isEquals();
    }

    public Dot1dTpPortTable clone() {
        Dot1dTpPortTable _copy = new Dot1dTpPortTable();
        for (Map.Entry<String, IDot1dTpPortEntry> _entry: dot1dTpPortEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.4.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dTpPortEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
