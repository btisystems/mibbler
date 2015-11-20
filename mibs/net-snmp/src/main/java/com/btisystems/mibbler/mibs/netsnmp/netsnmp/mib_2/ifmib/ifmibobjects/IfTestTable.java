
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifmib.ifmibobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifmib.ifmibobjects.IIfTestTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifmib.ifmibobjects.iftesttable.IIfTestEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifmib.ifmibobjects.iftesttable.IfTestEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IfTestTable
    extends DeviceEntity
    implements Serializable, IIfTestTable, ITableAccess<IIfTestEntry>
{

    private Map<String, IIfTestEntry> ifTestEntry = new TreeMap<String, IIfTestEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IfTestTable() {
    }

    public Map<String, IIfTestEntry> getIfTestEntry() {
        return this.ifTestEntry;
    }

    public IIfTestEntry getEntry(String key) {
        return ifTestEntry.get(key);
    }

    public void setEntry(String key, IIfTestEntry value) {
        ifTestEntry.put(key, value);
        ((IfTestEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIfTestEntry> getEntries() {
        return ifTestEntry;
    }

    public IfTestEntry createEntry(String entryIndex) {
        IfTestEntry newEntry = new IfTestEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.31.1.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ifTestEntry", ifTestEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ifTestEntry).toHashCode();
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
        IfTestTable rhs = ((IfTestTable) obj);
        return new EqualsBuilder().append(ifTestEntry, rhs.ifTestEntry).isEquals();
    }

    public IfTestTable clone() {
        IfTestTable _copy = new IfTestTable();
        for (Map.Entry<String, IIfTestEntry> _entry: ifTestEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.31.1.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ifTestEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
