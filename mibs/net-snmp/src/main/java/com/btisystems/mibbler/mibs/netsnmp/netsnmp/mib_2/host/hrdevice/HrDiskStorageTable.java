
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.IHrDiskStorageTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrdiskstoragetable.IHrDiskStorageEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.hrdiskstoragetable.HrDiskStorageEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HrDiskStorageTable
    extends DeviceEntity
    implements Serializable, IHrDiskStorageTable, ITableAccess<IHrDiskStorageEntry>
{

    private Map<String, IHrDiskStorageEntry> hrDiskStorageEntry = new TreeMap<String, IHrDiskStorageEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrDiskStorageTable() {
    }

    public Map<String, IHrDiskStorageEntry> getHrDiskStorageEntry() {
        return this.hrDiskStorageEntry;
    }

    public IHrDiskStorageEntry getEntry(String key) {
        return hrDiskStorageEntry.get(key);
    }

    public void setEntry(String key, IHrDiskStorageEntry value) {
        hrDiskStorageEntry.put(key, value);
        ((HrDiskStorageEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHrDiskStorageEntry> getEntries() {
        return hrDiskStorageEntry;
    }

    public HrDiskStorageEntry createEntry(String entryIndex) {
        HrDiskStorageEntry newEntry = new HrDiskStorageEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.25.3.6.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrDiskStorageEntry", hrDiskStorageEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrDiskStorageEntry).toHashCode();
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
        HrDiskStorageTable rhs = ((HrDiskStorageTable) obj);
        return new EqualsBuilder().append(hrDiskStorageEntry, rhs.hrDiskStorageEntry).isEquals();
    }

    public HrDiskStorageTable clone() {
        HrDiskStorageTable _copy = new HrDiskStorageTable();
        for (Map.Entry<String, IHrDiskStorageEntry> _entry: hrDiskStorageEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.3.6"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrDiskStorageEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
