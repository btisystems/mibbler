
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.ringstationconfigcontroltable.RingStationConfigControlEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.IRingStationConfigControlTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.ringstationconfigcontroltable.IRingStationConfigControlEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class RingStationConfigControlTable
    extends DeviceEntity
    implements Serializable, IRingStationConfigControlTable, ITableAccess<IRingStationConfigControlEntry>
{

    private Map<String, IRingStationConfigControlEntry> ringStationConfigControlEntry = new TreeMap<String, IRingStationConfigControlEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RingStationConfigControlTable() {
    }

    public Map<String, IRingStationConfigControlEntry> getRingStationConfigControlEntry() {
        return this.ringStationConfigControlEntry;
    }

    public IRingStationConfigControlEntry getEntry(String key) {
        return ringStationConfigControlEntry.get(key);
    }

    public void setEntry(String key, IRingStationConfigControlEntry value) {
        ringStationConfigControlEntry.put(key, value);
        ((RingStationConfigControlEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IRingStationConfigControlEntry> getEntries() {
        return ringStationConfigControlEntry;
    }

    public RingStationConfigControlEntry createEntry(String entryIndex) {
        RingStationConfigControlEntry newEntry = new RingStationConfigControlEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.10.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ringStationConfigControlEntry", ringStationConfigControlEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ringStationConfigControlEntry).toHashCode();
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
        RingStationConfigControlTable rhs = ((RingStationConfigControlTable) obj);
        return new EqualsBuilder().append(ringStationConfigControlEntry, rhs.ringStationConfigControlEntry).isEquals();
    }

    public RingStationConfigControlTable clone() {
        RingStationConfigControlTable _copy = new RingStationConfigControlTable();
        for (Map.Entry<String, IRingStationConfigControlEntry> _entry: ringStationConfigControlEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.10.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ringStationConfigControlEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
