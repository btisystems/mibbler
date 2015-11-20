
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.interfaces;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.interfaces.IIfTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.interfaces.iftable.IIfEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.interfaces.iftable.IfEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IfTable
    extends DeviceEntity
    implements Serializable, IIfTable, ITableAccess<IIfEntry>
{

    private Map<String, IIfEntry> ifEntry = new TreeMap<String, IIfEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IfTable() {
    }

    public Map<String, IIfEntry> getIfEntry() {
        return this.ifEntry;
    }

    public IIfEntry getEntry(String key) {
        return ifEntry.get(key);
    }

    public void setEntry(String key, IIfEntry value) {
        ifEntry.put(key, value);
        ((IfEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIfEntry> getEntries() {
        return ifEntry;
    }

    public IfEntry createEntry(String entryIndex) {
        IfEntry newEntry = new IfEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.2.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ifEntry", ifEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ifEntry).toHashCode();
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
        IfTable rhs = ((IfTable) obj);
        return new EqualsBuilder().append(ifEntry, rhs.ifEntry).isEquals();
    }

    public IfTable clone() {
        IfTable _copy = new IfTable();
        for (Map.Entry<String, IIfEntry> _entry: ifEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.2.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ifEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
