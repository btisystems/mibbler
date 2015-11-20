
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.tokenring;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.tokenring.IRingStationControlTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.tokenring.ringstationcontroltable.IRingStationControlEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.tokenring.ringstationcontroltable.RingStationControlEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class RingStationControlTable
    extends DeviceEntity
    implements Serializable, IRingStationControlTable, ITableAccess<IRingStationControlEntry>
{

    private Map<String, IRingStationControlEntry> ringStationControlEntry = new TreeMap<String, IRingStationControlEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RingStationControlTable() {
    }

    public Map<String, IRingStationControlEntry> getRingStationControlEntry() {
        return this.ringStationControlEntry;
    }

    public IRingStationControlEntry getEntry(String key) {
        return ringStationControlEntry.get(key);
    }

    public void setEntry(String key, IRingStationControlEntry value) {
        ringStationControlEntry.put(key, value);
        ((RingStationControlEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IRingStationControlEntry> getEntries() {
        return ringStationControlEntry;
    }

    public RingStationControlEntry createEntry(String entryIndex) {
        RingStationControlEntry newEntry = new RingStationControlEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.10.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ringStationControlEntry", ringStationControlEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ringStationControlEntry).toHashCode();
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
        RingStationControlTable rhs = ((RingStationControlTable) obj);
        return new EqualsBuilder().append(ringStationControlEntry, rhs.ringStationControlEntry).isEquals();
    }

    public RingStationControlTable clone() {
        RingStationControlTable _copy = new RingStationControlTable();
        for (Map.Entry<String, IRingStationControlEntry> _entry: ringStationControlEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.10.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ringStationControlEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
