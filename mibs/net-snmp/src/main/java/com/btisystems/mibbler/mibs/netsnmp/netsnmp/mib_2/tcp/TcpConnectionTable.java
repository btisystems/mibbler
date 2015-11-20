
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.tcp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp.ITcpConnectionTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp.tcpconnectiontable.ITcpConnectionEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.tcp.tcpconnectiontable.TcpConnectionEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class TcpConnectionTable
    extends DeviceEntity
    implements Serializable, ITcpConnectionTable, ITableAccess<ITcpConnectionEntry>
{

    private Map<String, ITcpConnectionEntry> tcpConnectionEntry = new TreeMap<String, ITcpConnectionEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TcpConnectionTable() {
    }

    public Map<String, ITcpConnectionEntry> getTcpConnectionEntry() {
        return this.tcpConnectionEntry;
    }

    public ITcpConnectionEntry getEntry(String key) {
        return tcpConnectionEntry.get(key);
    }

    public void setEntry(String key, ITcpConnectionEntry value) {
        tcpConnectionEntry.put(key, value);
        ((TcpConnectionEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ITcpConnectionEntry> getEntries() {
        return tcpConnectionEntry;
    }

    public TcpConnectionEntry createEntry(String entryIndex) {
        TcpConnectionEntry newEntry = new TcpConnectionEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.6.19.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tcpConnectionEntry", tcpConnectionEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tcpConnectionEntry).toHashCode();
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
        TcpConnectionTable rhs = ((TcpConnectionTable) obj);
        return new EqualsBuilder().append(tcpConnectionEntry, rhs.tcpConnectionEntry).isEquals();
    }

    public TcpConnectionTable clone() {
        TcpConnectionTable _copy = new TcpConnectionTable();
        for (Map.Entry<String, ITcpConnectionEntry> _entry: tcpConnectionEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.6.19"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tcpConnectionEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
