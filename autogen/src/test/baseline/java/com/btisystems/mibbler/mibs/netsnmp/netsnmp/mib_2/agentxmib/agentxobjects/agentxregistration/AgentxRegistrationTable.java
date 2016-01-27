
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.agentxregistration;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxregistration.IAgentxRegistrationTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxregistration.agentxregistrationtable.IAgentxRegistrationEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.agentxregistration.agentxregistrationtable.AgentxRegistrationEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class AgentxRegistrationTable
    extends DeviceEntity
    implements Serializable, IAgentxRegistrationTable, ITableAccess<IAgentxRegistrationEntry>
{

    private Map<String, IAgentxRegistrationEntry> agentxRegistrationEntry = new TreeMap<String, IAgentxRegistrationEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AgentxRegistrationTable() {
    }

    public Map<String, IAgentxRegistrationEntry> getAgentxRegistrationEntry() {
        return this.agentxRegistrationEntry;
    }

    public IAgentxRegistrationEntry getEntry(String key) {
        return agentxRegistrationEntry.get(key);
    }

    public void setEntry(String key, IAgentxRegistrationEntry value) {
        agentxRegistrationEntry.put(key, value);
        ((AgentxRegistrationEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IAgentxRegistrationEntry> getEntries() {
        return agentxRegistrationEntry;
    }

    public AgentxRegistrationEntry createEntry(String entryIndex) {
        AgentxRegistrationEntry newEntry = new AgentxRegistrationEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.74.1.4.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("agentxRegistrationEntry", agentxRegistrationEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(agentxRegistrationEntry).toHashCode();
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
        AgentxRegistrationTable rhs = ((AgentxRegistrationTable) obj);
        return new EqualsBuilder().append(agentxRegistrationEntry, rhs.agentxRegistrationEntry).isEquals();
    }

    public AgentxRegistrationTable clone() {
        AgentxRegistrationTable _copy = new AgentxRegistrationTable();
        for (Map.Entry<String, IAgentxRegistrationEntry> _entry: agentxRegistrationEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.74.1.4.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "agentxRegistrationEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
