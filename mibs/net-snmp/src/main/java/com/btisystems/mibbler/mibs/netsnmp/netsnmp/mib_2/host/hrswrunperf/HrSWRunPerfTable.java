
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrswrunperf;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswrunperf.IHrSWRunPerfTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswrunperf.hrswrunperftable.IHrSWRunPerfEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrswrunperf.hrswrunperftable.HrSWRunPerfEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HrSWRunPerfTable
    extends DeviceEntity
    implements Serializable, IHrSWRunPerfTable, ITableAccess<IHrSWRunPerfEntry>
{

    private Map<String, IHrSWRunPerfEntry> hrSWRunPerfEntry = new TreeMap<String, IHrSWRunPerfEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrSWRunPerfTable() {
    }

    public Map<String, IHrSWRunPerfEntry> getHrSWRunPerfEntry() {
        return this.hrSWRunPerfEntry;
    }

    public IHrSWRunPerfEntry getEntry(String key) {
        return hrSWRunPerfEntry.get(key);
    }

    public void setEntry(String key, IHrSWRunPerfEntry value) {
        hrSWRunPerfEntry.put(key, value);
        ((HrSWRunPerfEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHrSWRunPerfEntry> getEntries() {
        return hrSWRunPerfEntry;
    }

    public HrSWRunPerfEntry createEntry(String entryIndex) {
        HrSWRunPerfEntry newEntry = new HrSWRunPerfEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.25.5.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrSWRunPerfEntry", hrSWRunPerfEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrSWRunPerfEntry).toHashCode();
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
        HrSWRunPerfTable rhs = ((HrSWRunPerfTable) obj);
        return new EqualsBuilder().append(hrSWRunPerfEntry, rhs.hrSWRunPerfEntry).isEquals();
    }

    public HrSWRunPerfTable clone() {
        HrSWRunPerfTable _copy = new HrSWRunPerfTable();
        for (Map.Entry<String, IHrSWRunPerfEntry> _entry: hrSWRunPerfEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrSWRunPerfEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
