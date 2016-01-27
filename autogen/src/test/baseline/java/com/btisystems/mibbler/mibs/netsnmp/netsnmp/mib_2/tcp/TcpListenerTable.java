
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.tcp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp.ITcpListenerTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp.tcplistenertable.ITcpListenerEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.tcp.tcplistenertable.TcpListenerEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class TcpListenerTable
    extends DeviceEntity
    implements Serializable, ITcpListenerTable, ITableAccess<ITcpListenerEntry>
{

    private Map<String, ITcpListenerEntry> tcpListenerEntry = new TreeMap<String, ITcpListenerEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TcpListenerTable() {
    }

    public Map<String, ITcpListenerEntry> getTcpListenerEntry() {
        return this.tcpListenerEntry;
    }

    public ITcpListenerEntry getEntry(String key) {
        return tcpListenerEntry.get(key);
    }

    public void setEntry(String key, ITcpListenerEntry value) {
        tcpListenerEntry.put(key, value);
        ((TcpListenerEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ITcpListenerEntry> getEntries() {
        return tcpListenerEntry;
    }

    public TcpListenerEntry createEntry(String entryIndex) {
        TcpListenerEntry newEntry = new TcpListenerEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.6.20.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tcpListenerEntry", tcpListenerEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tcpListenerEntry).toHashCode();
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
        TcpListenerTable rhs = ((TcpListenerTable) obj);
        return new EqualsBuilder().append(tcpListenerEntry, rhs.tcpListenerEntry).isEquals();
    }

    public TcpListenerTable clone() {
        TcpListenerTable _copy = new TcpListenerTable();
        for (Map.Entry<String, ITcpListenerEntry> _entry: tcpListenerEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.6.20"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tcpListenerEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
