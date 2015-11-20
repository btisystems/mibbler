
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.ringstationconfigtable.RingStationConfigEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.IRingStationConfigTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.ringstationconfigtable.IRingStationConfigEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class RingStationConfigTable
    extends DeviceEntity
    implements Serializable, IRingStationConfigTable, ITableAccess<IRingStationConfigEntry>
{

    private Map<String, IRingStationConfigEntry> ringStationConfigEntry = new TreeMap<String, IRingStationConfigEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RingStationConfigTable() {
    }

    public Map<String, IRingStationConfigEntry> getRingStationConfigEntry() {
        return this.ringStationConfigEntry;
    }

    public IRingStationConfigEntry getEntry(String key) {
        return ringStationConfigEntry.get(key);
    }

    public void setEntry(String key, IRingStationConfigEntry value) {
        ringStationConfigEntry.put(key, value);
        ((RingStationConfigEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IRingStationConfigEntry> getEntries() {
        return ringStationConfigEntry;
    }

    public RingStationConfigEntry createEntry(String entryIndex) {
        RingStationConfigEntry newEntry = new RingStationConfigEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.10.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ringStationConfigEntry", ringStationConfigEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ringStationConfigEntry).toHashCode();
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
        RingStationConfigTable rhs = ((RingStationConfigTable) obj);
        return new EqualsBuilder().append(ringStationConfigEntry, rhs.ringStationConfigEntry).isEquals();
    }

    public RingStationConfigTable clone() {
        RingStationConfigTable _copy = new RingStationConfigTable();
        for (Map.Entry<String, IRingStationConfigEntry> _entry: ringStationConfigEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.10.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ringStationConfigEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
