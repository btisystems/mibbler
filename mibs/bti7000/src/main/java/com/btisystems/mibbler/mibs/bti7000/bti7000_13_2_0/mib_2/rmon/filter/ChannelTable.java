
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.filter;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.filter.channeltable.ChannelEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.filter.IChannelTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.filter.channeltable.IChannelEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class ChannelTable
    extends DeviceEntity
    implements Serializable, IChannelTable, ITableAccess<IChannelEntry>
{

    private Map<String, IChannelEntry> channelEntry = new TreeMap<String, IChannelEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ChannelTable() {
    }

    public Map<String, IChannelEntry> getChannelEntry() {
        return this.channelEntry;
    }

    public IChannelEntry getEntry(String key) {
        return channelEntry.get(key);
    }

    public void setEntry(String key, IChannelEntry value) {
        channelEntry.put(key, value);
        ((ChannelEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IChannelEntry> getEntries() {
        return channelEntry;
    }

    public ChannelEntry createEntry(String entryIndex) {
        ChannelEntry newEntry = new ChannelEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.7.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("channelEntry", channelEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(channelEntry).toHashCode();
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
        ChannelTable rhs = ((ChannelTable) obj);
        return new EqualsBuilder().append(channelEntry, rhs.channelEntry).isEquals();
    }

    public ChannelTable clone() {
        ChannelTable _copy = new ChannelTable();
        for (Map.Entry<String, IChannelEntry> _entry: channelEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.7.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "channelEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
