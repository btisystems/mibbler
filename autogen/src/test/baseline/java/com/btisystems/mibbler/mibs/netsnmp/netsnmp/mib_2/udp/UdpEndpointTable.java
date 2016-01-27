
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.udp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.udp.IUdpEndpointTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.udp.udpendpointtable.IUdpEndpointEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.udp.udpendpointtable.UdpEndpointEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class UdpEndpointTable
    extends DeviceEntity
    implements Serializable, IUdpEndpointTable, ITableAccess<IUdpEndpointEntry>
{

    private Map<String, IUdpEndpointEntry> udpEndpointEntry = new TreeMap<String, IUdpEndpointEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public UdpEndpointTable() {
    }

    public Map<String, IUdpEndpointEntry> getUdpEndpointEntry() {
        return this.udpEndpointEntry;
    }

    public IUdpEndpointEntry getEntry(String key) {
        return udpEndpointEntry.get(key);
    }

    public void setEntry(String key, IUdpEndpointEntry value) {
        udpEndpointEntry.put(key, value);
        ((UdpEndpointEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IUdpEndpointEntry> getEntries() {
        return udpEndpointEntry;
    }

    public UdpEndpointEntry createEntry(String entryIndex) {
        UdpEndpointEntry newEntry = new UdpEndpointEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.7.7.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("udpEndpointEntry", udpEndpointEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(udpEndpointEntry).toHashCode();
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
        UdpEndpointTable rhs = ((UdpEndpointTable) obj);
        return new EqualsBuilder().append(udpEndpointEntry, rhs.udpEndpointEntry).isEquals();
    }

    public UdpEndpointTable clone() {
        UdpEndpointTable _copy = new UdpEndpointTable();
        for (Map.Entry<String, IUdpEndpointEntry> _entry: udpEndpointEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.7.7"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "udpEndpointEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
