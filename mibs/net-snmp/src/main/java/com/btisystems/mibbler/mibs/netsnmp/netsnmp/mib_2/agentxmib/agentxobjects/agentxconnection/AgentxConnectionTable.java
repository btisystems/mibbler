
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.agentxconnection;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxconnection.IAgentxConnectionTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxconnection.agentxconnectiontable.IAgentxConnectionEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.agentxconnection.agentxconnectiontable.AgentxConnectionEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class AgentxConnectionTable
    extends DeviceEntity
    implements Serializable, IAgentxConnectionTable, ITableAccess<IAgentxConnectionEntry>
{

    private Map<String, IAgentxConnectionEntry> agentxConnectionEntry = new TreeMap<String, IAgentxConnectionEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AgentxConnectionTable() {
    }

    public Map<String, IAgentxConnectionEntry> getAgentxConnectionEntry() {
        return this.agentxConnectionEntry;
    }

    public IAgentxConnectionEntry getEntry(String key) {
        return agentxConnectionEntry.get(key);
    }

    public void setEntry(String key, IAgentxConnectionEntry value) {
        agentxConnectionEntry.put(key, value);
        ((AgentxConnectionEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IAgentxConnectionEntry> getEntries() {
        return agentxConnectionEntry;
    }

    public AgentxConnectionEntry createEntry(String entryIndex) {
        AgentxConnectionEntry newEntry = new AgentxConnectionEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.74.1.2.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("agentxConnectionEntry", agentxConnectionEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(agentxConnectionEntry).toHashCode();
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
        AgentxConnectionTable rhs = ((AgentxConnectionTable) obj);
        return new EqualsBuilder().append(agentxConnectionEntry, rhs.agentxConnectionEntry).isEquals();
    }

    public AgentxConnectionTable clone() {
        AgentxConnectionTable _copy = new AgentxConnectionTable();
        for (Map.Entry<String, IAgentxConnectionEntry> _entry: agentxConnectionEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.74.1.2.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "agentxConnectionEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
