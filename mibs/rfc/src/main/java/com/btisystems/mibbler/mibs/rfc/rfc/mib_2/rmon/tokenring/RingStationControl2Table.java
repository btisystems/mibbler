
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.tokenring;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.tokenring.IRingStationControl2Table;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.tokenring.ringstationcontrol2table.IRingStationControl2Entry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.tokenring.ringstationcontrol2table.RingStationControl2Entry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class RingStationControl2Table
    extends DeviceEntity
    implements Serializable, IRingStationControl2Table, ITableAccess<IRingStationControl2Entry>
{

    private Map<String, IRingStationControl2Entry> ringStationControl2Entry = new TreeMap<String, IRingStationControl2Entry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RingStationControl2Table() {
    }

    public Map<String, IRingStationControl2Entry> getRingStationControl2Entry() {
        return this.ringStationControl2Entry;
    }

    public IRingStationControl2Entry getEntry(String key) {
        return ringStationControl2Entry.get(key);
    }

    public void setEntry(String key, IRingStationControl2Entry value) {
        ringStationControl2Entry.put(key, value);
        ((RingStationControl2Entry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IRingStationControl2Entry> getEntries() {
        return ringStationControl2Entry;
    }

    public RingStationControl2Entry createEntry(String entryIndex) {
        RingStationControl2Entry newEntry = new RingStationControl2Entry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.10.7.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ringStationControl2Entry", ringStationControl2Entry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ringStationControl2Entry).toHashCode();
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
        RingStationControl2Table rhs = ((RingStationControl2Table) obj);
        return new EqualsBuilder().append(ringStationControl2Entry, rhs.ringStationControl2Entry).isEquals();
    }

    public RingStationControl2Table clone() {
        RingStationControl2Table _copy = new RingStationControl2Table();
        for (Map.Entry<String, IRingStationControl2Entry> _entry: ringStationControl2Entry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.10.7"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ringStationControl2Entry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
