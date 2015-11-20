
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.probeconfig;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.probeconfig.INetConfigTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.probeconfig.netconfigtable.INetConfigEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.probeconfig.netconfigtable.NetConfigEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class NetConfigTable
    extends DeviceEntity
    implements Serializable, INetConfigTable, ITableAccess<INetConfigEntry>
{

    private Map<String, INetConfigEntry> netConfigEntry = new TreeMap<String, INetConfigEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NetConfigTable() {
    }

    public Map<String, INetConfigEntry> getNetConfigEntry() {
        return this.netConfigEntry;
    }

    public INetConfigEntry getEntry(String key) {
        return netConfigEntry.get(key);
    }

    public void setEntry(String key, INetConfigEntry value) {
        netConfigEntry.put(key, value);
        ((NetConfigEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, INetConfigEntry> getEntries() {
        return netConfigEntry;
    }

    public NetConfigEntry createEntry(String entryIndex) {
        NetConfigEntry newEntry = new NetConfigEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.19.11.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("netConfigEntry", netConfigEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(netConfigEntry).toHashCode();
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
        NetConfigTable rhs = ((NetConfigTable) obj);
        return new EqualsBuilder().append(netConfigEntry, rhs.netConfigEntry).isEquals();
    }

    public NetConfigTable clone() {
        NetConfigTable _copy = new NetConfigTable();
        for (Map.Entry<String, INetConfigEntry> _entry: netConfigEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.19.11"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "netConfigEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
