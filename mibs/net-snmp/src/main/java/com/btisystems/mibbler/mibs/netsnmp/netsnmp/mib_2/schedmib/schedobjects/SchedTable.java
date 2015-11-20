
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.schedmib.schedobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.schedmib.schedobjects.ISchedTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.schedmib.schedobjects.schedtable.ISchedEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.schedmib.schedobjects.schedtable.SchedEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SchedTable
    extends DeviceEntity
    implements Serializable, ISchedTable, ITableAccess<ISchedEntry>
{

    private Map<String, ISchedEntry> schedEntry = new TreeMap<String, ISchedEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SchedTable() {
    }

    public Map<String, ISchedEntry> getSchedEntry() {
        return this.schedEntry;
    }

    public ISchedEntry getEntry(String key) {
        return schedEntry.get(key);
    }

    public void setEntry(String key, ISchedEntry value) {
        schedEntry.put(key, value);
        ((SchedEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISchedEntry> getEntries() {
        return schedEntry;
    }

    public SchedEntry createEntry(String entryIndex) {
        SchedEntry newEntry = new SchedEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.63.1.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("schedEntry", schedEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(schedEntry).toHashCode();
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
        SchedTable rhs = ((SchedTable) obj);
        return new EqualsBuilder().append(schedEntry, rhs.schedEntry).isEquals();
    }

    public SchedTable clone() {
        SchedTable _copy = new SchedTable();
        for (Map.Entry<String, ISchedEntry> _entry: schedEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.63.1.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "schedEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
