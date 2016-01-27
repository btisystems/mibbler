
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.system;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.system.ISysORTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.system.sysortable.ISysOREntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.system.sysortable.SysOREntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SysORTable
    extends DeviceEntity
    implements Serializable, ISysORTable, ITableAccess<ISysOREntry>
{

    private Map<String, ISysOREntry> sysOREntry = new TreeMap<String, ISysOREntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SysORTable() {
    }

    public Map<String, ISysOREntry> getSysOREntry() {
        return this.sysOREntry;
    }

    public ISysOREntry getEntry(String key) {
        return sysOREntry.get(key);
    }

    public void setEntry(String key, ISysOREntry value) {
        sysOREntry.put(key, value);
        ((SysOREntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISysOREntry> getEntries() {
        return sysOREntry;
    }

    public SysOREntry createEntry(String entryIndex) {
        SysOREntry newEntry = new SysOREntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.1.9.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sysOREntry", sysOREntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sysOREntry).toHashCode();
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
        SysORTable rhs = ((SysORTable) obj);
        return new EqualsBuilder().append(sysOREntry, rhs.sysOREntry).isEquals();
    }

    public SysORTable clone() {
        SysORTable _copy = new SysORTable();
        for (Map.Entry<String, ISysOREntry> _entry: sysOREntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.1.9"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sysOREntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
