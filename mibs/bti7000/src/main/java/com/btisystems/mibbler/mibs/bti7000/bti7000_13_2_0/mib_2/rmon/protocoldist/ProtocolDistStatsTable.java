
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.protocoldist;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.protocoldist.protocoldiststatstable.ProtocolDistStatsEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.protocoldist.IProtocolDistStatsTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.protocoldist.protocoldiststatstable.IProtocolDistStatsEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class ProtocolDistStatsTable
    extends DeviceEntity
    implements Serializable, IProtocolDistStatsTable, ITableAccess<IProtocolDistStatsEntry>
{

    private Map<String, IProtocolDistStatsEntry> protocolDistStatsEntry = new TreeMap<String, IProtocolDistStatsEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ProtocolDistStatsTable() {
    }

    public Map<String, IProtocolDistStatsEntry> getProtocolDistStatsEntry() {
        return this.protocolDistStatsEntry;
    }

    public IProtocolDistStatsEntry getEntry(String key) {
        return protocolDistStatsEntry.get(key);
    }

    public void setEntry(String key, IProtocolDistStatsEntry value) {
        protocolDistStatsEntry.put(key, value);
        ((ProtocolDistStatsEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IProtocolDistStatsEntry> getEntries() {
        return protocolDistStatsEntry;
    }

    public ProtocolDistStatsEntry createEntry(String entryIndex) {
        ProtocolDistStatsEntry newEntry = new ProtocolDistStatsEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.12.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("protocolDistStatsEntry", protocolDistStatsEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(protocolDistStatsEntry).toHashCode();
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
        ProtocolDistStatsTable rhs = ((ProtocolDistStatsTable) obj);
        return new EqualsBuilder().append(protocolDistStatsEntry, rhs.protocolDistStatsEntry).isEquals();
    }

    public ProtocolDistStatsTable clone() {
        ProtocolDistStatsTable _copy = new ProtocolDistStatsTable();
        for (Map.Entry<String, IProtocolDistStatsEntry> _entry: protocolDistStatsEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.12.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "protocolDistStatsEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
