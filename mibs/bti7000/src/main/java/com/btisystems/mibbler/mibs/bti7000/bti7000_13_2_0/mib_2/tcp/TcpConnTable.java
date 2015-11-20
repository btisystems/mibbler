
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.tcp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.tcp.tcpconntable.TcpConnEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.tcp.ITcpConnTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.tcp.tcpconntable.ITcpConnEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class TcpConnTable
    extends DeviceEntity
    implements Serializable, ITcpConnTable, ITableAccess<ITcpConnEntry>
{

    private Map<String, ITcpConnEntry> tcpConnEntry = new TreeMap<String, ITcpConnEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TcpConnTable() {
    }

    public Map<String, ITcpConnEntry> getTcpConnEntry() {
        return this.tcpConnEntry;
    }

    public ITcpConnEntry getEntry(String key) {
        return tcpConnEntry.get(key);
    }

    public void setEntry(String key, ITcpConnEntry value) {
        tcpConnEntry.put(key, value);
        ((TcpConnEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ITcpConnEntry> getEntries() {
        return tcpConnEntry;
    }

    public TcpConnEntry createEntry(String entryIndex) {
        TcpConnEntry newEntry = new TcpConnEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.6.13.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tcpConnEntry", tcpConnEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tcpConnEntry).toHashCode();
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
        TcpConnTable rhs = ((TcpConnTable) obj);
        return new EqualsBuilder().append(tcpConnEntry, rhs.tcpConnEntry).isEquals();
    }

    public TcpConnTable clone() {
        TcpConnTable _copy = new TcpConnTable();
        for (Map.Entry<String, ITcpConnEntry> _entry: tcpConnEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.6.13"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tcpConnEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
