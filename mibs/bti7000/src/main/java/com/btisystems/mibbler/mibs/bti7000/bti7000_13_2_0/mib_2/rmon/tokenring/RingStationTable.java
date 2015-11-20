
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.ringstationtable.RingStationEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.IRingStationTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.ringstationtable.IRingStationEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class RingStationTable
    extends DeviceEntity
    implements Serializable, IRingStationTable, ITableAccess<IRingStationEntry>
{

    private Map<String, IRingStationEntry> ringStationEntry = new TreeMap<String, IRingStationEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RingStationTable() {
    }

    public Map<String, IRingStationEntry> getRingStationEntry() {
        return this.ringStationEntry;
    }

    public IRingStationEntry getEntry(String key) {
        return ringStationEntry.get(key);
    }

    public void setEntry(String key, IRingStationEntry value) {
        ringStationEntry.put(key, value);
        ((RingStationEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IRingStationEntry> getEntries() {
        return ringStationEntry;
    }

    public RingStationEntry createEntry(String entryIndex) {
        RingStationEntry newEntry = new RingStationEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.10.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ringStationEntry", ringStationEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ringStationEntry).toHashCode();
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
        RingStationTable rhs = ((RingStationTable) obj);
        return new EqualsBuilder().append(ringStationEntry, rhs.ringStationEntry).isEquals();
    }

    public RingStationTable clone() {
        RingStationTable _copy = new RingStationTable();
        for (Map.Entry<String, IRingStationEntry> _entry: ringStationEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.10.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ringStationEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
