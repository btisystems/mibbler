
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.IAgentxGeneral;
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

public class AgentxGeneral
    extends DeviceEntity
    implements Serializable, IAgentxGeneral, IVariableBindingSetter
{

    private Integer agentxDefaultTimeout;
    private int agentxMasterAgentXVer;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AgentxGeneral() {
    }

    public int getAgentxDefaultTimeout() {
        if (this.agentxDefaultTimeout == null) {
            return  5;
        }
        return this.agentxDefaultTimeout;
    }

    public boolean isAgentxDefaultTimeoutDefined() {
        return (this.agentxDefaultTimeout!= null);
    }

    public void setAgentxDefaultTimeout(int agentxDefaultTimeout) {
        int oldValue = getAgentxDefaultTimeout();
        this.agentxDefaultTimeout = agentxDefaultTimeout;
        notifyChange(1, oldValue, agentxDefaultTimeout);
    }

    public int getAgentxMasterAgentXVer() {
        return this.agentxMasterAgentXVer;
    }

    public void setAgentxMasterAgentXVer(int agentxMasterAgentXVer) {
        int oldValue = getAgentxMasterAgentXVer();
        this.agentxMasterAgentXVer = agentxMasterAgentXVer;
        notifyChange(2, oldValue, agentxMasterAgentXVer);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setAgentxDefaultTimeout(binding.getVariable().toInt());
                break;
            case  2 :
                setAgentxMasterAgentXVer(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("agentxDefaultTimeout", agentxDefaultTimeout).append("agentxMasterAgentXVer", agentxMasterAgentXVer).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(agentxDefaultTimeout).append(agentxMasterAgentXVer).toHashCode();
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
        AgentxGeneral rhs = ((AgentxGeneral) obj);
        return new EqualsBuilder().append(agentxDefaultTimeout, rhs.agentxDefaultTimeout).append(agentxMasterAgentXVer, rhs.agentxMasterAgentXVer).isEquals();
    }

    public AgentxGeneral clone() {
        AgentxGeneral _copy = new AgentxGeneral();
        _copy.agentxDefaultTimeout = agentxDefaultTimeout;
        _copy.agentxMasterAgentXVer = agentxMasterAgentXVer;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.74.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "agentxDefaultTimeout", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "agentxMasterAgentXVer", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
