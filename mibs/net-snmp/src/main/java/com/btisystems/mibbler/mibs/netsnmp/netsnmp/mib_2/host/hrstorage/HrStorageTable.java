
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrstorage;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrstorage.IHrStorageTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrstorage.hrstoragetable.IHrStorageEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrstorage.hrstoragetable.HrStorageEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HrStorageTable
    extends DeviceEntity
    implements Serializable, IHrStorageTable, ITableAccess<IHrStorageEntry>
{

    private Map<String, IHrStorageEntry> hrStorageEntry = new TreeMap<String, IHrStorageEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrStorageTable() {
    }

    public Map<String, IHrStorageEntry> getHrStorageEntry() {
        return this.hrStorageEntry;
    }

    public IHrStorageEntry getEntry(String key) {
        return hrStorageEntry.get(key);
    }

    public void setEntry(String key, IHrStorageEntry value) {
        hrStorageEntry.put(key, value);
        ((HrStorageEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHrStorageEntry> getEntries() {
        return hrStorageEntry;
    }

    public HrStorageEntry createEntry(String entryIndex) {
        HrStorageEntry newEntry = new HrStorageEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.25.2.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrStorageEntry", hrStorageEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrStorageEntry).toHashCode();
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
        HrStorageTable rhs = ((HrStorageTable) obj);
        return new EqualsBuilder().append(hrStorageEntry, rhs.hrStorageEntry).isEquals();
    }

    public HrStorageTable clone() {
        HrStorageTable _copy = new HrStorageTable();
        for (Map.Entry<String, IHrStorageEntry> _entry: hrStorageEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.2.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrStorageEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
