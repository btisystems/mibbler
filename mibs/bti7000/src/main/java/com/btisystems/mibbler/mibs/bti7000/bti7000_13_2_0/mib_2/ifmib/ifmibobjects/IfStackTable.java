
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.ifmib.ifmibobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.ifmib.ifmibobjects.ifstacktable.IfStackEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ifmib.ifmibobjects.IIfStackTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ifmib.ifmibobjects.ifstacktable.IIfStackEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IfStackTable
    extends DeviceEntity
    implements Serializable, IIfStackTable, ITableAccess<IIfStackEntry>
{

    private Map<String, IIfStackEntry> ifStackEntry = new TreeMap<String, IIfStackEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IfStackTable() {
    }

    public Map<String, IIfStackEntry> getIfStackEntry() {
        return this.ifStackEntry;
    }

    public IIfStackEntry getEntry(String key) {
        return ifStackEntry.get(key);
    }

    public void setEntry(String key, IIfStackEntry value) {
        ifStackEntry.put(key, value);
        ((IfStackEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIfStackEntry> getEntries() {
        return ifStackEntry;
    }

    public IfStackEntry createEntry(String entryIndex) {
        IfStackEntry newEntry = new IfStackEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.31.1.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ifStackEntry", ifStackEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ifStackEntry).toHashCode();
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
        IfStackTable rhs = ((IfStackTable) obj);
        return new EqualsBuilder().append(ifStackEntry, rhs.ifStackEntry).isEquals();
    }

    public IfStackTable clone() {
        IfStackTable _copy = new IfStackTable();
        for (Map.Entry<String, IIfStackEntry> _entry: ifStackEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.31.1.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ifStackEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
