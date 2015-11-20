
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.IHrProcessorTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrprocessortable.IHrProcessorEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.hrprocessortable.HrProcessorEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HrProcessorTable
    extends DeviceEntity
    implements Serializable, IHrProcessorTable, ITableAccess<IHrProcessorEntry>
{

    private Map<String, IHrProcessorEntry> hrProcessorEntry = new TreeMap<String, IHrProcessorEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrProcessorTable() {
    }

    public Map<String, IHrProcessorEntry> getHrProcessorEntry() {
        return this.hrProcessorEntry;
    }

    public IHrProcessorEntry getEntry(String key) {
        return hrProcessorEntry.get(key);
    }

    public void setEntry(String key, IHrProcessorEntry value) {
        hrProcessorEntry.put(key, value);
        ((HrProcessorEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHrProcessorEntry> getEntries() {
        return hrProcessorEntry;
    }

    public HrProcessorEntry createEntry(String entryIndex) {
        HrProcessorEntry newEntry = new HrProcessorEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.25.3.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrProcessorEntry", hrProcessorEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrProcessorEntry).toHashCode();
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
        HrProcessorTable rhs = ((HrProcessorTable) obj);
        return new EqualsBuilder().append(hrProcessorEntry, rhs.hrProcessorEntry).isEquals();
    }

    public HrProcessorTable clone() {
        HrProcessorTable _copy = new HrProcessorTable();
        for (Map.Entry<String, IHrProcessorEntry> _entry: hrProcessorEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.3.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrProcessorEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
