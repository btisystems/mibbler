
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.IAgentxConnection;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class AgentxConnection
    extends DeviceEntity
    implements Serializable, IAgentxConnection, IVariableBindingSetter
{

    private int agentxConnTableLastChange;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AgentxConnection() {
    }

    public int getAgentxConnTableLastChange() {
        return this.agentxConnTableLastChange;
    }

    public void setAgentxConnTableLastChange(int agentxConnTableLastChange) {
        int oldValue = getAgentxConnTableLastChange();
        this.agentxConnTableLastChange = agentxConnTableLastChange;
        notifyChange(1, oldValue, agentxConnTableLastChange);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setAgentxConnTableLastChange(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("agentxConnTableLastChange", agentxConnTableLastChange).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(agentxConnTableLastChange).toHashCode();
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
        AgentxConnection rhs = ((AgentxConnection) obj);
        return new EqualsBuilder().append(agentxConnTableLastChange, rhs.agentxConnTableLastChange).isEquals();
    }

    public AgentxConnection clone() {
        AgentxConnection _copy = new AgentxConnection();
        _copy.agentxConnTableLastChange = agentxConnTableLastChange;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.74.1.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "agentxConnTableLastChange", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
