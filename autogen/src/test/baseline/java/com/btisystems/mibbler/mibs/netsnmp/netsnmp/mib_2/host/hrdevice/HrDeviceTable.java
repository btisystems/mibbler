
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.IHrDeviceTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrdevicetable.IHrDeviceEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.hrdevicetable.HrDeviceEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HrDeviceTable
    extends DeviceEntity
    implements Serializable, IHrDeviceTable, ITableAccess<IHrDeviceEntry>
{

    private Map<String, IHrDeviceEntry> hrDeviceEntry = new TreeMap<String, IHrDeviceEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrDeviceTable() {
    }

    public Map<String, IHrDeviceEntry> getHrDeviceEntry() {
        return this.hrDeviceEntry;
    }

    public IHrDeviceEntry getEntry(String key) {
        return hrDeviceEntry.get(key);
    }

    public void setEntry(String key, IHrDeviceEntry value) {
        hrDeviceEntry.put(key, value);
        ((HrDeviceEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHrDeviceEntry> getEntries() {
        return hrDeviceEntry;
    }

    public HrDeviceEntry createEntry(String entryIndex) {
        HrDeviceEntry newEntry = new HrDeviceEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.25.3.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrDeviceEntry", hrDeviceEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrDeviceEntry).toHashCode();
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
        HrDeviceTable rhs = ((HrDeviceTable) obj);
        return new EqualsBuilder().append(hrDeviceEntry, rhs.hrDeviceEntry).isEquals();
    }

    public HrDeviceTable clone() {
        HrDeviceTable _copy = new HrDeviceTable();
        for (Map.Entry<String, IHrDeviceEntry> _entry: hrDeviceEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.3.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrDeviceEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
