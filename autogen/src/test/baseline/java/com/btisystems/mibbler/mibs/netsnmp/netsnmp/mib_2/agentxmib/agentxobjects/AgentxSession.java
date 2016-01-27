
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.IAgentxSession;
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

public class AgentxSession
    extends DeviceEntity
    implements Serializable, IAgentxSession, IVariableBindingSetter
{

    private int agentxSessionTableLastChange;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AgentxSession() {
    }

    public int getAgentxSessionTableLastChange() {
        return this.agentxSessionTableLastChange;
    }

    public void setAgentxSessionTableLastChange(int agentxSessionTableLastChange) {
        int oldValue = getAgentxSessionTableLastChange();
        this.agentxSessionTableLastChange = agentxSessionTableLastChange;
        notifyChange(1, oldValue, agentxSessionTableLastChange);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setAgentxSessionTableLastChange(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("agentxSessionTableLastChange", agentxSessionTableLastChange).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(agentxSessionTableLastChange).toHashCode();
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
        AgentxSession rhs = ((AgentxSession) obj);
        return new EqualsBuilder().append(agentxSessionTableLastChange, rhs.agentxSessionTableLastChange).isEquals();
    }

    public AgentxSession clone() {
        AgentxSession _copy = new AgentxSession();
        _copy.agentxSessionTableLastChange = agentxSessionTableLastChange;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.74.1.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "agentxSessionTableLastChange", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
