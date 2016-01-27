
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.IAgentxRegistration;
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

public class AgentxRegistration
    extends DeviceEntity
    implements Serializable, IAgentxRegistration, IVariableBindingSetter
{

    private int agentxRegistrationTableLastChange;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AgentxRegistration() {
    }

    public int getAgentxRegistrationTableLastChange() {
        return this.agentxRegistrationTableLastChange;
    }

    public void setAgentxRegistrationTableLastChange(int agentxRegistrationTableLastChange) {
        int oldValue = getAgentxRegistrationTableLastChange();
        this.agentxRegistrationTableLastChange = agentxRegistrationTableLastChange;
        notifyChange(1, oldValue, agentxRegistrationTableLastChange);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setAgentxRegistrationTableLastChange(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("agentxRegistrationTableLastChange", agentxRegistrationTableLastChange).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(agentxRegistrationTableLastChange).toHashCode();
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
        AgentxRegistration rhs = ((AgentxRegistration) obj);
        return new EqualsBuilder().append(agentxRegistrationTableLastChange, rhs.agentxRegistrationTableLastChange).isEquals();
    }

    public AgentxRegistration clone() {
        AgentxRegistration _copy = new AgentxRegistration();
        _copy.agentxRegistrationTableLastChange = agentxRegistrationTableLastChange;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.74.1.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "agentxRegistrationTableLastChange", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
