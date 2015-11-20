
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.agentxsession;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxsession.IAgentxSessionTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxsession.agentxsessiontable.IAgentxSessionEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.agentxsession.agentxsessiontable.AgentxSessionEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class AgentxSessionTable
    extends DeviceEntity
    implements Serializable, IAgentxSessionTable, ITableAccess<IAgentxSessionEntry>
{

    private Map<String, IAgentxSessionEntry> agentxSessionEntry = new TreeMap<String, IAgentxSessionEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AgentxSessionTable() {
    }

    public Map<String, IAgentxSessionEntry> getAgentxSessionEntry() {
        return this.agentxSessionEntry;
    }

    public IAgentxSessionEntry getEntry(String key) {
        return agentxSessionEntry.get(key);
    }

    public void setEntry(String key, IAgentxSessionEntry value) {
        agentxSessionEntry.put(key, value);
        ((AgentxSessionEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IAgentxSessionEntry> getEntries() {
        return agentxSessionEntry;
    }

    public AgentxSessionEntry createEntry(String entryIndex) {
        AgentxSessionEntry newEntry = new AgentxSessionEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.74.1.3.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("agentxSessionEntry", agentxSessionEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(agentxSessionEntry).toHashCode();
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
        AgentxSessionTable rhs = ((AgentxSessionTable) obj);
        return new EqualsBuilder().append(agentxSessionEntry, rhs.agentxSessionEntry).isEquals();
    }

    public AgentxSessionTable clone() {
        AgentxSessionTable _copy = new AgentxSessionTable();
        for (Map.Entry<String, IAgentxSessionEntry> _entry: agentxSessionEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.74.1.3.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "agentxSessionEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
