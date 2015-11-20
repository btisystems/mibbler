
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology.networkneighbortable.NetworkNeighborEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.INetworkNeighborTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.networkneighbortable.INetworkNeighborEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class NetworkNeighborTable
    extends DeviceEntity
    implements Serializable, INetworkNeighborTable, ITableAccess<INetworkNeighborEntry>
{

    private Map<String, INetworkNeighborEntry> networkNeighborEntry = new TreeMap<String, INetworkNeighborEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NetworkNeighborTable() {
    }

    public Map<String, INetworkNeighborEntry> getNetworkNeighborEntry() {
        return this.networkNeighborEntry;
    }

    public INetworkNeighborEntry getEntry(String key) {
        return networkNeighborEntry.get(key);
    }

    public void setEntry(String key, INetworkNeighborEntry value) {
        networkNeighborEntry.put(key, value);
        ((NetworkNeighborEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, INetworkNeighborEntry> getEntries() {
        return networkNeighborEntry;
    }

    public NetworkNeighborEntry createEntry(String entryIndex) {
        NetworkNeighborEntry newEntry = new NetworkNeighborEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.13.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("networkNeighborEntry", networkNeighborEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(networkNeighborEntry).toHashCode();
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
        NetworkNeighborTable rhs = ((NetworkNeighborTable) obj);
        return new EqualsBuilder().append(networkNeighborEntry, rhs.networkNeighborEntry).isEquals();
    }

    public NetworkNeighborTable clone() {
        NetworkNeighborTable _copy = new NetworkNeighborTable();
        for (Map.Entry<String, INetworkNeighborEntry> _entry: networkNeighborEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.13.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "networkNeighborEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
