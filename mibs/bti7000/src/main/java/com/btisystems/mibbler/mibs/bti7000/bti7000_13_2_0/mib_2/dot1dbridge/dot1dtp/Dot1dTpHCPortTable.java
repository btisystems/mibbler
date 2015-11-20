
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.dot1dtp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.dot1dtp.dot1dtphcporttable.Dot1dTpHCPortEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dtp.IDot1dTpHCPortTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dtp.dot1dtphcporttable.IDot1dTpHCPortEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1dTpHCPortTable
    extends DeviceEntity
    implements Serializable, IDot1dTpHCPortTable, ITableAccess<IDot1dTpHCPortEntry>
{

    private Map<String, IDot1dTpHCPortEntry> dot1dTpHCPortEntry = new TreeMap<String, IDot1dTpHCPortEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dTpHCPortTable() {
    }

    public Map<String, IDot1dTpHCPortEntry> getDot1dTpHCPortEntry() {
        return this.dot1dTpHCPortEntry;
    }

    public IDot1dTpHCPortEntry getEntry(String key) {
        return dot1dTpHCPortEntry.get(key);
    }

    public void setEntry(String key, IDot1dTpHCPortEntry value) {
        dot1dTpHCPortEntry.put(key, value);
        ((Dot1dTpHCPortEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1dTpHCPortEntry> getEntries() {
        return dot1dTpHCPortEntry;
    }

    public Dot1dTpHCPortEntry createEntry(String entryIndex) {
        Dot1dTpHCPortEntry newEntry = new Dot1dTpHCPortEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.4.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dTpHCPortEntry", dot1dTpHCPortEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dTpHCPortEntry).toHashCode();
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
        Dot1dTpHCPortTable rhs = ((Dot1dTpHCPortTable) obj);
        return new EqualsBuilder().append(dot1dTpHCPortEntry, rhs.dot1dTpHCPortEntry).isEquals();
    }

    public Dot1dTpHCPortTable clone() {
        Dot1dTpHCPortTable _copy = new Dot1dTpHCPortTable();
        for (Map.Entry<String, IDot1dTpHCPortEntry> _entry: dot1dTpHCPortEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.4.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dTpHCPortEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
