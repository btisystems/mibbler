
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.at;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.at.attable.AtEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.at.IAtTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.at.attable.IAtEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class AtTable
    extends DeviceEntity
    implements Serializable, IAtTable, ITableAccess<IAtEntry>
{

    private Map<String, IAtEntry> atEntry = new TreeMap<String, IAtEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AtTable() {
    }

    public Map<String, IAtEntry> getAtEntry() {
        return this.atEntry;
    }

    public IAtEntry getEntry(String key) {
        return atEntry.get(key);
    }

    public void setEntry(String key, IAtEntry value) {
        atEntry.put(key, value);
        ((AtEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IAtEntry> getEntries() {
        return atEntry;
    }

    public AtEntry createEntry(String entryIndex) {
        AtEntry newEntry = new AtEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.3.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("atEntry", atEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(atEntry).toHashCode();
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
        AtTable rhs = ((AtTable) obj);
        return new EqualsBuilder().append(atEntry, rhs.atEntry).isEquals();
    }

    public AtTable clone() {
        AtTable _copy = new AtTable();
        for (Map.Entry<String, IAtEntry> _entry: atEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "atEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
