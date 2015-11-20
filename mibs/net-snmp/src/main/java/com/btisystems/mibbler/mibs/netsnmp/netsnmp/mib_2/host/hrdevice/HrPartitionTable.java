
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.IHrPartitionTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrpartitiontable.IHrPartitionEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.hrpartitiontable.HrPartitionEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HrPartitionTable
    extends DeviceEntity
    implements Serializable, IHrPartitionTable, ITableAccess<IHrPartitionEntry>
{

    private Map<String, IHrPartitionEntry> hrPartitionEntry = new TreeMap<String, IHrPartitionEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrPartitionTable() {
    }

    public Map<String, IHrPartitionEntry> getHrPartitionEntry() {
        return this.hrPartitionEntry;
    }

    public IHrPartitionEntry getEntry(String key) {
        return hrPartitionEntry.get(key);
    }

    public void setEntry(String key, IHrPartitionEntry value) {
        hrPartitionEntry.put(key, value);
        ((HrPartitionEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHrPartitionEntry> getEntries() {
        return hrPartitionEntry;
    }

    public HrPartitionEntry createEntry(String entryIndex) {
        HrPartitionEntry newEntry = new HrPartitionEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.25.3.7.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrPartitionEntry", hrPartitionEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrPartitionEntry).toHashCode();
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
        HrPartitionTable rhs = ((HrPartitionTable) obj);
        return new EqualsBuilder().append(hrPartitionEntry, rhs.hrPartitionEntry).isEquals();
    }

    public HrPartitionTable clone() {
        HrPartitionTable _copy = new HrPartitionTable();
        for (Map.Entry<String, IHrPartitionEntry> _entry: hrPartitionEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.3.7"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrPartitionEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
