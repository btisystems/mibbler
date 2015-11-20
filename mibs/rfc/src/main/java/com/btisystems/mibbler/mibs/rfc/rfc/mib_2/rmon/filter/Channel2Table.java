
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.filter;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.filter.IChannel2Table;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.filter.channel2table.IChannel2Entry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.filter.channel2table.Channel2Entry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Channel2Table
    extends DeviceEntity
    implements Serializable, IChannel2Table, ITableAccess<IChannel2Entry>
{

    private Map<String, IChannel2Entry> channel2Entry = new TreeMap<String, IChannel2Entry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Channel2Table() {
    }

    public Map<String, IChannel2Entry> getChannel2Entry() {
        return this.channel2Entry;
    }

    public IChannel2Entry getEntry(String key) {
        return channel2Entry.get(key);
    }

    public void setEntry(String key, IChannel2Entry value) {
        channel2Entry.put(key, value);
        ((Channel2Entry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IChannel2Entry> getEntries() {
        return channel2Entry;
    }

    public Channel2Entry createEntry(String entryIndex) {
        Channel2Entry newEntry = new Channel2Entry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.7.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("channel2Entry", channel2Entry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(channel2Entry).toHashCode();
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
        Channel2Table rhs = ((Channel2Table) obj);
        return new EqualsBuilder().append(channel2Entry, rhs.channel2Entry).isEquals();
    }

    public Channel2Table clone() {
        Channel2Table _copy = new Channel2Table();
        for (Map.Entry<String, IChannel2Entry> _entry: channel2Entry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.7.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "channel2Entry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
