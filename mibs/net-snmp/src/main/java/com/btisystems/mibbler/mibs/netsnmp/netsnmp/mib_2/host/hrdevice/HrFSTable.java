
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.IHrFSTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrfstable.IHrFSEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.hrfstable.HrFSEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HrFSTable
    extends DeviceEntity
    implements Serializable, IHrFSTable, ITableAccess<IHrFSEntry>
{

    private Map<String, IHrFSEntry> hrFSEntry = new TreeMap<String, IHrFSEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrFSTable() {
    }

    public Map<String, IHrFSEntry> getHrFSEntry() {
        return this.hrFSEntry;
    }

    public IHrFSEntry getEntry(String key) {
        return hrFSEntry.get(key);
    }

    public void setEntry(String key, IHrFSEntry value) {
        hrFSEntry.put(key, value);
        ((HrFSEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHrFSEntry> getEntries() {
        return hrFSEntry;
    }

    public HrFSEntry createEntry(String entryIndex) {
        HrFSEntry newEntry = new HrFSEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.25.3.8.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrFSEntry", hrFSEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrFSEntry).toHashCode();
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
        HrFSTable rhs = ((HrFSTable) obj);
        return new EqualsBuilder().append(hrFSEntry, rhs.hrFSEntry).isEquals();
    }

    public HrFSTable clone() {
        HrFSTable _copy = new HrFSTable();
        for (Map.Entry<String, IHrFSEntry> _entry: hrFSEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.3.8"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrFSEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
