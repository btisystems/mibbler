
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.udp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.udp.IUdpTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.udp.udptable.IUdpEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.udp.udptable.UdpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class UdpTable
    extends DeviceEntity
    implements Serializable, IUdpTable, ITableAccess<IUdpEntry>
{

    private Map<String, IUdpEntry> udpEntry = new TreeMap<String, IUdpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public UdpTable() {
    }

    public Map<String, IUdpEntry> getUdpEntry() {
        return this.udpEntry;
    }

    public IUdpEntry getEntry(String key) {
        return udpEntry.get(key);
    }

    public void setEntry(String key, IUdpEntry value) {
        udpEntry.put(key, value);
        ((UdpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IUdpEntry> getEntries() {
        return udpEntry;
    }

    public UdpEntry createEntry(String entryIndex) {
        UdpEntry newEntry = new UdpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.7.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("udpEntry", udpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(udpEntry).toHashCode();
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
        UdpTable rhs = ((UdpTable) obj);
        return new EqualsBuilder().append(udpEntry, rhs.udpEntry).isEquals();
    }

    public UdpTable clone() {
        UdpTable _copy = new UdpTable();
        for (Map.Entry<String, IUdpEntry> _entry: udpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.7.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "udpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
