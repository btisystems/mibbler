
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrswrun;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswrun.IHrSWRunTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswrun.hrswruntable.IHrSWRunEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrswrun.hrswruntable.HrSWRunEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HrSWRunTable
    extends DeviceEntity
    implements Serializable, IHrSWRunTable, ITableAccess<IHrSWRunEntry>
{

    private Map<String, IHrSWRunEntry> hrSWRunEntry = new TreeMap<String, IHrSWRunEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrSWRunTable() {
    }

    public Map<String, IHrSWRunEntry> getHrSWRunEntry() {
        return this.hrSWRunEntry;
    }

    public IHrSWRunEntry getEntry(String key) {
        return hrSWRunEntry.get(key);
    }

    public void setEntry(String key, IHrSWRunEntry value) {
        hrSWRunEntry.put(key, value);
        ((HrSWRunEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHrSWRunEntry> getEntries() {
        return hrSWRunEntry;
    }

    public HrSWRunEntry createEntry(String entryIndex) {
        HrSWRunEntry newEntry = new HrSWRunEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.25.4.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrSWRunEntry", hrSWRunEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrSWRunEntry).toHashCode();
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
        HrSWRunTable rhs = ((HrSWRunTable) obj);
        return new EqualsBuilder().append(hrSWRunEntry, rhs.hrSWRunEntry).isEquals();
    }

    public HrSWRunTable clone() {
        HrSWRunTable _copy = new HrSWRunTable();
        for (Map.Entry<String, IHrSWRunEntry> _entry: hrSWRunEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.4.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrSWRunEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
